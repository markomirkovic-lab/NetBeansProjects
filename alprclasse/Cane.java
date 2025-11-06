package alprclasse;

/**
 *
 * @author marko.mirkovic
 * @version 17 October 2022
 */
public class Cane 
{
    public String nome;
    public double peso;

    public Cane(String nome, double peso)
    {
        this.nome = nome;
        this.peso = peso;
    }

    

    
    

//    public Cane(double peso)
//    {
//        this.peso = peso;
//    }

    public double getPeso()
    {
        return this.peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }
    
    public double getPesoLibre()
    {
        return this.peso / 0.45;
    }
    
    
}
