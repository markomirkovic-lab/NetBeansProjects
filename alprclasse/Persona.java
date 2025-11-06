package alprclasse;

/**
 * Persona class
 * @author marko.mirkovic
 * @version 17 October 2022
 */
public class Persona 
{
    /*    
    String nome = "Pinco";
    String cognome = "Pallino";
    int altezza = 10;
    */
    
    String nome;
    String cognome;
    char genere;
    int altezza;
    private int id;
    private static int contatoreDiPersone;
    
    private boolean male;
    private boolean female;
    private boolean fleas;

    /*    
    //quando le variabili sono istanziate e inizializzate a dei valori
    //il costrutture da add code e' vuoto:
    public Persona()
    {
    
    }
    */

    //quando le variabili sono istanziate ma non inizializzate a dei valori
    //il costruttore  da add code non e' vuoto:
    
    /**
     * 
     * @param nome
     * @param cognome
     * @param genere
     * @param altezza 
     */
    public Persona(String nome, String cognome, char genere, int altezza)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.genere = genere;
        this.altezza = altezza;
    }
    
//    public Persona()
//    {
//        this.id = ++contatoreDiPersone;
//    }

    public int getId()
    {
        return this.id = ++contatoreDiPersone;
    }
    
    
            
    
    /*    
    //Attenzione ai booleani
    public Persona(String nome, String cognome, int altezza, boolean male, boolean female, boolean fleas)
    {
    this.nome = nome;
    this.cognome = cognome;
    this.altezza = altezza;
    this.male = male;
    this.female = female;
    this.fleas = fleas;
    }
    */

    
    
    /**
     * 
     * @param nome 
     */
    public Persona(String nome)
    {
        this.nome = nome;
    }
    
    //Setter automatici

    /**
     * 
     * @param nome 
     */
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setCognome(String cognome)
    {
        this.cognome = cognome;
    }

    public void setAltezza(int altezza)
    {
        this.altezza = altezza;
    }

//    public void setGenere(String genere)
//    {
//        this.genere = genere;
//    }
    
    public void setUomo()
    {
        this.genere = 'M';
    }
    
    public void setDonna()
    {
        this.genere = 'F';
    }
    
    
    
    //Getter automatici

    /**
     * 
     * @return 
     */
    public String getNome()
    {
        return nome;
    }

    public String getCognome()
    {
        return cognome;
    }

    public int getAltezza()
    {
        return altezza;
    }

//    public String getGenere()
//    {
//        return genere;
//    }
    
    
    
    //altri metodi di istanza

    /*
    public void setMale(boolean male)
    {
        this.male = male;
    }

    public void setFemale(boolean female)
    {
        this.female = female;
    }

    public void setFleas(boolean fleas)
    {
        this.fleas = fleas;
    }
    */
    
    
//    public boolean isMale()
//    {
//        if(this.genere.equals('M'))
//        {
//            
//        } 
//        return male;
//    }
//
//    public boolean isFemale()
//    {
//        return female;
//    }
//
//    public boolean hasFleas()//meglio di isFleas o getFleas
//    {
//        return fleas;
//    }
//    
    
    public String getCortesia()
    {
        String ret;
        
        if(this.genere=='M')
        {
            ret = "egregio signor " + this.cognome;
        }
        else
        {
            ret = "gentile singora " + this.cognome;
        }
        return ret;
    }
    
    public void saluta()
    {
        System.out.println("Ciao mi chiamo " + this.nome);
    }
    
    public void mangia()
    {
        this.altezza++;
        System.out.println("Niam");
    }
}
