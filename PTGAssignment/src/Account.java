public class Account {

    protected String accountNumber;
    protected String ownerName;
    protected double balance;

    // Constructor
    public Account(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method (akan dioverride)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method (akan dioverride)
    public double calculateInterest() {
        return 0;
    }

    public double getBalance() {
        return balance;
    }
}
