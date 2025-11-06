package esercizio04;


import java.util.Objects;

public abstract class Animale
{
    private String nome;
    private String specie;
    private String verso;
    private int peso;
    
    
    
    public Animale(String nome, String specie, String verso, int peso)
    {
        this.__setNome(nome);
        this.__setSpecie(specie);
        this.__setVerso(verso);
        this.__setPeso(peso);
    }


    //----------------------------------------------------------------------
    //Getter e setter
    private void __setNome(String nome)
    {
        this.nome=nome;
    }
    
    public void setNome(String nome)
    {
        this.__setNome(nome);
    }
    
    public String getNome()
    {
        return(this.nome);
    }
    
    
    private void __setSpecie(String specie)
    {
        this.specie=specie;
    }
    
    public void setSpecie(String specie)
    {
        this.__setSpecie(specie);
    }
    
    public String getSpecie()
    {
        return(this.specie);
    }
    
    
    private void __setVerso(String verso)
    {
        this.verso=verso;
    }
    
    public void setVerso(String verso)
    {
        this.__setVerso(verso);
    }
    
    public String getVerso()
    {
        return(this.verso);
    } 
    
    
    private void __setPeso(int peso)
    {
        this.peso=peso;
    }
    
    public void setPeso(int peso)
    {
        this.__setPeso(peso);
    }
    
    public int getPeso()
    {
        return(this.peso);
    }    
    
    
    //-----------------------------------------------------------------------
    //Ridefinizione metodi da Object
    
    @Override
    public String toString()
    {
        return("Nome: " + this.getNome() + ". Specie: " + this.getSpecie() + 
               ". Verso: " + this.getVerso() + ". Peso: " + this.getPeso());
    }


    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        
        final Animale other = (Animale) obj;
        if (this.nome.equals(other.nome) && 
            this.specie.equals(other.specie) && 
            this.verso.equals(other.verso))
        {
            return true;
        }
        else
            return(false);
    }
    
    /*
    public final int getTipo()
    {
        boolean isCarnivoro = this instanceof ICarnivoro;
        boolean isErbivoro = this instanceof IErbivoro;
        
        if (isCarnivoro && isErbivoro) return ONIVORO;
        if (isCarnivoro) return CARNIVORO;
        if (isErbivoro) return ERBIVORO;
        return SCONOSCIUTO;
    
       
            
       
            
    }
    */
}

