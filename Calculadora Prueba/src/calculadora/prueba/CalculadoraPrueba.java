/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.prueba;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


/**
 *
 * @author LIVERPOOL I5
 */
public class CalculadoraPrueba extends JFrame implements ActionListener {

     /**
     * Default frame width
     */
    int FRAME_WIDTH    = 400;

    /**
     * Default frame height
     */
    int FRAME_HEIGHT   = 623;

    /**
     * X coordinate of the frame default origin point
     */
     int FRAME_X_ORIGIN = 150;

    /**
     * Y coordinate of the frame default origin point
     */
     int FRAME_Y_ORIGIN = 250;

    /**
     * Default width for buttons
     */
     int BUTTON_WIDTH  = 99;

    /**
     * Default height for buttons
     */
     int BUTTON_HEIGHT = 80;

    /**
     * Constant for empty string
     */
     String EMPTY_STRING = "";

    /**
     * Constant for platform specific newline
     */
     //String NEWLINE = System.getProperty("line.separator");
     String buttonText;
     
     String buttonText2;
     String buttonText3;
     String buttonText4;
     
     boolean check_first;
     
     
     String numero_palabra;
     JMenu Options;
    // Construye el 
    /**
     * The Swing button for Cancel
     */
     //JButton clearButton;

    /**
     * The Swing button for OK
     */
     JButton zero;
     JButton one;
     JButton two;
     JButton three;
     JButton four;
     JButton five;
     JButton six;
     JButton seven;
     JButton eight;
     JButton nine;
     JButton plus;
     JButton dividir;
     JButton cross;
     JButton minus;
     JButton igual;
     //JButton dot;
     //JButton parentesisizq;
     //JButton parentesisderecho;
     //JButton erase;

    /**
     * The JTextField for the user to enter a text
     */
     //JTextField inputLine;

    /**
     * The JTextArea for displaying the entered text
     */
     JTextField textArea;
     
    
     Calculator mycalc;//Declarar la clase calculadora
     

//----------------------------------
//      Main method
//----------------------------------
    public static void main(String[] args) {
       CalculadoraPrueba frame = new CalculadoraPrueba();
        frame.setVisible(true);
        
    }


//----------------------------------
//    Constructors
//----------------------------------

    /**
     * Default constructor
     */
    public CalculadoraPrueba() {
        Container contentPane;

        //set the frame properties
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (false);
        setTitle     ("Calculator");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        //setBackground ( new Color(152, 150, 123));
        JMenuItem item;
        
        mycalc = new Calculator ();
        
        Options = new JMenu("Options");
        
        item = new JMenuItem("Clear");
        item.addActionListener(this);
        Options.add(item);
        
        Options.addSeparator();
        
        item = new JMenuItem("Exit");
        item.addActionListener(this);
        Options.add(item);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(Options);

        contentPane = getContentPane( );
        contentPane.setLayout( null );
        contentPane.setBackground( new Color(22, 26, 35));

        //create and place two buttons on the frame
        one = new JButton("1");
        one.setBounds(0, 405, BUTTON_WIDTH, BUTTON_HEIGHT);
        one.setBackground( new Color (51,59,78));
        one.setForeground(Color.WHITE);
        one.setFont(new Font("Serif", Font.PLAIN, 28));
        contentPane.add(one);
        
        four = new JButton("4");
        four.setBounds(0, 325, BUTTON_WIDTH, BUTTON_HEIGHT);
        four.setBackground( new Color (51,59,78));
        four.setForeground(Color.WHITE);
        four.setFont(new Font("Serif", Font.PLAIN, 28));
        contentPane.add(four);
        
        seven = new JButton("7");
        seven.setBounds(0, 245, BUTTON_WIDTH, BUTTON_HEIGHT);
        seven.setBackground( new Color (51,59,78));
        seven.setForeground(Color.WHITE);
        seven.setFont(new Font("Serif", Font.PLAIN, 28));
        contentPane.add(seven);
        
        
        
        zero = new JButton("0");
        zero.setBounds(100, 485, BUTTON_WIDTH, BUTTON_HEIGHT);
        zero.setBackground( new Color (51,59,78));
        zero.setForeground(Color.WHITE);
        zero.setFont(new Font("Serif", Font.PLAIN, 28));
        contentPane.add(zero);
        
        two = new JButton("2");
        two.setBounds(99, 405, BUTTON_WIDTH, BUTTON_HEIGHT);
        two.setBackground( new Color (51,59,78));
        two.setForeground(Color.WHITE);
        two.setFont(new Font("Serif", Font.PLAIN, 28));
        contentPane.add(two);
        
        five = new JButton("5");
        five.setBounds(99, 325, BUTTON_WIDTH, BUTTON_HEIGHT);
        five.setBackground( new Color (51,59,78));
        five.setForeground(Color.WHITE);
        five.setFont(new Font("Serif", Font.PLAIN, 28));
        contentPane.add(five);
        
        eight = new JButton("8");
        eight.setBounds(99, 245, BUTTON_WIDTH, BUTTON_HEIGHT);
        eight.setBackground( new Color (51,59,78));
        eight.setForeground(Color.WHITE);
        eight.setFont(new Font("Serif", Font.PLAIN, 28));
        contentPane.add(eight);
        
        three = new JButton("3");
        three.setBounds(198, 405, BUTTON_WIDTH, BUTTON_HEIGHT);
        three.setBackground( new Color (51,59,78));
        three.setForeground(Color.WHITE);
        three.setFont(new Font("Serif", Font.PLAIN, 28));
        contentPane.add(three);
        
        /*dot = new JButton(".");
        dot.setBounds(198, 485, BUTTON_WIDTH, BUTTON_HEIGHT);
        dot.setBackground( new Color (51,59,78));
        dot.setForeground(Color.WHITE);
        dot.setFont(new Font("Serif", Font.PLAIN, 28));
        contentPane.add(dot);*/
        
        six = new JButton("6");
        six.setBounds(198, 325, BUTTON_WIDTH, BUTTON_HEIGHT);
        six.setBackground( new Color (51,59,78));
        six.setForeground(Color.WHITE);
        six.setFont(new Font("Serif", Font.PLAIN, 28));
        contentPane.add(six);
        
        nine = new JButton("9");
        nine.setBounds(198, 245, BUTTON_WIDTH, BUTTON_HEIGHT);
        nine.setBackground( new Color (51,59,78));
        nine.setForeground(Color.WHITE);
        nine.setFont(new Font("Serif", Font.PLAIN, 28));
        contentPane.add(nine);
        
        igual = new JButton("=");
        igual.setBounds(297, 485, BUTTON_WIDTH, BUTTON_HEIGHT);
        igual.setBackground( new Color (66,197,195));
        igual.setForeground(Color.WHITE);
        igual.setFont(new Font("Serif", Font.PLAIN, 28));
        contentPane.add(igual);
        
        plus = new JButton("+");
        plus.setBounds(297, 405, BUTTON_WIDTH, BUTTON_HEIGHT);
        plus.setBackground( new Color (39,47,60));
        plus.setForeground(Color.WHITE);
        plus.setFont(new Font("Serif", Font.PLAIN, 28));
        contentPane.add(plus);
        
        minus = new JButton("-");
        minus.setBounds(297, 325, BUTTON_WIDTH,BUTTON_HEIGHT);
        minus.setBackground( new Color (39,47,60));
        minus.setForeground(Color.WHITE);
        minus.setFont(new Font("Serif", Font.PLAIN, 28));
        contentPane.add(minus);
        
        cross = new JButton("x");
        cross.setBounds(297, 245, BUTTON_WIDTH, BUTTON_HEIGHT);
        cross.setBackground( new Color (39,47,60));
        cross.setForeground(Color.WHITE);
        cross.setFont(new Font("Serif", Font.PLAIN, 28));
        contentPane.add(cross);
        
        dividir = new JButton("/");
        dividir.setBounds(297, 168, BUTTON_WIDTH, BUTTON_HEIGHT);
        dividir.setBackground( new Color (39,47,60));
        dividir.setForeground(Color.WHITE);
        dividir.setFont(new Font("Serif", Font.PLAIN, 28));
        contentPane.add(dividir);
        
       
        
        /*clearButton = new JButton("CLEAR");
        clearButton.setBounds(0, 168, 297, BUTTON_HEIGHT);
        clearButton.setBackground( new Color (39,47,60));
        clearButton.setForeground(Color.WHITE);
        clearButton.setFont(new Font("Serif", Font.PLAIN, 15));
        contentPane.add(clearButton);*/

        //register this frame as an action listener of the two buttons
        //clearButton.addActionListener(this);
        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        cross.addActionListener(this);
        dividir.addActionListener(this);
        igual.addActionListener(this);
        //dot.addActionListener(this);
        
        

       /* inputLine = new JTextField();
        *

        //inputLine.addActionListener(this);*/

        //textArea = new JTextArea();
        //textArea.setBounds(50, 5, 200, 135);
        //textArea.setBorder(BorderFactory.createLineBorder(Color.red));

//---------------------------------------
//  Different types of borders; some borders effective if background color is changed
//
//       textArea.setBorder(BorderFactory.createEtchedBorder(Color.blue, Color.gray));
        //textArea.setBorder(BorderFactory.createLoweredBevelBorder());
//        textArea.setBorder(BorderFactory.createRaisedBevelBorder());
//        textArea.setBorder(BorderFactory.createTitledBorder("JTextArea"));
//
//-------------------------------------

        //textArea.setEditable(false);
        //contentPane.add(textArea);

//----------------------------------------------------
//      To add scroll bars to the text area

        textArea = new JTextField();
        textArea.setBounds(1, 1, 393, 168);
        textArea.setFont(new Font("Serif", Font.PLAIN, 50));
        textArea.setBackground( new Color (22,26,35));
        textArea.setForeground(Color.WHITE);
        textArea.setEditable(false);
        textArea.setHorizontalAlignment(JTextField.RIGHT);
        
        contentPane.add(textArea);
        //scrollText.setBorder(BorderFactory.createLineBorder(Color.blue));
        //contentPane.add(scrollText);

           buttonText="";
           buttonText2="";
           buttonText3= "";
          check_first = true;
          
           
//------------------------------------------------------
        
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }

//-------------------------------------------------
//      Public Methods:
//
//          void    actionPerformed   (   ActionEvent        )
//
//------------------------------------------------

    /**
     * Standard method to respond the action event.
     *
     * @param event the ActionEvent object
     *
     */
    
    public void actionPerformed(ActionEvent event) {
            if (event.getSource() instanceof JButton) {
                JButton clickedButton = (JButton) event.getSource();
                //buttonText = event.getActionComand(JButton);
                if(check_first == true){
                if (clickedButton == zero  || clickedButton == one || clickedButton == two || clickedButton == three || clickedButton == four || clickedButton == five || clickedButton == six || clickedButton == seven || clickedButton == eight || clickedButton == nine) {
                 
                    buttonText  = buttonText+clickedButton.getText();
                   textArea.setText(buttonText);
                   mycalc.value1 = Double.parseDouble(buttonText);
                   
                   
                }
                }
                  if(check_first == true){
                if(clickedButton == cross  || clickedButton == dividir   || clickedButton == minus   || clickedButton == plus ){
                    textArea.setText(EMPTY_STRING);
                    buttonText3 = clickedButton.getText();
                    mycalc.operator = buttonText3.charAt(0);
                    //para que desaparesca la primera acumulacón de numeros  
                    check_first = false;
                    if(clickedButton == cross){
                        mycalc.value2= 1;
                    }
                    else{
                        
                      mycalc.value2= 0;
                    }
                    if(clickedButton == dividir){
                        mycalc.value2= 1;
                    }
                }
                }
                if (clickedButton == zero & check_first == false|| clickedButton == one & check_first == false || clickedButton == two & check_first == false|| clickedButton == three & check_first == false|| clickedButton == four & check_first == false|| clickedButton == five & check_first == false|| clickedButton == six & check_first == false|| clickedButton == seven & check_first == false|| clickedButton == eight & check_first == false|| clickedButton == nine & check_first == false) {
                 
                    buttonText2  = buttonText2+clickedButton.getText();
                   textArea.setText(buttonText2);
                   mycalc.value2 = Double.parseDouble(buttonText2);  
                }
                if(clickedButton == cross & check_first == false || clickedButton == dividir  & check_first == false || clickedButton == minus  & check_first == false || clickedButton == plus & check_first == false || clickedButton == igual & check_first == false){
                    
                        if(clickedButton == cross){
                             operaciones();
                             mycalc.value2 = 0;
                             buttonText3 = "";
                             buttonText2 = "";
                             buttonText3 = clickedButton.getText();
                             mycalc.operator = buttonText3.charAt(0);
                            
                        }
                        else{
                        operaciones();
                        buttonText3 = "";
                        buttonText2 = "";
                        buttonText3 = clickedButton.getText();
                        mycalc.operator = buttonText3.charAt(0);
                        //Los acumuladores de numeros se reinician
                        mycalc.value2 = 0;
                        }
                        //borrar si necesario
                       
                }
 
            }
         if(event.getSource() instanceof JMenuItem){
                     String clickedbutton = event.getActionCommand();
                      if(clickedbutton.equals("Exit")){
                          System.exit(0);
                      }
                      else{
                          textArea.setText(null);
                          buttonText2 = "";
                          buttonText = ""; 
                          buttonText3 = "";
                          check_first = true;
                          if(mycalc.operator =='x'){
                              //mycalc.value1 = 0;
                              mycalc.value2 = 1;  
                              mycalc.value1 = 1;
                        
                          }
                          else{
                             // mycalc.value2 = 0;
                              mycalc.value2 = 0;
                              mycalc.value1 = 0;
                          }
                      }
        }
    }
        public void operaciones(){
             switch(mycalc.operator){
            case ('+'): mycalc.value1 = mycalc.add();
                numero_palabra = String.valueOf(mycalc.value1);
                textArea.setText(numero_palabra);
            break;
            case ('-'): mycalc.value1 = mycalc.substract();
                numero_palabra = String.valueOf(mycalc.value1);
                textArea.setText(numero_palabra);
            break;
            case ('x'): mycalc.value1 = mycalc.multiplication();
                numero_palabra = String.valueOf(mycalc.value1);
                textArea.setText(numero_palabra);
            break;
            case ('/'): mycalc.value1 = mycalc.divide();
                      numero_palabra = String.valueOf(mycalc.value1);
                
                if(mycalc.value2 == 0 ){
                textArea.setText("Error");
                }
                else{
                        textArea.setText(numero_palabra);
                }
            break;
            }
            //mycalc.operator = tempOp;
            }
        }

    
