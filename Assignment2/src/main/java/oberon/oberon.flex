package oberon;

import beaver.Symbol;
import beaver.Scanner;

import oberon.OberonParser.Terminals;

%%

%class OberonScanner
%extends Scanner
%unicode
%function nextToken
%type Symbol
%yylexthrow Scanner.Exception
%eofval{
	return token(Terminals.EOF, "end-of-file");
%eofval}
%line
%column

%{
  StringBuffer string = new StringBuffer(128);

  private Symbol token(short id)
  {
	return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), yytext());
  }

  private Symbol token(short id, Object value)
  {
	return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), value);
  }

%}

/* layout */
WhiteSpace = [\ \t\n\r]*

/* identifiers */
Identifier = [a-zA-Z][a-zA-Z0-9]*
Integer = [0-9]+

%%

<YYINITIAL> {
    /* keywords */
    "END"                           { return token(Terminals.END); }
    "ELSE"                          { return token(Terminals.ELSE); }
    "DO"                            { return token(Terminals.DO); }
    "ELSIF"                         { return token(Terminals.ELSIF); }
    "THEN"                          { return token(Terminals.THEN); }
    "OF"                            { return token(Terminals.OF); }
    "IF"                            { return token(Terminals.IF); }
    "WHILE"                         { return token(Terminals.WHILE); }
    "ARRAY"                         { return token(Terminals.ARRAY); }
    "RECORD"                        { return token(Terminals.RECORD); }
    "CONST"                         { return token(Terminals.CONST); }
    "TYPE"                          { return token(Terminals.TYPE); }
    "VAR"                           { return token(Terminals.VAR); }
    "PROCEDURE"                     { return token(Terminals.PROC); }
    "BEGIN"                         { return token(Terminals.BEGIN); }
    "MODULE"                        { return token(Terminals.MODULE); }

    /* seperators */
    "("                             { return token(Terminals.LPAREN); }
    ")"                             { return token(Terminals.RPAREN); }
    "["                             { return token(Terminals.LBRACK); }
    "]"                             { return token(Terminals.RBRACK); }
    ";"                             { return token(Terminals.SEMICOLON); }
    "."                             { return token(Terminals.DOT); }
    ","                             { return token(Terminals.COMMA); }

    /* operators */
    "*"                             { return token(Terminals.MULT); }
    "DIV"                           { return token(Terminals.DIV); }
    "MOD"                           { return token(Terminals.MOD); }
    "&"                             { return token(Terminals.AND); }
    "+"                             { return token(Terminals.PLUS); }
    "-"                             { return token(Terminals.MIN); }
    "OR"                            { return token(Terminals.OR); }
    "="                             { return token(Terminals.EQ); }
    "#"                             { return token(Terminals.HASHTAG); }
    "<"                             { return token(Terminals.LT); }
    "<="                            { return token(Terminals.LEQ); }
    ">"                             { return token(Terminals.GT); }
    ">="                            { return token(Terminals.GEQ); }
    ":"                             { return token(Terminals.COLON); }
    "~"                             { return token(Terminals.COMP); }
    ":="                            { return token(Terminals.ASSIGN); }

    /* whitespace */
    {WhiteSpace}                    { /* ignore */ }

    /* Components */
    {Identifier}                        { return token(Terminals.IDENT, yytext()); }
    {Integer}                         { return token(Terminals.INT, yytext()); }

}

/* error fallback */
.|\n                                { throw new Scanner.Exception(yyline + 1, yycolumn + 1, "unrecognized character '" + yytext() + "'"); }
