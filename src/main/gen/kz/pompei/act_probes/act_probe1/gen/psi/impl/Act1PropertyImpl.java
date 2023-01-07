// This is a generated file. Not intended for manual editing.
package kz.pompei.act_probes.act_probe1.gen.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static kz.pompei.act_probes.act_probe1.gen.psi.Act1Types.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import kz.pompei.act_probes.act_probe1.gen.psi.*;

public class Act1PropertyImpl extends ASTWrapperPsiElement implements Act1Property {

  public Act1PropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Act1Visitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Act1Visitor) accept((Act1Visitor)visitor);
    else super.accept(visitor);
  }

}
