package arithmeticexpression;

public class Neg implements ArithmeticExpression {
    private final ArithmeticExpression expr;

    public Neg(ArithmeticExpression expr) {
        this.expr = expr;
    }

    public String toString() {
        return "(-1*" + this.expr + ")";
    }

    public Const eval(Environment env) {
        return new Const(-1 * this.expr.eval(env).getValue());
    }
}
