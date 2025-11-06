/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lprotesting2;

/**
 *
 * @author marko.mirkovic
 */
public class LproTesting2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String t = "+41 (0)91 333 44 55";
        String t1 = "Paperon De' Paperoni";
        String tmp = t;
       
        
        int inizio = t.indexOf(" ");
        int fine = t.indexOf(" ", inizio+1);
        System.out.println(t.substring(inizio+1,fine));
        
        
       
        System.out.println(""+t.charAt(4)+t.charAt(5)+t.charAt(6));
        
        System.out.println(t.substring(inizio,9));
        System.out.println(t.substring(inizio+1,fine));
        
        //inizio = t.indexOf(" ");
        //fine = t.indexOf(" ", inizio+1);
        
        //inizio = tmp.indexOf(" ");
        //tmp = tmp.substring(inizio + ": " + tmp);
        
        
        
        
                }   
}
