
package lpro28102021;


public class Lpro28102021 {


    public static void main(String[] args) {
        
        // operatori unari a++
        
        int a = 7;
        
        /*
        System.out.println(a + a++); //14
        System.out.println(a); //8
        
        System.out.println(a++ + a++); //16
        System.out.println(a); //9
        */
        
        System.out.println(a++ + ++a * a); //a = 7
        System.out.println(a); //7
        
        /*
                            7                    a: 7
                            7  +  9  * a            8
                            7  +  9  * 9            9
                            7  + 81
                                88
        
        
        */
       
        System.out.println(a++ + a * ++a); //a = 7
        System.out.println(a); //7
        
        /*                                      a: 7
                            7                      8
                            7  +  8  * ++a         8
                            7  +  8  * 9           9
                            7  + 72
                                72
        
        
        */
       
        double pi = 3.14;
        System.out.println(++pi);
        System.out.println(pi++);
        
        
        char genere = 'd';
        String nome = "Anna";
        
        //Operatore ternario
        System.out.println( (genere == 'd' ? "Gentile signora " : "Egregio singor ") + nome);
        //Excel se(az="d"; c4, D6)
        
        int min = 75;
        System.out.println(min/60);
        System.out.println(min%60);
        
        
        //invece di substring
        int oggi = 20211028;
        //System.out.println(oggi % 1000);
        System.out.println(oggi % 100);
        System.out.println(oggi / 100 % 100);
        System.out.println(oggi / 100 / 100);
        
        
        //a++ + a * --a
        
        
        
        
    }
    
}
