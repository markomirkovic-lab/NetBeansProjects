package Animale;

/**
 * Animale
 * @author marko.mirkovic
 * @version 25 September 2022
 */
public class Animale 
{
    private String nome;
    private String specie;
    private String verso;
    private char   genere;
    private final char MASCHIO = 'M';
    private final char FEMMINA = 'F';
    private final char SCONOSCIUTO = ' ';

    //Costruttore standard
    public Animale(String nome, String specie, String verso, char genere)
    {
        this.nome = nome;
        this.specie = specie;
        this.verso = verso;
        this.genere = genere;
    }
    
    
    //Costruttore dispense
    public Animale(String nome, String specie, String verso)
    {         
        this.__setNome(nome);//utilizzo del setter private         
        this.setSpecie(specie);         
        this.setVerso(verso);         
        this.genereSconosciuto();     
    } 

    //Nome
    public String getNome()
    {
        return nome;
    }

    /**
     * 
     * In generale tutti i setter dovrebbero essere final oppure, nel caso
     * di metodi public chiamati nel costruttore, dovreste ridefinirli come
     * private, che non potranno essere riscritti. Ecco come cambierebbe la
     * classe Animale con il metodo setNome: 
     */
    
    //setter automatico
//    public void setNome(String nome)
//    {
//        this.nome = nome;
//    }
    
    //diventa cosi:
    public void __setNome(String nome)
    {
        this.nome = nome;
    }
        
    public void setName(String nome)
    {
        this.__setNome(nome);
    }
    
    // In questo modo siete sicuri che nessuno potrà riscrivere la __setNome. 

    //Specie
    public String getSpecie()
    {
        return (this.specie);
    }

    public void setSpecie(String specie)
    {
        this.specie = specie.toUpperCase().trim();
    }

    //Verso
    public String getVerso()
    {
        return (this.verso);
    }

    public void setVerso(String verso)
    {
        this.verso = verso.toUpperCase().trim();
    }

    public char getGenere()
    {
        return (this.genere);
    }

    public void setGenere(char genere)
    {
        this.genere = genere;
    }
    
    //Genere
    //Il genere è stato gestito usando delle costanti 
    //Il genere non è accessibile dall’esterno della classe e si comporta come
    //un valore boolean, infatti i getter iniziano con is e i setter sono senza
    //argomenti 
    /*
    Gia' inizializzati sopra
    private char   genere;
    private final char MASCHIO = 'M';
    private final char FEMMINA = 'F';
    private final char SCONOSCIUTO = ' ';
    */
    
    private void genereSconosciuto()
    {
        this.genere = this.SCONOSCIUTO;
    }
    
    /**
     * Se non volete che qualcuno, derivando una vostra classe, sovrascriva
     * un metodo, magari delicato e che potrebbe compromettere il buon 
     * funzionamento del software, allora dichiaratelo final, in questo modo
     * non sarà ridefinibile. 
     * Vedi sotto "final"
     */
        
    public final void setMaschio()//setter senza argomenti
    {
        this.genere = this.MASCHIO;
    }
    
    public boolean isMaschio()
    {
        if(this.genere == this.MASCHIO)
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
    
    public boolean isFemmina()
    {
        return(!this.isMaschio());
    }
    
    public final void setFemmina()//setter senza argomenti
    {
        this.genere = this.FEMMINA;
    }
    
    //Metodi generici
    @Override
    public String toString()
    {
        String tmp = "";
        
        tmp+="Nome: " + this.getNome() + "\n";
        tmp+="Specie: " + this.getSpecie() + "\n";
        tmp+="Verso: " + this.getVerso() + "\n";
        if(this.isMaschio())
        {
            tmp+="Genere: Maschile\n"; 
        }
        else if(this.isFemmina())
        {
            tmp+="Genere: Femminile\n";
        }
        else
        {
            tmp+="Genere: Sconosciuto\n";
        }
        
        return(tmp);
    }
    
    
    
}
