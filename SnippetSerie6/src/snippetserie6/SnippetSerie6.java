
package snippetserie6;

public class SnippetSerie6 
{
    public static void main(String[] args) 
    {
        float temperatura= (float)34.7;
        //Casting esplicito da float a double
        
        int lunghezza= (int)123L;
        //Casting esplicito da long a int
        
        int lettera= 100;
        System.out.println( (char)lettera ); //OUTPUT: d
        //Casting esplicito da int a char
        System.out.println('\u0064'); //OUTPUT: d
        
        /*Technical information
        https://unicode-table.com/en/0064/
        Name Latin Small Letter D
        Unicode number	
        U+0064
        HTML-code	
        &#100;
        CSS-code	
        \0064
        Block Basic Latin
        Uppercase D
        Unicode version: 1.1 (1993)
        Alt code: Alt 100
        ASCII 100:  d
        https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
        */
        System.out.println((int)('d')); //OUTPUT: 100
        
        System.out.println( (char)(lettera+1) ); //OUTPUT: e
        
        int lettera2= (int)'d';
        //Casting esplicito da char a int
        
        System.out.println( lettera2+1 ); //OUTPUT: 101
        
        System.out.println( (int)'a' + (int)'b'); //OUTPUT: 195
               
        System.out.println( " fa " + 7+5); //OUTPUT: fa 75
        //Casting implicito da int a String
        

        String n= "scuola specializzata";
        //         01234567891111111111
        //                   0123456789
        
        System.out.println( n.length() );//OUTPUT: 20
        System.out.println("Il primo: " + n.charAt(0)); //OUTPUT: Il primo: s
        // 's'
        System.out.println("Il nono: " + n.charAt(8)); //OUTPUT: Il nono: p
        // 'p'
        System.out.println("L\'ultimo: " + n.charAt(n.length()-1) ); //OUTPUT: L'ultimo: a
        // 'a'
        
        System.out.println( n.indexOf("spec") ); //OUTPUT: 7
        //mi da la posizione della prima sottostringa
        System.out.println( n.indexOf("a") ); //OUTPUT: 5
        
        System.out.println( n.substring(5)); //OUTPUT: a specializzata
        //estrae la sottostringa che inizia dalla posizione 5
        System.out.println( n.substring(n.indexOf(" ")+1) ); //OUTPUT: specializzata
        //estrae partendo dalla posizione che segue il carattere ' '
        System.out.println( n.substring(0, n.indexOf(" ") ) ); //OUTPUT: scuola
        //parte dall'indice 0 e temrina prima dello spazio
        System.out.println( n.substring(5, n.length() ) );//OUTPUT: a specializzata
        
        System.out.println( n.replace("a", "A"));//OUTPUT: scuolA speciAlizzAtA
        System.out.println( n.replace("zz", "DOPPIAZETA"));//OUTPUT: scuola specialiDOPPIAZETAata
        
        System.out.println( n.toUpperCase() );//OUTPUT: SCUOLA SPECIALIZZATA
        
        System.out.println("   aaaa    bbbb   ".trim());//OUTPUT: aaaa    bbbb
        //Toglie gli spazi esterni ma mantiene quelli interni
        
        System.out.println("aaa".equals("bbb"));//OUTPUT: false
        System.out.println("aaa".equals("AAA"));//OUTPUT: false
        System.out.println("aaa".equalsIgnoreCase("AAA"));//OUTPUT: true


	//Esercizio richiesto da SGT1b
        String frase= "   Lasciate ogni speranza o voi che entrate   ";
        //                0123456789123456789123456789101234567891
        frase= frase.trim();
        
        char primaLettera= frase.charAt(0);
        char ultimaLettera= frase.charAt(frase.length()-1);
        
        int posizione= frase.indexOf("ogni");
        System.out.println(frase.indexOf("ogni")); //OUTPUT: 9
        System.out.println( posizione==-1 ? "Non trovata" : "Trovata in posizione " + posizione );
        //OUTPUT: Trovata in posizione 9
        System.out.println( posizione!=-1 ? "Non trovata" : "Trovata in posizione " + posizione );
        //OUTPUT: Non trovata
        
        String estrazione= frase.substring(posizione, posizione+"ogni".length());
        System.out.println(estrazione);//OUTPUT: ogni
        
        String farfallino= frase.replace("a", "afa").replace("e","efe").replace("i","ifi").replace("o","ofo").replace("u","ufu");
        System.out.println(farfallino);
        //OUTPUT: Lafascifiafatefe ofognifi speferafanzafa ofo vofoifi chefe efentrafatefe
        
        farfallino= farfallino.toUpperCase();
        System.out.println(farfallino);
        //OUTPUT: LAFASCIFIAFATEFE OFOGNIFI SPEFERAFANZAFA OFO VOFOIFI CHEFE EFENTRAFATEFE
        
        String a= "Simone";
        String b= "Luca";
        System.out.println( a == b);//OUTPUT: false
        System.out.println( a.equals(b) );//OUTPUT: false
        System.out.println( b.equals(a) );//OUTPUT: false
        System.out.println( !a.equals(b) );//OUTPUT: True
        
        
        
        //Prendiamo la stringa
        //Calcoliamo dove inizia la parola
        //Calcoliamo dove termina
        //Mettiamo quel pezzo in uppercase
        frase= "Lasciate ogni speranza o voi che entrate";
        //      0123456789112345678911234567891123456789
        
        String cerca= "entrate";
        int inizio= frase.indexOf(cerca);
        System.out.println(inizio); //OUTPUT: 33
        int fine= inizio+cerca.length(); //index di entrate + lunghezza di entrate
        System.out.println(fine); //OUTPUT: 33+7 = 40
        
        String prima= frase.substring(0, inizio);// da 0 a index di entrate
        System.out.println("prima " + prima);
        String upper= frase.substring(inizio, fine).toUpperCase(); //index di entrate + 7
        System.out.println("upper " + upper);
        String dopo=  frase.substring(fine); //40 = no OUTPUT
        System.out.println("dopo " + dopo);
        
        System.out.println(prima + upper + dopo);

        
    }
    
}
