package lprosecondosemestre_2021_2022;

/**
 *
 * @author marko.mirkovic
 */
public class NewClass
{
    public static void main(String[] args)
    {
        Carta c = new Carta();
        
        //valore che non vogliamo c.seme = '$';
        //per proteggere mettiamo private
        
        //c.seme = '$'; non accetta in quanto private
        
        //utente puo' inviare un valore non accettato (che non vogliamo):   es -7
        
        c.setValore(1);
        
        System.out.println(c.getValore());
        
        c.setAsso();
        
        //impostiamo il seme
        
        c.setPicche();
        System.out.println(c.getValore() + " " + c.getSeme());
        
        "ww".endsWith("w");
        
        Carta cc = new Carta();
        cc.setQueen();
        cc.setCuori();
        
        Carta. ;
        
        //Differenza tra classe e' oggetto
        
        //La classe contiente tutti gli attributi della classe
        
        //vs. attributi di instanza (i e ii)
        
        
        int i0 = Integer.MAX_VALUE;//nella classe integer
        Integer i = 7;//nel valore i integer
        Integer ii = 77;//nel valore ii integer
        
               
        
    }
}
