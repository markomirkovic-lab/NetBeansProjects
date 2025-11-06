/**
 * LPRO es. 6.5
 * 
 * @author marko.mirkovic
 * Version 06.10.2021
 */
package lprotesting1;


public class LproTesting1 {


    public static void main(String[] args) {
        
        int a;
        a = 75;
        
        int z = 34, zz=23, jdk;
        
        a = 30;
        
        System.out.println(a/4);
        System.out.println((double)(a/4)); //errore: prima la parantesi
        System.out.println(a/4);
        
        char c = 'a';
        
        System.out.println(c+1); //prendere il no. del char + 1
        System.out.println( (char)(c+1));
        System.out.println((int) '$');
        System.out.println((double) '$');
        System.out.println((int) 'c'); //hex->decimale
        
        int h; // int è un oggetto
        String scuola = "SSse-SiG"; //string è una classe
        
        System.out.println( scuola.toUpperCase() );
        System.out.println( scuola.toLowerCase() );
        System.out.println( scuola.charAt(3));
        System.out.println( scuola.length());
        System.out.println( scuola.replace("-", "**")); //trova e sostituisci
        System.out.println( scuola.replace("--", "**")); //trova e sostituisci
        System.out.println( scuola.replace("S", "J")); //trova e sostituisci
        System.out.println( scuola.replace("S", "J")); //trova e sostituisci
        System.out.println( scuola); //trova e sostituisci
        
        System.out.println( scuola.indexOf("SiG")); //da la posizione del indice
        
        System.out.println("    abc def     ".trim()); //usare sempre in cui si chiede all'utente di inserire qualcosa
        //evita spazzi char non intenzionalmente creati dall'utente (spazzi)
        System.out.println("    abc def     ".trim().toUpperCase().replace("DEF", "XYZ"));
        
        System.out.println("ABC".equals("abc"));
        System.out.println("ABC".equalsIgnoreCase("abc"));          
    }
    
}
