package kz.pompei.act_probes.act_probe1.base;

import com.intellij.psi.tree.TokenSet;
import kz.pompei.act_probes.act_probe1.gen.psi.Act1Types;

public interface Act1TokenSets {

  TokenSet IDENTIFIERS = TokenSet.create(Act1Types.KEY);

  TokenSet COMMENTS = TokenSet.create(Act1Types.COMMENT);

}
