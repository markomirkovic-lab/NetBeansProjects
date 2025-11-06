package animale__;

/**
 *
 * @author Neil Otupacca
 */
public class Animale {

    private String nome;
    private String specie;
    private String verso;
    private double peso;

    public Animale(String nome, String specie, String verso, double peso) {
        this.nome = nome;
        this.specie = specie;
        this.verso = verso;
        this.peso = peso;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSpecie() {
        return this.specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getVerso() {
        return this.verso;
    }

    public void setVerso(String verso) {
        this.verso = verso;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
