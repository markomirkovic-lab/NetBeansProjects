/**
 * Esercizio sulle matrici array
 * @author marko.mirkovic
 * @version 17.01.2022
 */


package lprocap11array;


public class LproInClass19012022
{
    public static void main(String[] args)
    {
        int[] ig =    { 1,   2,    3,    4,    5,    6,    7 };
        String[] sg = {"lu", "ma", "me", "gi", "ve", "sa", "do"};
        
        System.out.println(ig[3] + " " + sg[3]);
        System.out.println("");
        
        int[][] matrice1 = new int[3][4];//matrice righe colonne
        
        int[][] matrice2 =
        {
            { 0,  1,  2,  3},       //Riga 0
            {10, 11, 12, 13},       //Riga 1
            { 0,  0,  0,  0}        //Riga 3
  //Colonne   0   1   2   3
        };
        
        int a = matrice2[0][0] + matrice2[1][0];
        System.out.println("a " + a);
        
        System.out.println("");
        
        for(int colonna = 0; colonna < matrice2[0].length; colonna++)//lunghezza riga = 4
        {
            matrice2[2][colonna] = matrice2[0][colonna] + matrice2[1][colonna];
        }
        
        for(int colonna = 0; colonna < matrice2[0].length; colonna++)
        {
            //System.out.print("matrice2[2][colonna]" + matrice2[2][colonna] + "\t");
            System.out.print(matrice2[2][colonna] + "\t");
        }
        
        //tris x|0|x, forza 4
        
        
        
    }
}
