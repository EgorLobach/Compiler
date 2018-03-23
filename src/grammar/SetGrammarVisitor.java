// Generated from D:/work/java/Compiler/grammar\SetGrammar.g4 by ANTLR 4.7
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SetGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SetGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SetGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SetGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(SetGrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SetGrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#print_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_set(SetGrammarParser.Print_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SetGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SetGrammarParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(SetGrammarParser.ContentContext ctx);
}