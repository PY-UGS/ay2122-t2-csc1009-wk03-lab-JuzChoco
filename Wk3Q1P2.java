import java.util.Scanner;

public class Wk3Q1P2 {
    
    public static void main(String[] args){

        Wk3Q1 loan = new Wk3Q1();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter annual interest rate, for example, 8.25: ");
        loan.setAnnualInterestRate(sc.nextDouble());

        System.out.println("Enter number of years as an integer: ");
        loan.setNumberOfYears(sc.nextInt());

        System.out.println("Enter loan amount, for example, 120000.95: ");
        loan.setLoanAmount(sc.nextDouble());

        System.out.println("The loan was created on: " + loan.getLoanDate());

        System.out.format("The monthly payment is: %.2f", loan.getMonthlyPayment());
        
        System.out.print("\n");
        
        System.out.format("The total payment is: %.2f", loan.getTotalPayment());
        sc.close();
    }
}
