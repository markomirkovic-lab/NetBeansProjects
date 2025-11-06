package alprclasse;

/**
 *
 * @author marko.mirkovic
 * @version 17 October 2022
 */
public class ZZZ_Persona 
{
    public static void main(String[] args)
    {
//        Persona aldo = new Persona();
//        aldo.nome = "Aldo";
//        aldo.cognome = "Brazorf";
//        aldo.altezza = 150;
        
        Persona aldo = new Persona("Aldo", "Brazorf", 'M', 150);
        
        aldo.saluta();
        System.out.println(aldo.nome);
        System.out.println(aldo.altezza);
        
        
//        Persona miro;
//        miro = new Persona();
//        miro.nome = "Miro";
        
        Persona miro;
//        miro = new Persona("Miro","",0);
        miro = new Persona("Miro");
        
        miro.saluta();
        System.out.println(miro.nome);
        System.out.println(miro.altezza);
        
        
        System.out.println("-----------");
        
        
        Persona a = new Persona("Cicci0");
        Persona b = new Persona("Giacomo");
        System.out.println("a.getNome() " + a.getNome());
        System.out.println("b.getNome() " +b.getNome());
        System.out.println("a.getId() " + a.getId());
        System.out.println("b.getId() " + b.getId());
        
        /*
        run-single:
        Ciao mi chiamo Aldo
        Aldo
        150
        Ciao mi chiamo Miro
        Miro
        10
        -----------
        a.getNome() Cicci0
        b.getNome() Giacomo
        a.getId() 1
        b.getId() 2
        */
    }
}
