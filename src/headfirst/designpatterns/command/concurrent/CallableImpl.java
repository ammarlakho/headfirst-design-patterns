package headfirst.designpatterns.command.concurrent;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable<Integer> {
    private int myName;

    CallableImpl(int i) {
        myName = i;
    }

    public Integer call() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread : " + getMyName() + " I is : " + i);
        }
        return new Integer(getMyName());
    }

    public int getMyName() {
        return myName;
    }

    public void setMyName(int myName) {
        this.myName = myName;
    }
}
