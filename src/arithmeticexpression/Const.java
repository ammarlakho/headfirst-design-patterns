package arithmeticexpression;

public class Const implements ArithmeticExpression {
    private final int value;

    public Const(int value) {
        this.value = value;
    }

    public Const eval(Environment env) {
        return this;
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        return Integer.toString(this.value);
    }
}
