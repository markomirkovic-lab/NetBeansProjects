package Animale;

/**
 * Fellino
 * • Nella definizione della classe è stato aggiunto extends Animale che
 *   significa che la classe Felino eredita tutte le caratteristiche della
 *   classe Animale. 
 * • La classe Animale è detta classe madre (o padre), Felino è detta classe
 *   figlia 
 * • Felino potrà accedere a tutti gli attributi e i metodi public della classe
 *   Animale 
 * • Il metodo genereSconosciuto non è visibile a Felino in quanto private 
 * • Per richiamare i metodi della classe padre si userà la parola chiave super
 * • Leggete con attenzione cosa avviene nel costruttore e nel metodo toString
 * @author marko.mirkovic
 * @version 25 September 2022
 */
public class Felino extends Animale//extends Animale
{
    private int velocita;
    private double altezzaSalto;
    
    //Costuttore automatico
    public Felino(int velocita, double altezzaSalto, String nome, String specie,
                  String verso, char genere)
    {
        super(nome, specie, verso, genere);
        this.velocita = velocita;
        this.altezzaSalto = altezzaSalto;
    }

    //Costuttore automatico
    public Felino(int velocita, double altezzaSalto, String nome, String specie,
                  String verso)
    {
        super(nome, specie, verso);
        this.velocita = velocita;
        this.altezzaSalto = altezzaSalto;
    }
    
    //Costruttore dispense
        public Felino(String nome, String verso, int velocita,
                      double altezzaSalto)
    {
        //Richiamo il costruttore padre
        super(nome, "Fellino", verso);
        this.velocita = velocita;
        this.altezzaSalto = altezzaSalto;
    }
    
    //Velocità

    public int getVelocita()
    {
        return (this.velocita);
    }

    public void setVelocita(int velocita)
    {
        this.velocita = velocita;
    }

    public double getAltezzaSalto()
    {
        return (this.altezzaSalto);
    }

    public void setAltezzaSalto(double altezzaSalto)
    {
        this.altezzaSalto = altezzaSalto;
    }

    @Override
    public String toString()
    {
        String tmp = super.toString(); //To change body of generated methods, choose Tools | Templates.
        
        tmp+= "Velocita: " + this.getVelocita() + "\n";
        tmp+= "Altezza salto: " + this.getAltezzaSalto() + "\n";
        
        return(tmp);
    }

    
    
    
}
