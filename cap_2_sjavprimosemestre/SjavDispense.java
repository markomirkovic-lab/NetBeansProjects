package cap_2_sjavprimosemestre;

/**
 * Questa è la classe Sjav. È un modello che descrive come si costruisce e come
 * si comporta un’oggetto (o un’istanza della classe) 
 * @author marko.mirkovic
 * @version 03.09.2022
 */

public class SjavDispense
{ 
    // Costrutture SjavDispense, metodo usato per costruire un oggetto (o istanziare)
    public SjavDispense(String nome)  
    {         
        // this e' un oggetto che si riferisce a se stesso.
        this.setNome(nome);     
    }
    //---------------------------------       
    
    //Metodi e variabili di istanza
    
    // nome È un attributo dell’oggetto.
    // Si dovrebbero evitare attributi public, in favore di quelli private
    // accompagnati da getter/setter.
    
    // iniziale e' una variabile privata.  
    // Esiste nell’oggetto ma non è  visibile all’esterno, solo dai 
    // metodi di istanza
    private char iniziale;     

    public String nome;              

    // setNome Metodo setter, usato per alterare/scrivere un attributo.
    public void setNome(String nome) 
    {   
        // this e' un oggetto che si riferisce a se stesso.
        this.nome=nome;         
        this.iniziale=nome.charAt(0);     
    }              

    // getNome Metodo getter, usato per leggere un attributo.
    public String getNome() 
    {    
        // this e' un oggetto che si riferisce a se stesso.
        return(this.nome);     
    } 

    // getIniziale  Metodo getter che accede alle variabili di istanza. 
    public char getIniziale() 
    {   
        // this e' un oggetto che si riferisce a se stesso.
        return(this.iniziale);     
    } 

    //---------------------------------   
    // Metodi e variabili di classe
    // VERSION È una variabile che esiste solo nella classe. 
    
    public static final int VERSION=1; 

    // getVersion e' un metodo di classe.
    public static void getVersion() 
    {           
        System.out.println( VERSION );     
    } 

}

/*
public class Sjav
{
    public String nome;
    private char iniziale;
    public static final int VERSION=1;
    
    public static void getVersion()
    {
        System.out.println( VERSION );
    }
    
    public Sjav(String nome)
    {
        this.setNome(nome);        
    }
    
    
    public void setNome(String nome)
    {
        this.nome=nome;
        this.iniziale=nome.charAt(0);        
    }
    
    
    public String getNome()
    {
        return(this.nome);
    }  
    
    public char getIniziale()
    {
        return(this.iniziale);
    }
}

*/