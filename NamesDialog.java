import javax.swing.JOptionPane;
/**
    This program demonstrates using dialogs with JOptionPane
 */
public class NamesDialog {
    public static void main(String[] args)
    {
        String firstName, lastName;

        // get the user's first name. 
        firstName = JOptionPane.showInputDialog("What is your first name?");

        // get the user's last name. 
        lastName = JOptionPane.showInputDialog("What is your last name?");         

        // display a greeting
        JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName);
        System.exit(0);

    }
}
