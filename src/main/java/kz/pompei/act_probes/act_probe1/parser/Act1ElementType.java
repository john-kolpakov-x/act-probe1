package kz.pompei.act_probes.act_probe1.parser;

import com.intellij.psi.tree.IElementType;
import kz.pompei.act_probes.act_probe1.base.Act1Language;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class Act1ElementType extends IElementType {
  public Act1ElementType(@NonNls @NotNull String debugName) {
    super(debugName, Act1Language.INSTANCE);
  }
}
