package alprgrado;

/**
 * Classe Grado
 * Rappresenta le temperature e la loro conversione fra le varie unita' di
 * misura della temperatura
 * @author marko.mirkovic
 * @version 18 October 2022
 */
public class Grado 
{
    //Variabili di istanza
    //Private: non vogliamo che l'utente possa inserire valori non previsti
    private double temperatura;
    private char tipo;
    
    
    //Costruttore di default

    public Grado(double temperatura, char tipo)
    {
        this.temperatura = temperatura;
        this.tipo = tipo;
    }

    //Uguale come nelle dispense
    public Grado(double temperatura)
    {
        this.temperatura = temperatura;
        //aggiunto this.setCelsius(); per impostare a tipo a Celsius
        this.setCelsius();
    }

    public Grado(char tipo)
    {
        this.tipo = tipo;
    }
    
    
    //Setter di default

    public void setTemperatura(double temperatura)
    {
        this.temperatura = temperatura;
    }

    public void setTipo(char tipo)
    {
        this.tipo = tipo;
    }
    
    //Getter di default

    public double getTemperatura()
    {
        return temperatura;
    }

    public char getTipo()
    {
        return tipo;
    }
    
    //--------------------------------------------
    
    //Setter e getter delle dispense
    
    public void setValore()
    {
        this.temperatura = temperatura;
    }
    
    public double getValore()
    {
        return (this.temperatura);
    }
    
    public void setCelsius()
    {
        this.tipo = 'c';
    }
    
    public void setFahrenheit()
    {
        this.tipo = 'f';
    }
    
    
    //--------------------------------------------------------
    
    //Getter dispense
    
    //Conversione da F a C
    //si appoggia us isCelsius()
    public double getCelsius()
    {
        if(this.isCelsius())
        {
            return (this.temperatura);
        }
        else
        {
            //return ( (this.temperatura - 32) / 1.8 );
            return ( F2C(this.temperatura) );//F2C metodo statico
        }
    }
    
    //Conversione da C a F
    //si appoggia su isFahrenheit()
    public double getFahrenheit()
    {
        if(this.isFahrenheit())
        {
            return (this.temperatura);
        }
        else
        {
            //return ( (this.temperatura * 1.8) + 32 );
            return ( C2F(this.temperatura) );//C2F metodo statico
        }
    }
    
    //--------------------------------------------------------
    
    public boolean isCelsius()
    {
        if(this.tipo == 'c')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isFahrenheit()
    {
        if(this.tipo == 'f')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //----------------------------------------------------
    
    //equals
    //Se due gradi sono uguali quando la temperature e il tipo sono uguali
    //Convertiamo tutti in Celsius e li paragoniamo (nostra scelta)
    public boolean equals(Grado x)
    {
        if(this.temperatura == x.temperatura && this.tipo == x.tipo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //----------------------------------------------------
    
    
    //toString
    @Override
    public String toString()
    {
        return (this.temperatura + "°" + this.tipo);
    }
    
    //----------------------------------------------------
    
    //Metodi statici disponibili all'utente per convertire delle temperature
    //senza dover creare un oggetto Grado
    
    public static double C2F(double celsius)
    {
        return ( (celsius * 1.8) + 32 );
    }
    
    public static double F2C(double fahrenheit)
    {
        return ( (fahrenheit - 32 ) / 1.8 );
    }
    
    
}
