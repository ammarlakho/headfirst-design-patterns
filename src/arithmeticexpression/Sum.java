package arithmeticexpression;

public class Sum implements ArithmeticExpression {

    private final ArithmeticExpression left;
    private final ArithmeticExpression right;

    public Sum(ArithmeticExpression left, ArithmeticExpression right) {
        this.left = left;
        this.right = right;
    }

    public String toString() {
        return "(" + this.left + "+" + this.right + ")";
    }

    public Const eval(Environment env) {
        return new Const((this.left.eval(env).getValue()) + (this.right.eval(env).getValue()));
    }
}
