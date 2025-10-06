import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("How many hours did you work this week? ");
        int hoursWorked = input.nextInt();

        System.out.print("What is your regular pay rate? ");
        double payRate  = input.nextDouble();

        int employeeNumber = 1231;
        
        Employee employee = new Employee(employeeNumber, hoursWorked, payRate);   

        System.out.println("Regular Pay is " + employee.calculateRegularPay());
        System.out.println("Overtime pay is " + employee.calculateOverTimePay());
    }
}
