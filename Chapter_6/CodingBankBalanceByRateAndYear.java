import java.util.Scanner;

public class CodingBankBalanceByRateAndYear {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double balance;

        System.out.println("Enter Initial bank balance> ");
        balance = input.nextDouble();

        double [] rates = {0.02, 0.03, 0.04, 0.05};
        

        for(int i=0; i<=4; i++){

            double rate = rates[i];
            double tempBalance = balance;

            System.out.println("With an initial balance of $" + balance + " at an interest rate of:" + rate);

            for(int year = 1; year <=4; year++) {

                tempBalance = tempBalance + (tempBalance * rate);

                System.out.printf("After year " + year + " at " +  rate + " interest rate, balance is $%.2f\n", tempBalance);
            }
            
        }

        
        /* 
        for(int year=1 ; year <=4; year++) {
            System.out.println("With an initial balance of $" + balance+ " at an interest rate of: " );


            for( rate= 0.01; rate <= 0.05; rate += 0.01) {
                
                double tempBalance = balance; 
                tempBalance = tempBalance + (tempBalance * rate * year);

    
                System.out.printf("After year " + year + " at " +  rate + " interest rate, balance is $%.2f\n", tempBalance);
           } 

        }*/

    }
}
