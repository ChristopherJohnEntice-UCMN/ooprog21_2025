import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance;
        double interestRate = 0.03; 
        int year = 0;
        int choice;

        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();

        do {
            System.out.print( "Do you want to see next year's balance?\n" +
                        "Enter 1 for yes or any other number for no >>");
            choice = input.nextInt();

            if (choice == 1){
             year++;
             balance = balance + (balance * interestRate);

            //System.out.printf("After year " + year + " at " +  interestRate + " interest rate , balance is %.2f\n " + balance);
            System.out.printf("After year" + year + " at "  + interestRate + " interest rate, balance is %.2f\n", balance);
            }
        } while (choice == 1);
        input.close();
    }
}