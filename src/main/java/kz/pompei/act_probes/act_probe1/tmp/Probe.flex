// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package kz.pompei.act_probes.act_probe1.gen2.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import kz.pompei.act_probes.act_probe1.tmp.ProbeTypes;
import com.intellij.psi.TokenType;

%%

%class ProbeLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

%{

  private void asd() {

  }

%}

CRLF=\R
WHITE_SPACE=[\ \n\t\f]
WORD=[:letter:][[:letter:]0-9_]+
NUMBER=[+-]?[0-9]+(\.[0-9]+(_[0-9]+)*)?([eE][+-]?[0-9]+)?([a-zA-Z][a-zA-Z0-9_]*)?

%state WAITING_VALUE

%%

<YYINITIAL> {WHITE_SPACE}                                   { yybegin(YYINITIAL); asd(); return ProbeTypes.WHITE_SPACE; }

<YYINITIAL> "import"                                        { yybegin(YYINITIAL); return ProbeTypes.KEYWORD_STARTER; }
<YYINITIAL> "fun"                                           { yybegin(YYINITIAL); return ProbeTypes.KEYWORD_STARTER; }
<YYINITIAL> "operator"                                      { yybegin(YYINITIAL); return ProbeTypes.KEYWORD_STARTER; }

<YYINITIAL> "ROOT"                                          { yybegin(YYINITIAL); return ProbeTypes.KEYWORD; }

<YYINITIAL> "("                                             { yybegin(YYINITIAL); return ProbeTypes.PARENTHESIS_OPEN; }
<YYINITIAL> ")"                                             { yybegin(YYINITIAL); return ProbeTypes.PARENTHESIS_CLOSE; }
<YYINITIAL> "["                                             { yybegin(YYINITIAL); return ProbeTypes.SQUARE_OPEN; }
<YYINITIAL> "]"                                             { yybegin(YYINITIAL); return ProbeTypes.SQUARE_CLOSE; }
<YYINITIAL> "{"                                             { yybegin(YYINITIAL); return ProbeTypes.CURLY_OPEN; }
<YYINITIAL> "}"                                             { yybegin(YYINITIAL); return ProbeTypes.CURLY_CLOSE; }

<YYINITIAL> {WORD}                                          { yybegin(YYINITIAL); return ProbeTypes.WORD; }

<YYINITIAL> {NUMBER}                                        { yybegin(YYINITIAL); return ProbeTypes.NUMBER; }

<YYINITIAL> "<-"                                            { yybegin(YYINITIAL); return ProbeTypes.SIGN; }

<YYINITIAL> \.                                              { yybegin(YYINITIAL); return ProbeTypes.DOT; }

<YYINITIAL> .                                               { yybegin(YYINITIAL); return TokenType.BAD_CHARACTER; }
