/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio04;

/**
 *
 * @author marko.mirkovic
 * @version
 */
public class ZZZ_Main 
{
    public static void main(String[] args)
    {
        Gatto tom = new Gatto("Tom", "felino", "miaoo", 15);
        
        
//        Cane cn = new Cane("Maurizio", "Buldog", 10.50);
//        
//        boolean is Carnivoro = cn instanceof ICarnivoro;
//        boolean is Erbivoro = cna istance of IErivoro;
//        
//        String type = "niente";
//        if (isCarnivoro && isErbivoro) type = "carnivoro";
//        else if (isCarnivoro) type = "carnivoro";
//        else if (isErivoro) type = "erbivoro;"
//
//        System.out.println(": " + cn.getNome() + ", " + cn.getSpecie() +
//                           ": ", + cn.getVerso() + cn.getType() );

//    Mucca mc = new Mucca ("Carolina", "Milka", 300);
//    System.out.println(": " + mc.getNome() + ", " + mc.getSpecie() +
//                           ": ",  mc.getVerso() + ", " + cn.getTipo() + type );
        
        try
        {
            tom.mangiaAnimale(tom);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
        
    }

}
