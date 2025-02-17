package bank;

import java.io.*;

public class DepositCommand implements  Command {
    private final int depositAmount;
    private final BankAccount bankAccount;
    private boolean executed;

    public DepositCommand(BankAccount bankAccount, int depositAmount) {
        this.bankAccount = bankAccount;
        this.depositAmount = depositAmount;
    }

    @Override
    public void execute() {
        if (this.executed) {
            throw new IllegalStateException("Cannot execute deposit again");
        }
        this.bankAccount.changeBalance(this.depositAmount, BalanceChangeEnum.DEPOSIT);
    }

    @Override
    public void undo() {
        if (!this.executed) {
            throw new IllegalStateException("Command cannot be undo-ed since it isn't been executed");
        }
        this.bankAccount.changeBalance(this.depositAmount, BalanceChangeEnum.WITHDRAW);
    }
}
