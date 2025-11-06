/**
 * Operatori prima parte
 *
 * @author marko.mirkovic
 * Version 07.11.2021
 */
package operatori1parte;


public class Operatori1Parte {


    public static void main(String[] args) {
        
        int a, b, c, d, e, f, g; a=b=c=d=e=f=g=0;
        //Tutte le variabili sono inizializzate a 0
        
        double h;
        
        a=7; b=c=d=e=f=g=a; //Tutte le variabili sono impostate a 7
        
        // b=c=d=e=f=g=h=a; ERRORE non accetta
        
        h=a; // accetta, int a viene castato a double
               
        System.out.println("a: " + a + " " + "b: " + b + " " + "h: " + h);
        
        /*
        run:
        a: 7 b: 7 h: 7.0
        */
        
        //----------------------------------------------------------------
        
        int b2;
        b2=23%5;
        System.out.println("b2: " + b2); // 20 / 5 = 4 con resto di 3
        
        /*
        run:
        bb: 3
        */
        
        //----------------------------------------------------------------
        
        int a2=5;
        
        ++a2; //Prefisso: assegna subito a2 = 5+1
        System.out.println("a2: " + a2); //Stamperà 6
        a2++; //Postfisso: riprende prima a2 = 6 poi a2= 6+1
        System.out.println("a2: " + a2); //Stamperà 7

        int a3=5;
        
        ++a3; //Prefisso: assegna subito a3 = 5+1
        System.out.println("a3: " + a3); //Stamperà 6
        
        int a4=5;
        
        a4++; //Postfisso: assegna subito a4 = 5+1 ?????????
        System.out.println("a4: " + a4); //Stamperà 6
        
        //----------------------------------------------------------------
        
        int a6, b6;
        a6=2;
        b6=3*a++; //Prima calcola 3*a, poi incrementa a 
        System.out.println("a6: " + a6 + " " + "b6: " + b6); //Stamperà 3 6
        //Equivale a fare
        // a6=2
        // b6=3*a6; a6=2;
        // a6=a6+1;
        // a6=3*2=6;
        
        int a7, b7;
        a7=2;
        b7=3*++a7; //Prima incrementa a, poi calcola 3*a
        System.out.println("a7: " + a7 + " " + "b7: " + b7); //Stamperà 3 9
        //Equivale a fare
        // a7=2
        // a7=a+1;
        // b7=3*a; a = 2+1;
        // b7= 3 * 3 = 9;
        
        //----------------------------------------------------------------
        
        int a8, b8;
        
        a8=2;
        b8=a8++*3*++a8;
        System.out.println("a8: " + a8 + " " + "b8: " + b8); //Stamperà 4 24
        //a8= 3 + 1 = 4;
        //b8= 2 * 3 * 4 = 6 * 4 = 24;
     
        int a9, b9;
        
        a9=2;
        b9=++a9*3*a9++;
        System.out.println("a9: " + a9 + " " + "b9: " + b9); //Stamperà 4 27
        //a= (2+1) + (1) = 4;
        //b= 3 * 3 * 3 = 9 * 3 = 27;
        
        int a10, b10;
        a10=2;
        b10=((++a10*3-1)*2)*a10++;
        System.out.println("a10: " + a10 + " " + "b10: " + b10); //Stamperà 4 48
        //a10= (2+1)+1 = 4
        //b10= ( (2+1)*3-1 ) * 2 * 3 = (3*3-1)*2*3 = 8 * 2 * 3 = 16 * 3 = 48
        
        
        int a11, b11;
        a11=2;
        b11=++a11*((3*a11++)*2-1);
        System.out.println("a11: " + a11 + " " + "b11: " + b11); //Stamperà 4 51
        
        //b11= (2+1) * ((3*3)*2-1)= 3 * ((9)*2-1) = 3 * (18-1) = 3 * 17 = 51 
        
        int bb11bis = 3*((3*3)*2-1);
        System.out.println(bb11bis); //51
        
        
        int a12, b12;
        a12=2;
        b12=++a12*a12++*++a12*a12++; //3*3*5*5
        System.out.println("a12: " + a12 + " " + "b12: " + b12);
        //a= (2+1)+0+(1+1)+1= 6;
        //b= (2+1)*3*5*5 = 3*3*5*5 = 225;
        
        
        //----------------------------------------------------------------


        int a13,b13,c13;
        
        a13=5; // 0b00000101
        b13=2; // 0b00000010
        c13=a&b; // 0b00000000
        System.out.println(a13);
        System.out.println(b13);
        System.out.println("a&b: " + c13);
        //Possiamo usarlo per esaminare lo stato di
        //uno specifico bit
        //Possiamo usarlo per impostare a 1 un bit
        //  0b00000101
        //  0b00000010
        // &            AND
        //  0b00000000
        System.out.println("0b: " + 0b00000000);//7
        
        
        c13=a|b; // 0b00000111
        System.out.println("a|b: " + c13);//15 ???
        //Possiamo usarlo per impostare a 1 un bit
        //  0b00000101
        //  0b00000010  2 = b13
        // |            OR
        //  0b00000111
        System.out.println("0b: " + 0b00000111);//7
        
        
        c13=7^b13; // 0b00000101
        System.out.println("7^B13: " + c13);//5
        //Possiamo usarlo per impostare a 0 un
        //determinato bit, se è a 1
        //  0b00000111  7
        //  0b00000010  2 = b13
        // ^            XOR
        //  0b00000101
        System.out.println("0b: " + 0b00000101);//5
        
        
        c13=5^b13; // 0b00000111
        System.out.println(c13);//7
        //Possiamo usarlo per impostare a 1 un
        //determinato bit, se è a 0
        //  0b00000101
        //  0b00000010
        // ^           XOR
        //  0b00000111/7
        System.out.println("0b: " + 0b00000111);//7
        
        
        c13=~b13; // 0b11111101 = - 3
        System.out.println("~: " + c13); //Negazione -3
        //  
        //  0b00000010  2 = b13
        // ~            NOT 
        //  0b11111101  OPPOSITE
        System.out.println("0b: " + 0b11111101);//253 ???
            
        
        c13=b13<<2; // 0b00001000  = 8
        //Shift di due bit a sinistra 
        System.out.println("<<2: " + c13);//8
        //  
        //  0b00000010  2 = b13
        // ~            SHIFT LEFT X 2 
        //  0b000010000 
        System.out.println("0b: " + 0b00001000);//8
          
        
        c13=a13>>2; // 0b00000001  = 1
        //Shift di due bit a destra
        System.out.println(">>2: " + c13);//1
        //  
        //  0b00000010  2 = b13
        // ~            SHIFT RIGHT X 2 
        //  0b00000000  OPPOSITE
        System.out.println("0b: " + 0b00000000);//0 ?????

        c=67; //È il numero da rendere negativo
        System.out.println(c);//67
        c=~c; //Not
        System.out.println(c);//-68
        c=c+1; //+1 -> -68+1= -67
        System.out.println(c); //-67
        
        //----------------------------------------------------------------
        
        
        a=10; a=a+5;
        System.out.println(a);
        a=10; a=a*5;
        System.out.println(a);
        a=10; a=a/5;
        System.out.println(a);
        a=10; a=a-5;
        System.out.println(a);
        a=10; a=a%5;
        System.out.println(a);
        
        
        a=10; a+=5;
        System.out.println(a);
        a=10; a*=5;
        System.out.println(a);
        a=10; a/=5;
        System.out.println(a);
        a=10; a-=5;
        System.out.println(a);
        a=10; a%=5;
        System.out.println(a);
        //----------------------------------------------------------------
        
        /*
        int a, b;
        boolean risultato;
        
        a=5;
        b=7;
        
        risultato= a>b; //Maggiore? false
        risultato= a<b; //Minore? true 
        risultato= a>=b; //Maggiore o uguale? false
        risultato= a<=b; //Minore o uguale? true
        risultato= a==b; //Uguale? false
        risultato= a!=b; //Diverso? true
        
        */
        
        //----------------------------------------------------------------
        
        float nota;
        nota = 10;
        boolean notaValida= (nota>=1) && (nota<=6);
        System.out.println(notaValida);

        /*
        boolean opzioneValida= (scelta=='v') || (scelta=='q');
        
        //Infine dobbiamo anche pensare ad espressioni logiche pure:

        boolean mettiIlMaglione= !piove && (tiraIlVento || (temperatura>5 && temperatura<10));

        */
        
        float livello = 10;
        System.out.println( (livello >= 11.9999 && livello<=12.0001) ? "Livello corretto" : "Livello errato");
        
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        //----------------------------------------------------------------
        
        
        
        
        
    }
    
}
