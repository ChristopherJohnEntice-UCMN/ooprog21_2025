public class Employee {
    
    private static final int MaxEmployeeNumber = 9999;
    private static final double MaxRate = 60.00;
    private static final double OverTimerate = 1.5;
    private static final int RegularHours = 40;

    private int employeeNumber;
    private double hoursWorked;
    private double payRate;

    public Employee(int employeeNumber, double hoursWorked, double payRate){
        if (employeeNumber <= 0 || employeeNumber > MaxEmployeeNumber) {
            throw new IllegalArgumentException("Employee NUmber must be between 0 and " + MaxEmployeeNumber);
        }
        if(payRate < 0 ){
            throw new IllegalArgumentException("Pay rate must be between 0.00 and " + MaxRate);
        }

        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }

    public int employeeNumber(){
        return employeeNumber;
    }
    public double hoursWorked(){
        return hoursWorked;
    }
    public double payRate(){
        return payRate;
    }


    public double calculateRegularPay(){
    
    return Math.min(hoursWorked, RegularHours) * payRate;

    }

    public double calculateOverTimePay(){
        if(hoursWorked <= RegularHours){
            return 0.0;
        } 

        double Over = hoursWorked - RegularHours;
        double overTimerate = Over * payRate *OverTimerate;
        return overTimerate;

    }

}
