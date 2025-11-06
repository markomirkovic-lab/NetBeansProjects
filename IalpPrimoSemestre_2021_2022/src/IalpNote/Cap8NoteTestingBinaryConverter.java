/**
 * IALP Cap 8 Note Testing - Binary converter
 * @author marko.mirkovic
 * @version 08.01.2022
 */

package IalpNote;


public class Cap8NoteTestingBinaryConverter
{
    public static void main(String[] args)
    {
        byte b = 7;
        
        byte b0 = (byte) (b % 2);               //7%2 = 1
        b /= 2;                     //7/2 = 3
        byte b1 = (byte) (b % 2);               //3%2 = 1
        b /= 2;                     //3/2 = 1
        byte b2 = (byte) (b % 2);               //1%2 = 1
        b /= 2;                     //1/2 = 0
        byte b3 = (byte) (b % 2);               //0%2 = 0
        b /= 2;                     //0/2 = 0
        byte b4 = (byte) (b % 2);               //0%2 = 0
        b /= 2;                     //0/2 = 0
        byte b5 = (byte) (b % 2);               //0%2 = 0   
        b /= 2;                     //0/2 = 0
        byte b6 = (byte) (b % 2);               //0%2 = 0   
        b /= 2;                     //0/2 = 0
        byte b7 = (byte) (b % 2);               //0%2 = 0
        
        System.out.println("" + b7 + b6 + b5 + b4 + b3 + b2 + b1 + b0);
        
        /*
        run:
        00000111
        */
                  
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        int B1 = 7;
        //                                                        print | OUTPUT
        String result = "";
        //                           7%2                                      1
        result = "" + (B1 % 2);    //System.out.println(result);    1
        B1 /= 2;                   //7/2 = 3
        //                           3%2                                      1
        result = (B1 % 2) + result;//System.out.println(result);    11
        B1 /= 2;                   //3/2 = 1
        //                         //1%2                                      1
        result = (B1 % 2) + result;//System.out.println(result);    111
        B1 /= 2;                   //1/2 = 0
        //                         //0%2                                      0
        result = (B1 % 2) + result;//System.out.println(result);    0111
        B1 /= 2;                   //0/2 = 0
        //                         //0%2                                      0
        result = (B1 % 2) + result;//System.out.println(result);    00111
        B1 /= 2;                   //0/2 = 0
        //                         //0%2                                      0
        result = (B1 % 2) + result;//System.out.println(result);    000111
        B1 /= 2;                   //0/2 = 0
        //                         //0%2                                      0
        result = (B1 % 2) + result;//System.out.println(result);    0000111
        B1 /= 2;                   //0/2 = 0
        //                         //0%2                                      0
        result = (B1 % 2) + result;//System.out.println(result);    00000111
        B1 /= 2;                   //0/2 = 0
        System.out.println(result);
        
        /*
        1
        11
        111
        0111
        00111
        000111
        0000111
        00000111
        
        00000111
        */
        
        /*
        run:
        00000111
        */
                
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        System.out.println("B11 ");
        
        int nro = 7;
        byte B11;
        //System.out.print("Inserisci un numero rappresentabile in un Byte: ");
        //nro=tastiera.nextInt();
        //------------------------------------------------------------
        //Prima soluzione
        //------------------------------------------------------------
        B11=(byte)nro;
        System.out.print("\n\nQuesto sistema ha un difetto: il "
        + " risultato va letto da destra a sinistra: ");
        System.out.print((B11%2));
        //Devo usare il casting perchè l'operatore % restituisce un int a causa del 2!
        B11=(byte)(B11/2);
        System.out.print((B11%2));
        B11=(byte)(B11/2);
        System.out.print((B11%2));
        B11=(byte)(B11/2);
        System.out.print((B11%2));
        B11=(byte)(B11/2);
        System.out.print((B11%2));
        B11=(byte)(B11/2);
        System.out.print((B11%2));
        B11=(byte)(B11/2);
        System.out.print((B11%2));
        B11=(byte)(B11/2);
        System.out.print((B11%2));
        B11=(byte)(B11/2);
        
        /*
        7%2 = 1                 1
        7/2 = 3
        
        3%2 = 1                 1
        3/2 = 1
        
        1%2 = 1                 1
        1/2 = 0
        
        0%2 = 0                 0
        0/2 = 0
        
        0%2 = 0                 0
        0/2 = 0
        
        0%2 = 0                 0
        0/2 = 0
        
        0%2 = 0                 0
        0/2 = 0
        
        0%2 = 0                 0
        0/2 = 0
        
        ----------------------->11100000
        */
        
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        int B2 = 7;
        
        String result2 = "";
        result2 = "" + (B2 % 2);            // 7%2                      =        1
        result2 = ((B2 /= 2) % 2) + result2;//(7/2)%2 = 3%2 =1+      "1"=       11
        result2 = ((B2 /= 2) % 2) + result2;//(3/2)%2 = 1%2 =1+     "11"=      111
        result2 = ((B2 /= 2) % 2) + result2;//(1/2)%2 = 0%2 =0+    "111"=     0111
        result2 = ((B2 /= 2) % 2) + result2;//(0/2)%2 = 0%2 =0+   "0111"=    00111
        result2 = ((B2 /= 2) % 2) + result2;//(0/2)%2 = 0%2 =0+  "00111"=   000111
        result2 = ((B2 /= 2) % 2) + result2;//(0/2)%2 = 0%2 =0+ "000111"=  0000111
        result2 = ((B2 /= 2) % 2) + result2;//(0/2)%2 = 0%2 =0+"0000111"= 00000111
        System.out.println("result 2 " + result2);//result 2 00000111
        
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        nro = 7;
        byte bb;
        bb=(byte)nro;
        String conversione="";
        //Uso la stringa per memorizzare il risultato,
        //inserendo davanti, in testa, i resti del modulo
        //                                                    OUPUT conversione
        conversione=(bb%2) + conversione;//7 % 2 = 1 -> 1 +        "" =        1
        bb=(byte)(bb/2);                 //7 / 2 = 3
        conversione=(bb%2) + conversione;//3 % 2 = 1 -> 1 +       "1" =       11
        bb=(byte)(bb/2);                 //3 / 2 = 1
        conversione=(bb%2) + conversione;//1 % 2 = 1 -> 1 +      "11" =      111
        bb=(byte)(bb/2);                 //1 / 2 = 0
        conversione=(bb%2) + conversione;//0 % 2 = 0 -> 0 +     "111" =     0111
        bb=(byte)(bb/2);                 //0 / 2 = 0
        conversione=(bb%2) + conversione;//0 % 2 = 0 -> 0 +    "0111" =    00111 
        bb=(byte)(bb/2);                 //0 / 2 = 0
        conversione=(bb%2) + conversione;//0 % 2 = 0 -> 0 +   "00111" =   000111
        bb=(byte)(bb/2);                 //0 / 2 = 0
        conversione=(bb%2) + conversione;//0 % 2 = 0 -> 0 +  "000111" =  0000111
        bb=(byte)(bb/2);                 //0 / 2 = 0
        conversione=(bb%2) + conversione;//0 % 2 = 0 -> 0 + "0000111" = 00000111
        bb=(byte)(bb/2);                 //0 / 2 = 0
        //---------------------------------------------->0000'0111
        System.out.println("\n\nAnche questo sistema è perfetto: " + conversione);
        
        //Anche questo sistema è perfetto: 00000111
        
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        System.out.println("r");
        System.out.println("-.-");
        
        nro = 7;
        byte r;
        r=(byte)nro;
        
        //Uso l’and sui bit per esaminare se il bit più significativo
        //è a 1
        //Es: Se il numero da convertire è 0b10110011   = 
        //                               & 0b10000000   = 128
        // da come risultato               0b10000000
        //
        //Es: Se il numero da convertire è 0b00000111   =   7
        //                               & 0b10000000   = 128
        // da come risultato               0b00000000   =   0
        //
        // Se lo shifto a sinistra di 7 posizioni ottengo 0b00000001
        //Lavorando sul bit più significativo
        //System.out.print((r & 128)>>7); //Ottengo 0 oppure 1
        //r=(byte)(r<<1); //Tolgo il bit appena esaminato
        
        
        //r = 7
        System.out.print((r & 128)>>7);//(  7 & 128) =   0 ->    0>>7 = 0
        r=(byte)(r<<1);                //  7<<1 =   14
        System.out.print((r & 128)>>7);//( 14 & 128) =   0 ->    0>>7 = 0 
        r=(byte)(r<<1);                // 14<<1 =   28
        System.out.print((r & 128)>>7);//( 28 & 128) =   0 ->    0>>7 = 0
        r=(byte)(r<<1);                // 28<<1 =   56
        System.out.print((r & 128)>>7);//( 56 & 128) =   0 ->    0>>7 = 0
        r=(byte)(r<<1);                // 56<<1 =  112
        System.out.print((r & 128)>>7);//(112 & 128) =   0 ->    0>>7 = 0
        r=(byte)(r<<1);                //112<<1 =  -32
        System.out.print((r & 128)>>7);//(-32 & 128) = -32 ->  -32>>7 = 1
        r=(byte)(r<<1);                //-32<<1 =  -64
        System.out.print((r & 128)>>7);//(-64 & 128) = -64 ->  -64>>7 = 1
        r=(byte)(r<<1);                //-64<<1 = -128
        System.out.print((r & 128)>>7);//(-128 & 128)=-128 -> -128>>7 = 1
        r=(byte)(r<<1);                //-128<<1 =   0
        //------------------------------------------------------------>0000'0111
        //System.out.print OUTPUT: 00000111
        System.out.println("");
        
        /*
        --------------------
          0b00000111   =   7
        & 0b10000000   = 128
          0b00000000   =   0
        
          0b00000000          ->   0>>7                     0
        --------------------
          0b00000111   =   7
          0b00001110   =  14  ->   7<<1  
        ----------------------
          0b00001110   =  14
        & 0b10000000   = 128
          0b00000000   =   0
          0b00000000          ->   0>>7                     0
        --------------------
          0b00001110   =  14
          0b00011100   =  28  ->  14<<1
        ----------------------
          0b00011100   =  28
        & 0b10000000   = 128
          0b00000000   =   0
        
          0b00000000          ->   0>>7                     0
        --------------------
          0b00011100   =  28
          0b00111000   =  56  ->  28<<1
        ----------------------
          0b00111000   =  56
        & 0b10000000   = 128
          0b00000000   =   0
        
          0b00000000          ->   0>>7                     0
        --------------------
          0b00111000   =  56
          0b01110000   = 112  ->  56<<1
        ----------------------
          0b01110000   = 112
        & 0b10000000   = 128
          0b00000000   =   0
        
          0b00000000   =      ->   0>>7                     0  
        --------------------
          0b01110000   = 112
          0b11100000   = -32  ->  112<<1
        ----------------------
          0b11100000   = -32
        & 0b10000000   = 128
          0b10000000   = 128
        
          0b00000001   =   1  -> 128>>7                     1
        --------------------
          0b11100000   = -32
          0b11000000   = -64  -> -32<<1
        ----------------------
          0b11000000   = -64
        & 0b10000000   = 128
          0b10000000   = 128
        
          0b00000001   =   1  -> 128>>7                     1
        --------------------
          0b11000000   = -64
          0b10000000   =-128  -> -64<<1
        ----------------------
         0b110000000   =-128
        &0b010000000   = 128
         0b010000000   = 128
        
          0b00000001   =   1  -> 128>>7                     1
        --------------------
        
        ---------------------------------------------------->0000'0111
        
        */
        
        /*
        System.out.println("-.-");
        System.out.println("details:");
       
        System.out.println("r: " + r);
        System.out.println("r & 128 " + (r & 128));
        System.out.println("--");
        System.out.println("r & 128)>>7 " + ((r & 128)>>7));
        System.out.println("--");
        r=(byte)(r<<1);
        System.out.println("r : " + r);
        System.out.println("--");
        System.out.println("r<<1 : " + r);
        System.out.println("--");
        System.out.println("r & 128 " + (r & 128));
        System.out.println("--");
        System.out.println("r & 128)>>7 " + ((r & 128)>>7));
        System.out.println("--");
        r=(byte)(r<<1);
        System.out.println("r : " + r);
        System.out.println("--");
        System.out.println("r<<1 : " + r);
        System.out.println("--");
        System.out.println("r & 128 " + (r & 128));
        System.out.println("--");
        System.out.println("r & 128)>>7 " + ((r & 128)>>7));
        System.out.println("--");
        r=(byte)(r<<1);
        System.out.println("r : " + r);
        System.out.println("--");
        System.out.println("r<<1 : " + r);
        System.out.println("--");
        System.out.println("r & 128 " + (r & 128));
        System.out.println("--");
        System.out.println("r & 128)>>7 " + ((r & 128)>>7));
        System.out.println("--");
        r=(byte)(r<<1);
        System.out.println("r : " + r);
        System.out.println("--");
        System.out.println("r<<1 : " + r);
        System.out.println("--");
        System.out.println("r & 128 " + (r & 128));
        System.out.println("--");
        System.out.println("r & 128)>>7 " + ((r & 128)>>7));
        System.out.println("--");
        r=(byte)(r<<1);
        System.out.println("r : " + r);
        System.out.println("--");
        System.out.println("r<<1 : " + r);
        System.out.println("--");
        System.out.println("r & 128 " + (r & 128));
        System.out.println("--");
        System.out.println("r & 128)>>7 " + ((r & 128)>>7));
        System.out.println("--");
        r=(byte)(r<<1);
        System.out.println("r : " + r);
        System.out.println("r<<1 : " + r);
        System.out.println("--");
        System.out.println("r & 128 " + (r & 128));
        System.out.println("--");
        System.out.println("r & 128)>>7 " + ((r & 128)>>7));
        System.out.println("--");
        r=(byte)(r<<1);
        System.out.println("r : " + r);
        System.out.println("--");
        System.out.println("r<<1 : " + r);
        System.out.println("--");
        System.out.println("r & 128 " + (r & 128));
        System.out.println("--");
        System.out.println("r & 128)>>7 " + ((r & 128)>>7));
        System.out.println("--");
        r=(byte)(r<<1);
        System.out.println("-128<<1 :" + ((byte)(-128<<1)));
        System.out.println("r : " + r);
        System.out.println("--");
        */
        
        /*
        r
        -.-
        -.-
        details:
        r: 7
        r & 128 0
        --
        r & 128)>>7 0
        --
        r : 14
        --
        r<<1 : 14
        --
        r & 128 0
        --
        r & 128)>>7 0
        --
        r : 28
        --
        r<<1 : 28
        --
        r & 128 0
        --
        r & 128)>>7 0
        --
        r : 56
        --
        r<<1 : 56
        --
        r & 128 0
        --
        r & 128)>>7 0
        --
        r : 112
        --
        r<<1 : 112
        --
        r & 128 0
        --
        r & 128)>>7 0
        --
        r : -32
        --
        r<<1 : -32
        --
        r & 128 128
        --
        r & 128)>>7 1
        --
        r : -64
        r<<1 : -64
        --
        r & 128 128
        --
        r & 128)>>7 1
        --
        r : -128
        --
        r<<1 : -128
        --
        r & 128 128
        --
        r & 128)>>7 1
        --
        -128<<1 :0
        r : 0
        --

        ---
        */
        
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        System.out.println("rr");
        System.out.println("");
        
        byte rr=7;
        System.out.print((rr>>7) & 1);// ((0) & 1) =    0
        rr=(byte)(rr<<1);//14
        System.out.print((rr>>7) & 1);// ((0) & 1) =    0
        rr=(byte)(rr<<1);//28
        System.out.print((rr>>7) & 1);// ((0) & 1) =    0
        rr=(byte)(rr<<1);//56
        System.out.print((rr>>7) & 1);// ((0) & 1) =    0
        rr=(byte)(rr<<1);//112
        System.out.print((rr>>7) & 1);// ((0) & 1) =    0
        rr=(byte)(rr<<1);//-32
        System.out.print((rr>>7) & 1);// ((1) & 1) =    1
        rr=(byte)(rr<<1);//-64
        System.out.print((rr>>7) & 1);// ((1) & 1) =    1
        rr=(byte)(rr<<1);//-128
        System.out.print((rr>>7) & 1);// ((1) & 1) =    1
        rr=(byte)(rr<<1);//0
        //System.out.print----------------------------->00000111
        
        /*
        run:
        rr

        00000111
        */
        
        /*
        -------------
          0b00000111 -> 7
        
          0b00000000 -> 0 = 7>>1
        & 0b00000001 -> & 1
          0b00000000 ->                             0
        ------------
          0b00000111 ->  7
          0b00001110 -> 14 = 7<<1
        -------------
          0b00001110 -> 14
        
          0b00000000 -> 0 = 14>>7
        & 0b00000001 -> & 1
          0b00000000 ->                             0
        ------------
          0b00001110 -> 14
          0b00011100 -> 28 = 14<<1
        -------------
          0b00011100 -> 28
        
          0b00000000 -> 0 = 28>>7
        & 0b00000001 -> & 1
          0b00000000 ->                             0
        ------------
          0b00011100 -> 28
          0b00111000 -> 56 = 28<<1
        -------------
          0b00111000 -> 56
        
          0b00000000 -> 0 = 56>>7
        & 0b00000001 -> & 1
          0b00000000 ->                             0
        ------------
          0b00111000 -> 56
          0b01110000 -> 112 = 54<<1
        -------------
          0b01110000 -> 112
        
          0b00000000 -> 0 = 112>>7
        & 0b00000001 -> & 1
          0b00000000 ->                             0
        ------------
          0b01110000 -> 112
          0b11100000 -> -32 = 112<<1
        -------------
          0b11100000 -> -32
        
          0b11111111 -> -1 = -32>>7
        & 0b00000001 -> & 1
          0b00000001 ->                             1
        ------------
          0b11100000 -> -32
          0b11000000 -> -64 = -32<<1
        -------------
          0b11000000 -> -64
         
          0b11111111 ->  -1 = -64>>7
        & 0b00000001 -> & 1
          0b00000001 ->                             1
        ------------
          0b11000000 -> -64
          0b10000000 -> -128 = -64<<1
        -------------
          0b10000000 -> -128
         
          0b11111111 ->  -1 = -128>>7
        & 0b00000001 -> & 1
          0b00000001 ->                             1 
        ------------
          0b10000000 -> -128
          0b00000000 ->   0 = -128<<1
        -------------
        System.out.print---------------------------->0000'0111
        */
        
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        /*
        B11 

        Questo sistema ha un difetto: il  risultato va letto da destra a sinistra: 11100000
        */
        
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        System.out.println("B111");
        
        //int nro = 7;
        nro = 7;
        byte B111=(byte)nro;
        System.out.print("\n\nQuesto sistema è perfetto: ");
        System.out.print((B111/2/2/2/2/2/2/2)%2);
        System.out.print((B111/2/2/2/2/2/2)%2);
        System.out.print((B111/2/2/2/2/2)%2);
        System.out.print((B111/2/2/2/2)%2);
        System.out.print((B111/2/2/2)%2);
        System.out.print((B111/2/2)%2);
        System.out.print((B111/2)%2);
        System.out.print(B111%2);
        
        /*
        //Metodo standard (ma INVERTITO) di FOIN e NUAC / 2 con il resto
        //                prima cifra e anche prima nella rappresentazione
        (7/2/2/2/2/2/2/2)%2 = 0._%2 =           0
        (7/2/2/2/2/2/2)%2 = 0._%2 =             0
        (7/2/2/2/2/2)%2 = 0._%2 =               0
        (7/2/2/2/2)%2 = 0._%2 =                 0
        (7/2/2/2)%2 = 0._%2 =                   0
        (7/2/2)%2 = 1%2 =                       1
        (7/2)%2 = 3/2 =                         1
         7%2 =                                  1
        ----------------------------------------> 0000'0111
        */
        
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        int B3 = 7;
        
        System.out.print((B3 & 0x80) == 0 ? 0 : 1);     //1000'0000  128
        System.out.print((B3 & 0x40) == 0 ? 0 : 1);     //0100'0000   64
        System.out.print((B3 & 0x20) == 0 ? 0 : 1);     //0010'0000   32
        System.out.print((B3 & 0x10) == 0 ? 0 : 1);     //0001'0000   16
        System.out.print((B3 & 0x08) == 0 ? 0 : 1);     //0000'1000    8
        System.out.print((B3 & 0x04) == 0 ? 0 : 1);     //0000'0100    4
        System.out.print((B3 & 0x02) == 0 ? 0 : 1);     //0000'0010    2
        System.out.println((B3 & 0x01) == 0 ? 0 : 1);   //0000'0001    1
        System.out.println("- . -");
        System.out.println("B3 & 0x80 =  " + (B3 & 0x80));
        System.out.println("B3 & 0x40 =  " + (B3 & 0x40));
        System.out.println("B3 & 0x20 =  " + (B3 & 0x20));
        System.out.println("B3 & 0x10 =  " + (B3 & 0x10));
        System.out.println("B3 & 0x08 =  " + (B3 & 0x08));
        System.out.println("B3 & 0x04 =  " + (B3 & 0x04));
        System.out.println("B3 & 0x02 =  " + (B3 & 0x02));
        System.out.println("B3 & 0x80 =  " + (B3 & 0x01));
        
        /*
        - . -
        B3 & 0x80 =  0
        B3 & 0x40 =  0
        B3 & 0x20 =  0
        B3 & 0x10 =  0
        B3 & 0x08 =  0
        B3 & 0x04 =  4
        B3 & 0x02 =  2
        B3 & 0x80 =  1
        */
        
        /*
        0x80
        0000'0111
        1000'0000 AND
        -------------
        0000'0000       = 0     == 0 ? 0 : 1    ->      0
        
        0x40
        0000'0111
        0100'0000 AND
        -------------
        0000'0000       = 0     == 0 ? 0 : 1    ->      0
        
        0x20
        0000'0111
        0010'0000 AND
        -------------
        0000'0000       = 0     == 0 ? 0 : 1    ->      0
        
        0x10
        0000'0111
        0001'0000 AND
        -------------
        0000'0000       = 0     == 0 ? 0 : 1    ->      0
        
        0x08
        0000'0111
        0000'1000 AND
        -------------
        0000'0000       = 0     == 0 ? 0 : 1    ->      0
        
        0x04
        0000'0111
        0000'0100 AND
        -------------
        0000'0100       = 1     == 0 ? 0 : 1    ->      1
        
        0x02
        0000'0111
        0000'0010 AND
        -------------
        0000'0010       = 1     == 0 ? 0 : 1    ->      1
        
        0x01
        0000'0111
        0000'0001 AND
        -------------
        0000'0001       = 1     == 0 ? 0 : 1    ->      1
        
        ---------------------------------------------------------
        System.out.print ->                             0000'0111
        */
        
                
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        int B4 = 7;
        
        System.out.print((B3 & 128) == 0 ? 0 : 1);     //1000'0000  128
        System.out.print((B3 &  64) == 0 ? 0 : 1);     //0100'0000   64
        System.out.print((B3 &  32) == 0 ? 0 : 1);     //0010'0000   32
        System.out.print((B3 &  16) == 0 ? 0 : 1);     //0001'0000   16
        System.out.print((B3 &   8) == 0 ? 0 : 1);     //0000'1000    8
        System.out.print((B3 &   4) == 0 ? 0 : 1);     //0000'0100    4
        System.out.print((B3 &   2) == 0 ? 0 : 1);     //0000'0010    2
        System.out.println((B3 & 1) == 0 ? 0 : 1);     //0000'0001    1
        System.out.println("- . -");
        System.out.println("B3 & 128 =  " + (B3 & 128));
        System.out.println("B3 &  64 =  " + (B3 &  64));
        System.out.println("B3 &  32 =  " + (B3 &  32));
        System.out.println("B3 &  16 =  " + (B3 &  16));
        System.out.println("B3 &   8 =  " + (B3 &   8));
        System.out.println("B3 &   4 =  " + (B3 &   4));
        System.out.println("B3 &   2 =  " + (B3 &   2));
        System.out.println("B3 &   1 =  " + (B3 &   1));
        
        /*
        - . -
        B3 & 128 =  0
        B3 &  64 =  0
        B3 &  32 =  0
        B3 &  16 =  0
        B3 &   8 =  0
        B3 &   4 =  4
        B3 &   2 =  2
        B3 &   1 =  1
        */
        
        /*
        128
        0000'0111
        1000'0000 AND
        -------------
        0000'0000       = 0     == 0 ? 0 : 1    ->      0
        
        64
        0000'0111
        0100'0000 AND
        -------------
        0000'0000       = 0     == 0 ? 0 : 1    ->      0
        
        32
        0000'0111
        0010'0000 AND
        -------------
        0000'0000       = 0     == 0 ? 0 : 1    ->      0
        
        16
        0000'0111
        0001'0000 AND
        -------------
        0000'0000       = 0     == 0 ? 0 : 1    ->      0
        
        8
        0000'0111
        0000'1000 AND
        -------------
        0000'0000       = 0     == 0 ? 0 : 1    ->      0
        
        4
        0000'0111
        0000'0100 AND
        -------------
        0000'0100       = 1     == 0 ? 0 : 1    ->      1
        
        2
        0000'0111
        0000'0010 AND
        -------------
        0000'0010       = 1     == 0 ? 0 : 1    ->      1
        
        1
        0000'0111
        0000'0001 AND
        -------------
        0000'0001       = 1     == 0 ? 0 : 1    ->      1
        
        ---------------------------------------------------------
        System.out.print ->                             0000'0111
        
        */
        
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        int B5 = 7;
        
        System.out.print((B5 >> 7) & 1);//  0
        System.out.print((B5 >> 6) & 1);//  0
        System.out.print((B5 >> 5) & 1);//  0
        System.out.print((B5 >> 4) & 1);//  0
        System.out.print((B5 >> 3) & 1);//  0
        System.out.print((B5 >> 2) & 1);//  1
        System.out.print((B5 >> 1) & 1);//  1
        System.out.println(B5 & 1);//       1
        
        /*
        (7 >> 7) & 1
        0000'0111   = 7
        
        0000'0000   >>7
        0000'0001   AND 1
        -----------------
        0000'0000                               0
        
        (7 >> 6) & 1
        0000'0111   = 7
        
        0000'0000   >>6
        0000'0001   AND 1
        -----------------
        0000'0000                               0
        
        (7 >> 5) & 1
        0000'0111   = 7
        
        0000'0000   >>5
        0000'0001   AND 1
        -----------------
        0000'0000                               0
        
        (7 >> 4) & 1
        0000'0111   = 7
        
        0000'0000   >>4
        0000'0001   AND 1
        -----------------
        0000'0000                               0
        
        (7 >> 3) & 1
        0000'0111   = 7
        
        0000'0000   >>3
        0000'0001   AND 1
        -----------------
        0000'0000                               0
        
        (7 >> 2) & 1
        0000'0111   = 7
        
        0000'0001   >>2
        0000'0001   AND 1
        -----------------
        0000'0001                               1
        
        (7 >> 1) & 1
        0000'0111   = 7
        
        0000'0011   >>2
        0000'0001   AND 1
        -----------------
        0000'0001                               1
        
        
        0000'0111   = 7
        0000'0001   AND 1
        -----------------
        0000'0001                               1
        
        -------------------------------------------------
        System.out.print ->                     0000'0111
        */
        
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        /*
        run:
        00000111

        ---

        00000111

        ---

        B11 


        Questo sistema ha un difetto: il  risultato va letto da destra a sinistra: 11100000
        ---

        result 2 00000111

        ---



        Anche questo sistema è perfetto: 00000111

        ---

        r
        -.-
        00000111

        ---

        rr

        00000111
        ---


        ---

        B111


        Questo sistema è perfetto: 00000111
        ---

        00000111
        - . -
        B3 & 0x80 =  0
        B3 & 0x40 =  0
        B3 & 0x20 =  0
        B3 & 0x10 =  0
        B3 & 0x08 =  0
        B3 & 0x04 =  4
        B3 & 0x02 =  2
        B3 & 0x80 =  1

        ---

        00000111
        - . -
        B3 & 128 =  0
        B3 &  64 =  0
        B3 &  32 =  0
        B3 &  16 =  0
        B3 &   8 =  0
        B3 &   4 =  4
        B3 &   2 =  2
        B3 &   1 =  1

        ---

        00000111

        ---
        */
    }
}
