package kz.pompei.act_probes.act_probe1.base;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class Act1File extends PsiFileBase {

  protected Act1File(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, Act1Language.INSTANCE);
  }

  @Override
  public @NotNull FileType getFileType() {
    return Act1FileType.INSTANCE;
  }
}
