/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap9Oggetti;

/**
 *
 * @author marko.mirkovic
 * @version
 */
public class MiaApp2
{
    public static void main(String[] args)
    {
        Persona a = new Persona("Carlo", "Magno", 2022);
        
        Persona b = new Persona("Pinco", "Pallo", "PIPA", 10, 6, 2000);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
