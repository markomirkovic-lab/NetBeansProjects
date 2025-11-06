package lprosecondosemestre_2021_2022;

/**
 *
 * @author marko.mirkovic
 */
public class Carta
{
    
    
    //Attributi
    //public si puo' usare su latri classi
    //public int valore;
    //public char seme;
    
    private int valore;
    private char seme;
    
    //metodo setter (tutti metodi setter restrituiscono void)
    public void setValore(int valore)
    {
        //this fa riferimento all'attributo
        //senza fa riferimento al valore che da l'utente
        //filtrare i valori in entrata
        if(valore<0) this.valore = 0;
        else if(valore>13) this.valore = 13;
        else this.valore = valore;
        
        //soluzione elegante
        //sollevare un eccezzione
        
        
    }
    
    public void setAsso()
    {
        this.setValore(1);
    }
    
    public void setAsso()
    {
        this.setValore(1);
    }
    
    public void setAsso()
    {
        this.setValore(1);
    }
    
    public void setAsso()
    {
        this.setValore(1);
    }
    
    public void setAsso()
    {
        this.setValore(1);
    }
    
    public void setKing()
    {
        this.setValore(1);
    }
    
    //valore della carta
    public int getValore()
    {
        return this.valore;
    }
    
    //rappresentazione della carta
    public String getValore()
    {
        if(this.valore==0) return "Joker";
        else if(this.valore==11) return "A";
        else if(this.valore==12) return "J";
        else if(this.valore==13) return "Q";
        else if(this.valore==11) return "K";
        else return 
        
    }
    
    public void setCuori()
    {
        this.seme = CUORI;
    }
    
    public void setQuardi()
    {
        this.seme = QUADRI;
    }
        
    public void setFiori()
    {
        this.seme = FIORI;
    } 
    
    public void setPicche()
    {
        this.seme = PICCHE;
    }  
    
    public String getSeme()
    {
        if(this.isCuori()) return CUORI+"";
        else if(this.isQuadri()) return QUADRI+"";
        else if(this.isFiori()) return FIORI+"";
        else return PICCHE;
    }
    
    public boolean isCuori()
    {
        return
    }
    
    public static void main(String[] args)
    {
        
    }
}
