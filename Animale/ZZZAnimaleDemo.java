package Animale;

/**
 * ZZZ Animale Demo
 * @author marko.mirkovic
 * @version 25 September 2022
 */
public class ZZZAnimaleDemo 
{
    public static void emettiRumore(Animale a)
    {
        System.out.println(a.getClass().getSimpleName() + ": " + a.getVerso());
        
        System.out.println("L'oggetto fornito e' un");
        
        if(a instanceof Animale)
        {
            System.out.println("- Animale");
        }
        
        if(a instanceof Felino)
        {
            System.out.println("- Felino");
        }
        
        if(a instanceof Gatto)
        {
            System.out.println("- Gatto");
        }
    }
    public static void main(String[] args)
    {
        Animale cane = new Animale("Wyle E.", "Coyote", "uhuhuhuu");
        cane.setMaschio();
        System.out.println(cane);
        
        System.out.println("");
        
        Animale leonessa = new Animale("Nala", "Leone", "roar");
        leonessa.setFemmina();
        System.out.println(leonessa);
        
        Felino leone = new Felino("Nala", "roar", 70, 3);
        leone.setSpecie("leone");
        leone.setFemmina();
        System.out.println(leone);
        
        
        System.out.println("---");
        Gatto kitty = new Gatto("Kitty", true);
        System.out.println(kitty);
        System.out.println("---");
        Gatto kitto = new Gatto("Kitto", true);
        kitto.setName("Kitto");
        kitto.setVerso("Mauuu");
        kitto.setGenere('M');
        kitto.setVelocita(35);
        kitto.setAltezzaSalto(1.5);
        
        System.out.println(kitty);
        System.out.println(kitto);
        System.out.println("---");
        //Gatto argo = new Gatto();
        System.out.println("----------");
        
        Animale cane2 = new Animale("Wyle E.", "Coyote", "uhuhuhuu");
        Felino leone2 = new Felino("Nala", "roar", 70, 3);
        Gatto gatto = new Gatto("Silvestro", false);
        
        //se fosse il codice emettiRumore nella classe animale
        //allora per richiamare il metodo bisogna scrivere
        //animale.emettiRumore(...);
        emettiRumore(cane);
        emettiRumore(leone);
        emettiRumore(gatto);
        
        /**
         * Una classe anonima è una classe “locale” senza un nome assegnato, 
         * si tratta di una classe definita e instanziata un’unica volta 
         * attraverso una singola espressione caratterizzata da una versione 
         * estesa della sintassi dell’operatore new. 
         * In parole povere se dovete creare una classe da usare una sola 
         * volta non sempre conviene scrivere tutto il codice, la possiamo 
         * scrivere al volo nel punto del codice in cui la si userà.
         */
        
        //idem per qui: animale.emettiRumore(...
        emettiRumore(             
                new Animale("Ciop", "scoiattolo", "boh")             
                {                 
                    @Override                 
                    public String getVerso()                 
                    {                     
                        return("Quello dello scoiattolo");
                    }
                }
        );
                
    }
    
    /*
    run-single:
    Nome: Wyle E.
    Specie: COYOTE
    Verso: UHUHUHUU
    Genere: Maschile


    Nome: Nala
    Specie: LEONE
    Verso: ROAR
    Genere: Femminile

    Nome: Nala
    Specie: LEONE
    Verso: ROAR
    Genere: Femminile
    Velocita: 70
    Altezza salto: 3.0

    ----------
    class Animale.Animale: UHUHUHUU
    L'oggetto fornito e' un
    - Animale
    class Animale.Felino: ROAR
    L'oggetto fornito e' un
    - Animale
    - Felino
    class Animale.Gatto: MIAO
    L'oggetto fornito e' un
    - Animale
    - Felino
    - Gatto
    class Animale.ZZZAnimaleDemo$1: Quello dello scoiattolo
    L'oggetto fornito e' un
    - Animale
    */
    
    //class Animale.ZZZAnimaleDemo$1:
    //non ha nome: classe anonima
    
    /*
    Questa tecnica verrà usata più avanti. È importante capire che le 
    classi anonime si scrivono come le classi normali ma: 
    • Non hanno nome • Non possono essere riutilizzate 
    • Vanno scritte dopo la chiamata al costruttore (operatore new) 
    • Posso aggiungere metodi, ridefinirne di esistenti, aggiungere attributi 
    */
}
