package serie5esempiogui;

public class AppGUI
{
    public int x;
    public int y;
    public int w;
    public int h;
    public String title;
    
    public AppGUI(String title, int x, int y, int w, int h)
    {
        this.title=title;
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        
        //Qui ci sarà il codice per il disegno, per ora sostituito da un println
        System.out.println(this.title + ": x" + x + " y" + y + " w" + w + " h" + h);
    }            
}

