/**
 * LPRO Cap 8 Operatori video lezione
 *
 * @author marko.mirkovic
 * Version 27.11.2021
 */
package lprovideo8operatori;

public class LproVideo8Operatori
{

    public static void main(String[] args)
    {
        /*
        Precedenze
        Per concludere riportiamo una tabella che indica le precedenze fra gli
        operatori, dal maggiore al minore:
        
        ++
        --
        ~
        !
        (type)
        new
        * / %
        <<
        >>
        < <=
        > >=
        ==
        !=
        &
        &&
        ^
        |
        ||
        ?:
        =
        *= /= += -= &=
        &= ^= |=
        
        */

        // operando1 operatore operando2 risultato
        //      12      +        7          17
        
        // regola operatori da sinistra a destra
        
        System.out.println(1-2);//-1
        System.out.println(2-1);//1
        System.out.println(4.0%2.5);//1.5
        System.out.println(3.0 + 4.0 + 4.0 * 5.0 / 2.0 - 1.0);//
        //                               20.0
        //                                      10.0
        //                  7.0     +           10.0
        //                      17.0                    - 1.0
        
        System.out.println(3+4*5+1);//3 + 20 + 1 = 24 (int)
        System.out.println( 7 + 2*3 - (2*8) / 3);// 13 - 7 = 8 (int)
        System.out.println( 7 + 2*3 - (2*8) / 3.0);// 13 - 5.3334 = 7.6667 (double)
        System.out.println( 7 + 2*3 - (2*8) / 3.00000000);// 13 - 5.3334 = 7.6667 (double)
        System.out.println(0.3*10 + 14/100);//3.0 + 0 = 3.0 , il 14/100 risultato int è 0
        System.out.println(0.3*10 * 14/100);//3.0 + 0 = 0.42 , il 14/100 risultato double è 0.14
        
        boolean a = true;
        boolean b = false;
        int n1 = 1;
        int n2 = 2;
        int n22 = 2;
        System.out.println(!a);//NOT true = false
        System.out.println(a^b);//True OR false = true
        //System.out.println(a~b);//Non funziona
        System.out.println(a|b);//True AND false = true
        System.out.println(a||b);//True AND false = true
        System.out.println(n1 < n2 | n1 == n2);//True AND false = true
        System.out.println(n1 < n2 || n1 == n2);//True AND false = true
        System.out.println(n1 != n2);
        System.out.println(n1 == n2);
        System.out.println(n1 > n2);
        System.out.println(n1 < n2);
                
        System.out.println(n1 > n2 || n1 < n2);// 1 > 2 OR 1 < 2 = true
        System.out.println(!(n1 > n2 || n1 < n2));// NOT 1 > 2 OR 1 < 2 = false
        System.out.println(n2 < n22 || n2 > n22);// 2 > 2 OR 2 < 2 = false
        
        //Per esprimere (n2 == n22) possiamo usare:
        System.out.println( !(n2 < n22) || !(n2 > n22) );// NOT 2 > 2 OR NOT 2 < 2 = true
        //oppure
        System.out.println( !(n2 < n22 || n2 > n22) );// NOT 2 > 2 OR NOT 2 < 2 = true
        
        //Operatori uniari
        //Pre   incrementali ++a    o   decrementali --a
        //Post  incrementali a++    o   decrementali a--
        //Pre   incrementa          o   decrementa      PRIMA
        //Post  incrementa          o   decrementa      DOPO
        
        //Cambiano il valore dell'operando di 1
        //Hanno priorità su tutti gli altri operatori, parentesi comprese
        //Si valutano da sinistra a destra
        
        int u = 7;
        System.out.println("u++: " + (u++));
        //Operatore post-incremento u++ = stampa 7 ma ora u vale 8
        System.out.println("u++: " + (u++));//stampa 8 ma ora u vale 9
        System.out.println("u: " + (u));//stampa 9
        System.out.println("");
        
        int uu = 7;
        System.out.println("++u: " + (++uu));
        //Operatore pre-incremento --u = stammpa 8 e ora u vale 8
        System.out.println("++u: " + (++uu));//stampa 9 e ora u vale 9
        System.out.println("u: " + (uu));//stampa 9
        System.out.println("");
        
        int uuu = 7;
        System.out.println("u--: " + (uuu--));
        //Operatore post-decremento u-- stammpa 7 ma ora u vale 6
        System.out.println("u--: " + (uuu--));//stampa 6 ma ora u vale 5
        System.out.println("u: " + (uuu));//stampa 5
        System.out.println("");
        
        int uuuu = 7;
        System.out.println("--u: " + (--uuuu));
        //Operatore pre-decremento --u stammpa 6 e ora u vale 6
        System.out.println("--u: " + (--uuuu));//stampa 5 e ora u vale 5
        System.out.println("u: " + (uuuu));//5
        System.out.println("");
        
        int k = 3;
        int p = 3;
        
        System.out.println("k++ * ++p: " + (k++ * ++p));// 3 * 4 = 12
        
        //ora k = 4 e p = 4
        System.out.println("ora, dopo l'espressione precedente k vale: " + k);
        System.out.println("ora, dopo l'espressione precedente p vale: " + p);
        System.out.println("k * p: " + (k * p));// 4 * 4 = 16
        
        
        int aa = 3;
        int bb = aa - aa * ++aa + aa;
        /*       l'espressione viene eseguita da sinistra a destra
                 ------------------------>
                 3 - aa * ++aa + aa; a = 3
                 3 -  3 * ++aa + aa; a = 3
                 3 -  3 *    4 + aa; a = 4  da questo momento in poi a = 4
                 3 -  3 *    4 +  4; a = 4  vale regola precedenza operatori (*)
                 3 -     12    +  4; a = 4
                     -9        +  4; a = 4
                           -5      ; a = 4
        */
        System.out.println("bb aa: " + bb + " " + aa);//-5 4        a = 4
        System.out.println("bb + aa: " + (bb + aa));// -5 + 4 = -1  a = 4
        
        
        int aaa = 3;
        int bbb = (aaa - aaa) * ++aaa + aaa;//la () viene eseguita prima
        /*       l'espressione viene eseguita da sinistra a destra
                 ------------------------>
                 3 - aaa * ++aaa + aaa; a = 3  operatore unario non ha la precedeza
                 3 -  3  * ++aaa + aaa; a = 3  la () viene eseguita prima
                    0    *    4  + aaa; a = 4  da questo momento in poi a = 4
                         0       +   4; a = 4
                                     4; a = 4
        */
        System.out.println("bbb aaa: " + bbb + " " + aaa);//4 4         a = 4
        System.out.println("bbb + aaa: " + (bbb + aaa));// 4 + 4 = 8    a = 4
        
        
        int aaaa = 3;
        int bbbb = aaaa - ++aaaa * aaaa + aaaa;//la () viene eseguita prima
        /*         l'espressione viene eseguita da sinistra a destra
                   ------------------------>
                      3 - ++aaaa * aaaa + aaaa; a = 3  operatore unario non ha la precedeza
                      3 -      4 * aaaa + aaaa; a = 4
                      3 -      4 *    4 + aaaa; a = 4
                      3 -      4 *    4 +    4; a = 4
                      3 -          16   +    4; a = 4
                           -13          +    4; a = 4
                                            -9; a = 4
        */
        System.out.println("bbbb aaaa: " + bbbb + " " + aaaa);//-9   4       a = 4
        System.out.println("bbbb + aaaa: " + (bbbb + aaaa));//  -9 + 4 = -5  a = 4
        
        int aaaaa = 3;
        int bbbbb = aaaaa - aaaaa * ++aaaaa + aaaaa * ++aaaaa;//la () viene eseguita prima
        /*         l'espressione viene eseguita da sinistra a destra
                   ------------------------>
                        3 - aaaaa * ++aaaaa + aaaaa * ++aaaaa; a = 3  operatore unario non ha la precedeza
                        3 -     3 * ++aaaaa + aaaaa * ++aaaaa; a = 3
                        3 -     3 *       4 + aaaaa * ++aaaaa; a = 4
                        3 -     3 *       4 +     4 * ++aaaaa; a = 4
                        3 -     3 *       4 +     4 *       5; a = 5
                        3 -              12 +              20;
                                         -9 +              20;
                                                           11;
        */
        System.out.println("bbbbb aaaaa: " + bbbbb + " " + aaaaa);//11   5       a = 4
        System.out.println("bbbbb + aaaaa: " + (bbbbb + aaaaa));//  11 + 5 = 16  a = 5
        
        
        //Unario con doubble
        
        double z = 7.88;
        z++;
        System.out.println("z++: " + z);
        
        double zz = 7.88;
        ++zz;
        System.out.println("++zz: " + zz);
        
        
        
        //Operatore ternario
        /*
        3 operandi
        
        operando 1          ?       operando 2      :       operando3
        
        espressione test    ?       espressione     :       espressione
                                    se test == true         se test == false
        
        in Excel:
        B2=d		
        Gentile signora		=IF(B2="d","Gentile signora","Egregio signore")
        */
        
        char genere = 'd';
        String saluto = genere =='d' ? "Gentile signora" : "Gentile Signore";
        System.out.println(saluto);
        
        int genere2 = 1;
        String saluto2 = genere2 ==1 ? "Gentile signora" : "Gentile Signore";
        System.out.println(saluto2);
        
        String genere3 = "Si";
        String saluto3 = genere3 =="Si" ? "Gentile signora" : "Gentile Signore";
        System.out.println(saluto3);
        
        
        //Operatori di assegnamento
        //vengono eseguiti per ultimi!!!
        //==============================
        //Prendono il risultato dell'espressione sulla destra e
        //            lo assegnano alla variable sulla sinistra  - aA = 5
        
        int aA;
        
        aA = 5;
        System.out.println(aA);
        aA+= 5;// aA = aA + 5 ->  5 + 5 = 10
        System.out.println(aA);
        aA-= 3;// aA = aA - 3 -> 10 - 3 =  7
        System.out.println(aA);
        aA*= 3;// aA = aA * 3 ->  7 * 3 = 21
        System.out.println(aA);
        aA/= 7;// aA = aA / 7 -> 21 / 7 =  3
        System.out.println(aA);
        aA%= 2;// aA = aA % 2 ->  3 /%2 =  1 reminder della divisione
        System.out.println(aA);
        
        int aAA = 1;
        aAA+=       2 * ++aAA;
        //    1 +   2 *     2;
        //    1 +           4;    aAA = 2
        System.out.println(aAA);//=5 ora aAA = 5
        
        
        
        //System.out.println(); stampa di tutto
        /*
        run:
        -1
        1
        1.5
        16.0
        24
        8
        7.666666666666667
        7.666666666666667
        3.0
        0.42
        false
        true
        true
        true
        true
        true
        true
        false
        false
        true
        true
        false
        false
        true
        true
        u++: 7
        u++: 8
        u: 9

        ++u: 8
        ++u: 9
        u: 9

        u--: 7
        u--: 6
        u: 5

        --u: 6
        --u: 5
        u: 5

        k++ * ++p: 12
        ora, dopo l'espressione precedente k vale: 4
        ora, dopo l'espressione precedente p vale: 4
        k * p: 16
        bb aa: -5 4
        bb + aa: -1
        bbb aaa: 4 4
        bbb + aaa: 8
        bbbb aaaa: -9 4
        bbbb + aaaa: -5
        bbbbb aaaaa: 11 5
        bbbbb + aaaaa: 16
        z++: 8.879999999999999
        ++zz: 8.879999999999999
        Gentile signora
        Gentile signora
        Gentile signora
        5
        10
        7
        21
        3
        1
        5
        BUILD SUCCESSFUL (total time: 0 seconds)

        */
        
        
    }
           
        
}
