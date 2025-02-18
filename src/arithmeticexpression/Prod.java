package arithmeticexpression;

public class Prod implements ArithmeticExpression {
    private final ArithmeticExpression left;
    private final ArithmeticExpression right;

    public Prod(ArithmeticExpression left, ArithmeticExpression right) {
        this.left = left;
        this.right = right;
    }

    public String toString() {
        return "(" + this.left + "*" + this.right + ")";
    }

    public Const eval(Environment env) {
        return new Const(left.eval(env).getValue() * right.eval(env).getValue());
    }
}
