package pico;

import beaver.Symbol;
import beaver.Scanner;

import pico.PicoParser.Terminals;

%%

%class PicoScanner
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

/* comments */
Comment = "//" ~[\n\r]* [\n\r]

/* identifiers */
Identifier = [a-zA-Z][a-zA-Z0-9]*

%%

<YYINITIAL> {
    /* keywords */
    "extends"               { return token(Terminals.EXTENDS); }
    "class"                 { return token(Terminals.CLASS); }
    "while"                 { return token(Terminals.WHILE); }


    /* boolean literals */
    "true"                  { return token(Terminals.BOOLEAN_LITERAL, new Boolean(true)); }
    "false"                 { return token(Terminals.BOOLEAN_LITERAL, new Boolean(false)); }

    /* seperators */
    "("                     { return token(Terminals.LPAREN); }
    ")"                     { return token(Terminals.RPAREN); }
    "{"                     { return token(Terminals.LBRACE); }
    "}"                     { return token(Terminals.RBRACE); }
    ";"                     { return token(Terminals.SEMICOLON); }
    "."                     { return token(Terminals.DOT); }

    /* operators */
    "="                     { return token(Terminals.EQ); }
    "&&"                    { return token(Terminals.ANDAND); }
    "||"                    { return token(Terminals.OROR); }

    /* comments */
    {Comment}               { /* ignore */ }

    /* whitespace */
    {WhiteSpace}            { /* ignore */ }

    /* identifiers */
    {Identifier}            { return token(Terminals.ID, yytext()); }

}

/* error fallback */
.|\n                             { throw new Scanner.Exception(yyline + 1, yycolumn + 1, "unrecognized character '" + yytext() + "'"); }
