/**
 * IALP es. CalcolaNotaDecimo 
 * 
 * @author marko.mirkovic
 * Version 10.10.2021
 */
package calcolanotadecimo;


public class CalcolaNotaDecimo {


    public static void main(String[] args) {
        
        /*Scrivere un secondo programma chiamato CalcolaNotaDecimo
        nel quale viene dichiarata la variabile double media contenente
        la media dei 3 test calcolata da MediaNote e viene arrotondata
        mezzo punto più vicino.
        Ad esempio 5.4 viene approssimato a 5.5,
        mentre 5.77 viene approssimato a 6.*/
        
        
        double nota1 = 5.4;
        double nota2 = 5.6;
        double nota3 = 5.77;
        
        double nota1Arrotondata;
        double nota2Arrotondata;
        double nota3Arrotondata;
        
        double mediaNote;
        
        
        nota1Arrotondata = ((int)(0.5 + nota1 / 0.5))*0.5;
        nota2Arrotondata = ((int)(0.5 + nota2 / 0.5))*0.5;
        nota3Arrotondata = ((int)(0.5 + nota3 / 0.5))*0.5;
        
        mediaNote = (nota1Arrotondata+nota2Arrotondata+nota3Arrotondata)/3;
        
        mediaNote = ((int)(0.5 + mediaNote / 0.5))*0.5;
                
        System.out.println("nota 1 arrotondata = " + nota1Arrotondata);
        System.out.println("nota 2 arrotondata = " + nota2Arrotondata);
        System.out.println("nota 3 arrotondata = " + nota3Arrotondata);
        //System.out.println("media note arrotondate = " + (int)(mediaNote));
        System.out.println("media note arrotondate = " + (mediaNote));
        
    }
    
}
