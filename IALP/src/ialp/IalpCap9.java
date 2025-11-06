 /**
 * General testing
 * IALP Capitolo 9
 * @author marko.mirkovic
 * @version
 * 
 */

package ialp;

import java.util.Scanner;

public class IalpCap9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
    
        int n = 3;
        
        double nota = 0;
        
        double notaInput = 0.0;
        
    
        
        if(n!=0)//condizione
        {
            System.out.println(n + " è diverso da 0");// istruzione
        }
        
        //----------------------------------------------------------
        
        if(n==0)//condizione
        {
            System.out.println("zero");
            System.out.println("nulla");
        }
        
        //----------------------------------------------------------
        
        if(n==0)//condizione
        {
            System.out.println(n+" è uguale a 0");//se vero
        }
        else
        {
            System.out.println(n+" è diverso da 0");//se falso
        }
        
        //----------------------------------------------------------
        
        if(n<0)//condizione
        {
            System.out.println("negativo");//se vero
        }
        else
        {
            System.out.println("positivo");//se falso
        }
        
        //----------------------------------------------------------
        
        if(n==0)//condizione
        {
            System.out.println(n+" è uguale a 0");//se true
        }
        else if(n>10)
        {
            System.out.println(n+" è maggiore di 10");//se true
        }
        else
        {
            System.out.println(n+" è minore di 10");//se true
        }
        
        
        if(n<18)//condizione
        {
            System.out.println("minorenne");//se true
        }
        else if(n>65)
        {
            System.out.println("pensionato");//se true
        }
        else
        {
            System.out.println("adulto");//se true
        }
        
        if(nota<1.0)//condizione
        {
            System.out.println("Valore troppo piccolo.");//se true
        }
        else if(nota<2.5)
        {
            System.out.println("E");//se true
        }
        else if(nota<3.5)
        {
            System.out.println("D");//se true
        }
        else if(nota<4.5)
        {
            System.out.println("C");//se true
        }
        else if(nota<5.5)
        {
            System.out.println("B");//se true
        }
        else if(nota<=6)
        {
            System.out.println("A");//se true
        }
        else
        {
            System.out.println("Valore troppo grande.");//se true
        }
        System.out.println("");
        
        //-------------------------------------------------------------
        
        System.out.print("Inserire una nota: ");
        if(input.hasNextDouble())
        {
            notaInput = input.nextDouble();
            //input.nextLine();
        
            if(notaInput<1.0)//condizione
            {
                System.out.println("Valore troppo piccolo.");//se true
            }
            else if(notaInput<2.5)
            {
                System.out.println("E");//se true
            }
            else if(notaInput<3.5)
            {
                System.out.println("D");//se true
            }
            else if(notaInput<4.5)
            {
                System.out.println("C");//se true
            }
            else if(notaInput<5.5)
            {
                System.out.println("B");//se true
            }
            else if(notaInput<=6)
            {
                System.out.println("A");//se true
            }
            else
            {
                System.out.println("Valore troppo grande.");//se true
            }
        }
        else
        {
            System.out.println("Errore, valore non valido \""
                               + input.nextLine()+"\"");
        }
        
        System.out.println("");
        //---------------------------------------------------------
        
        switch(n)
        {
            case 0:
                System.out.println("NESSUNO");
                break;
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DUE");
                break;
            case 4:
                System.out.println("QUATTRO");
                break;
            default:
                System.out.println("MOLTI");
                break;
        }
        
        System.out.println("");
        
        switch(n)
        {
            case 0:
                System.out.println("NESSUNO");
                //break;
            case 1:
                System.out.println("UNO");
                //break;
            case 2:
                System.out.println("DUE");
                //break;
            case 3:
                System.out.println("TRE");
            case 4:
                System.out.println("QUATTRO");
                //break;
            default:
                System.out.println("MOLTI");
                //break;
        }
        
        System.out.println("");
        
        switch(n)
        {
        case 5:
        System.out.print("FIVE,");
        case 4:
        System.out.print("FOUR,");
        case 3:
        System.out.print("THREE,");
        case 2:
        System.out.print("TWO,");
        case 1:
        System.out.print("ONE,");
        case 0:
        System.out.print("IGNITION!");
        }
        
        System.out.println("");
        
        
        //----------------------------------------------------------------
        
        char op;
        int result = 0;
        int op1 = 2;
        int op2 = 3;
        
        
        //System.out.print("Inserici il primo numero: ");
        
        //System.out.print("Inserici il secondo numero: ");
          
        System.out.print("Inserici l'operatore: ");
        
        op = input.next().trim().charAt(0);
        //op = input.next().trim().charAt(1);
        input.nextLine();
        
        switch(op)
        {
        case '+':
        result = op1+op2;
        break;
        case '-':
        result = op1-op2;
        break;
        case '*':
        case 'x':
        case '.':
        result = op1*op2;
        break;
        case '/':
        case ':':
        result = op1/op2;
        break;
        case '%':
        result = op1%op2;
        break;
        default:
        System.out.println("Error");
        break;
        }
        System.out.println(result);
        
        /*
        run:
        3 è diverso da 0
        3 è diverso da 0
        positivo
        3 è minore di 10
        minorenne
        Valore troppo piccolo.

        Inserire una nota: 5
        B

        MOLTI

        TRE
        QUATTRO
        MOLTI

        THREE,TWO,ONE,IGNITION!
        Inserici l'operatore: +
        5
        BUILD SUCCESSFUL (total time: 6 seconds)
        */
        
    }
}

