

package lezioniVideo;

import java.util.Scanner;

/**
 * Lista char
 * @author Marko Mirkovic
 * @version 26.01.2022
 */

public class LezioneVideoCap11ArraylistaChar
{
    public static void main(String[] args)
    {
        
        //char lettere [] = new char[6]
        //lettere[0] = 'w';
        //...
        //lettere[5] = 'l';
        
        char lettera[] = {'w', 'a', 'h', 't', 'k', 'l'};
        //Index            0    1    2    3    4    5
        
        System.out.println("Index 'k'       " + lettera[4]);
        System.out.println("lettera.length  " + lettera.length);
        System.out.println("");
        
        //--
        
        for(int index = 0; index<lettera.length; index++)
        {
            if(lettera[index]=='k')
            {
                System.out.println("Index 'k'       " + index);
                System.out.println("lettera[index]  " + lettera[index]);
            }
        }
        
        /*
        run:
        Index 'k'       k
        lettera.length  6

        Index 'k'       4
        lettera[index]  k
        */        
        
        //--
        System.out.println("");
        
        Scanner tastiera = new Scanner(System.in);
        
        char valore[] = new char[6];
        
        System.out.println("Inserici sei valori dell'array");
        valore[0] = tastiera.nextLine().trim().charAt(0);
        valore[1] = tastiera.nextLine().trim().charAt(0);
        valore[2] = tastiera.nextLine().trim().charAt(0);
        valore[3] = tastiera.nextLine().trim().charAt(0);
        valore[4] = tastiera.nextLine().trim().charAt(0);
        valore[5] = tastiera.nextLine().trim().charAt(0);
        
        for(int index = 0; index<valore.length; index++)
        {
            System.out.print(valore[index] + ", ");
        }
        System.out.println("");
        
        /*
        run:
        Index 'k'       k
        lettera.length  6

        Index 'k'       4
        lettera[index]  k

        Inserici sei valori dell'array
        w
        a
        h
        t
        k
        m
        w, a, h, t, k, m,
        */
        
        System.out.println("");
        
        //--
        
        char valore2 [] = new char[6];
        
        System.out.println("Inserici sei valori dell'array");
        for(int index=0; index < valore2.length; index++)
        {
            valore2[index]= tastiera.nextLine().trim().charAt(0);
        }
        
        for(int index = 0; index<valore2.length; index++)
        {
            System.out.print(valore2[index] + ", ");
        }
        System.out.println("");
        
        /*
        run:
        Inserici sei valori dell'array
        a
        b
        c
        d
        e
        f
        a, b, c, d, e, f, 
        */
        
        
        System.out.println("");
        
        //--
        
        
        
        
    }
}
