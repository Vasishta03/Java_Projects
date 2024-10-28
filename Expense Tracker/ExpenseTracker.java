import java.util.Scanner;

public class ExpenseTracker {
    private double bal;

    public ExpenseTracker() {
        bal = 0.0;
    }

    public void addIncome(double amount) {
        bal += amount;
    }

    public void addExpense(double amount) {
        bal -= amount;
    }

    public double getBalance() {
        return bal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseTracker tracker = new ExpenseTracker();

        while (true) {
            System.out.println("1. Add Income || 2. Add Expense || 3. View Balance || 4. Exit ");
            System.out.print("Your Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Income amount: ");
                    double income = scanner.nextDouble();
                    tracker.addIncome(income);
                }
                case 2 -> {
                    System.out.print("Expense amount: ");
                    double expense = scanner.nextDouble();
                    tracker.addExpense(expense);
                }
                case 3 -> System.out.println("Current Balance: Rs." + tracker.getBalance());
                case 4 -> {
                    System.out.println("Exiting...!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
