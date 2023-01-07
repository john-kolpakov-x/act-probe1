package kz.pompei.act_probes.act_probe1.highlighter;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.intellij.openapi.util.NlsContexts;
import java.util.Map;
import javax.swing.Icon;
import kz.pompei.act_probes.act_probe1.base.Act1Icons;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Act1ColorSettingsPage implements ColorSettingsPage {

  private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
    new AttributesDescriptor("Key", Act1SyntaxHighLighter.KEY),
    new AttributesDescriptor("Separator", Act1SyntaxHighLighter.SEPARATOR),
    new AttributesDescriptor("Value", Act1SyntaxHighLighter.VALUE),
    new AttributesDescriptor("Bad value", Act1SyntaxHighLighter.BAD_CHARACTER)
  };

  @Override
  public @Nullable Icon getIcon() {
    return Act1Icons.FILE;
  }

  @Override
  public @NotNull SyntaxHighlighter getHighlighter() {
    return new Act1SyntaxHighLighter();
  }

  @Override
  public @NonNls @NotNull String getDemoText() {
    return "# You are reading the \".properties\" entry.\n" +
      "! The exclamation mark can also mark text as comments.\n" +
      "website = https://en.wikipedia.org/\n" +
      "language = English\n" +
      "# The backslash below tells the application to continue reading\n" +
      "# the value onto the next line.\n" +
      "message = Welcome to \\\n" +
      "          Wikipedia!\n" +
      "# Add spaces to the key\n" +
      "key\\ with\\ spaces = This is the value that could be looked up with the key \"key with spaces\".\n" +
      "# Unicode\n" +
      "tab : \\u0009";
  }

  @Override
  public @Nullable Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
    return null;
  }

  @Override
  public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
    return DESCRIPTORS;
  }

  @Override
  public ColorDescriptor @NotNull [] getColorDescriptors() {
    return ColorDescriptor.EMPTY_ARRAY;
  }

  @SuppressWarnings("UnstableApiUsage")
  @Override
  public @NotNull @NlsContexts.ConfigurableName String getDisplayName() {
    return "Act1";
  }
}
