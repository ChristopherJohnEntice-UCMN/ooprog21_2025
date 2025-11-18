import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Count Elements Greater Than Previous Average\n");
        
        System.out.print("How many response times will you enter? ");
        int size = input.nextInt();
        
        int[] responseTimes = new int[size];
        
        System.out.print("Enter " + size + " response times: ");
        for (int i = 0; i < size; i++) {
            responseTimes[i] = input.nextInt();
        }
        
       
        System.out.print("\nInput\n\nresponseTimes = [");
        for (int i = 0; i < responseTimes.length; i++) {
            System.out.print(responseTimes[i]);
            if (i < responseTimes.length - 1) System.out.print(", ");
        }
        System.out.println("]\n");
        
        
        int result = countGreater(responseTimes);
        System.out.println("Output\n");
        System.out.println(result);
        
        input.close();
    }

       public static int countGreater(int[] arr) {
        if (arr.length < 2) return 0;

        int count = 0;
        double sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            double avg = sum / i;   
            if (arr[i] > avg) {
                count++;
            }
            sum += arr[i];          
        }
        return count;
    }

}
