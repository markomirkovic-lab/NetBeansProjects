package alprclasse;

/**
 *
 * @author marko.mirkovic
 * @version 17 October 2022
 */
public class ZZZ_Cane 
{
    public static void main(String[] args)
    {
        Cane Fufi = new Cane("Fufi",30.5);
        System.out.println(Fufi.nome + " " + Fufi.getPesoLibre());
        
        /*
        run-single:
        Fufi 67.77777777777777
        */
        
        Fufi.peso = -10;
        System.out.println(Fufi.nome + " " + Fufi.getPesoLibre());
        
        Fufi.setPeso(-10);
        System.out.println(Fufi.nome + " " + Fufi.getPesoLibre());
        
        /*
        run-single:
        Fufi 67.77777777777777
        Fufi -22.22222222222222
        Fufi -22.22222222222222
        */
        
    }
}
