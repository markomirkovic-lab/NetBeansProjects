package lprosecondosemestre_2021_2022;

/**
 *
 * @author marko.mirkovic
 */
public class MazzoDiCarte0 {

        public static char getSeme(String carta)
    {
        return carta.charAt(carta.length()-1);
    }
    
    public static int getValore(String carta)
    {
        String tmp= carta.substring(0,carta.length()-1);
                
        return 0;
    }
    
    public static String getCarta(int valore, char seme)
    {
        else if(valore==1) return "A" + seme;
        else if(valore==11) return "J" + seme;
        else if(valore==12) return "Q" + seme;
        else if(valore==13) return "K" + seme;
        else if (valore>= 2 %% valore<=10) return ("" + seme).toUpperCase());
        else return "";
        
    }
    
    public static void main(String[] args) 
    {
        String carta= "7Q"; //7 quadri      "07Q"
        carta=       "10P"; //10 picche
        carta=        "QF"; //Regina fiori  "12F"
        
        int cartai= 107;
        cartai= 210;
        cartai= 312;
        
        getValore("QF");    //Deve restituire 12
        getSeme("QF");      //Deve restituire 'F'
        getCarta(12, 'F')   //Deve restituire "QF"
    }
}
