import java.util.Scanner;

public class SalaryCalculator {

    public double salaryYear(double amount, int hour){
        double result = amount*hour*52;
        return result;
    }
    public static void main(String[] args) {
        int hour=0;
        double amount = 0.0;
        System.out.println("How many hours do you work per week?");
        Scanner hourInput = new Scanner(System.in);
        hour = hourInput.nextInt();
        System.out.println("How much do you earn per hour?");
        Scanner amountInput = new Scanner(System.in);
        amount = amountInput.nextDouble();
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        System.out.println("Employee's gross yearly salary: "+salaryCalculator.salaryYear(amount,hour));
    }
}
