package arithmeticexpression;

public class Var implements ArithmeticExpression {
    private final String name;

    public Var(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public Const eval(Environment env) {
        return env.lookup(this.name);
    }
}
