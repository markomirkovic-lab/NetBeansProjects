/*
 * ShippetsTesting1
 * @author Marko Mirkovic
 * @version 17.10.2021
 */
package snippetstesting;


public class SnippetsTesting1 {


    public static void main(String[] args)
    {
    
        //int a = 012; //10
        //int b = 0x12; //18
        //int c = ++a * b-- + b % a;
        //      11    18    11:7 = 6
        
        
        //System.out.println("a = " + a); //10
        //System.out.println("b = " + b); //18
        //System.out.println("a + b = " + a+b); //1018
        //System.out.println("a + b = " + (int)a+b); //1018
        //System.out.println("a + b = " + (int)(a+b)); //28
        //System.out.println("a + b = " + (float)(a+b)); //28.0
        //System.out.println("a + b = " + (a+b)); // 28
        
        //System.out.println("++a = " + ++a); //11 (a+1)
        //System.out.println("++a = " + ++a); //12 (a = 11) + 1
        //System.out.println("b-- = " + b--); //18 (b = b = 10)
        //System.out.println("b-- = " + b--); //17 (b = b - 1)
        //System.out.println("b-- = " + b--); //16 (b = 17 - 1)
        
        
        //System.out.println(" b % a = " + b % a); //17 % 11 = 6 (++a 17 % 11)
        //System.out.println("++a * b-- = " + ++a * b--); //11 * 18 = 198
        
        //System.out.println(b);
        
        //System.out.println(c);
        //System.out.println(b);
        //System.out.println(c);
        //System.out.println(a + b + "\n\u005e" + a + c);
        //System.out.println(++a * b-- + b%a);
        
        //int aA = 11;
        
        //int bB = ++aA * aA+2;
        
        //int cC = bB + bB%aA;
        
        //System.out.println(aA);
        //System.out.println(bB);
        //System.out.println(aA);
        //System.out.println(bB);
        //System.out.println(cC);
        
        
        //String a = "ABCDC";
        //System.out.println((char) (a.charAt(1))); //B
        //System.out.println((char) (a.charAt(1) - 17)); //1 = start of text
        //System.out.println((char) (a.charAt(3) - 1)); //C
        
        /*
        int a = 10;
        int b = 18;
        int c = ++a * b-- + b%a; //11*17 = 198 + 17%11 = 6 = 42+3 = 45
        int d = b%a;
        
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b%a);
        System.out.println(++a * b--);
        System.out.println(++a * b-- + b%a);
        
        System.out.println(d-a);

        */
        
        /*
        float a = 0.001345F, b=0.001123F, c;
        
        c = a + b;
        
        if (c==0.002468F)
            System.out.println("Esatti");
        else
            System.out.println("Diversi");
            System.out.println(c + " diverso da " + 0.002468F);
        
        //Diversi
        //0.0024680002 diverso da 0.002468
        
        */
        
        /*
        if (d==6)
            System.out.println("Esatti");
        else
            System.out.println("Diversi");
            System.out.println(d + " diverso da " + b%a);
        */    
        
        /*
        char a = 'a';
        int aa = 'a';
        char b = '\u0061';
        char c = '\\';
        
        System.out.println(a + " " + aa + " "  + b + " " + c);
        // a 97 a \

        */
        
        /*
        int i;
        int a, b, c;
        
        float F=2.7F;
        float g, h=0.3, k; // errore h non ha la dichiarazione F (float) 0.3F
        
        b=77F; // errore b è stato dichiarato float ma non e' possibile essendo un int
        k=3.14F;
        
        */
        
        //String a = "prova", b = "prova";
        //System.out.println(a.equals(b)); //True
        
        /*
        String a = "Buongiorno";
                  //0123456789 0->9 = totale 10 posizioni
        System.out.println(a.length());
        */
        
        /*
        //              0123456789112345678921234567
        //              0   4     10     17  21   26
        String frase = "Tre tigri contro tre tigri!";
        
        System.out.println(frase.charAt(0)); //T
        System.out.println(frase.charAt(frase.length()-1)); //i
        System.out.println(frase.toLowerCase()); //tre tigri contro tre tigri!
        System.out.println(frase.toUpperCase()); //TRE TIGRI CONTRO TRE TIGRI!
        System.out.println(frase.substring(10,16));//contro
        System.out.println(frase.indexOf("tigri"));//4
        System.out.println(frase.lastIndexOf("tigri"));//21
        */
        
        /*
        //Mix di interi
        long risultato;
        short s=10;
        int i=15;
        byte b=7;
        
        risultato = s + i + b; //32 -> s e b promossi a int e il risultato a long
        
        System.out.println(risultato); //32
        */
        
        
        /*
        //Mix di floating point e interi
        
        final float PI = 3.14F;
        int r = 7;
        double area = r*r*PI; //r promosso a float, area promossa a double
        
        System.out.println(area); //153.86000061035156
        
        */
        
        
        /*
        //Mix di char
        char a = 'a';
        short z = 122;
        int diff = z-a; //a promossa a short, risultato promsso a int
        
        System.out.println(diff); // 122 - 97  = 25
        
        */
        
        
        /*
        int i = 0;
        int l = 0L; //non si può
        l = i; //Errore
        i = l; //Errore
        System.out.println(i);
        */
        
        /*
        int i = 0;
        long l = 0L;
        l = i; //0
        //i = l; //Errore
        System.out.println(i);
        */
        
        /*
        int i = 0;
        long l = 0L;
        l = i; //0 int i viene promosso a long
        i = (int)l; //0 l viene troncato a int
        System.out.println(l + " " + i); //0 0
        */
        
        /*
        int i = 0;            //x'xxx'x32'768
        long l = 4294967296L; //4'294'967'296 
        i = (int)l; //0 troncamento a int
        System.out.println(i); //0
        */
        
        /*
        int i = 0;
        long l = 1L;
        i = (int)l; //1 non avviene il troncamento -> 1 entro 32'768 
        System.out.println(i); //1
        */
        
        //Casting ha la precedenza
        //I valori vengono troncati
        
        /*
        double a = 1.3456;
        double b;
        b = (long)a; //1 -> avviene il troncamento al intero e decimale sparisce
                System.out.println(b); //1
        */
        
        /*
        double a = 1.3456;
        double b;
        b = (float)a; //1.3456000089645386
        System.out.println(b); //1.3456000089645386
        */
        
        /*
        double a = 1.3456;
        float b;
        b = (float)a; //1.3456
        System.out.println(b); //1.3456
        */
        
        /*
        //1.3456 -> 1.0
        //1.3456 -> 1
        double a = 1.3456;
        double b;
        int c;
        b = (long)a; //1.0
        c = (int)a;  //1
        System.out.println(b); //1.0
        System.out.println(c); //1
        */
        
        /*
        //1.3456 -> 1.3
        double a = 1.3456;
        double b;
        b = ((int)(a * 10.0))/10.0; //1.3
        System.out.println(b); //1.3
        */
        
        /*
        //Casting esplicito
        final double PI = 3.14F;
        int r = 7;
        float area = r*r*(float)PI; //153.86, r promosso a float, PI castato a float
        System.out.println(area);//153.86
        */
        
        
        /*
        char a = 'A';
        System.out.println((int)a);//65 (ASCII lettera A = codice = 65)
        */
        
        /*
        double d = 34.97;
        int i = (int)d;//34 -> esege la troncatura a numero intero
        System.out.println(i);//34
        */
        
        
        /*
        String s = "ciao a tutti";
        
        char a = s.charAt(11);//stampa ultimo carattere: i
        System.out.println(a);
        
        

        //char b = s.charAt(20);
        //System.out.println(b); //Error: String index out of range: 20
        
        //char c = s.charAt(-1);//stampa ultimo carattere: i
        //System.out.println(c);//Error: String index out of range: -1
        
        */
        
        /*
        int a = 0x7FFFFFFF;
        short b = (short)a;
        System.out.println(a);
        System.out.println(b);
        */
        
        /*
        run:
        2147483647
        -1
        */
        
        /*
        float temperatura = (float) 34.7;
        System.out.println(temperatura);//34.7
        
        int lettera = 100;
        System.out.println((char)lettera);//d
        
        */
        
        /*
        String frase = "   Lasciate ogni speranza a voi che entrata   ";
        //                 
        frase = frase.trim();
        //"Lasciate ogni speranza a voi che entrata";
        // 0123456789012345678901234567890123456789
        //          ogni
        
        int posizione = frase.indexOf("ogni");
        System.out.println(posizione == -1 ? "Non trovata" : "Trovata in posizione " + posizione);
        // Trovata in posizione 9
        
        String estrazione = frase.substring(posizione, posizione+"ogni".length());//ogni
        //                                  9          9+4 = 13
        //"Lasciate ogni speranza a voi che entrata";
        // 0123456789012345678901234567890123456789
        //          ogni
        System.out.println(estrazione);//ogni
        
        
        System.out.println("---");
        System.out.println(7L);//7 (decimale)
        System.out.println(07L);//7 (ottale)
        System.out.println(0x12AL);//298 (hex) (1x16^2+2*16+10)
        System.out.println(0b1001L);//9 (binario)
        */

        /*
        float singola = 3.0F;
        
        System.out.println(3.0F + 3);//6.0
        System.out.println("ciao " + 3.0F + 3);//ciao 3.03
        System.out.println("ciao " + (3.0F + 3));//ciao 6.0
        System.out.println("ciao " + 3.0F * 3);//ciao 9.0
        System.out.println(3.0F + 3 + "ciao ");//6.0 ciao
        System.out.println(3.0F * 3 + "ciao ");//9.0 ciao
        */
        
        /*
        java.​lang.​String
        public int indexOf(String str,                    int fromIndex)
        Returns the index within this string of the first occurrence of the
        specified substring, starting at the specified index.
        The returned index is the smallest value k for which:
             k >= Math.min(fromIndex, this.length()) &&
                           this.startsWith(str, k)

        If no such value of k exists, then -1 is returned.
        Parameters:
        str - the substring to search for. fromIndex - the index from which to
        start the search. 
        Returns:
        the index of the first occurrence of the specified substring, starting
        at the specified index, or -1 if there is no such occurrence.
        */
        
        

        
    }
    
}
