/**
 * Capitolo 10 Array
 * @author marko.mirkovic
 * @version 19.12.2021
 */

package test19122021;

import java.util.Scanner;
//import java.util.Arrays;1


public class Test19122021
{


    public static void main(String[] args)
    {
        
        
        Scanner input=new Scanner(System.in);
        
        
        
        
        int dimensione;
        dimensione=input.nextInt();
        double[] temp=new double[dimensione];
        
        System.out.println("---");
        
        final int GG_SETTIMANA=7;
        double[] temp2=new double[GG_SETTIMANA];
        double[] temp3=new double[4+3];
        
        System.out.println(temp.length);
        System.out.println(temp);
        System.out.println(temp2.length);
        System.out.println(temp2);
        System.out.println(temp3.length);
        System.out.println(temp3);
        
        
        //la lunghezza è data dal metodo length() e gli indici partono
        //da 0 fino a length()-1
        //per gli Array length() non è un metodo ma è l’attributo length
        
        int[] vettore=new int[7]; //Array di 7 elementi
        System.out.println("L\'array contiene " + vettore.length);
        
               
        //Per accedere all’elemento x, sia per leggerlo che per scriverlo,
        //è sufficiente scrivere l’indice fra parentesi quadre:
        vettore[3]=8;//Assegna il numero 8 alla 4° cella o posizione dell’array vettore
        System.out.println(vettore);
        System.out.println(vettore[3]);
        System.out.println(vettore[2]);
        
        double[] vettore2 = new double[10];
        double a = vettore2[0] = 1.0;
        double b = vettore2[1] = 2.0;
        double c = vettore2[3] = 3;
        //double f = vettore2[15] = 8;//errore oltre l'indice dell'array
        
        
        System.out.println(a);
        System.out.println(vettore2[0]);
        System.out.println(b);
        System.out.println(c);
        //System.out.println(f);//errore oltre l'indice dell'array
        
        /*
        System.out.println("---");
        System.out.println("Errore:");
        System.out.println(vettore[9]);
        
        
        run:
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        Index 9 out of bounds for length 7
        */
        
        /*
        run:
        3
        ---
        3
        [D@12843fce
        7
        [D@3dd3bcd
        7
        [D@97e1986
        L'array contiene 7
        [I@4439f31e
        8
        0
        1.0
        1.0
        2.0
        3.0
        */
        
        System.out.println(" ");
        System.out.println("----------------------------------");
        System.out.println(" ");
        
        int array1[]={0, 1, 2, 3, 4};
        
        System.out.println(array1[2]);
        
        int array2[]=array1.clone();
        
        System.out.println(array2);
        System.out.println(array2[3]);
        
        array2[3]=77;
        System.out.println(array2[3]);
        System.out.println(array1[3]);
        
        System.out.println("---");
        
        int array11[]={0, 1, 2, 3, 4};
        int array22[]=new int[array11.length];
        System.out.println(array11.length);//5
        
        for (int i=0; i<array11.length; i++)
        {
            array22[i]=array11[i];
        }
        array22[2]=77;
        System.out.println("array11[2]: " + (array11[2]) + " " + "array22[2]: " + (array22[2]) );
        
        System.out.println("---");
        
        int[] dati = {9, 18, 27, 36, 45, 54};
        //System.out.println(dati);
        for(int i = 0; i<dati.length; i++)
        {
            //System.out.println(dati[i]);
            System.out.print(dati[i] + ", ");//9, 18, 27, 36, 45, 54, 
        }
        System.out.println("");
        
        System.out.println(dati.length+1);//7 = 6 + 1
        int[] tmp=new int[dati.length+1];
        
        for(int i = 0; i<tmp.length; i++)
        {
            //System.out.println(dati[i]);
            System.out.print(tmp[i] + ", ");//0, 0, 0, 0, 0, 0, 0, 
        }
        System.out.println("");
        System.out.println("---");
        
        int[] tmp2=new int[dati.length+1];
        
        //int[] tmp2 = new int[];//Error: array dimension missing
        
        //                       6
        for(int i = 0; i<dati.length; i++)
        {
            tmp2[i] = dati[i];//insercie 0 nella ultima posizione dell'array
        }
        
        for(int i = 0; i<tmp2.length; i++)
        {
            //System.out.println(dati[i]);
            System.out.print(tmp2[i] + ", "); //9, 18, 27, 36, 45, 54, 0, 
        }
        System.out.println("");
        
        System.out.println("---");
        
        int[] tmp3=new int[dati.length+1];
        
        //int[] tmp2 = new int[];//Error: array dimension missing
        
        //                       6
        for(int i = 0; i<dati.length; i++)
        {
            tmp3[i+1] = dati[i];//inserisce 0 nella posizione 0 dell'array
        }
        
        for(int i = 0; i<tmp3.length; i++)
        {
            //System.out.println(dati[i]);
            System.out.print(tmp3[i] + ", ");//0, 9, 18, 27, 36, 45, 54, 
        }
        System.out.println("");
        
        System.out.println("---");
        
        tmp3[0]=99;
        
        for(int i = 0; i<tmp3.length; i++)
        {
            //System.out.println(dati[i]);
            System.out.print(tmp3[i] + ", ");//99, 9, 18, 27, 36, 45, 54, 
        }
        System.out.println("");
        
        System.out.println("---");
        
        int[] tmp4=new int[dati.length+1];
        
        for(int i = 0; i<dati.length; i++)
        {
            tmp4[i] = dati[i];//inserisce 0 nella posizione 0 dell'array
        }
                
        for(int i = 0; i<tmp4.length; i++)
        {
            //System.out.println(dati[i]);
            System.out.print(tmp4[i] + ", ");//9, 18, 27, 36, 45, 54, 0, 
        }
        
        tmp4[tmp4.length-1]=99;
        
        System.out.println("");
        
        System.out.println("---");
        
        for(int i = 0; i<tmp4.length; i++)
        {
            //System.out.println(dati[i]);
            System.out.print(tmp4[i] + ", ");//9, 18, 27, 36, 45, 54, 99,
        }
        
        
        System.out.println("");
        
        System.out.println("---");
        
        int indice = 3;//indice della cella
        
        int[] tmp5=new int[dati.length+1];
        
        for(int i=0; i<dati.length; i++)
        {
            if(i<indice)
            {
                tmp5[i]=dati[i];//prima di indice 3
                                //9, 18, 27,
            }
            else
            {
                tmp5[i+1]=dati[i];//dopo di indice 3 spostiamo tutti
                                  //i dati a destra di uno
                                  //9, 18, 27, 0, 36, 45, 54,
            }
            
            tmp5[indice]=999;//assegnamo il valore alla posizione indice 3
                             //che era vuota
        }
        
        
        
        for(int i = 0; i<tmp5.length; i++)
        {
            //System.out.println(dati[i]);
            System.out.print(tmp5[i] + ", ");//9, 18, 27, 999, 36, 45, 54,
        }
        System.out.println("");
        
        System.out.println("---");
        
        int indice2 = 3;//Indice della cella
        
       
        int[] tmp6= new int[dati.length-1];
        
        for(int i=0; i<dati.length;i++)
        {
            if(i<indice2)
            {
                                //      0   1   2   3   4   5
                tmp6[i]=dati[i];//dati= 9, 18, 27, 36, 45, 54,
            }
            else if (i>indice2)
            {
                tmp6[i-1]=dati[i];
            }
        }
        
        for(int i = 0; i<tmp6.length; i++)
        {
            //System.out.println(dati[i]);
                                             //0   1   2   3   4
            System.out.print(tmp6[i] + ", ");//9, 18, 27, 45, 54, 
        }
        System.out.println("");
        
        System.out.println("---.---.---");
        
       //----------------------------------------------------------------
       
       int[] aa, bb;
       
       aa= new int[3];
       aa[0]=11;
       aa[1]=22;
       aa[2]=33;
       
       for(int i=0;i<aa.length;i++)
       {
           System.out.print(aa[i] + ", ");
       }
       System.out.println("");
        
       System.out.println("---.---.---");
       
       
       
    }

}
