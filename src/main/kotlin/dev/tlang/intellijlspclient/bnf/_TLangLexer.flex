package dev.tlang.intellijlspclient.bnf;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static generated.GeneratedTypes.*;

%%

%{
  public _TLangLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _TLangLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+


%%
<YYINITIAL> {
  {WHITE_SPACE}       { return WHITE_SPACE; }

  "ID"                { return ID; }
  "helperBlock"       { return HELPERBLOCK; }
  "tmplBlock"         { return TMPLBLOCK; }
  "modelBlock"        { return MODELBLOCK; }


}

[^] { return BAD_CHARACTER; }
