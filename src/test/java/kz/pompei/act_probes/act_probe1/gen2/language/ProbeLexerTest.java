package kz.pompei.act_probes.act_probe1.gen2.language;

import com.intellij.psi.tree.IElementType;
import java.io.IOException;
import kz.pompei.act_probes.act_probe1.tmp.ProbeTypes;
import org.junit.Test;

public class ProbeLexerTest {

  private static String toLen(int len, Object x) {
    String ret = "" + x;
    while (ret.length() < len) {
      //noinspection StringConcatenationInLoop
      ret = " " + ret;
    }
    return ret;
  }

  @Test
  public void advance() throws IOException {
    ProbeLexer lexer = new ProbeLexer(null);

    String s = ""
      + "import Int32 <- ROOT.kz.pompei.act.core.types.Signed Integer 32 bits\n"
      + "import Int64 <- ROOT.kz.pompei.act.core.types.Signed Integer 64 bits\n"
      + "import Text  <- ROOT.kz.pompei.act.core.types.Text\n"
      + "import Bool  <- ROOT.kz.pompei.act.core.types.Boolean\n"
      + "import Impl  <- ROOT.kz.pompei.act.core.annotations.Implements Interface\n"
      + "import Nullable   <- ROOT.kz.pompei.act.core.annotations.Nullable Type\n"
      + "import Override   <- ROOT.kz.pompei.act.core.annotations.Override Method\n"
      + "import Comparable <- ROOT.kz.pompei.act.core.interfaces.Comparable\n"
      + "\n"
      + "class Hello World @Impl(Comparable[Hello World])\n"
      + "  @Shortcut(HW)\n"
      + "  @Shortcut(HiWorld)\n"
      + "struct\n"
      + "  hello: Int32\n"
      + "  world: Int64\n"
      + "  message: Text\n"
      + "do\n"
      + "  operator=(o: ^Me @Nullable): Bool @Override\n"
      + "  do\n"
      + "    if o = nil ret no fi\n"
      + "    ret hello = o.hello and world = o.world and message = o.message\n"
      + "  done\n"
      + "done\n";


    lexer.reset(s, 0, s.length(), ProbeLexer.YYINITIAL);

    for (int i = 0; ; i++) {
      IElementType advance = lexer.advance();

      if (advance == null) {
        break;
      }

      if (ProbeTypes.WHITE_SPACE.equals(advance)) {
        continue;
      }

      System.out.println("37Gc1wPu7F " + toLen(3, i) + " :: " + toLen(20, advance)
                           + " :: " + toLen(3, lexer.getTokenStart())
                           + "..." + toLen(3, lexer.getTokenEnd())
                           + " : " + lexer.yytext());
    }
  }
}
