/**
 * LPRO es. 6.3
 * 
 * @author marko.mirkovic
 * Version 06.10.2021
 */
package lproes6e4;


public class LproEs6e4 {

    
    public static void main(String[] args) {
        
        String nome;
        nome = "Marko";
        
        System.out.println(nome.length());
        
        nome = nome + " Mirkovic";
        
        System.out.println(nome.length());
        
        nome = "Signor " + nome;
        
        System.out.println(nome.length());
        
        String nomeMaiuscolo = nome.toUpperCase();
        
        System.out.println(nomeMaiuscolo);
        
        System.out.println(nomeMaiuscolo.substring(7, 13));
        
        System.out.println(nomeMaiuscolo.charAt(7));
        
        System.out.println(nomeMaiuscolo.charAt(11));
        
        nome = "Egregio Signor " + nome;
        
        System.out.println(nome);
        
        System.out.println(nomeMaiuscolo);
        
    }
    
}
