package bank;

public class TestBank {

    public static void main(String[] args) {
        int depositAmount = 100;
        int withdrawalAmount = 20;

        BankAccount bankAccount = new BankAccount(0); // Receiver
        System.out.println("Initial Balance: " + bankAccount.getBalance());

        DepositCommand depositCommand = new DepositCommand(bankAccount, depositAmount);
        WithdrawalCommand withdrawalCommand = new WithdrawalCommand(bankAccount, withdrawalAmount);

        depositCommand.execute();
        System.out.println("Balance After Deposit: " + bankAccount.getBalance());
        withdrawalCommand.execute();
        withdrawalCommand.execute();
        withdrawalCommand.execute();
        withdrawalCommand.execute();
        withdrawalCommand.execute();
        withdrawalCommand.execute();
        withdrawalCommand.execute();

        System.out.println("Balance After Withdrawal: " + bankAccount.getBalance());


    }
}
