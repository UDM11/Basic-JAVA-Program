package bank.accounts;

public class SavingsAccount {
    private String accountNumber;
    private double balance;

    public SavingsAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to SavingsAccount.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from SavingsAccount.");
        } else {
            System.out.println("Insufficient balance in SavingsAccount.");
        }
    }

    public void showBalance() {
        System.out.println("SavingsAccount Balance: " + balance);
    }
}
