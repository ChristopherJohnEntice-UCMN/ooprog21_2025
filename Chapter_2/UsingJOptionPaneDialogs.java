import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {

    public static void main(String[] a) {
        String nameValue;
        String sectionValue;
        int confirmationValue;
        

        JOptionPane.showMessageDialog(null, "Welcome to Ooprog Quiz 1.01");

        do{
            
            nameValue = JOptionPane.showInputDialog(null, "What is your name?");
            sectionValue = JOptionPane.showInputDialog(null, "What is your Course and Section?");
            confirmationValue = JOptionPane.showConfirmDialog(null,"would you like to confirm?");
        }while(confirmationValue == 1);


        JOptionPane.showMessageDialog(null, "My Name is: " + nameValue + " Section: " + sectionValue);

    }
    
}
