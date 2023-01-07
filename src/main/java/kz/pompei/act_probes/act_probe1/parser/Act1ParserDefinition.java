package kz.pompei.act_probes.act_probe1.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import kz.pompei.act_probes.act_probe1.base.Act1File;
import kz.pompei.act_probes.act_probe1.base.Act1Language;
import kz.pompei.act_probes.act_probe1.base.Act1TokenSets;
import kz.pompei.act_probes.act_probe1.gen.language.Act1LexerAdapter;
import kz.pompei.act_probes.act_probe1.gen.parser.Act1Parser;
import kz.pompei.act_probes.act_probe1.gen.psi.Act1Types;
import org.jetbrains.annotations.NotNull;

public class Act1ParserDefinition implements ParserDefinition {

  public static final IFileElementType FILE = new IFileElementType(Act1Language.INSTANCE);

  @Override
  public @NotNull Lexer createLexer(Project project) {
    return new Act1LexerAdapter();
  }

  @Override
  public @NotNull TokenSet getCommentTokens() {
    return Act1TokenSets.COMMENTS;
  }

  @Override
  public @NotNull TokenSet getStringLiteralElements() {
    return TokenSet.EMPTY;
  }

  @Override
  public @NotNull PsiParser createParser(Project project) {
    return new Act1Parser();
  }

  @Override
  public @NotNull IFileElementType getFileNodeType() {
    return FILE;
  }

  @Override
  public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
    return new Act1File(viewProvider);
  }

  @Override
  public @NotNull PsiElement createElement(ASTNode node) {
    return Act1Types.Factory.createElement(node);
  }
}
