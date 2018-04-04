// Generated from D:/work/java/Compiler/grammar\SetGrammar.g4 by ANTLR 4.7
package grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SetGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface SetGrammarVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link SetGrammarParser#setExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSetExpression(SetGrammarParser.SetExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProgram(SetGrammarParser.ProgramContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlock(SetGrammarParser.BlockContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#declaration}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDeclaration(SetGrammarParser.DeclarationContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#declarationElement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDeclarationElement(SetGrammarParser.DeclarationElementContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#print}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrint(SetGrammarParser.PrintContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#printSet}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrintSet(SetGrammarParser.PrintSetContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#inputSignature}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInputSignature(SetGrammarParser.InputSignatureContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#functionCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionCall(SetGrammarParser.FunctionCallContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitType(SetGrammarParser.TypeContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#signatureFunction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSignatureFunction(SetGrammarParser.SignatureFunctionContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#functionReturn}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionReturn(SetGrammarParser.FunctionReturnContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#functionNonReturn}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionNonReturn(SetGrammarParser.FunctionNonReturnContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#blockReturn}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlockReturn(SetGrammarParser.BlockReturnContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#blockNonReturn}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlockNonReturn(SetGrammarParser.BlockNonReturnContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#equalCompare}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEqualCompare(SetGrammarParser.EqualCompareContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#compare}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCompare(SetGrammarParser.CompareContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#simpleCompare}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSimpleCompare(SetGrammarParser.SimpleCompareContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#negationCompare}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNegationCompare(SetGrammarParser.NegationCompareContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#elseBlock}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElseBlock(SetGrammarParser.ElseBlockContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#ifBlock}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfBlock(SetGrammarParser.IfBlockContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#whileBlock}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWhileBlock(SetGrammarParser.WhileBlockContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#sizeExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSizeExpression(SetGrammarParser.SizeExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#getExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGetExpression(SetGrammarParser.GetExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#indexOfExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIndexOfExpression(SetGrammarParser.IndexOfExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpression(SetGrammarParser.ExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link SetGrammarParser#content}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitContent(SetGrammarParser.ContentContext ctx);
}