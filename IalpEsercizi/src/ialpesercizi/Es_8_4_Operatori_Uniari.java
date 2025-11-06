

package ialpesercizi;


public class Es_8_4_Operatori_Uniari
{
    public static void main(String[] args)
    {
        int a=3;
        float b=1.5F;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a+++b++);
        System.out.println(++a+(++b));
        
        /*
        run:
        3           //a = 4
        5           //a = 5
        6.5         //5 + 1.5 = 6.5     a=6 b=2.5
        10.5        //7 + 3.5 = 10.5    a=7 b=3.5
        
        */
        
    }
}
