package cap_2_sjavprimosemestre;

/**
 *
 * @author marko.mirkovic
 * @version 29.08.202
 */
public class Aa {
    public static void main(String[] args)
    {
        Bb b1 = new Bb("Frank"); //otteniamo un oggetto di tipo Bb
        Bb b2 = new Bb("Pippo"); //un altro oggetto di tipo Bb
        
        String s1 = b1.getName();
                //this assume la refference
                
        String s2 = b2.getName();
                //this assume la refference
                        
                
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
    }
}
