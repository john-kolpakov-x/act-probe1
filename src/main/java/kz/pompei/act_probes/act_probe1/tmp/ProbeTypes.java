package kz.pompei.act_probes.act_probe1.tmp;

import com.intellij.psi.tree.IElementType;

public interface ProbeTypes {

  IElementType WHITE_SPACE     = new ProbeElementType("WHITE_SPACE");
  IElementType WORD            = new ProbeElementType("WORD");
  IElementType SIGN            = new ProbeElementType("SIGN");
  IElementType DOT             = new ProbeElementType("DOT");
  IElementType KEYWORD         = new ProbeElementType("KEYWORD");
  IElementType KEYWORD_STARTER = new ProbeElementType("KEYWORD_STARTER");
  IElementType NUMBER          = new ProbeElementType("NUMBER");

  IElementType IF    = new ProbeElementType("IF");
  IElementType ELSIF = new ProbeElementType("ELSIF");
  IElementType ELSE  = new ProbeElementType("ELSE");
  IElementType FI    = new ProbeElementType("FI");

  IElementType PARENTHESIS_OPEN  = new ProbeElementType("PARENTHESIS_OPEN");
  IElementType PARENTHESIS_CLOSE = new ProbeElementType("PARENTHESIS_CLOSE");
  IElementType SQUARE_OPEN       = new ProbeElementType("SQUARE_OPEN");
  IElementType SQUARE_CLOSE      = new ProbeElementType("SQUARE_CLOSE");

  IElementType DO   = new ProbeElementType("DO");
  IElementType DONE = new ProbeElementType("DONE");

}
