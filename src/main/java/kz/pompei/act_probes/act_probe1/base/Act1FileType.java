package kz.pompei.act_probes.act_probe1.base;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import javax.swing.Icon;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("UnstableApiUsage")
public class Act1FileType extends LanguageFileType {

  public static final Act1FileType INSTANCE = new Act1FileType();

  private Act1FileType() {
    super(Act1Language.INSTANCE);
  }

  @Override
  public @NonNls @NotNull String getName() {
    return "Акт1";
  }

  @Override
  public @NlsContexts.Label @NotNull String getDescription() {
    return "Описание языка Акт1";
  }

  @Override
  public @NlsSafe @NotNull String getDefaultExtension() {
    return "акт1";
  }

  @Override
  public Icon getIcon() {
    return Act1Icons.FILE;
  }
}
