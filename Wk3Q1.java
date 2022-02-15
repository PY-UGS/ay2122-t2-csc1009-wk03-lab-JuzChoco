import java.util.Date;
import java.lang.Math;


public class Wk3Q1 {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;
    //private double monthlyPayment;

    double getAnnualInterestRate(){
        return annualInterestRate;
    }

    void setAnnualInterestRate(double a){
        this.annualInterestRate = a;
    }

    int getNumberOfYears(){
        return numberOfYears;
    }

    void setNumberOfYears(int a){
        this.numberOfYears = a;
    }

    double getLoanAmount(){
        return loanAmount;
    }

    void setLoanAmount(double a){
        this.loanAmount = a;
    }

    Date getLoanDate(){

        long milliS = System.currentTimeMillis();
        Date loanDate = new Date(milliS);
        return loanDate;
    }
    void setLoanDate(Date a){
        this.loanDate = a;
    }

    double testing(){
        return numberOfYears * loanAmount;
    }

    double getMonthlyPayment(){

        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfYears_twelve = numberOfYears * 12;
        double testing = Math.pow((1 + monthlyInterestRate), (numberOfYears_twelve));
        double testing1 = 1 / testing;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - testing1);
        
        
        return monthlyPayment;
    }

    double getTotalPayment(){

        double totalPayment = this.getMonthlyPayment() * numberOfYears * 12;

        return totalPayment;
    }
}
