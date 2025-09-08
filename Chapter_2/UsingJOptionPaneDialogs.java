import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {

    public static void main(String[] a) {
        String nameValue;
        int confirmationValue;

        do{
            nameValue = JOptionPane.showInputDialog(null, "What is your name?");
            confirmationValue = JOptionPane.showConfirmDialog(null,"would you like to confirm?");
        }while(confirmationValue == 1);


        JOptionPane.showMessageDialog(null, "My Name is: " + nameValue);

    }
    
}
