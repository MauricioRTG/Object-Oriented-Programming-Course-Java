/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.prueba;

import javax.swing.JOptionPane;

/**
 *
 * @author 162106 Mauricio Tenorio 
 */
public class Calculator { //Constructor
    double value1, value2;
    char operator;
    public  Calculator(){
        value1= value2 = 0;
        operator = ' ';
    }
    public double add(){
        //double result = 0.0;
        return value1 + value2;
    }
     public double substract(){
        //double result = 0.0;
        return value1 - value2;
    }
     public double divide(){
        if(value2 != 0)
        return value1/value2;
        else{
           //System.out.println("Error= division by zero");
           return value1;
        }
    }
    public double multiplication(){
        //double result = 0.0;
        return value1 * value2;
    }
    
}
