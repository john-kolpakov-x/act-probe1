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

WHITE_SPACE=[\ \n\t\f]
WORD=\w+

%state WAITING_VALUE

%%

<YYINITIAL> {WHITE_SPACE        }                           { yybegin(YYINITIAL); return /*GO1MC57483*/ProbeTypes.WHITE_SPACE; }

<YYINITIAL> {WORD}                                          { yybegin(YYINITIAL); return ProbeTypes.WORD; }

[^]                                                         { return TokenType.BAD_CHARACTER; }
