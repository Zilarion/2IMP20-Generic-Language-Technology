package pico;

import beaver.*;
import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "pico.grammar".
 */
public class PicoParser extends Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short ID = 1;
		static public final short LPAREN = 2;
		static public final short LBRACE = 3;
		static public final short BOOLEAN_LITERAL = 4;
		static public final short OROR = 5;
		static public final short ANDAND = 6;
		static public final short WHILE = 7;
		static public final short RBRACE = 8;
		static public final short DOT = 9;
		static public final short RPAREN = 10;
		static public final short CLASS = 11;
		static public final short SEMICOLON = 12;
		static public final short EQ = 13;
		static public final short EXTENDS = 14;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9njasjFKq4GXj$35igzBTAAHuee1HGhqKG$c4YY4aY8NqpGBvBmM$opWbSGRtX1nsU7RRC" +
		"XFSspyyxRsTqvwLJIlYufQ5pBMj4TjNLPenhJ26ubkLLrDElk0chLpjH2JQ3#eBgesrxNqN" +
		"KpBTetNT7Lc6bIYnhIdEiwEbQy8GvxHN1$YNpQyodxgfhMwA7qlAtv56$0BQfdr53JJhXz5" +
		"NrDDwaFU3DqEukkq$qSUshiwha5d#YE4QkynHHg8gaQwhoke4$nne7UHZmho9gyGTJJw1ZR" +
		"n56l29wFUqtCIvnvyjX3pFCOYLsqE2rmUzLrl6$zDOkP$IEiG1tkHO#d6MCEJnUMuM7Ady8" +
		"BU9do1ZnBUWawIQ$15jo57NWEhx9pxyE30VVjmIFOWDtaJMRVbwd$avw7FhjuJjP3DyiV3w" +
		"fZ$sbMqtlFZSpRplIJGMUaxpPJh5$mrzL$x3VyjL$sqqwJyoN5jxv#zlKOFi1x#yHwO1$TV" +
		"MU7ziE#zyywWlWxban9mGn6XfX3GS6K19$57er4wJlYX5QOd$XV2SnZXOaSzgav9$HfaTUS" +
		"e8N$91PrYG==");

	static final Action RETURN3 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 3];
		}
	};

	static final Action RETURN4 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 4];
		}
	};

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	static final Action RETURN5 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 5];
		}
	};

	private final Action[] actions;

	public PicoParser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			Action.RETURN,	// [0] $goal = BLOCK
			new Action() {	// [1] lst$BLOCK_STATEMENT = BLOCK_STATEMENT
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			new Action() {	// [2] lst$BLOCK_STATEMENT = lst$BLOCK_STATEMENT BLOCK_STATEMENT
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			Action.NONE,  	// [3] opt$lst$BLOCK_STATEMENT = 
			Action.RETURN,	// [4] opt$lst$BLOCK_STATEMENT = lst$BLOCK_STATEMENT
			RETURN3,	// [5] BLOCK = LBRACE opt$lst$BLOCK_STATEMENT RBRACE; returns 'RBRACE' although none is marked
			Action.RETURN,	// [6] BLOCK_STATEMENT = CLASS_DECL
			Action.RETURN,	// [7] BLOCK_STATEMENT = VAR_DECL
			Action.RETURN,	// [8] BLOCK_STATEMENT = STATEMENT
			Action.RETURN,	// [9] STATEMENT = ASSIGN_STATEMENT
			Action.RETURN,	// [10] STATEMENT = WHILE_STATEMENT
			Action.NONE,  	// [11] opt$EXTENDS_DEF = 
			Action.RETURN,	// [12] opt$EXTENDS_DEF = EXTENDS_DEF
			RETURN4,	// [13] CLASS_DECL = CLASS ID opt$EXTENDS_DEF BLOCK; returns 'BLOCK' although none is marked
			RETURN2,	// [14] EXTENDS_DEF = EXTENDS USE; returns 'USE' although none is marked
			RETURN3,	// [15] VAR_DECL = NAME ID SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN4,	// [16] ASSIGN_STATEMENT = NAME EQ EXP SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN5,	// [17] WHILE_STATEMENT = WHILE LPAREN EXP RPAREN STATEMENT; returns 'STATEMENT' although none is marked
			Action.RETURN,	// [18] EXP = NAME
			Action.RETURN,	// [19] EXP = BOOLEAN_LITERAL
			RETURN3,	// [20] EXP = EXP OROR EXP; returns 'EXP' although none is marked
			RETURN3,	// [21] EXP = EXP ANDAND EXP; returns 'EXP' although none is marked
			RETURN3,	// [22] EXP = LPAREN EXP RPAREN; returns 'RPAREN' although none is marked
			Action.RETURN,	// [23] USE = ID
			Action.RETURN,	// [24] NAME = ID
			RETURN3	// [25] NAME = NAME DOT USE; returns 'USE' although none is marked
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}