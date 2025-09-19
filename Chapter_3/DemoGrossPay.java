public class DemoGrossPay{
   public static void main(String[] a){
   
   String output = calculateGross();
   displayOutput(output);
   
   }
   public static String displayOutput(String calculate){
   
   String output = calculate;
   System.out.println(output);

   return output;
   
   }
   
   public static String calculateGross(){
   
      //hours ni  
      double h1 = 10.0;
      double h2 = 25.0;
      double h3 = 37.5;
      
      //hourly rate ni siya
      double rate = 22.75;
      
      
      double num1 = h1 * rate;
      double num2 = h2 * rate;
      double num3 = h3 * rate;
      
      String calculate = h1+" hours at $"+ rate+" per hour is $"+num1+ "\n"
                       + h2+" hours at $"+ rate+" per hour is $"+num2+ "\n"
                       + h3+" hours at $"+ rate+" per hour is $"+num3+ "\n";
      return calculate;
   }
}