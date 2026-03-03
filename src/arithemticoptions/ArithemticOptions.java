
package arithemticoptions;
import javax.swing.*;

/**
 *
 * @author lab_services_student
 */
public class ArithemticOptions {


    public static void main(String[] args) {
        int val1, val2,val3;
        String operation;
        
        
    val1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first value"));
    
    val2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second value"));
    
    val3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third value"));
    
    operation = JOptionPane.showInputDialog("Enter an operator symbol");
    
    if(operation.equals("+")){
        JOptionPane.showMessageDialog(null,"Additon-> " + "(" + val1 + "+" + val2 + "+" + val3  + ")" + "= " + (val1 + val2 + val3));
          
    } 
    
    else if(operation.equals ("-")){
        JOptionPane.showMessageDialog(null,"Subtraction-> " + "(" + val1 + "-" + val2 + "+" + val3 + ")" + "=" + (val1 - val2 + val3));
    } 
    
    else if (operation.equals ("*")){
        
       JOptionPane.showMessageDialog(null,"Multiplication-> " + "(" + val1 + "x" + val2 + ")" + "= " + (val1* val2 * val3)); 
    } 
    
    else if (operation.equals ("/")){
        JOptionPane.showMessageDialog(null,"Division-> " + "(" + val1 + "/" + val2 + ")" + "= " + (val1/val2));
    } 
    
    else if (operation.equals ("%")){
        
        JOptionPane.showMessageDialog(null,"Remainder-> " + "(" +val1 + "%"+ val2 + ")" + "= " + (val1%val2));
    }
    else if(operation.equals ("sum")){
        JOptionPane.showMessageDialog(null,"Summation->" + "(" + val1 + "+" + val2 + "+" + val3 + "/3"  + "="  + (val1 + val2 + val3/3));
    }
    
    else{
        JOptionPane.showMessageDialog(null,"Not a valid operation symbol");
    }
    
    
    }
    
    
}
