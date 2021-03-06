// This is a generated file. Not intended for manual editing.
package com.raket.silverstripe.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SilverStripeOuterWrapperImpl extends ASTWrapperPsiElement implements SilverStripeOuterWrapper {

  public SilverStripeOuterWrapperImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<SilverStripeSsBlockEndStatement> getSsBlockEndStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SilverStripeSsBlockEndStatement.class);
  }

  @Override
  @NotNull
  public List<SilverStripeSsBlockSimpleStatement> getSsBlockSimpleStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SilverStripeSsBlockSimpleStatement.class);
  }

  @Override
  @NotNull
  public List<SilverStripeSsBlockStartStatement> getSsBlockStartStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SilverStripeSsBlockStartStatement.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SilverStripeVisitor) ((SilverStripeVisitor)visitor).visitOuterWrapper(this);
    else super.accept(visitor);
  }

}
