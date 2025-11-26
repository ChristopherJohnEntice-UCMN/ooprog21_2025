import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = scanner.nextLine();

        if (name.equals("Carmen")) {
            System.out.println("Names match!");
        } 
        else if (name.equals("carmen")) {
            System.out.println("Carmen does not equal carmen");
        } 
        else {
            System.out.println("Names do not match.");
        }
    }
}
