import grammar.SetGrammarBaseVisitor;
import grammar.SetGrammarParser;

public class Visitor extends SetGrammarBaseVisitor<String> {
    String program = "public class Program {\n" +
            "    public static void main(String[] args) {\n" +
            "        try {\n" +
            "            start();\n" +
            "        } catch (Exception e) {\n" +
            "            System.err.println(e.getMessage());\n" +
            "        }\n" +
            "    }\n" +
            "    private static void start() throws Exception\n";

    @Override
    public String visitDeclaration(SetGrammarParser.DeclarationContext ctx) {
        String buffer = "";
        if (ctx.SET() != null)
            buffer += "Set ";
        buffer += "" + ctx.NAME().getText() + " = "+ visitExpression(ctx.expression());
        return buffer;
    }

    @Override
    public String visitProgram(SetGrammarParser.ProgramContext ctx) {
        String buffer = program;
        buffer += visitBlock(ctx.block()) + "\n}";
        return buffer;
    }

    @Override
    public String visitBlock(SetGrammarParser.BlockContext ctx) {
        String buffer = "{\n";
        for (SetGrammarParser.ContentContext context : ctx.content())
            buffer += visitContent(context) + "\n";
        buffer += "}\n";
        return buffer;
    }

    @Override
    public String visitPrint(SetGrammarParser.PrintContext ctx) {
        return "\tSystem.out.println(" + ctx.LINE().getText() + ");";
    }

    @Override
    public String visitPrint_set(SetGrammarParser.Print_setContext ctx) {
        return "\tSystem.out.println(" + ctx.NAME().getText() + ".toString());";
    }

    @Override
    public String visitExpression(SetGrammarParser.ExpressionContext ctx) {
        if(ctx.SET_EXPRESSION()!=null)
            return "new Set(new Element"+ ctx.SET_EXPRESSION().getText() + ")";
        if(ctx.PLUS()!=null)
            return "plus(" + ctx.getChild(0).getText() + ", " + ctx.getChild(2).getText() +");";
        if(ctx.MINUS()!=null)
            return "minus(" + ctx.getChild(0).getText() + ", " + ctx.getChild(2).getText() +");";
        if(ctx.DIVIDE()!=null)
            return "divide(" + ctx.getChild(0).getText() + ", " + ctx.getChild(2).getText() +");";
        if(ctx.MULTIPLY()!=null)
            return "multiply(" + ctx.getChild(0).getText() + ", " + ctx.getChild(2).getText() +");";
        if (ctx.getChildCount()==1)
            return ctx.getChild(0).getText();
        return "";
    }

    @Override
    public String visitContent(SetGrammarParser.ContentContext ctx) {
        if (ctx.print() != null)
            return visitPrint(ctx.print());
        else if (ctx.declaration() != null)
            return visitDeclaration(ctx.declaration());
        else if (ctx.print_set()!=null)
            return visitPrint_set(ctx.print_set());
        else return "";
    }
}

