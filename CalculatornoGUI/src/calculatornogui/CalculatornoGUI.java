/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatornogui;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class CalculatornoGUI {

    double value1, value2;
    char operator;
    
    
    
    public CalculatornoGUI (){ //constuructor 
        value1 = 0.0;
        value2 = 0.0;
        operator = ' ';
    }
    
     public  double add(){
            return value1 + value2;
        }
        
          public double substract(){
            return value1 - value2;
        }
          
             public double multiply(){
            return value1 * value2;
        }
             public double divide(){
                
                    return value1/value2;
               
               
            }
           
    public static void main(String[] args) {
        // TODO code application logic here
       CalculatornoGUI mycalc;
       String input;
       char tempOP;
       mycalc = new  CalculatornoGUI();
       
  
       input = JOptionPane.showInputDialog("Type first vaule");
       mycalc.value1 = Double.parseDouble(input);
       input = JOptionPane.showInputDialog("Type operator");
       mycalc.operator = input.charAt(0);
       
            do{
                
       input = JOptionPane.showInputDialog("Type second vaule");
       mycalc.value2 = Double.parseDouble(input);
       
       input = JOptionPane.showInputDialog("Type next operator");
       tempOP = input.charAt(0);
       
       switch (mycalc.operator){
       
           case '+': JOptionPane.showMessageDialog(null,"Result = " +mycalc.add());
           break;
           
           case '-': JOptionPane.showMessageDialog(null,"Result = " +mycalc.substract());
           break; 
           
           case '*': JOptionPane.showMessageDialog(null,"Result = " +mycalc.multiply());
           break;
           
           case '/': if(mycalc.value2 != 0){
               JOptionPane.showMessageDialog(null,"Result = " +mycalc.divide());
           }
           else{
                    JOptionPane.showMessageDialog(null,"Error= division by zero");    
            }
           break;
       }
       mycalc.operator = tempOP;                                                
       }
       while(tempOP != '=');
    }
    
}
