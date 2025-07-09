import bank.accounts.CurrentAccount;
import bank.accounts.SavingsAccount;

public class BankApp {
    public static void main(String[] args) {
        // Create accounts
        SavingsAccount savings = new SavingsAccount("SA123", 1000);
        CurrentAccount current = new CurrentAccount("CA456", 2000);

        // Simulate transactions
        savings.deposit(500);
        savings.withdraw(300);
        savings.showBalance();

        System.out.println();

        current.deposit(1000);
        current.withdraw(2500); // Attempt over-withdraw
        current.showBalance();
    }
}
