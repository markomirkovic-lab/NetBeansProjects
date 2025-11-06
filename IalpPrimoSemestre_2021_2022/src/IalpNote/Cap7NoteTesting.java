/**
 * Cap 8 Note Testing - Operatori
 * @author marko.mirkovic
 * @version 08.01.2022
 */

package IalpNote;


public class Cap7NoteTesting
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;
        float c = 3.0f;
        float d = 4.0f;
        c = a * d; // OK, a viene promossa a float
        System.out.println(c);//4.0
        //a = c * b; // Errore di compilazione, il risultato è di tipo float
        a = (int) c * b; // Errore di compilazione, il risultato è di tipo float
        System.out.println(a);//8
        //a = (float) c * b; // Errore di compilazione, il risultato è di tipo float
        a = (int)c * b;
        System.out.println(a);//8
        a = 1;
        b = 2;
        c = a / b; // c ora vale 0.0
        System.out.println(c);//0.0
        d = (float)a / b; // d ora vale 0.5
        System.out.println(d);//0.5
        
        /*
        run:
        4.0
        8
        8
        0.0
        0.5
        */
        System.out.println("");
        System.out.println("---");
        System.out.println("");
     
        
                              // 2147483647
        int aa = 0x7FFFFFFF;  // 0111’1111’1111’1111’1111’1111’1111’1111
        short bb = (short)aa; // 1111’1111’1111’1111 > -1
        System.out.println(aa);//2147483647
        System.out.println(bb);//-1
        
        /*
        
        int aa = 0x7FFFFFFF;    0111’1111’1111’1111’1111’1111’1111’1111
        max short = 32767                           0111'1111'1111'1111
        (short) 0x7FFFFFFF:
        troncato di:            1111’1111’1111’1111
        int -1 =                                    1111'1111'1111'1111
        ---------------------------------------------------------------
        
        
        */
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        int aaa = 2147482300;
        float f = aaa; // f vale 2.14748224E9 > 2147482240
        System.out.println(aaa);
        System.out.println(f);
        
        /*
        2147482300
        2.14748224E9
        
        2.147482300         int aaa
        2.14748224000000000 float f
        
        0.00000016          perdita di bit meno significativi
        */
        
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        long aaaa = 2147482300;
        double ff = aaa; // f vale 2.14748224E9 > 2147482240
        System.out.println(aaa);
        System.out.println(f);
        
       
        /*
        stesso risultato:
        2147482300
        2.14748224E9
        
        2.147482300         long   aaa
        2.14748224000000000 double f
        
        0.00000016          perdita di bit meno significativi
        */
               
        
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        short stipendioShort = 0b00000000100000000;//256: HHHH'HHHH'LLLL'LLLL
        System.out.println(stipendioShort);//stampa 256
        byte stipendioByte = (byte)stipendioShort;//LLLL'LLLL
        System.out.println(stipendioByte);//stampa 0!!!
        
        /*
        0'0000'0001'0000'0000    = 256
          0000'0000'0111'1111    = 127 max short
        short
        troncato:
                    0000'0000    = 0
        
        */
        
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        
        System.out.println("---");
        //oppure:
        
        short ss = 0x00FF; //0000'0000'1111'1111
        byte bbbb = (byte)ss; // 1111'1111
        System.out.println(bbbb);//stampa -1, perché?
        
        /*
        0000'0000'1111'1111     Hex 00FF = 255
                  1111'1111     Valore residuo dopo il troncamento = -1
        
        
        
        
        */
        
        
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        
        int A = 3;
        int B = 5;
        boolean C = A>B;
        System.out.println("A>B " + C);
        System.out.println(A>B);
        C = A!=B;
        System.out.println("A!=B " + C);
        System.out.println(A!=B);
        
        C = A==B;
        System.out.println("A==B " + C);
        System.out.println(A==B);
        
        /*
        A>B false
        false
        A!=B true
        true
        A==B false
        false
        */
        
        System.out.println("---");
        
        
        
        
        int F = 7;
        int G = 7;
        //String M = F + G + ""; OK
        var M = F + G + "";
        var N = 3;
        var z = "hello";
        N = 4;
        
        System.out.println(F + G + "");
        System.out.println(M);
        System.out.println( (Object)M.getClass().getName() );        
        System.out.println(N * 3);
        
    }
}
