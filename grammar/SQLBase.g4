lexer grammar SQLBase;


DIGIT : [0-9];
fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

//Reserved keywords http://orientdb.com/docs/last/SQL-Syntax.html
K_SELECT : S E L E C T ;
K_INSERT : I N S E R T;
K_UPDATE : U P D A T E;
K_DELETE : D E L E T E;
K_FROM : F R O M ;
K_WHERE : W H E R E;
K_INTO : I N T O;
K_VALUES : V A L U E S;
K_SET : S E T;
K_ADD : A D D;
K_REMOVE : R E M O V E;
K_AND : A N D;
K_OR : O R;
K_NULL : N U L L;
K_ORDER : O R D E R;
K_BY : B Y;
K_LIMIT : L I M I T;
K_RANGE : R A N G E;
K_ASC : A S C;
K_AS : A S;
K_DESC: D E S C;
K_CONTAINSKEY : C O N T A I N S K E Y;
K_CONTAINSVALUE : C O N T A I N S V A L U E;
K_CONTAINSTEXT : C O N T A I N S T E X T;
K_MATCHES : M A T C H E S;
K_TRAVERSE : T R A V E R S E;
K_SKIP : S K I P;
K_THIS : '@this';

//RECORD_ATTRIBUTE
K_RECORD_ATTRIBUTE
: K_RID_ATTR
| K_CLASS_ATTR
| K_VERSION_ATTR
| K_SIZE_ATTR
| K_TYPE_ATTR
;

K_RID_ATTR: '@rid';
K_CLASS_ATTR: '@class';
K_VERSION_ATTR: '@version';
K_SIZE_ATTR: '@size';
K_TYPE_ATTR: '@type';


SELECT: 'select';
FROM: 'from';
WHERE: 'where';
AND: 'and' | '&&';
OR: 'or' | '||';
XOR: 'xor';
IS: 'is';
NULL: 'null';
LIKE: 'like';
IN: 'in';
EXISTS: 'exists';
ALL: 'all';
ANY: 'any';
TRUE: 'true';
FALSE: 'false';
DIVIDE	: 'div' | '/' ;
MOD: 'mod' | '%' ;
BETWEEN: 'between';
REGEXP: 'regexp';
PLUS	: '+' ;
MINUS	: '-' ;
NEGATION: '~' ;
VERTBAR	: '|' ;
BITAND	: '&' ;
POWER_OP: '^' ;
BINARY: 'binary';
SHIFT_LEFT	: '<<' ;
SHIFT_RIGHT	: '>>' ;
ESCAPE: 'escape';
ASTERISK: '*' ;
RPAREN	: ')' ;
LPAREN	: '(' ;
RBRACK	: ']' ;
LBRACK	: '[' ;
COLON	: ':' ;
ALL_FIELDS	: '.*' ;
EQ: '=';
LTH: '<';
GTH: '>';
NOT_EQ: '!=';
NE: '<>';
NOT: 'not';
LET: '<=';
GET: '>=';
SEMI: ';';
COMMA: ',';
DOT: '.';
COLLATE: 'collate';
INDEX: 'index';
KEY: 'key';
BY: 'by';
FOR: 'for';
USE: 'use';
IGNORE: 'ignore';
LEFT: 'left';
RIGHT: 'right';
ON: 'on';

Rid :  '#' INTEGER COLON INTEGER;

EqualsCompareOperator  : EQ;

CompareOperator 
: EqualsCompareOperator
|    LtOperator
|    GtOperator
|    NeOperator
|    NeqOperator
|    GeOperator
|    LeOperator
|    InOperator
|    NotInOperator
|    LikeOperator
|    ContainsKeyOperator
|    ContainsValueOperator
;

LtOperator :    LTH;
GtOperator :    GTH;
NeOperator :    NOT_EQ;
NeqOperator:    NE;
GeOperator :    GET;
LeOperator :    LET;
InOperator :    IN;
NotInOperator  :    NOT IN;
LikeOperator   :    LIKE;
ContainsKeyOperator  :    K_CONTAINSKEY;
ContainsValueOperator  :    K_CONTAINSVALUE;

ID: ('a'..'z' | 'A' .. 'Z' | '_')+ ;
STRING :  '"' (ESC | ~["\\])* '"' ;

FLOATING_POINT : '-'? INT '.' [0-9]+ EXP?;
INTEGER : '-'? INT;
STRING_LITERAL
: '\'' ( ~'\'' | '\'\'' )* '\''
;

NUMBER
    :   '-'? INT '.' [0-9]+ EXP? // 1.35, 1.35E-9, 0.3, -4.5
    |   '-'? INT EXP             // 1e10 -3e4
    |   '-'? INT                 // -3, 45
    ;

fragment INT :   '0' | [1-9] [0-9]* ; // no leading zeros
fragment EXP :   [Ee] [+\-]? INT ; // \- since - means "range" inside [...]
fragment ESC :   '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

WS : [ \t\r\n]+ -> skip ;