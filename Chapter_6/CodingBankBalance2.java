import java.util.Scanner;

public class CodingBankBalance2 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        double balance;
        double rate = 0.03;
        int year = 0;
        int choice;

        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();

        System.out.print( "Do you want to see next year's balance?\n" +
                        "Enter 1 for yes or any other number for no >>");
        choice = input.nextInt();

        do {
            if (choice == 1){
             year++;
             balance = balance + (balance * rate);

            System.out.printf("After year " + year + " at " +  rate + " interest rate, balance is $%.2f\n", balance);
            }

            System.out.print( "Do you want to see next year's balance?\n" +
                        "Enter 1 for yes or any other number for no >>");
            choice = input.nextInt();
        } while (choice == 1);
        input.close();
                

    }
}
