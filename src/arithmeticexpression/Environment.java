package arithmeticexpression;

import java.util.HashMap;

public class Environment {
    private final HashMap<String, Const> env;

    public Environment() {
        this.env = new HashMap<>();
    }

    public Const lookup(String key) {
        return this.env.get(key);
    }

    public void put(String key, Const value) {
        this.env.put(key, value);
    }
}
