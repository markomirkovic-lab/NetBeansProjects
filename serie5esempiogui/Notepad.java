package serie5esempiogui;

public class Notepad extends AppGUI implements KeyboardListener, MouseListener
{
    public Notepad(String title, int x, int y, int w, int h)
    {
        super(title, x, y, w, h);
        
        //Qui ci sarà il codice del blocco note
        System.out.println("Sono l'app Notepad");
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

    
    //Metodi imposti da KeyboardListener
    @Override
    public void keyPressed(KeyboardEvent e)
    {
        System.out.println("     App " + this.title + " evento keyPressed: " + e.c + " shift: " + e.shift);
    }
}
