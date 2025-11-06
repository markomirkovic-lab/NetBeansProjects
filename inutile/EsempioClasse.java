package inutile;

/**
 *
 * @author marko.mirkovic
 * @version 18 October 2022
 */
public class EsempioClasse 
{
    public static void main(String[] args)
    {
        Inutile inutile = new Inutile();
        Inutile inutile2 = new Inutile();
                
        inutile.m(1);
        System.out.println("Inutile " + Inutile.sx);    //2
        inutile2.m(11);
        System.out.println("inutile.x " + inutile.x);   //1
        System.out.println("inutile2.x " + inutile2.x); //11
        System.out.println("Inutile " + Inutile.sx);    //22
        
        Inutile.sx=33;
        System.out.println("inutile.sx " + Inutile.sx); //33
        
        System.out.println("---");
        System.out.println(inutile.x + " " + inutile.sx);   //1 33
        System.out.println(inutile2.x + " " + inutile2.sx); //11 33
        
        System.out.println("---");
        System.out.println("Inutile " + Inutile.sx);        //33
        
        Inutile.sx(50);
        System.out.println("Inutile " + Inutile.sx);        //150
        /*
        run-single:
        inutile.x 1
        inutile2.x 11
        inutile.sx 33
        ---
        1 33
        11 33
        ---
        Inutile 33
        Inutile 150
        */
        
    }
}
