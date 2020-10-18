/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajero;

import javax.swing.JOptionPane;

/**
 *
 * @author LIVERPOOL I5
 */
public class Matrix {
    int maat [][];
      int costo = 0;
    public Matrix(){
        maat = new int [15][15];
    }
    void Fill()
    {
        for(int i=0;i<15;i++)
        {
            for(int j=0;j<15;j++)
            {
                maat[i][j] = 0;
            }
        }
        //Primer renglón
        maat[0][1]=maat[1][0]= 800;
        maat[0][3]=maat[3][0]= 500;
        maat[0][4]=maat[4][0]= 200;
        maat[0][5]=maat[5][0]= 400;
        maat[0][6]=maat[6][0]= 850;
        maat[0][8]=maat[8][0]=100;
        maat[0][9]=maat[9][0]= 60;              
        maat[0][14]=maat[14][0]= 470;
       
        //Segundo renglón      
        maat[1][2]=maat[2][1]= 125;
        maat[1][3]=maat[3][1]= 80;
       
        //Tercer renglón
        maat[2][7]=maat[7][2]= 200;
        maat[2][10]=maat[10][2]= 75;
       
        //Cuarto renglón
        maat[3][14]=maat[14][3]= 50;
       
        //Quinto renglón
        maat[4][8]= maat[8][4]=70;
       
        //Sexto renglón
        maat[5][7]=maat[7][5]= 150;
        maat[5][10]=maat[10][5]= 240;
        maat[5][14]=maat[14][5]= 150;
       
        //Séptimo renglón
        maat[6][10]=maat[10][6]= 300;
        maat[6][11]=maat[11][6]= 90;
        maat[6][12]=maat[12][6]= 60;
        maat[6][13]=maat[13][6]= 350;
       
        //Octavo renglón
        maat[7][14]=maat[14][7]= 100;
       
        //Noveno renglón        
        //Décimo renglón        
        //Onceavo renglón
       
        //Doceavo renglón
        maat[11][12]=maat[12][11]=70;
        maat[11][13]=maat[13][11]=250;
       
        //Treceavo renglón        
        //Catorceavo renglón                
        //Quinceavo renglón                    
    }
   
    void print()
    {
        for(int i=0;i<15;i++)
        {
            for(int j=0;j<15;j++)
            {
                System.out.printf("%4d\t",maat[i][j]);
            }
            System.out.println();
        }
    }
    public void search (int destino, int partida ){
       //Checa pirmero si hay un vuelo directo a X
       //Desde el mismo lugar a que se quiere buscar, va a la primera ciudad que esta en su fila, así hasta encontrar el destino. 
       //Se acumula en una pila la ruta
       //Si sigue sin encontrarlo elimina las ciudades y checa el siguiente al primera ciudad en la fila y así sucesivamente
       
       //Promero con un for busca en la fila de la ciudad de partida si hay un vuelo directo
       //Me falta: no estoy tomando en cuenta cuando no lo encuentra, y tiene que borrar lo que se habia guardado en costos.
       //Eliminar con un for que vaya comience desde el alto de la pila y vaya eliminando de manera descendente.
       int buscador = 0;
       int buscador1 = 0;
       int save = 0;
       int save2 = 0;
       int contador_viajes = 0;
       int [] viajepila = new int [15];
       boolean verifica = false;
       boolean mas_viajes = false;
       boolean preguntar = false;
       int i;
       int antpartida = 0;
       
       viajepila[contador_viajes] = partida;
       if(maat[partida][destino] == 0){
           mas_viajes = true;
           for(i= 0 ; i<15; i++){
               buscador = maat[partida][i];
               
               if(buscador != 0){
                   //System.out.println(buscador);
                   //Asigna el nodo disponible y lo pone como nueva partida a recorrer
                   partida = i;
                   //verifica si ya ha ido por ese viaje.
                   for(int a=0; a<15;a++){
                           if(i == viajepila[a]){
                               verifica = true;
                           }
                    }
                   if (verifica == true){
                       
                       verifica = false;
                       //Si ya se habia ido a esa ruta se checa si hay otra ruta en ese viaje, si lo hay lo asigna como nueva partida y se hace recursciòn, si no entonces se vuelve al viaje anterior para recorrerlo y ver si hay otra posible ruta.
                        for(int c=i+1; c<15;c++){
                           buscador1 = maat[partida][c];
                           //Checa si en la fila de ese viaje hay otro viaje disponible.
                               if(buscador1 != 0){
                                   //costo = costo + buscador1;
                                   partida = c;
                                   contador_viajes++;
                                   search(destino,partida);
                               }
                               else{
                                   //Si no hay otro viaje disponible vuelve al anterior viaje y se brinca el que ya se habia recorrido por el siguinete viaje.
                                    //antpartida = viajepila[contador_viajes-1];
                                    //costo = costo - maat[antpartida][partida];
                                   partida = viajepila[contador_viajes-1];
                                    contador_viajes--;
                                    search(destino,partida);
                               }
                           
                        }    
                   }
                   else{
                       //Si no ha ido por ese nodo antes entonces lo recorre y lo guarda en la pila.
                      // costo = costo + buscador;
                       contador_viajes ++;
                        search(destino,partida);
                   }
                   
               }
           }
           
       }
       else{
           //Si hubo más de un viaje para llegar al destino
           contador_viajes++;
           viajepila[contador_viajes] = destino;
           if(mas_viajes == true){
               for(int z=1; z<=contador_viajes; z++){
                   //save = viajepila[z];
                   //save2 = viajepila[z-1];
                    save = viajepila[z];
                    System.out.println(save);
                   //costo = costo + maat[save2][save];
                   
                }
               //System.out.println(costo);
           }
           else{
               //Si el viaje fue directo
               costo = maat[partida][destino];
               //System.out.println(costo);
               
           }
            
       }
     
     
   }
}
