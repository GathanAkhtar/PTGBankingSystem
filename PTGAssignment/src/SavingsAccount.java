public class SavingsAccount extends Account{
    private double interestRate;
    private double minimumBalance;
    private int month;

    public SavingsAccount (String accountNumber, String ownerName, double balance, double interestRate, double minimumBalance, int month) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
        this.month = month;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void withdraw (double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal denied: Minimum balance required.");
        }
    }
}
