
public class CompanyInfo{
   public static void main(String[] args){
      
      String companyName  = displayCompanyName();
      String companyHours = displayHours();
      
      displayOutput(companyName,companyHours);
   }
   
   public static void displayOutput(String companyName, String companyHours){
      String output = companyName + "\n" +
                      companyHours;
                      
      System.out.println(output);
   }
   
   
   
   public static String displayCompanyName() {
      String companyName = "Smart Electronics";
      return companyName;
   }
   
   public static String displayHours(){
      String companyHours = "Monday - Friday " + "8am to 6pm\n" +
                            "Saturday        " + "8am to noon\n"+
                            "Sunday          " + "closed";
      return companyHours;
      
   }
}