class Account {
    private String accountNumber;
    private double balance;

    public void setAccountNumber(String accNum) {
        accountNumber = accNum;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAccountNumber("123ABC");
        acc.deposit(1000);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.printf("Balance: $%.2f\n", acc.getBalance()); // Formatted output
    }
}
