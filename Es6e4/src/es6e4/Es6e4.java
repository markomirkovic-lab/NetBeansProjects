/**
 * Testing es. 6.4 
 * basato su es. 3.8
 * 
 * @author marko.mirkovic
 * Version 03.10.2021
 */
package es6e4;


public class Es6e4 {

   
    public static void main(String[] args) {
        int tanicaLitri5 = 5; //tanica grande
        int tanicaLitri3 = 3; //tanica piccola
        //int litriTravaso = 0;
        //int litriRimanenti = 0;
        
        tanicaLitri5 = tanicaLitri5 - tanicaLitri3; //con tanica grande riempire la tanica piccola
        tanicaLitri3 = 0; //svuotare la tanica 3 litri
        tanicaLitri3 = tanicaLitri5; //travaso da tanica 5 litri a tanica 2 litri
        tanicaLitri5 = 5; //riempio la tanica 5 litri
        tanicaLitri3 = tanicaLitri3 + 1; //travaso la tanica 5 litri a tanica 3 litri (1 litro)
        tanicaLitri5 = tanicaLitri5 - 1; //rimanenza nella tanica 2 litri (5-1 litri)
               
        
        System.out.println("tanicaLitri5 " + tanicaLitri5 + " tanicaLitri3 = " + tanicaLitri3);
        
    }
    
}
