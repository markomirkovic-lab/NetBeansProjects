/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package persondbpersonremake;

/**
 * 
 * @author marko.mirkovic
 * @version 03 December 2022
 */
public class ShopDBFrame {

    
    public class IdNameItem {

    private int id;
    private String name;

    public IdNameItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    /** Stringa utilizzata dalla JTable per la visualizzazione il testo
     * della cella.
     * 
     * @return 
     */
    @Override
    public String toString() {
        return this.name;
    }
    
   }

}
