public class CurrentAccount extends Account {

    private double overdraftLimit;
    private double monthlyFee;
    private int month;

    public CurrentAccount (String accountNumber, String ownerName, double balance, double overdraftLimit, double monthlyFee, int month) {
        super(accountNumber, ownerName, balance);
        this.overdraftLimit = overdraftLimit;
        this.monthlyFee = monthlyFee;
        this.month = month;
    }

    @Override
    public double calculateInterest() {
        return - monthlyFee * month;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal denied: Overdraft limit excedeed");
        }
    }
}
