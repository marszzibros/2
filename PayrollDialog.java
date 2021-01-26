import javax.swing.JOptionPane;

/**
 * This program demonstrates using dialogs with JOptionPane
 */

public class PayrollDialog {
    public static void main(String[] args)
    {
        String inputString;     // for reading input
        String name;            // the user's name
        int hours;              // the number of hours worked
        double payRate;         // the user's hourly pay rate
        double grossPay;        // the user's gross pay

        // get the user's name
        name = JOptionPane.showInputDialog("What is your name?");

        // get the hours worked
        inputString = JOptionPane.showInputDialog("How many hours did you work this week?");
        hours = Integer.parseInt(inputString);

        // get the hours worked
        inputString = JOptionPane.showInputDialog("What is your hourly pay rate?");
        payRate = Double.parseDouble(inputString);

        grossPay = payRate * hours;

        // dispay the results
        JOptionPane.showMessageDialog(null, "Hello " + name + ". Your gross pay is $" + grossPay);
        System.exit(0);
    }
}
