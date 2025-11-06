package sjav;

/**
 * Sjav
 * @author marko.mirkovic
 * @version 18 September 2022
 */
public class Sjav 
{
    //Variabili iniziali
    private char iniziale;
    public String nome;
    public static final int VERSION = 1;
    
//    Definito da insert code
//
//    public Sjav(char iniziale, String nome)
//    {
//        this.iniziale = iniziale;
//        this.nome = nome;
//    }
//
//    public char getIniziale()
//    {
//        return iniziale;
//    }
//
//    public void setIniziale(char iniziale)
//    {
//        this.iniziale = iniziale;
//    }
//
//    public String getNome()
//    {
//        return nome;
//    }
//
//    public void setNome(String nome)
//    {
//        this.nome = nome;
//    }
//    

    public void setNome(String nome)
    {
        this.nome = nome;
        this.iniziale = nome.charAt(0);
    }
    
    public Sjav(String nome)
    {
        this.setNome(nome);
    }
    
    public String getNome()
    {
        return(this.nome);
    }
    
    public char getIniziale()
    {
        return(this.iniziale);
    }
    
    public static void getVersion()
    {
        System.out.println(VERSION);
    }
    
    
}
