package bank;

public class WithdrawalCommand implements Command {
    private final int withdrawalAmount;
    private final BankAccount bankAccount;
    private boolean executed;
    private boolean success;

    public WithdrawalCommand(BankAccount bankAccount, int withdrawalAmount) {
        this.bankAccount = bankAccount;
        this.withdrawalAmount = withdrawalAmount;
        this.executed = false;
        this.success = false;
    }

    @Override
    public void execute() {
        this.success = this.bankAccount.changeBalance(this.withdrawalAmount, BalanceChangeEnum.WITHDRAW);
        executed = true;
    }

    @Override
    public void undo() {
        if (!executed) {
            throw new IllegalStateException("Command cannot be undo-ed since it isn't been executed");
        }
        if (!success) {
            // Since withdrawal failed, undo-ing it isn't necessary, and we can simply re-toggle success back to true.
            this.success = true;
        }

        //Both executed and success are true, now we can undo
        this.bankAccount.changeBalance(this.withdrawalAmount, BalanceChangeEnum.DEPOSIT);
    }
}
