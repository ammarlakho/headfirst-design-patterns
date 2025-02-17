package bank;

public interface Command {

    public void execute();

    public void undo();
}
