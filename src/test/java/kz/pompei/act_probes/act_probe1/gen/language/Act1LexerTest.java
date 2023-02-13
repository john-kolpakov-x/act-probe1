package kz.pompei.act_probes.act_probe1.gen.language;

import com.intellij.psi.tree.IElementType;
import java.io.IOException;
import junit.framework.TestCase;

import static kz.pompei.act_probes.act_probe1.gen.language.Act1Lexer.YYINITIAL;

public class Act1LexerTest extends TestCase {

  public void test_reset__advance() throws IOException {

    String text = "asd=dsa\ndsa=asd";

    Act1Lexer act1Lexer = new Act1Lexer(null);

    //
    //
    act1Lexer.reset(text, 0, text.length(), YYINITIAL);
    //
    //

    //
    //
    IElementType elementType = act1Lexer.advance();
    //
    //


    System.out.println("458D35saC1 :: elementType = " + elementType);
    int    tokenStart = act1Lexer.getTokenStart();
    int    tokenEnd   = act1Lexer.getTokenEnd();
    String key1       = text.substring(tokenStart, tokenEnd);
    System.out.println("46meHnYGpX :: key1 = " + key1);
    int yystate = act1Lexer.yystate();
    System.out.println("Mf8LTVkB03 :: yystate = " + yystate);

  }
}
