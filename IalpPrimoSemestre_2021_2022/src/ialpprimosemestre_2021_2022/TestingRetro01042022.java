
package ialpprimosemestre_2021_2022;

/**
 *
 * @author marko.mirkovic
 * @version
 */
public class TestingRetro01042022
{
    public static void main(String[] args)
    {
        /*
        String a = "Ciao";
        
        System.out.println(a);
        
        System.out.println(a.length());
        
        int b = 0;
        
        System.out.println("---");
        
        */
        
        //--
        
        //Array
        
        int[] dati = {9, 18, 27, 36, 45, 54};
        
        //Inserire in cima all'array
        
        int[] tmp=new int[ dati.length+1 ];
        
        for(int i=0; i<dati.length; i++) //Scorriamo tutti gli elementi
        { 
            tmp[i+1] = dati[i]; //Copio elaborando la nuova posizione
        }
        
        tmp[0] =99;
        
        dati = tmp;
        
        for(int i=0; i<dati.length; i++) //Scorriamo tutti gli elementi
        { 
            //System.out.println(dati[i]);
            System.out.print( dati[i] + (i != dati.length-1 ? "," : ".\n") );
            
        }
        
        
        //----------------
        
        //Inserire in fondo
        
        int[] dati2 = {9, 18, 27, 36, 45, 54};
        
        int[] tmp2=new int[ dati2.length+1 ];
        
        for(int i=0; i<dati2.length; i++) //Scorriamo tutti gli elementi
        { 
            tmp2[i] = dati2[i]; //Copio elaborando la nuova posizione
        }
        
        tmp2[tmp2.length-1] =99;
        
        dati2 = tmp2;
        
        for(int i=0; i<dati.length; i++) //Scorriamo tutti gli elementi
        { 
            //System.out.println(dati[i]);
            System.out.print( dati2[i] + (i != dati2.length-1 ? "," : ".\n") );
            
        }
        
        //-------------
        
        //Inserire in mezzo
        
        //index        0   1   2   3   4   5
        int[] dati3 = {9, 18, 27, 36, 45, 54};
        
        int[] tmp3=new int[ dati3.length+1 ];
        
        int index = 3;
        
        for(int i=0; i<dati3.length; i++) //Scorriamo tutti gli elementi
        { 
            if(i<index)
            {
                tmp3[i] = dati3[i]; //Copio elaborando la nuova posizione
            }
            else
            {
                tmp3[i+1] = dati3[i]; //Copio elaborando la nuova posizione
            }
            
            tmp3[index] = dati3[i]; //Copio elaborando la nuova posizione
        }
        
        tmp3[index] =99;
        
        dati3 = tmp3;
        
        for(int i=0; i<dati3.length; i++) //Scorriamo tutti gli elementi
        { 
            //System.out.println(dati[i]);
            System.out.print( dati3[i] + (i != dati3.length-1 ? "," : ".\n") );
            
        }
        
        //Togliere dall'array
        
        //index        0   1   2   3   4   5
        int[] dati4 = {9, 18, 27, 36, 45, 54};
        
        for(int i=0; i<dati4.length; i++) //Scorriamo tutti gli elementi
        { 
            //System.out.println(dati[i]);
            System.out.print( dati4[i] + (i != dati4.length-1 ? "," : ".\n") );
            
        }
        
        int[] tmp4=new int[ dati4.length-1 ];
        
        int index4 = 3;
        
        for(int i=0; i<dati4.length; i++) //Scorriamo tutti gli elementi
        { 
            if(i<index)
            {
                tmp4[i] = dati4[i]; //Copio elaborando la nuova posizione
            }
            else if(i>index)
            {
                tmp4[i-1] = dati4[i]; //Copio elaborando la nuova posizione
            }
        }
        
        dati4 = tmp4;
        
        for(int i=0; i<dati4.length; i++) //Scorriamo tutti gli elementi
        { 
            //System.out.println(dati[i]);
            System.out.print( dati4[i] + (i != dati4.length-1 ? "," : ".\n") );
            
        }
        
        System.out.println("---");
        
        /*
        run:
        99,9,18,27,36,45,54.
        9,18,27,36,45,54,99.
        9,18,27,99,36,45,54.
        9,18,27,36,45,54.
        9,18,27,45,54.
        */
        
        //--
        
        /*
        int [] a, b;
        
        a = new int[3];
        */
        
     
        //array testing
                
        int [] a = {11, 22, 33};
        
        int [] b;
        
        b = a;
        
        System.out.println("a[2]" + a[2]);
        
        b[2] = 77;
        
        System.out.println("b[2]" + b[2]);
        System.out.println("a[2]" + a[2]);
        
        System.out.println("---");
        /*
        run:
        a[2]33
        b[2]77
        a[2]77 <- a[2] viene modificata
        */
        
        //method clone
        
        int [] a2 = {11, 22, 33};
        
        int [] b2;
        
        b2 = a2.clone();
        
        System.out.println("a2[2]" + a2[2]);
        
        b2[2] = 77;
        
        System.out.println("b2[2]" + b2[2]);
        System.out.println("a2[2]" + a2[2]);
        
        /*
        run:
        a2[2]33
        b2[2]77
        a2[2]33 <- a2[2] non viene modificata
        */
        
        System.out.println("---");
        
        //--
        
        /*
        matrice={    0 1 2
                   0{1,2,3},
                   1{4,5,6},
                   2{7,8,9}}
        
        */
        
        int[][] matrice={{1,2,3},{4,5,6},{7,8,9}};
        
        for(int r=0; r<matrice.length; r++)
        { 
            for(int c=0; c<matrice[r].length; c++)
            {
                System.out.print(matrice[r][c] + " ");
            }
            System.out.println();

        }
        
        /*
        run:
        1 2 3 
        4 5 6 
        7 8 9
        */
        
        System.out.println("--");
        System.out.println("matrice[0].length: " + matrice[0].length);
        System.out.println("matrice[1].length: " + matrice[1].length);
        System.out.println("matrice[2].length: " + matrice[2].length);
        System.out.println("--");
        System.out.println("matrice[0]: " + matrice[0]);
        System.out.println("matrice[1]: " + matrice[1]);
        System.out.println("matrice[2]: " + matrice[2]);
        System.out.println("---");
        //--
        
        int[][] matrice2={{1,2,3},{4,5,6,6,6},{7,8,9}};
        
        for(int r=0; r<matrice2.length; r++)
        { 
            for(int c=0; c<matrice2[r].length; c++)
            {
                System.out.print(matrice2[r][c] + " ");
            }
            System.out.println();

        }
        
        /*
        run:
        1 2 3 
        4 5 6 
        7 8 9
        */
        
        /*
        1 2 3 
        4 5 6 
        7 8 9 
        --
        matrice[0].length: 3
        matrice[1].length: 3
        matrice[2].length: 3
        --
        matrice[0]: [I@735f7ae5
        matrice[1]: [I@180bc464
        matrice[2]: [I@1324409e
        */
        
        System.out.println("--");
        System.out.println("matrice2[0].length: " + matrice2[0].length);
        System.out.println("matrice2[1].length: " + matrice2[1].length);
        System.out.println("matrice2[2].length: " + matrice2[2].length);
        System.out.println("--");
        System.out.println("matrice2[0]: " + matrice2[0]);
        System.out.println("matrice2[1]: " + matrice2[1]);
        System.out.println("matrice2[2]: " + matrice2[2]);
        
        /*
        1 2 3 
        4 5 6 6 6 
        7 8 9 
        --
        matrice2[0].length: 3
        matrice2[1].length: 5
        matrice2[2].length: 3
        --
        matrice2[0]: [I@2c6a3f77
        matrice2[1]: [I@246ae04d
        matrice2[2]: [I@62043840
        */
        
        System.out.println("--");
        
        //--
        
        /*
        for(int i=0; i<args.length; i++)
        {
            System.out.println(args[i]);
        }
        */
        
        //--
        
        double [][] temperature = new double[7][7];
        
        for(int r=0; r<temperature.length; r++)
        { 
            for(int c=0; c<temperature[r].length; c++)
            {
                System.out.print(temperature[r][c] + " ");
            }
            System.out.println();
        }
        
        /*
        0.0 0.0 0.0 0.0 0.0 0.0 0.0 
        0.0 0.0 0.0 0.0 0.0 0.0 0.0 
        0.0 0.0 0.0 0.0 0.0 0.0 0.0 
        0.0 0.0 0.0 0.0 0.0 0.0 0.0 
        0.0 0.0 0.0 0.0 0.0 0.0 0.0 
        0.0 0.0 0.0 0.0 0.0 0.0 0.0 
        0.0 0.0 0.0 0.0 0.0 0.0 0.0
        */
        
        String [][] parole = new String[7][7];
        
        for(int r=0; r<parole.length; r++)
        { 
            for(int c=0; c<parole[r].length; c++)
            {
                System.out.print(parole[r][c] + " ");
            }
            System.out.println();
        }
        
        /*
        null null null null null null null 
        null null null null null null null 
        null null null null null null null 
        null null null null null null null 
        null null null null null null null 
        null null null null null null null 
        null null null null null null null
        */
        
        System.out.println("---");
        
        int [] mx1 = {1, 2, 3};
        
        int [] mx2 = new int[mx1.length];
        
        for(int r=0; r<mx1.length; r++)
        {
            mx2[r] = mx1[r];
        }
        
        for(int r=0; r<mx1.length; r++)
        {
            System.out.print(mx2[r] + (r != mx2.length-1 ? ", " : ".\n") );
        }
        
        //--
        
        int [] mx3 = {1, 2, 3};
        
        int [] mx4 = new int[mx3.length];
        
        int i = 0;
        
        for(int r=mx3.length-1; r>=0; r--)
        {
            
            /*
            for(int i=0; i<mx3.length; i++)
            {
                mx4[i] = mx3[r];
            }
            */
            
            
            
            mx4[i] = mx3[r];
            i++;
        }
        
        
        for(int r=0; r<mx4.length; r++)
        {
            System.out.print(mx4[r] + (r != mx4.length-1 ? ", " : ".\n") );
        }
        
        /*
        run:
        1, 2, 3.
        3, 2, 1.
        */
        
        System.out.println("---");
        
        //--
        
        //inverse
        
        //https://www.sanfoundry.com/java-program-find-inverse-matrix/
        
        
        
        int [][] mx5 = { {1, 2, 3},
                         {4, 5, 6},
                       };
        
        int [][] mx6 = new int[mx5.length][mx5[0].length];
        
        
        int i6 = 0;
        int g6 = 0;
        
        for(int r=0; r<mx5.length-1; r++)
        {
            
            
            for(int c=0; c<mx5[r].length-1; c++)
            {
                
                //mx6[i] = mx5[r];
                
                mx6[r][c] = mx5[r][c];
                
                
                
            }
            
                        
            
            
        }
        
        
        
        
        
        
        for(int r=0; r<mx6.length; r++)
        {
            for(int c=0; c<mx6[r].length; c++)
            {
                System.out.print(mx6[r][c] + (c != mx6[r].length-1 ? ", " : ".\n") );
            }
            
        }
        
        
        //System.out.println(mx6[0][0] + mx  + " " + mx6[1][1]);
        
        
        System.out.println("---");
        
        int n = 10;
        
        System.out.println("Math.log10(n)/Math.log10(2))+1" + (Math.log10(n)/Math.log10(2))+1);
        
        
    }
}
