public class Main {

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(
                "SA001", "Ali", 1000,
                0.02, 200, 1
        );

        CurrentAccount current = new CurrentAccount(
                "CA001", "Ahmad", 500,
                300, 10, 1
        );

        savings.withdraw(700);
        System.out.println("Savings Balance: " + savings.getBalance());
        System.out.println("Savings Interest: " + savings.calculateInterest());

        System.out.println();

        current.withdraw(700);
        System.out.println("Current Balance: " + current.getBalance());
        System.out.println("Current Monthly Fee: " + current.calculateInterest());
    }
}
