package lprosecondosemestre_2021_2022;

/**
 *
 * @author marko.mirkovic
 */
public class Food 
{
    private String nome; //= "NO NAME"; 
    private Double prezzo;
    
    
    public Food()
    {
        this.setNome("NO NAME");
        this.setPrezzo(5.0);
    }
    
    //costruttore per entrambi gli attributi
    public Food(String nome, double prezzo)
    {
        this.setNome(nome);
        this.setPrezzo(prezzo);
    }
    
    public void setNome(String nome)throws throw new Exeption 
    {
        if(nome.trim().length()>50 ) throw new Exeption ("Nome torppo lungo")
            this.nome = nome;
    }
    
    //get non ricevono argomenti
    public String getNome()
    {
        return nome.trim();
    }
    
    public void setPrezzo(double prezzo)
    {
        this.prezzo = prezzo;
    }
    
    //get non ricevono argomenti
    public double getPrezzo()
    {
        return prezzo;
    }

}
