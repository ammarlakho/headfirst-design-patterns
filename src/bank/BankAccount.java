package bank;

public class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getBalance() {
        return this.balance;
    }

    public boolean changeBalance(int change, BalanceChangeEnum balanceChangeType) {
        if (balanceChangeType == BalanceChangeEnum.DEPOSIT) {
            this.balance += change;
            return true;
        } else if (balanceChangeType == BalanceChangeEnum.WITHDRAW) {
            if (change > this.balance) {
                return false;
            }
            this.balance -= change;
            return true;
        }

        return false;
    }
}
