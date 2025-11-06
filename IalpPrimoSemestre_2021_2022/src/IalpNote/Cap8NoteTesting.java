/**
 * IALP Cap 8 Note Testing
 * @author marko.mirkovic
 * @version 08.01.2022
 */

package IalpNote;


public class Cap8NoteTesting
{
    public static void main(String[] args)
    {
        //                               //byte -> 0000'0000 8bit
        byte D = 0b0111;                 //0111 -> 0000'0111
        System.out.println("D " + D);    //7
        byte E = 0b0110;                 //0110 -> 0000'0110
        System.out.println("E " + E);    //6
        
        /*
        D 7
        E 6
        */
        
        
        System.out.println("D|E   " + (D|E));//7
        //0111          7
        //0110 OR       6
        //--------
        //0111          7
        System.out.println("D&E   " + (D&E));//6
        //0111          7
        //0110 AND      6
        //--------
        //0110          6
        System.out.println("D^E   " + (D^E));//1
        //0111          7
        //0110 XOR      6
        //--------
        //0001          1
        System.out.println("~D   " + (~(D)));//-8
        //0111          7
        //1000 NOT     -8 c1  8 binary
        //--------
        //1000         -8 
        System.out.println("~D+1 " + (~(D)+1));//-7
        //0111          7
        //1000 NOT     -8 c1  8 binary
        //--------
        //0001 +1
        //--------
        //1001         -7
        
        /*
        D|E   7
        D&E   6
        D^E   1
        ~D   -8
        ~D+1 -7
        */
                
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        int a1 = 5;
        int b1 = ~a1;
        System.out.println("a1 " + a1);//5
        System.out.println("b1 " + b1);//-6
        //0101          5
        //1010 NOT     -6 c1   10 binary
        
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        int a2 = 1;
        int b2 = a2<<1;
        System.out.println("a2 " + a2);//1
        System.out.println("b2 " + b2);//2
        //0000'0001     = 1
        //0000'0010     = 2       1<<1
        
        System.out.println("---");
        
        int a3 = -8;
        int b3 = a3 >> 1;
        System.out.println("a3 " + a3);//1
        System.out.println("b3 " + b3);//2
        //1111'1000     = -8
        //1111'1100     = -4       -8>>1
        
        System.out.println("---");
        int a4 = 2;
        int b4 = a4>>1;
        System.out.println("a4 " + a4);//1
        System.out.println("b4 " + b4);//2
        //0000'0010     = 2
        //0000'0001     = 1       2>>1
        
        
        System.out.println("");
        System.out.println("---");
        System.out.println("");
        
        
    }
}
