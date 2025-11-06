package SearchSort;

/**
 *
 * @author marko.mirkovic
 */
public class NewClass
{
    public static char getSeme(String carta)
    {
        return carta.charAt(carta.length()-1);
    }
    
    public static void getValore(String carta)
    {
        String valore = carta.substring(0, carta.length()-1);
        
        
    }
    
    public static String setCarta(int valore, char seme)
    {
        
    }
    
    public static void main(String[] args)
    {
        //carta:
        //numero:   A,...,13   j Q K
        //seme      CQFP
        //          1234
        
        int ci;
        //   2 seme 07 numero carta
        ci = 207;   //2: Quadri      7: carta
        ci = 312;   //3: Fiori      12: regina
        ci = 110;   //1: Cuori      10: carta
        
        //int da 1 a 52
        
        String cs; //valore + seme
        cs = "7Q";
        cs = "QF";
        cs = "10C";
        
        getValore("QF");
        getValore("10C");
        
        
        //mazzo carte array di string [52]
        
        //per mischiare le carte = bogo sort 1000 volte (doppio grandezza
        //dell'array, logaritmo base 10^10) rand scegli un # e lo scambi con primo
        
        
    }
}
