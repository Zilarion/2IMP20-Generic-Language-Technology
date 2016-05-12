package oberon;

import beaver.Symbol;
import beaver.Scanner;

import pico.OberonParser.Terminals;

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
Letter = [a-zA-Z];
Digit = [0-9];

%%

<YYINITIAL> {
    /* keywords */
    "END"                           { return token(Terminals.END); }
    "ELSE"                          { return token(Terminals.ELSE); }
    "ELSEIF"                        { return token(Terminals.ELSEIF); }
    "IF"                            { return token(Terminals.IF); }
    "WHILE"                         { return token(Terminals.WHILE); }
    "ARRAY"                         { return token(Terminals.ARRAY); }
    "RECORD"                        { return token(Terminals.RECORD); }
    "CONST"                         { return token(Terminals.CONST); }
    "TYPE"                          { return token(Terminals.TYPE); }
    "VAR"                           { return token(Terminals.VAR); }
    "PROCEDURE"                     { return token(Terminals.PROCEDURE); }
    "BEGIN"                         { return token(Terminals.BEGIN); }
    "MODULE"                        { return token(Terminals.MODULE); }


    /* boolean literals */
    "true"                          { return token(Terminals.BOOLEAN_LITERAL, new Boolean(true)); }
    "false"                         { return token(Terminals.BOOLEAN_LITERAL, new Boolean(false)); }

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
    {Letter}                        { return token(Terminals.LETTER, yytext()); }
    {Digit}                         { return token(Terminals.DIGIT, yytext()); }

}

/* error fallback */
.|\n                                { throw new Scanner.Exception(yyline + 1, yycolumn + 1, "unrecognized character '" + yytext() + "'"); }
