/**
 * Esercizio 9.8 Rotate left or right
 * 
 * Info:
 * 
 * https://www.java67.com/2014/10/how-to-pad-numbers-with-leading-zeroes-in-Java-example.html
 *   
 * https://www.freecodecamp.org/news/java-string-to-int-how-to-convert-a-string-to-an-integer/
 *
 * @author marko.mirkovic
 * Version 23.11.2021
 */
package ialpes9e8rotateleft;

import java.util.Scanner;

public class IalpEs9e8RotateLeft {


    public static void main(String[] args) {
        
        //String number;
        
        char operator;
        int binaryNumber;
        int shiftNumber;
        int b = 8;
        //String initialBinary = "";
        
        //String BinaryNumberString = Integer.toString(binaryNumber);
        
        //System.out.println(BinaryNumberString);
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter binary number: ");
        //input.nextInt();
        binaryNumber = input.nextByte();
        input.nextLine();
        
        System.out.print("Enter shift operator < or >: ");
        operator = input.next().trim().charAt(0);
        input.nextLine();
        
        System.out.print("Enter shift number from 1 to 1+n: ");
        //input.nextInt();
        shiftNumber = input.nextByte();
        input.nextLine();
        
        System.out.print("Result: ");
        //System.out.println(Integer.toBinaryString(#));
        
        switch(operator)
        {
            case '<':
                //operatore=operatore1;
                int conversionToLeft = binaryNumber<<shiftNumber;
                String binaryString = Integer.toBinaryString(conversionToLeft);
                int differenceToLeft = b - (binaryString.length());
                String zeroDigits = "" + differenceToLeft;
                //System.out.println(zeroDigits);
                String zeroLeftDigits = String.format("%08d", Integer.valueOf(binaryString));
                /*
                - % denotes that is formatting instruction
                - 0 is a flat that says pad with zero
                - 8 denotes the lenght of the formatted String, this will ensure
                - that the right number of zero should be added
                - d is for decimal which means the next argument should be an
                  integral value e.g. byte, char, short, int, or long
                */
                //System.out.println(zeroLeftDigits);
                System.out.println("Decimal result: " + conversionToLeft);
                System.out.print("Binary result: ");
                System.out.println(zeroLeftDigits);
                break;
            case '>':
                int conversionToRight = binaryNumber>>shiftNumber;
                String binaryString2 = Integer.toBinaryString(conversionToRight);
                int differenceToRight = b - (binaryString2.length());
                String zeroDigits2 = "" + differenceToRight;
                //System.out.println(zeroDigits2);
                String zeroLeftDigits2 = String.format("%08d", Integer.valueOf(binaryString2));
                System.out.println("Decimal result: " + conversionToRight);
                System.out.print("Binary result: ");
                System.out.println(zeroLeftDigits2);
                break;
           
        }

    }
 }
