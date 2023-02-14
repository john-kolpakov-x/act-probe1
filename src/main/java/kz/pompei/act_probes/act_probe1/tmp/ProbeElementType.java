package kz.pompei.act_probes.act_probe1.tmp;

import com.intellij.psi.tree.IElementType;
import kz.pompei.act_probes.act_probe1.base.Act1Language;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ProbeElementType extends IElementType {
  public ProbeElementType(@NonNls @NotNull String debugName) {
    super(debugName, Act1Language.INSTANCE);
  }
}
