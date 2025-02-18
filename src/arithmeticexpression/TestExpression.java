package arithmeticexpression;

public class TestExpression {

    /**
     * Describe how the Composite Pattern is used!
     * The ArithmeticExpr class is a unified interface. Both the const(individual leaf elements) and the
     * Sum/Prod/Neg (composites) follow the same interface and implement the eval function
     * so that any client class can create as nested an expression as they would like.
     */
    public static void main(String[] args) {
        Environment env = new Environment();
        Const four = new Const(5);
        Const five = new Const(5);
        Const seven = new Const(7);
        Const eight = new Const(8);
        Const nine = new Const(9);
        Const ten = new Const(10);


        ArithmeticExpression finalExpr =
                new Neg(new Sum(
                    new Prod(five, seven),
                    new Prod(nine, ten)
                ));

        System.out.println(finalExpr + " = " + finalExpr.eval(env));


        // x + -1(4*7)
        ArithmeticExpression varExpression = new Sum(
            new Var("x"),
            new Neg(new Prod(four, seven))
        );
        env.put("x", new Const(4));
        System.out.println(varExpression + " = " + varExpression.eval(env));
        env.put("x", new Const(-34));
        System.out.println(varExpression + " = " + varExpression.eval(env));
        env.put("x", new Const(30));
        System.out.println(varExpression + " = " + varExpression.eval(env));

    }
}
