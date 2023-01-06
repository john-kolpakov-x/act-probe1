// This is a generated file. Not intended for manual editing.
package kz.pompei.act_probes.act_probe1.gen.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import kz.pompei.act_probes.act_probe1.parser.Act1ElementType;
import kz.pompei.act_probes.act_probe1.parser.Act1TokenType;
import kz.pompei.act_probes.act_probe1.gen.psi.impl.*;

public interface SimpleTypes {

  IElementType PROPERTY = new Act1ElementType("PROPERTY");

  IElementType COMMENT = new Act1TokenType("COMMENT");
  IElementType CRLF = new Act1TokenType("CRLF");
  IElementType KEY = new Act1TokenType("KEY");
  IElementType SEPARATOR = new Act1TokenType("SEPARATOR");
  IElementType VALUE = new Act1TokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new Act1PropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
