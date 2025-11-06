package cap_2_sjavprimosemestre;

/**
 * Sjav
 * @author marko.mirkovic
 * @version 03.09.2022
 */
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
