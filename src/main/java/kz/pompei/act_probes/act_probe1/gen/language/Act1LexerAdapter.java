package kz.pompei.act_probes.act_probe1.gen.language;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import java.io.Reader;
import org.jetbrains.annotations.NotNull;

public class Act1LexerAdapter extends FlexAdapter {

  public Act1LexerAdapter() {
    super(new Act1Lexer(null));
  }
}
