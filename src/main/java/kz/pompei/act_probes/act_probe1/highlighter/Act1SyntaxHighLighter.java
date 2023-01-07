package kz.pompei.act_probes.act_probe1.highlighter;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import kz.pompei.act_probes.act_probe1.gen.language.Act1LexerAdapter;
import kz.pompei.act_probes.act_probe1.gen.psi.Act1Types;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class Act1SyntaxHighLighter extends SyntaxHighlighterBase {


  public static final TextAttributesKey SEPARATOR     =
    createTextAttributesKey("SIMPLE_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
  public static final TextAttributesKey KEY           =
    createTextAttributesKey("SIMPLE_KEY", DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey VALUE         =
    createTextAttributesKey("SIMPLE_VALUE", DefaultLanguageHighlighterColors.STRING);
  public static final TextAttributesKey COMMENT       =
    createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
  public static final TextAttributesKey BAD_CHARACTER =
    createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);


  private static final TextAttributesKey[] BAD_CHAR_KEYS  = new TextAttributesKey[]{BAD_CHARACTER};
  private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
  private static final TextAttributesKey[] KEY_KEYS       = new TextAttributesKey[]{KEY};
  private static final TextAttributesKey[] VALUE_KEYS     = new TextAttributesKey[]{VALUE};
  private static final TextAttributesKey[] COMMENT_KEYS   = new TextAttributesKey[]{COMMENT};
  private static final TextAttributesKey[] EMPTY_KEYS     = new TextAttributesKey[0];


  @Override
  public @NotNull Lexer getHighlightingLexer() {
    return new Act1LexerAdapter();
  }

  @Override
  public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
    if (tokenType.equals(Act1Types.SEPARATOR)) {
      return SEPARATOR_KEYS;
    }
    if (tokenType.equals(Act1Types.KEY)) {
      return KEY_KEYS;
    }
    if (tokenType.equals(Act1Types.VALUE)) {
      return VALUE_KEYS;
    }
    if (tokenType.equals(Act1Types.COMMENT)) {
      return COMMENT_KEYS;
    }
    if (tokenType.equals(TokenType.BAD_CHARACTER)) {
      return BAD_CHAR_KEYS;
    }
    return EMPTY_KEYS;
  }
}