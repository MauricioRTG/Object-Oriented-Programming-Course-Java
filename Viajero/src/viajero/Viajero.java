/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajero;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.io.File;
/**
 *
 * @author Mauricio Raúl Tenorio Guzmán 162106 23/08/2019
 */
public class Viajero extends JFrame implements ActionListener{

   int FRAME_WIDTH    = 400;

    /**
     * Default frame height
     */
    int FRAME_HEIGHT   = 400;

    /**
     * X coordinate of the frame default origin point
     */
     int FRAME_X_ORIGIN = 150;

    /**
     * Y coordinate of the frame default origin point
     */
     int FRAME_Y_ORIGIN = 250;
     
     int partida;
     int destino;
     
     JMenu options;
     
     JTextArea textArea;
     
     Matrix myarray;
     
     String opcionmenu;
     
     int dato;
     
     int i;
     
     
    public static void main(String[] args) {
     Viajero frame = new Viajero();
       frame.setVisible(true);
    }
    public Viajero(){
        Container contentPane; 
        
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (false);
        setTitle     ("Mi Arreglo");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
       myarray = new Matrix(); //Se crea el objeto de la clase MiArreglo
        
        JMenuItem item; 
           
        options = new JMenu("Actions"); 
        
        item = new JMenuItem("Fill");
        item.addActionListener(this);
        options.add(item);
        
        options.addSeparator();
        
        item = new JMenuItem("Print");
        item.addActionListener(this);
        options.add(item);
        
        options.addSeparator();
        
        item = new JMenuItem("Search");
        item.addActionListener(this);
        options.add(item);
          
        item = new JMenuItem ("Exit");
        item.addActionListener(this);
        options.add(item);
        
        JMenuBar menuBar = new JMenuBar();//Se crea el area la bara para el menu
        setJMenuBar(menuBar);
        menuBar.add(options);
      

        contentPane = getContentPane( );
        contentPane.setLayout( null );
        contentPane.setBackground( new Color(22, 26, 35));
        
         textArea = new JTextArea(); //Se crea el area para escribir
        JScrollPane scrollText= new JScrollPane(textArea);
        scrollText.setBounds(1, 1, 392, 340);

        textArea.setEditable(false);
        scrollText.setBorder(BorderFactory.createLineBorder(Color.blue));
        contentPane.add(scrollText);
        textArea.setFont(new Font("Serif", Font.PLAIN, 50));
        
        setDefaultCloseOperation( EXIT_ON_CLOSE ); //Se cierra el programa
        
    }
    
    public void actionPerformed (ActionEvent e){
        String clickedbutton = e.getActionCommand();
        opcionmenu = clickedbutton;
        metodos();
    }
     public void metodos(){ //Switch case para cada caso de uso, para ser mostrado en el menu y el usuario pueda interactuar con estas opciones.
             switch(opcionmenu){
            case ("Fill"): 
                myarray.Fill();
            break;
            case ("Print"): 
                myarray.print();
            break;
            case ("Search"): 
                String input = JOptionPane.showInputDialog("Escoge lugar de partida");
                partida= Integer.parseInt(input);
                String input2 = JOptionPane.showInputDialog("Escoge lugar de destino");
                destino= Integer.parseInt(input2);
                myarray.search(destino,partida);
                
    
            break;
            case ("Exit"): System.exit(0);
            break;
            
        }
    }
}

