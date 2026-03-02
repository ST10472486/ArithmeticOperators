
package arithemticoptions;
import javax.swing.*;

/**
 *
 * @author lab_services_student
 */
public class ArithemticOptions {


    public static void main(String[] args) {
        int val1, val2, result;
        String operation;
        
        
    val1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first value"));
    
    val2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second value"));
    
    
    
    operation = JOptionPane.showInputDialog("Enter an operator symbol");
    
    if(operation == "+"){
        result = val1 + val2;
        JOptionPane.showMessageDialog(null,"Additon->" + "(" + (val1 + "+" + val2)+ ")" + "=" + result);
          
    } 
    
    else if(operation == "-"){
        result = val1 - val2;
        JOptionPane.showMessageDialog(null,"Subtraction->" + "(" + (val1 - val2) + ")" + "=" + result);
    } 
    
    else if (operation == "*"){
        result = val1*val2;
       JOptionPane.showMessageDialog(null,"Multiplication->" + "(" + (val1 + val2) + ")" + "=" + result); 
    } 
    
    else if (operation == "/"){
        result = val1/val2;
        JOptionPane.showMessageDialog(null,"Division->" + "(" + (val1 / val2) + ")" + "=" + result);
    } 
    
    else if (operation == "%"){
        result = val1 % val2;
        JOptionPane.showMessageDialog(null,"Remainder->" + "(" +(val1 % val2)+ ")" + "=" + result);
    }
    
    else{
        JOptionPane.showMessageDialog(null,"Not a valid operation symbol");
    }
    
    
    }
    
    
}
