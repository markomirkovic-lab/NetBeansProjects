
package cap9Oggetti;

/**
 *
 * @author marko.mirkovic
 * @version 29.05.2022
 */
public class Persona
{
    public String nome;
    public String cognome;
    public String nomignolo;
    public int giornoNascita;
    public int meseNascita;
    public int annoNascita;
    
    
    
    public Persona(String nome, String cognome, String nomignolo,
                   int giornoNascita, int meseNascita, int annoNascita)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.nomignolo = nomignolo;
        this.giornoNascita = giornoNascita;
        this.meseNascita = meseNascita;
        this.annoNascita = annoNascita;
    }
    
    /*
    public Persona(String nome, String cognome, String nomignolo,
                   int giornoNascita, int meseNascita, int annoNascita)
    {
        this(nome, cognome, nomignolo, giornoNascita, meseNascita, annoNascita);
    }
    */

    public Persona(String nome, String cognome, int annoNascita)
    {
        this(nome, cognome,  "null", 0, 0, annoNascita);
    }
    
    @Override
    public String toString()
    {
        return("Buongiorno " + this.nome +  " , sei nato nell'anno " + this.annoNascita);
    }
    

    
}
