package serie5esempiogui;

public class Solitario extends AppGUI implements MouseListener
{
    public Solitario(String title, int x, int y, int w, int h)
    {
        super(title, x, y, w, h);
        
        //Qui ci sarà il codice del solitario
        System.out.println("Sono l'app Solitario");
    }
    
    
    //Metodi imposti da MouseListener
    @Override
    public void mouseMove(MouseEvent e)
    {
        System.out.println("     App " + this.title + " evento MouseMove: " + e.x + "-" + e.y);
    }
       
    @Override
    public void mouseClick(MouseEvent e)
    {
        System.out.println("     App " + this.title + " evento MouseClick: " + e.click);
    }    
}
