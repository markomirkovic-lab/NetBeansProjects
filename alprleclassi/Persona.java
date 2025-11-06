package alprleclassi;

/**
 *
 * @author marko.mirkovic
 * @version 18 October 2022
 */

//Non ha nessun tipo di ritorno, memmeno void.
public class Persona 
{
    public String nome;
    public String cognome;
    public int gg;
    public int mm;
    public int anno;
    
    //chi utilizza la classe non sa che esiste l'attributo genere
    //e non sa come questo viene gestito all'interno della classe
    //information hiding
    private char genere;
    
    //Costruttore vuoto
    public Persona()
    {
        
    }

    public Persona(String nome, String cognome)
    {
        this.nome = nome;
        this.cognome = cognome;
    }

    public Persona(int gg, int mm, int anno)
    {
        this.gg = gg;
        this.mm = mm;
        this.anno = anno;
    }
    
    
    
    public void setUomo()
    {
        this.genere = 'M';
    }
    
    public void setDonna()
    {
        this.genere = 'F';
    }
    
    public String getCotesia()
    {
        String ret;
        
        if(this.genere == 'M')
        {
            ret = "egregio signor";
        }
        else
        {
            ret = "gentile signora";
        }
        
        return ret;
    }
    
    
    //Distuttore
    public static void distruttore()
    {
        
    }
    
    
    //Distruttore
    @Override
    public void finalize()
    {
        System.out.println("Persona " + this.nome + " terminata!");
    }
    
    
    
    
    @Override
    public String toString()
    {
        return nome;
    }
}
