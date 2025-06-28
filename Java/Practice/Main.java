public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAccountNumber("123ABC");
        acc.deposit(1000);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: $" + acc.getBalance());
    }
}
