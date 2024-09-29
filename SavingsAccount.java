public class SavingsAccount {
    static double annualInterestRate;
    double savingsBalance;
    public SavingsAccount(double initialBalance) {
        savingsBalance = initialBalance;
    }
    void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance += monthlyInterest;
    }
   static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }
public void getSavingsBalance() {
        System.out.printf("Savings Balance: $%.2f%n", savingsBalance);

    }
    public static void main(String[] args) {
        SavingsAccount.modifyInterestRate(0.04);
        SavingsAccount account1 = new SavingsAccount(1000.0);
        account1.calculateMonthlyInterest();
         account1.getSavingsBalance();
            }
}
