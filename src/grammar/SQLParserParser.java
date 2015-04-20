// Generated from E:\Repositorys\GraphQL\src\grammar\SQLParser.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DIGIT=1, K_SELECT=2, K_INSERT=3, K_UPDATE=4, K_DELETE=5, K_FROM=6, K_WHERE=7, 
		K_INTO=8, K_VALUES=9, K_SET=10, K_ADD=11, K_REMOVE=12, K_AND=13, K_OR=14, 
		K_NULL=15, K_ORDER=16, K_BY=17, K_LIMIT=18, K_RANGE=19, K_ASC=20, K_AS=21, 
		K_DESC=22, K_CONTAINSKEY=23, K_CONTAINSVALUE=24, K_CONTAINSTEXT=25, K_MATCHES=26, 
		K_TRAVERSE=27, K_SKIP=28, K_THIS=29, K_RECORD_ATTRIBUTE=30, K_RID_ATTR=31, 
		K_CLASS_ATTR=32, K_VERSION_ATTR=33, K_SIZE_ATTR=34, K_TYPE_ATTR=35, SELECT=36, 
		FROM=37, WHERE=38, AND=39, OR=40, XOR=41, IS=42, NULL=43, LIKE=44, IN=45, 
		EXISTS=46, ALL=47, ANY=48, TRUE=49, FALSE=50, DIVIDE=51, MOD=52, BETWEEN=53, 
		REGEXP=54, PLUS=55, MINUS=56, NEGATION=57, VERTBAR=58, BITAND=59, POWER_OP=60, 
		BINARY=61, SHIFT_LEFT=62, SHIFT_RIGHT=63, ESCAPE=64, ASTERISK=65, RPAREN=66, 
		LPAREN=67, RBRACK=68, LBRACK=69, COLON=70, ALL_FIELDS=71, EQ=72, LTH=73, 
		GTH=74, NOT_EQ=75, NE=76, NOT=77, LET=78, GET=79, SEMI=80, COMMA=81, DOT=82, 
		COLLATE=83, INDEX=84, KEY=85, BY=86, FOR=87, USE=88, IGNORE=89, LEFT=90, 
		RIGHT=91, ON=92, Rid=93, EqualsCompareOperator=94, CompareOperator=95, 
		LtOperator=96, GtOperator=97, NeOperator=98, NeqOperator=99, GeOperator=100, 
		LeOperator=101, InOperator=102, NotInOperator=103, LikeOperator=104, ContainsKeyOperator=105, 
		ContainsValueOperator=106, ID=107, STRING=108, FLOATING_POINT=109, INTEGER=110, 
		STRING_LITERAL=111, NUMBER=112, WS=113;
	public static final int
		RULE_relational_op = 0, RULE_between_op = 1, RULE_expr_op = 2, RULE_projection_item = 3, 
		RULE_projection = 4, RULE_schema_name = 5, RULE_column_name = 6, RULE_element = 7, 
		RULE_right_element = 8, RULE_left_element = 9, RULE_simple_expression = 10, 
		RULE_where_clause = 11, RULE_expression = 12, RULE_function_parameter = 13, 
		RULE_function_parameters = 14, RULE_function_name = 15, RULE_function = 16, 
		RULE_traverse_condition = 17, RULE_traverse_stmt = 18, RULE_from_clause = 19, 
		RULE_order_by_clause = 20, RULE_limit_clause = 21, RULE_range_clause = 22, 
		RULE_select_stmt = 23;
	public static final String[] ruleNames = {
		"relational_op", "between_op", "expr_op", "projection_item", "projection", 
		"schema_name", "column_name", "element", "right_element", "left_element", 
		"simple_expression", "where_clause", "expression", "function_parameter", 
		"function_parameters", "function_name", "function", "traverse_condition", 
		"traverse_stmt", "from_clause", "order_by_clause", "limit_clause", "range_clause", 
		"select_stmt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'@this'", null, "'@rid'", "'@class'", "'@version'", 
		"'@size'", "'@type'", "'select'", "'from'", "'where'", null, null, "'xor'", 
		"'is'", "'null'", "'like'", "'in'", "'exists'", "'all'", "'any'", "'true'", 
		"'false'", null, null, "'between'", "'regexp'", "'+'", "'-'", "'~'", "'|'", 
		"'&'", "'^'", "'binary'", "'<<'", "'>>'", "'escape'", "'*'", "')'", "'('", 
		"']'", "'['", "':'", "'.*'", "'='", "'<'", "'>'", "'!='", "'<>'", "'not'", 
		"'<='", "'>='", "';'", "','", "'.'", "'collate'", "'index'", "'key'", 
		"'by'", "'for'", "'use'", "'ignore'", "'left'", "'right'", "'on'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DIGIT", "K_SELECT", "K_INSERT", "K_UPDATE", "K_DELETE", "K_FROM", 
		"K_WHERE", "K_INTO", "K_VALUES", "K_SET", "K_ADD", "K_REMOVE", "K_AND", 
		"K_OR", "K_NULL", "K_ORDER", "K_BY", "K_LIMIT", "K_RANGE", "K_ASC", "K_AS", 
		"K_DESC", "K_CONTAINSKEY", "K_CONTAINSVALUE", "K_CONTAINSTEXT", "K_MATCHES", 
		"K_TRAVERSE", "K_SKIP", "K_THIS", "K_RECORD_ATTRIBUTE", "K_RID_ATTR", 
		"K_CLASS_ATTR", "K_VERSION_ATTR", "K_SIZE_ATTR", "K_TYPE_ATTR", "SELECT", 
		"FROM", "WHERE", "AND", "OR", "XOR", "IS", "NULL", "LIKE", "IN", "EXISTS", 
		"ALL", "ANY", "TRUE", "FALSE", "DIVIDE", "MOD", "BETWEEN", "REGEXP", "PLUS", 
		"MINUS", "NEGATION", "VERTBAR", "BITAND", "POWER_OP", "BINARY", "SHIFT_LEFT", 
		"SHIFT_RIGHT", "ESCAPE", "ASTERISK", "RPAREN", "LPAREN", "RBRACK", "LBRACK", 
		"COLON", "ALL_FIELDS", "EQ", "LTH", "GTH", "NOT_EQ", "NE", "NOT", "LET", 
		"GET", "SEMI", "COMMA", "DOT", "COLLATE", "INDEX", "KEY", "BY", "FOR", 
		"USE", "IGNORE", "LEFT", "RIGHT", "ON", "Rid", "EqualsCompareOperator", 
		"CompareOperator", "LtOperator", "GtOperator", "NeOperator", "NeqOperator", 
		"GeOperator", "LeOperator", "InOperator", "NotInOperator", "LikeOperator", 
		"ContainsKeyOperator", "ContainsValueOperator", "ID", "STRING", "FLOATING_POINT", 
		"INTEGER", "STRING_LITERAL", "NUMBER", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Relational_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SQLParserParser.EQ, 0); }
		public TerminalNode LTH() { return getToken(SQLParserParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(SQLParserParser.GTH, 0); }
		public TerminalNode NOT_EQ() { return getToken(SQLParserParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(SQLParserParser.LET, 0); }
		public TerminalNode GET() { return getToken(SQLParserParser.GET, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRelational_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRelational_op(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (EQ - 72)) | (1L << (LTH - 72)) | (1L << (GTH - 72)) | (1L << (NOT_EQ - 72)) | (1L << (LET - 72)) | (1L << (GET - 72)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Between_opContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(SQLParserParser.BETWEEN, 0); }
		public Between_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBetween_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBetween_op(this);
		}
	}

	public final Between_opContext between_op() throws RecognitionException {
		Between_opContext _localctx = new Between_opContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_between_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(BETWEEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(SQLParserParser.AND, 0); }
		public TerminalNode XOR() { return getToken(SQLParserParser.XOR, 0); }
		public TerminalNode OR() { return getToken(SQLParserParser.OR, 0); }
		public TerminalNode NOT() { return getToken(SQLParserParser.NOT, 0); }
		public Expr_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterExpr_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitExpr_op(this);
		}
	}

	public final Expr_opContext expr_op() throws RecognitionException {
		Expr_opContext _localctx = new Expr_opContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !(((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (AND - 39)) | (1L << (OR - 39)) | (1L << (XOR - 39)) | (1L << (NOT - 39)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Projection_itemContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(SQLParserParser.K_NULL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParserParser.STRING_LITERAL, 0); }
		public Projection_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterProjection_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitProjection_item(this);
		}
	}

	public final Projection_itemContext projection_item() throws RecognitionException {
		Projection_itemContext _localctx = new Projection_itemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_projection_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==K_NULL || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProjectionContext extends ParserRuleContext {
		public List<Projection_itemContext> projection_item() {
			return getRuleContexts(Projection_itemContext.class);
		}
		public Projection_itemContext projection_item(int i) {
			return getRuleContext(Projection_itemContext.class,i);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitProjection(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_projection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			projection_item();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(57);
				match(COMMA);
				setState(58);
				projection_item();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schema_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLParserParser.ID, 0); }
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSchema_name(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SQLParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLParserParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParserParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParserParser.DOT, i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public List<TerminalNode> DIGIT() { return getTokens(SQLParserParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(SQLParserParser.DIGIT, i);
		}
		public TerminalNode STRING() { return getToken(SQLParserParser.STRING, 0); }
		public TerminalNode Rid() { return getToken(SQLParserParser.Rid, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_column_name);
		int _la;
		try {
			setState(83);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(69);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(66);
						schema_name();
						setState(67);
						match(DOT);
						}
						break;
					}
					setState(71);
					match(ID);
					setState(72);
					match(DOT);
					}
					break;
				}
				setState(75);
				match(ID);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(76);
					match(DIGIT);
					}
					}
					setState(79); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(STRING);
				}
				break;
			case Rid:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(Rid);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Right_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRight_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRight_element(this);
		}
	}

	public final Right_elementContext right_element() throws RecognitionException {
		Right_elementContext _localctx = new Right_elementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_right_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Left_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Left_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterLeft_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitLeft_element(this);
		}
	}

	public final Left_elementContext left_element() throws RecognitionException {
		Left_elementContext _localctx = new Left_elementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_left_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_expressionContext extends ParserRuleContext {
		public Left_elementContext left_element() {
			return getRuleContext(Left_elementContext.class,0);
		}
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public Right_elementContext right_element() {
			return getRuleContext(Right_elementContext.class,0);
		}
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSimple_expression(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simple_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			left_element();
			setState(92);
			relational_op();
			setState(93);
			right_element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(SQLParserParser.K_WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWhere_clause(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_where_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(95);
				match(LPAREN);
				}
			}

			setState(98);
			match(K_WHERE);
			setState(99);
			expression();
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(100);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public List<Expr_opContext> expr_op() {
			return getRuleContexts(Expr_opContext.class);
		}
		public Expr_opContext expr_op(int i) {
			return getRuleContext(Expr_opContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			simple_expression();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (AND - 39)) | (1L << (OR - 39)) | (1L << (XOR - 39)) | (1L << (NOT - 39)))) != 0)) {
				{
				{
				setState(104);
				expr_op();
				setState(105);
				simple_expression();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_parameterContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SQLParserParser.STRING, 0); }
		public Function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFunction_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFunction_parameter(this);
		}
	}

	public final Function_parameterContext function_parameter() throws RecognitionException {
		Function_parameterContext _localctx = new Function_parameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_parametersContext extends ParserRuleContext {
		public List<Function_parameterContext> function_parameter() {
			return getRuleContexts(Function_parameterContext.class);
		}
		public Function_parameterContext function_parameter(int i) {
			return getRuleContext(Function_parameterContext.class,i);
		}
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFunction_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFunction_parameters(this);
		}
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			function_parameter();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(115);
				match(COMMA);
				setState(116);
				function_parameter();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLParserParser.ID, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			function_name();
			setState(125);
			match(LPAREN);
			setState(127);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(126);
				function_parameters();
				}
			}

			setState(129);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Traverse_conditionContext extends ParserRuleContext {
		public TerminalNode K_TRAVERSE() { return getToken(SQLParserParser.K_TRAVERSE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParserParser.K_FROM, 0); }
		public TerminalNode ID() { return getToken(SQLParserParser.ID, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Traverse_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traverse_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTraverse_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTraverse_condition(this);
		}
	}

	public final Traverse_conditionContext traverse_condition() throws RecognitionException {
		Traverse_conditionContext _localctx = new Traverse_conditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_traverse_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(K_TRAVERSE);
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(132);
				function();
				}
				break;
			case 2:
				{
				setState(133);
				element();
				}
				break;
			}
			setState(136);
			match(K_FROM);
			setState(137);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Traverse_stmtContext extends ParserRuleContext {
		public Traverse_conditionContext traverse_condition() {
			return getRuleContext(Traverse_conditionContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Range_clauseContext range_clause() {
			return getRuleContext(Range_clauseContext.class,0);
		}
		public Traverse_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traverse_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTraverse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTraverse_stmt(this);
		}
	}

	public final Traverse_stmtContext traverse_stmt() throws RecognitionException {
		Traverse_stmtContext _localctx = new Traverse_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_traverse_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(139);
				match(LPAREN);
				}
			}

			setState(142);
			traverse_condition();
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(143);
				where_clause();
				}
				break;
			}
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(146);
				order_by_clause();
				}
				break;
			}
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(149);
				limit_clause();
				}
				break;
			}
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(152);
				range_clause();
				}
				break;
			}
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(155);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode K_FROM() { return getToken(SQLParserParser.K_FROM, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Traverse_stmtContext traverse_stmt() {
			return getRuleContext(Traverse_stmtContext.class,0);
		}
		public TerminalNode ID() { return getToken(SQLParserParser.ID, 0); }
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFrom_clause(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_from_clause);
		try {
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(K_FROM);
				setState(161);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(159);
					select_stmt();
					}
					break;
				case 2:
					{
					setState(160);
					traverse_stmt();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(K_FROM);
				setState(164);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(SQLParserParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLParserParser.K_BY, 0); }
		public List<TerminalNode> ID() { return getTokens(SQLParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLParserParser.ID, i);
		}
		public TerminalNode K_DESC() { return getToken(SQLParserParser.K_DESC, 0); }
		public TerminalNode K_ASC() { return getToken(SQLParserParser.K_ASC, 0); }
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitOrder_by_clause(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_order_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(K_ORDER);
			setState(168);
			match(K_BY);
			setState(169);
			match(ID);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(170);
				match(COMMA);
				setState(171);
				match(ID);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(177);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Limit_clauseContext extends ParserRuleContext {
		public TerminalNode K_LIMIT() { return getToken(SQLParserParser.K_LIMIT, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(SQLParserParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(SQLParserParser.INTEGER, i);
		}
		public TerminalNode K_SKIP() { return getToken(SQLParserParser.K_SKIP, 0); }
		public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterLimit_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitLimit_clause(this);
		}
	}

	public final Limit_clauseContext limit_clause() throws RecognitionException {
		Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_limit_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(K_LIMIT);
			setState(181);
			match(INTEGER);
			setState(184);
			_la = _input.LA(1);
			if (_la==K_SKIP) {
				{
				setState(182);
				match(K_SKIP);
				setState(183);
				match(INTEGER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_clauseContext extends ParserRuleContext {
		public TerminalNode K_RANGE() { return getToken(SQLParserParser.K_RANGE, 0); }
		public List<TerminalNode> Rid() { return getTokens(SQLParserParser.Rid); }
		public TerminalNode Rid(int i) {
			return getToken(SQLParserParser.Rid, i);
		}
		public Range_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRange_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRange_clause(this);
		}
	}

	public final Range_clauseContext range_clause() throws RecognitionException {
		Range_clauseContext _localctx = new Range_clauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_range_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(K_RANGE);
			setState(187);
			match(Rid);
			setState(190);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(188);
				match(COMMA);
				setState(189);
				match(Rid);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLParserParser.K_SELECT, 0); }
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Range_clauseContext range_clause() {
			return getRuleContext(Range_clauseContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSelect_stmt(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(192);
				match(LPAREN);
				}
			}

			setState(195);
			match(K_SELECT);
			setState(197);
			_la = _input.LA(1);
			if (_la==K_NULL || _la==STRING_LITERAL) {
				{
				setState(196);
				projection();
				}
			}

			setState(199);
			from_clause();
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(200);
				where_clause();
				}
				break;
			}
			setState(204);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(203);
				order_by_clause();
				}
				break;
			}
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(206);
				limit_clause();
				}
				break;
			}
			setState(210);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(209);
				range_clause();
				}
				break;
			}
			setState(213);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(212);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3s\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6\3"+
		"\7\3\7\3\b\3\b\3\b\5\bH\n\b\3\b\3\b\5\bL\n\b\3\b\3\b\6\bP\n\b\r\b\16\b"+
		"Q\3\b\3\b\5\bV\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\5\rc"+
		"\n\r\3\r\3\r\3\r\5\rh\n\r\3\16\3\16\3\16\3\16\7\16n\n\16\f\16\16\16q\13"+
		"\16\3\17\3\17\3\20\3\20\3\20\7\20x\n\20\f\20\16\20{\13\20\3\21\3\21\3"+
		"\22\3\22\3\22\5\22\u0082\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u0089\n\23"+
		"\3\23\3\23\3\23\3\24\5\24\u008f\n\24\3\24\3\24\5\24\u0093\n\24\3\24\5"+
		"\24\u0096\n\24\3\24\5\24\u0099\n\24\3\24\5\24\u009c\n\24\3\24\5\24\u009f"+
		"\n\24\3\25\3\25\3\25\5\25\u00a4\n\25\3\25\3\25\5\25\u00a8\n\25\3\26\3"+
		"\26\3\26\3\26\3\26\7\26\u00af\n\26\f\26\16\26\u00b2\13\26\3\26\5\26\u00b5"+
		"\n\26\3\27\3\27\3\27\3\27\5\27\u00bb\n\27\3\30\3\30\3\30\3\30\5\30\u00c1"+
		"\n\30\3\31\5\31\u00c4\n\31\3\31\3\31\5\31\u00c8\n\31\3\31\3\31\5\31\u00cc"+
		"\n\31\3\31\5\31\u00cf\n\31\3\31\5\31\u00d2\n\31\3\31\5\31\u00d5\n\31\3"+
		"\31\5\31\u00d8\n\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\2\6\4\2JMPQ\4\2)+OO\4\2\21\21qq\4\2\26\26\30\30\u00e1\2\62"+
		"\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2\b8\3\2\2\2\n:\3\2\2\2\fB\3\2\2\2\16"+
		"U\3\2\2\2\20W\3\2\2\2\22Y\3\2\2\2\24[\3\2\2\2\26]\3\2\2\2\30b\3\2\2\2"+
		"\32i\3\2\2\2\34r\3\2\2\2\36t\3\2\2\2 |\3\2\2\2\"~\3\2\2\2$\u0085\3\2\2"+
		"\2&\u008e\3\2\2\2(\u00a7\3\2\2\2*\u00a9\3\2\2\2,\u00b6\3\2\2\2.\u00bc"+
		"\3\2\2\2\60\u00c3\3\2\2\2\62\63\t\2\2\2\63\3\3\2\2\2\64\65\7\67\2\2\65"+
		"\5\3\2\2\2\66\67\t\3\2\2\67\7\3\2\2\289\t\4\2\29\t\3\2\2\2:?\5\b\5\2;"+
		"<\7S\2\2<>\5\b\5\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\13\3\2\2\2"+
		"A?\3\2\2\2BC\7m\2\2C\r\3\2\2\2DE\5\f\7\2EF\7T\2\2FH\3\2\2\2GD\3\2\2\2"+
		"GH\3\2\2\2HI\3\2\2\2IJ\7m\2\2JL\7T\2\2KG\3\2\2\2KL\3\2\2\2LM\3\2\2\2M"+
		"V\7m\2\2NP\7\3\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RV\3\2\2\2S"+
		"V\7n\2\2TV\7_\2\2UK\3\2\2\2UO\3\2\2\2US\3\2\2\2UT\3\2\2\2V\17\3\2\2\2"+
		"WX\5\16\b\2X\21\3\2\2\2YZ\5\20\t\2Z\23\3\2\2\2[\\\5\20\t\2\\\25\3\2\2"+
		"\2]^\5\24\13\2^_\5\2\2\2_`\5\22\n\2`\27\3\2\2\2ac\7E\2\2ba\3\2\2\2bc\3"+
		"\2\2\2cd\3\2\2\2de\7\t\2\2eg\5\32\16\2fh\7D\2\2gf\3\2\2\2gh\3\2\2\2h\31"+
		"\3\2\2\2io\5\26\f\2jk\5\6\4\2kl\5\26\f\2ln\3\2\2\2mj\3\2\2\2nq\3\2\2\2"+
		"om\3\2\2\2op\3\2\2\2p\33\3\2\2\2qo\3\2\2\2rs\7n\2\2s\35\3\2\2\2ty\5\34"+
		"\17\2uv\7S\2\2vx\5\34\17\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\37"+
		"\3\2\2\2{y\3\2\2\2|}\7m\2\2}!\3\2\2\2~\177\5 \21\2\177\u0081\7E\2\2\u0080"+
		"\u0082\5\36\20\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3"+
		"\2\2\2\u0083\u0084\7D\2\2\u0084#\3\2\2\2\u0085\u0088\7\35\2\2\u0086\u0089"+
		"\5\"\22\2\u0087\u0089\5\20\t\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\u008b\7\b\2\2\u008b\u008c\7m\2\2\u008c%\3\2"+
		"\2\2\u008d\u008f\7E\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0092\5$\23\2\u0091\u0093\5\30\r\2\u0092\u0091\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0096\5*\26\2\u0095"+
		"\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0099\5,"+
		"\27\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u009c\5.\30\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2"+
		"\2\2\u009d\u009f\7D\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\'\3\2\2\2\u00a0\u00a3\7\b\2\2\u00a1\u00a4\5\60\31\2\u00a2\u00a4\5&\24"+
		"\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a6"+
		"\7\b\2\2\u00a6\u00a8\7m\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		")\3\2\2\2\u00a9\u00aa\7\22\2\2\u00aa\u00ab\7\23\2\2\u00ab\u00b0\7m\2\2"+
		"\u00ac\u00ad\7S\2\2\u00ad\u00af\7m\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b5\t\5\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5+\3\2\2\2\u00b6\u00b7\7\24\2\2\u00b7\u00ba\7p\2\2\u00b8\u00b9"+
		"\7\36\2\2\u00b9\u00bb\7p\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"-\3\2\2\2\u00bc\u00bd\7\25\2\2\u00bd\u00c0\7_\2\2\u00be\u00bf\7S\2\2\u00bf"+
		"\u00c1\7_\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1/\3\2\2\2\u00c2"+
		"\u00c4\7E\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c7\7\4\2\2\u00c6\u00c8\5\n\6\2\u00c7\u00c6\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\5(\25\2\u00ca\u00cc\5\30"+
		"\r\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cf\5*\26\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2"+
		"\2\2\u00d0\u00d2\5,\27\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00d5\5.\30\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d8\7D\2\2\u00d7\u00d6\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\61\3\2\2\2 ?GKQUbgoy\u0081\u0088\u008e\u0092\u0095"+
		"\u0098\u009b\u009e\u00a3\u00a7\u00b0\u00b4\u00ba\u00c0\u00c3\u00c7\u00cb"+
		"\u00ce\u00d1\u00d4\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}