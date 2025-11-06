package cap_2_sjavprimosemestre;

/**
 *
 * @author marko.mirkovic
 */
public class Inutile 
{
     public int x;               //Attributo dell'oggetto
     static int sx;              //attributo della classe
     
    //il metodo dell'oggetto, può accedere a tutti gli attributi     
     
     public void m(int valore)        
     {         
         this.x=valore;
         sx=valore*2; 
     } 
     
     public int mx(int valore)        
     {         
         this.x=valore;
         return valore*4; 
     } 
    
    //Il metodo static non ha accesso agli attributi non static     
    public static void sx(int valore)     
    {         
        //this.x non funziona perchè NON esiste l'oggetto, NON esiste this!         
        sx=valore*3;     
        
    }

    
    //toString specializzato
    @Override //mio toString va a sovrascrivere il toString del object
    public String toString()
    {
        return "Inutile, x = " + this.x + ", sx = " + Inutile.sx;
    }
    

    /*
    @Override //mio toString va a sovrascrivere il toString del object
    public String toString()
    {
        return "Inutile, x = " + x + ", sx = " + sx; //forma implicita
    }
    
    */
    
    
    @Override
    public int hashCode()
    {
        int hash = 7;
        return hash;
    }

    
    //Quando considerare due oggi dello stesso tipo uguali o diversi
    //Siccome tutte le classi passano da object, tutti gli oggetti sono oggetti
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
        if (this.getClass() != obj.getClass())
        {
            return false;
        }
        final Inutile other = (Inutile) obj;
        if (this.x != other.x)
        {
            return false;
        }
        return true;
    }
    
    /*
    public boolean equals(Object obj)
    {
        return (this==obj);
    }
    */
    
    //== non controlla se la stringa e' la stessa (quello che c'e' scritto dentro)
    
    
    /*
    public boolean equals (Object anObject)
    {
        if (this == anObject)
    {
        return true;
    }
    if(anObject instanceof String)
    {
        String aString = (String)anObject;
        if (!COMPACT_STRINGS || this.coder == aString.coder)
        {
            return StringLatin1.equals(value, aString.value);
        }
    }
    return false;
    }
    */
    
    public static void main(String[] args)
    {
        Inutile i = new Inutile();
        Inutile ii = new Inutile();
        
        i.m(1);         //Inutile.sx vale ora 2
        ii.m(11);       //Inutile.sx vale ora 22
        Inutile.sx=33;  //Inutile.sx vale ora 33
        System.out.println(i.x + " " + i.sx);
        System.out.println(ii.x + " " + ii.sx);
        
        /*
        run-single:
        1 33
        11 33
        */
        
        
    }
}
