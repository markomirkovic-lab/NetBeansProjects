package Animale;

/**
 * Realizzeremo una classe Gatto, derivandola da Felino aggiungendo la 
 * possibilità di specificare se il manto è tigrato. 
 * @author marko.mirkovic
 * @version 25 September 2022
 */
public class Gatto extends Felino//extends Felino
{
    //Caratteristica del manto
    public boolean tigrato;
    
    public Gatto(String nome, boolean tigrato)
    {
        //Questo super chiama il costruttore di Felino
        super(nome, "miao", 40, 2.5);
        this.setSpecie("gatto");
        this.tigrato=tigrato;
    }
    
    /**
     * • Il verso non viene più passato in argomento al costruttore 
     * • Siccome si parla di un gatto, abbiamo introdotto il metodo miagola, 
     *   che restituisce il verso, ma è più specifico. 
     * • Notate che miagola usa this.getVerso() ereditato da Felino, a sua 
     *   volta ereditato da Animale! 
     */
    
    public String miagola()
    {
        return(this.getVerso());
    }
    
    //Metodi generici
    @Override
    public String toString()
    {
        String tmp = super.toString();
        
        if(this.tigrato)
        {
            tmp+="Tigrato: Si\n";
        }
        else
        {
            tmp+="Tigrato: No\n";
        }
        
        return(tmp);
    }
    
}
