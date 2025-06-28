package bank.accounts;

public class CurrentAccount {
    private String accountNumber;
    private double balance;

    public CurrentAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to CurrentAccount.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from CurrentAccount.");
        } else {
            System.out.println("Insufficient balance in CurrentAccount.");
        }
    }

    public void showBalance() {
        System.out.println("CurrentAccount Balance: " + balance);
    }
}
