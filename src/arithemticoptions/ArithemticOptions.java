
package arithemticoptions;
import javax.swing.*;

/**
 *
 * @author lab_services_student
 */
public class ArithemticOptions {


    public static void main(String[] args) {
        int val1, val2, val3;
        String operation;

        val1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first value"));
        val2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second value"));
        val3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third value"));
        operation = JOptionPane.showInputDialog("Enter an operator symbol  (+, -, *, /, %)");

        int sum = val1 + val2 + val3;
        double average = sum / 3.0;
        String sumAvg = "\nSum-> (" + val1 + "+" + val2 + "+" + val3 + ") = " + sum
                           + "\nAverage-> (" + val1 + "+" + val2 + "+" + val3 + ")/3 = " + average;

        if (operation.equals("+")) {
            JOptionPane.showMessageDialog(null,
                "Addition-> (" + val1 + "+" + val2 + "+" + val3 + ") = " + (val1 + val2 + val3)
                + sumAvg);

        } else if (operation.equals("-")) {
            JOptionPane.showMessageDialog(null,
                "Subtraction-> (" + val1 + "-" + val2 + "-" + val3 + ") = " + (val1 - val2 - val3)
                + sumAvg);

        } else if (operation.equals("*")) {
            JOptionPane.showMessageDialog(null,
                "Multiplication-> (" + val1 + "x" + val2 + "x" + val3 + ") = " + (val1 * val2 * val3)
                + sumAvg);

        } else if (operation.equals("/")) {
            JOptionPane.showMessageDialog(null,
                "Division-> (" + val1 + "/" + val2 + ") = " + (val1 / val2)
                + sumAvg);

        } else if (operation.equals("%")) {
            JOptionPane.showMessageDialog(null,
                "Remainder-> (" + val1 + "%" + val2 + ") = " + (val1 % val2)
                + sumAvg);

        } else {
            JOptionPane.showMessageDialog(null, "Not a valid operation symbol");
        }
    
    
    }
    
    
}
