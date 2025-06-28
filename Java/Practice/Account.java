public class Account {
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
        }
    }

    public double getBalance() {
        return balance;
    }
}

