grammar SQLParser;
import SQLBase;

/* 
*	1. Build Parser: antlr4 .\grammar\SQLParser.g4 -o .\out
* 	2. Compile: javac .\out\grammar\*.java
* 	3. Change to ./out/grammar directory
*  	Tokens: grun SQLParser select_stmt -tokens ..\..\input\select_stmt
*  	Tree: grun SQLParser select_stmt -tree ..\..\input\select_stmt
*  	GUI: grun SQLParser select_stmt -gui ..\..\input\select_stmt
*  	
*  	Based with the help of awesome grammer examples on https://github.com/antlr/grammars-v4
*/
relational_op:
	EQ | LTH | GTH | NOT_EQ | LET | GET;

between_op:
	BETWEEN
;

expr_op:
		AND | XOR | OR | NOT;


projection_item 
: K_NULL
| STRING_LITERAL;

projection : projection_item ( ',' projection_item )*;

schema_name:
    ID
;

column_name:
	((schema_name DOT)? ID DOT)? ID
	| DIGIT+
	| STRING 
	| Rid
;

element:
	column_name
;

right_element:
	element
;

left_element:
	element
;


simple_expression:
	left_element relational_op right_element
;

where_clause:
'('? K_WHERE expression ')'?
;

expression:
	simple_expression (expr_op simple_expression)*
;

function_parameter : STRING;
function_parameters : function_parameter ( ',' function_parameter )*;
function_name : ID;
function : function_name '(' function_parameters? ')';

traverse_condition : K_TRAVERSE (function | element) K_FROM ID; 

traverse_stmt : '('? traverse_condition where_clause? order_by_clause? limit_clause? range_clause? ')'?; //Recursion

from_clause: 
	K_FROM (select_stmt | traverse_stmt ) //Recursion
|
	K_FROM ID;

order_by_clause : K_ORDER K_BY ID ( ',' ID )* ( K_DESC | K_ASC )?;

limit_clause : K_LIMIT INTEGER (K_SKIP INTEGER)?;

range_clause : K_RANGE Rid ( ',' Rid )?;

select_stmt : '('? K_SELECT projection? from_clause where_clause? order_by_clause? limit_clause? range_clause? ')'?;