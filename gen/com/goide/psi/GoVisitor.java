// This is a generated file. Not intended for manual editing.
package com.goide.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;

public class GoVisitor extends PsiElementVisitor {

  public void visitAddExpr(@NotNull GoAddExpr o) {
    visitExpression(o);
  }

  public void visitAndExpr(@NotNull GoAndExpr o) {
    visitExpression(o);
  }

  public void visitAnonymousField(@NotNull GoAnonymousField o) {
    visitCompositeElement(o);
  }

  public void visitArgumentList(@NotNull GoArgumentList o) {
    visitCompositeElement(o);
  }

  public void visitArrayOrSliceType(@NotNull GoArrayOrSliceType o) {
    visitType(o);
  }

  public void visitAssignmentStatement(@NotNull GoAssignmentStatement o) {
    visitStatement(o);
  }

  public void visitBlock(@NotNull GoBlock o) {
    visitCompositeElement(o);
  }

  public void visitBreakStatement(@NotNull GoBreakStatement o) {
    visitStatement(o);
  }

  public void visitBuiltinArgs(@NotNull GoBuiltinArgs o) {
    visitCompositeElement(o);
  }

  public void visitBuiltinCallExpr(@NotNull GoBuiltinCallExpr o) {
    visitExpression(o);
  }

  public void visitCallExpr(@NotNull GoCallExpr o) {
    visitExpression(o);
  }

  public void visitChannelType(@NotNull GoChannelType o) {
    visitType(o);
  }

  public void visitCommCase(@NotNull GoCommCase o) {
    visitCompositeElement(o);
  }

  public void visitCommClause(@NotNull GoCommClause o) {
    visitCompositeElement(o);
  }

  public void visitCompositeLit(@NotNull GoCompositeLit o) {
    visitExpression(o);
  }

  public void visitConditionalExpr(@NotNull GoConditionalExpr o) {
    visitExpression(o);
  }

  public void visitConstDeclaration(@NotNull GoConstDeclaration o) {
    visitCompositeElement(o);
  }

  public void visitConstSpec(@NotNull GoConstSpec o) {
    visitCompositeElement(o);
  }

  public void visitContinueStatement(@NotNull GoContinueStatement o) {
    visitStatement(o);
  }

  public void visitConversionExpr(@NotNull GoConversionExpr o) {
    visitExpression(o);
  }

  public void visitDeferStatement(@NotNull GoDeferStatement o) {
    visitStatement(o);
  }

  public void visitElement(@NotNull GoElement o) {
    visitCompositeElement(o);
  }

  public void visitElementIndex(@NotNull GoElementIndex o) {
    visitCompositeElement(o);
  }

  public void visitExprCaseClause(@NotNull GoExprCaseClause o) {
    visitCompositeElement(o);
  }

  public void visitExprSwitchCase(@NotNull GoExprSwitchCase o) {
    visitCompositeElement(o);
  }

  public void visitExprSwitchStatement(@NotNull GoExprSwitchStatement o) {
    visitStatement(o);
  }

  public void visitExpression(@NotNull GoExpression o) {
    visitCompositeElement(o);
  }

  public void visitFallthroughStatement(@NotNull GoFallthroughStatement o) {
    visitStatement(o);
  }

  public void visitFieldDeclaration(@NotNull GoFieldDeclaration o) {
    visitCompositeElement(o);
  }

  public void visitFieldName(@NotNull GoFieldName o) {
    visitCompositeElement(o);
  }

  public void visitForClause(@NotNull GoForClause o) {
    visitCompositeElement(o);
  }

  public void visitForStatement(@NotNull GoForStatement o) {
    visitStatement(o);
  }

  public void visitFunctionDeclaration(@NotNull GoFunctionDeclaration o) {
    visitNamedElement(o);
  }

  public void visitFunctionLit(@NotNull GoFunctionLit o) {
    visitExpression(o);
  }

  public void visitFunctionType(@NotNull GoFunctionType o) {
    visitType(o);
  }

  public void visitGoStatement(@NotNull GoGoStatement o) {
    visitStatement(o);
  }

  public void visitGotoStatement(@NotNull GoGotoStatement o) {
    visitStatement(o);
  }

  public void visitIfStatement(@NotNull GoIfStatement o) {
    visitStatement(o);
  }

  public void visitImportDeclaration(@NotNull GoImportDeclaration o) {
    visitCompositeElement(o);
  }

  public void visitImportSpec(@NotNull GoImportSpec o) {
    visitCompositeElement(o);
  }

  public void visitIndexExpr(@NotNull GoIndexExpr o) {
    visitExpression(o);
  }

  public void visitInterfaceType(@NotNull GoInterfaceType o) {
    visitType(o);
  }

  public void visitKey(@NotNull GoKey o) {
    visitCompositeElement(o);
  }

  public void visitLabeledStatement(@NotNull GoLabeledStatement o) {
    visitStatement(o);
  }

  public void visitLiteral(@NotNull GoLiteral o) {
    visitExpression(o);
  }

  public void visitLiteralTypeExpr(@NotNull GoLiteralTypeExpr o) {
    visitExpression(o);
  }

  public void visitLiteralValue(@NotNull GoLiteralValue o) {
    visitCompositeElement(o);
  }

  public void visitMapType(@NotNull GoMapType o) {
    visitType(o);
  }

  public void visitMethodDeclaration(@NotNull GoMethodDeclaration o) {
    visitFunctionDeclaration(o);
  }

  public void visitMethodExpr(@NotNull GoMethodExpr o) {
    visitExpression(o);
  }

  public void visitMethodSpec(@NotNull GoMethodSpec o) {
    visitCompositeElement(o);
  }

  public void visitMulExpr(@NotNull GoMulExpr o) {
    visitExpression(o);
  }

  public void visitOrExpr(@NotNull GoOrExpr o) {
    visitExpression(o);
  }

  public void visitPackageClause(@NotNull GoPackageClause o) {
    visitCompositeElement(o);
  }

  public void visitParameterDeclaration(@NotNull GoParameterDeclaration o) {
    visitCompositeElement(o);
  }

  public void visitParameters(@NotNull GoParameters o) {
    visitCompositeElement(o);
  }

  public void visitParenthesesExpr(@NotNull GoParenthesesExpr o) {
    visitExpression(o);
  }

  public void visitPointerType(@NotNull GoPointerType o) {
    visitType(o);
  }

  public void visitRangeClause(@NotNull GoRangeClause o) {
    visitCompositeElement(o);
  }

  public void visitReceiver(@NotNull GoReceiver o) {
    visitCompositeElement(o);
  }

  public void visitReceiverType(@NotNull GoReceiverType o) {
    visitType(o);
  }

  public void visitRecvStatement(@NotNull GoRecvStatement o) {
    visitStatement(o);
  }

  public void visitReferenceExpression(@NotNull GoReferenceExpression o) {
    visitCompositeElement(o);
  }

  public void visitResult(@NotNull GoResult o) {
    visitCompositeElement(o);
  }

  public void visitReturnStatement(@NotNull GoReturnStatement o) {
    visitStatement(o);
  }

  public void visitSelectStatement(@NotNull GoSelectStatement o) {
    visitStatement(o);
  }

  public void visitSelectorExpr(@NotNull GoSelectorExpr o) {
    visitExpression(o);
  }

  public void visitSendStatement(@NotNull GoSendStatement o) {
    visitStatement(o);
  }

  public void visitShortVarDeclaration(@NotNull GoShortVarDeclaration o) {
    visitCompositeElement(o);
  }

  public void visitSignature(@NotNull GoSignature o) {
    visitCompositeElement(o);
  }

  public void visitSimpleStatement(@NotNull GoSimpleStatement o) {
    visitStatement(o);
  }

  public void visitStatement(@NotNull GoStatement o) {
    visitCompositeElement(o);
  }

  public void visitStructType(@NotNull GoStructType o) {
    visitType(o);
  }

  public void visitSwitchStatement(@NotNull GoSwitchStatement o) {
    visitStatement(o);
  }

  public void visitTag(@NotNull GoTag o) {
    visitCompositeElement(o);
  }

  public void visitType(@NotNull GoType o) {
    visitCompositeElement(o);
  }

  public void visitTypeAssertionExpr(@NotNull GoTypeAssertionExpr o) {
    visitExpression(o);
  }

  public void visitTypeCaseClause(@NotNull GoTypeCaseClause o) {
    visitCompositeElement(o);
  }

  public void visitTypeDeclaration(@NotNull GoTypeDeclaration o) {
    visitCompositeElement(o);
  }

  public void visitTypeReferenceExpression(@NotNull GoTypeReferenceExpression o) {
    visitCompositeElement(o);
  }

  public void visitTypeSpec(@NotNull GoTypeSpec o) {
    visitCompositeElement(o);
  }

  public void visitTypeSwitchCase(@NotNull GoTypeSwitchCase o) {
    visitCompositeElement(o);
  }

  public void visitTypeSwitchGuard(@NotNull GoTypeSwitchGuard o) {
    visitCompositeElement(o);
  }

  public void visitTypeSwitchStatement(@NotNull GoTypeSwitchStatement o) {
    visitStatement(o);
  }

  public void visitUnaryExpr(@NotNull GoUnaryExpr o) {
    visitExpression(o);
  }

  public void visitValue(@NotNull GoValue o) {
    visitCompositeElement(o);
  }

  public void visitVarDeclaration(@NotNull GoVarDeclaration o) {
    visitCompositeElement(o);
  }

  public void visitVarSpec(@NotNull GoVarSpec o) {
    visitCompositeElement(o);
  }

  public void visitAssignOp(@NotNull GoAssignOp o) {
    visitCompositeElement(o);
  }

  public void visitNamedElement(@NotNull GoNamedElement o) {
    visitCompositeElement(o);
  }

  public void visitCompositeElement(@NotNull GoCompositeElement o) {
    visitElement(o);
  }

}
