package tris;

import java.util.Scanner;


public class Fase_99_Finito_v3 
{
    public static void main(String[] args) 
    {
        //Due giocatori
        final char G1= 'x';   //Potrei anche farlo iniziare chiedendo il simbolo al giocatore
        final char G2= 'o';
        final char VUOTA= ' ';
        
        
        //Tabella di gioco
        final int SIZE=3;
        int r, c;
        char[][] tris= new char[SIZE][SIZE];
        
        //Inizializzo tutte le celle a VUOTA
        for(r=0; r<tris.length; r++) {
            for(c=0; c<tris[r].length; c++) {
                tris[r][c]= VUOTA;
            }
        }
        
        
        //Quando finisce?
        boolean parità=false;
        boolean vittoria= false;
        
        
        Scanner in= new Scanner(System.in);
        
        char simbolo= G2;   //Simulo che il gioco inizi con il simbolo G2, tanto verrà subito cambiato n G1        
        int celleVuote= tris.length*tris[0].length-1;
        int celleUguali=0;
        do {
            //------------------------------------------------------------------
            //Cambio giocatore
            if(simbolo==G1) simbolo=G2;
            else simbolo=G1;
            
            
            //------------------------------------------------------------------
            //Stampo
            for(r=0; r<tris.length; r++) {
                for(c=0; c<tris[r].length; c++) {
                    int larg= 1;
                    System.out.print( String.format("%4d[%-" + larg + "c]%s", (r*tris.length+c)+1, tris[r][c], "     ") );                    
                }
                System.out.println("");
            }
            
            
            //-----------------------------------------------------------------
            //Chiedo al giocatore di inserire le coordinate            
            do {                
                int cella;
                do {
                    System.out.print("Giocatore '" + simbolo + "' cella [1..9]: ");

                    while(!in.hasNextInt()) {
                        in.nextLine();
                        System.out.print("Giocatore '" + simbolo + "' cella [1..9]: ");
                    }
                    cella= in.nextInt();
                    in.nextLine();
                } while(cella<1 || cella>tris.length*tris.length);
                
                cella--;        //Calcolo riga e colonna.
                r= cella/tris.length;     //Come se fossimo in base 10, ma ragione in base 3
                c= cella%tris.length;                
            } while(tris[r][c]!=VUOTA);
            System.out.println("\n\n");
            
            
            //Occupo la cella
            tris[r][c]=simbolo;
            

            //------------------------------------------------------------------
            //Vittoria?
            vittoria= false;
            for(r=0; r<tris.length; r++) {
                celleUguali=0;

                for(c=0; c<tris[r].length; c++) {                       //Scorro le altre celle, notate che il ciclo parte da 1, e le confronto con la prima
                    if( tris[r][c]== simbolo ) celleUguali++;           //Se la prima cella è vuota, oppure è diversa dalla cella che sto controllando                    
                }

                if(celleUguali==tris.length) {                          //Tante celle quante sono quelle presenti sulla riga?
                    vittoria=true;
                    break;                                              //Interrompo il ciclo se c'è la vittoria
                }
            }


            //Non ha vinto sulle righe, controllo le colonne
            if(!vittoria) {
                for(c=0; c<tris[0].length; c++)  {                      //Uguale uguale all'algoritmo usato sopra per le righe
                    celleUguali=0;

                    for(r=0; r<tris.length; r++) {
                        if( tris[r][c]== simbolo ) celleUguali++;
                    }

                    if(celleUguali==tris.length) {
                        vittoria=true;
                        break;
                    }
                }                    
            }


            //Non ha vinto sulle colonne, controllo le diagonali
            if(!vittoria) {
                celleUguali=0;
                
                for(int d=0; d<tris.length; d++) {
                    if( tris[d][d]==simbolo ) celleUguali++;
                }
                
                if(celleUguali==tris.length) vittoria=true;                
            }      
            
            if(!vittoria) {
                celleUguali=0;
                
                for(int d=0; d<tris.length; d++) {
                    if( tris[d][tris.length-1-d]==simbolo ) celleUguali++;
                }
                
                if(celleUguali==tris.length) vittoria=true;                
            }                
    
            
            //------------------------------------------------------------------
            //Parità?
            if(celleVuote--==0) {
                if(!vittoria) parità= true;     //Se c'è vittoria non può esserci parità
            }
            
        } while(!parità && !vittoria);
        
        if(vittoria) System.out.println("Vinto giocatore '" + simbolo + "'");
        else if(parità) System.out.println("Pari");
        
        
        
        //------------------------------------------------------------------
        //Stampo
        for(r=0; r<tris.length; r++) {
            for(c=0; c<tris[r].length; c++) {
                System.out.print( r*tris.length+c+1 + "[" + tris[r][c] + "]\t");
            }
            System.out.println("");
        }        
    }    
}