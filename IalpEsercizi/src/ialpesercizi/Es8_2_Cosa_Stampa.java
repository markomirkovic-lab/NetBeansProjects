

package ialpesercizi;


public class Es8_2_Cosa_Stampa
{
    public static void main(String[] args)
    {
        int a,b,c,s,i,g;
        a=b=c=s=4;                          //a, b, c, d, s = 4
        i=g=++a;                            //i, g = 5
        a=s++ + --s + ++i + g++;            //a= 4 (s=5) + 4 + 6 + 5 (g=6)
        System.out.println(b);
        b*= (~i) + 1;                       //b = 4*(-6) + 1
        //System.out.println(~i);
        //System.out.println(4*(~i));
        //System.out.println(4*(~i)+1);
        System.out.println(a + " " + b);    //19   23//-24+1 = -23
    }
}
