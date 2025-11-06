package cap_2_sjavprimosemestre;

/**
 *
 * @author marko.mirkovic
 */
public class EsempioClasse 
{
    public static void main(String[] args)
    {
         Inutile i=new Inutile();    //Inutile e' il tipo di dato - oggetto creato     
         Inutile ii=new Inutile();              
         
         i.m(1);                                        //Inutile.sx vale ora 2
         
         System.out.println(i.x + " " + Inutile.sx);
         
         ii.m(11);                                      //Inutile.sx vale ora 22         
         
         Inutile.sx=33;                                 //Inutile.sx vale ora 33  
         
         //Non funziona perche il metodo non ritorna valore (void)
         //System.out.println("i.m(1)" + i.m(1));
         //System.out.println("i.m(1)" + ii.m(11));
         
         
         
         System.out.println(i.x + " " + i.sx);          //1 33         
         System.out.println(ii.x + " " + ii.sx);        //11 33  
         System.out.println(i.x + " " + Inutile.sx);    //1 33         
         System.out.println(ii.x + " " + Inutile.sx);   //11 33 
         
         Inutile.sx(-3);
         
         System.out.println(i.x + " " + Inutile.sx);    //1 -9         
         System.out.println(ii.x + " " + Inutile.sx);   //11 -9 
         
         //modificare x, valore di quel oggetto e non di tutti oggetti
         //ne esiste una copia per ogni oggetti che andiamo a creare
         
         //modificare sx, e' una sola, come variabile globale
         
         /*
        public int mx(int valore)        
        {         
            this.x=valore;
            return valore*4; 
        } 
         */
         
         //Valore di ritorno del mtodo mx();
         System.out.println("i.mx(5) " + (i.mx(5) * 3));
         
        int w = i.mx(5);
        System.out.println("Valore di ritorno del metodo mx(): " + (w * 3));
         
        //stampa speciaizzata
         System.out.println("i = " + i);
         System.out.println("i = " + i.toString()); //metodo implicito oggetto toString
        //reppresentazione testuale (toString di object)
        //(non consoce la specializzazione di Inutile
        //package.nomeClasse@hashCode
        //
        
        //int double boolean: primitivi (e' uno scalare)
        //oggetto ha piu' dati
        
        System.out.println("ii = " + ii);
        //promoting, meno preciso viene promosso in piu' preciso
        //ii viene convertito in string
        System.out.println("ii = " + ii.toString());
        
        String s1 = "pippo";
        String s2 = "Pippo".toLowerCase();
        System.out.println("si: " + s1 + ", s2: " + s2 + " (" + (s1==s2) + ")" );
        
        
        
    }
}
