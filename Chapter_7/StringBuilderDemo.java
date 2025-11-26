import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter your name: ");
        String nameInput = scanner.nextLine();

        System.out.print("Enter your address: ");
        String addressInput = scanner.nextLine();

        
        StringBuilder nameString = new StringBuilder(nameInput);
        StringBuilder addressString = new StringBuilder(addressInput);

        
        System.out.println("\n(StringBuilder 1) nameString: " + nameString);
        System.out.println("Capacity of nameString is: " + nameString.capacity());

        System.out.println("(StringBuilder 2) addressString: " + addressString);
        System.out.println("Capacity of addressString is: " + addressString.capacity());

       
        nameString.setLength(20);
        addressString.setLength(20);

   
        System.out.println("\n(Length set to 20 for StringBuilder 1) The name is " 
                            + nameString + "end");

        System.out.println("(Length set to 20 for StringBuilder 2) The address is "
                            + addressString);
    }
}
