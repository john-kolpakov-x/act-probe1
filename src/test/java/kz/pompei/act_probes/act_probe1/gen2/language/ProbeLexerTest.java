package kz.pompei.act_probes.act_probe1.gen2.language;

import java.io.IOException;
import java.io.StringReader;
import org.junit.Test;

public class ProbeLexerTest {

  @Test
  public void advance() throws IOException {
    StringReader r     = new StringReader("asd sdf fgh ghj");
    ProbeLexer   lexer = new ProbeLexer(null);

    String s = "asd dsa qwe ewq sss ddd";
    lexer.reset(s, 0, s.length(), ProbeLexer.YYINITIAL);

    System.out.println("37Gc1wPu7F  1 :: " + lexer.advance());
    System.out.println("37Gc1wPu7F  2 :: " + lexer.advance());
    System.out.println("37Gc1wPu7F  3 :: " + lexer.advance());
    System.out.println("37Gc1wPu7F  4 :: " + lexer.advance());
    System.out.println("37Gc1wPu7F  5 :: " + lexer.advance());
    System.out.println("37Gc1wPu7F  6 :: " + lexer.advance());
    System.out.println("37Gc1wPu7F  7 :: " + lexer.advance());
    System.out.println("37Gc1wPu7F  8 :: " + lexer.advance());
    System.out.println("37Gc1wPu7F  9 :: " + lexer.advance());
    System.out.println("37Gc1wPu7F 10 :: " + lexer.advance());
  }
}
