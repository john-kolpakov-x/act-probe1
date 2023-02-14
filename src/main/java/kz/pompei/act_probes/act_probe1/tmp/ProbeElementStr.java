package kz.pompei.act_probes.act_probe1.tmp;

import com.intellij.psi.tree.IElementType;
import kz.pompei.act_probes.act_probe1.base.Act1Language;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ProbeElementStr extends IElementType {

  public static final String STR_INNER = "STR_INNER";
  public static final String STR_OPEN  = "STR_OPEN";
  public static final String STR_CLOSE = "STR_CLOSE";
  public static final String STR_FULL  = "STR_FULL";

  public final String content;

  public ProbeElementStr(@NonNls @NotNull String debugName,
                         @NonNls @NotNull String content) {

    super(debugName, Act1Language.INSTANCE);
    this.content = content;
  }
}
