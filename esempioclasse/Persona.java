package esempioclasse;

/**
 * Class Persona
 * @author Marko Mirkovic
 * @version 18 September 2022
 */
public class Persona 
{
    public String nome;
    public String cognome;
    public int gg;
    public int mm;
    public int anno;
    private char genere;
    
    
    //Scriviamo nella classe Persona due metodi pubblici, che essendo membri
    //della classe possono accedere a tutti gli attributi. 
    
    public void setUomo()
    {
        this.genere = 'M';
    }
    
    public void setDonna()
    {
        this.genere = 'F';
    }
    
    public String getCortesia()
    {
        String ret;
        
        if(this.genere == 'M')
        {
            ret = "egregio signor " + this.cognome;
        }
        else
        {
            ret = "getile signora " + this.cognome;
        }
        return ret;
    }
    
    public Persona()
    {

    }

    
    public Persona(String nome)
    {
        this.nome = nome;
    }
    
    public Persona(String nome, String cognome)
    {
        //this(); questo richiama il costruttore senza argomenti
        this.nome = nome;
        this.cognome = cognome;
    }
    
    public Persona(int gg, int mm, int anno)
    {
        this.gg = gg;
        this.mm = mm;
        this.anno = anno;
    }
    
    //Distruttore
    public static void mioMetodo()
    {
        Persona x = new Persona();//x verra' distrutto
    }
    
    public void finalize()
    {
        System.out.println("Persona " + this.nome + " terminata!");
    }
    
    
}
