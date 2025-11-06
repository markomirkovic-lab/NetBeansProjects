package serie5esempiogui;

import java.util.ArrayList;

public class OperatingSystem
{
    public ArrayList<AppGUI> apps;
    
    public OperatingSystem()
    {
        this.apps=new ArrayList();        
    }
    
    public void addApp(AppGUI a)
    {
        this.apps.add(a);
    }
    
    public void removeApp(AppGUI a)
    {
        this.apps.remove(a);
    }
    
    
    public void MouseAction(MouseEvent e)
    {
        //Scorriamo tutte le app attualmente in esecuzione
        for(int i=0; i<this.apps.size(); i++)
        {
            //Questa app è stata pensata per gestire gli eventi del mouse?
            if(this.apps.get(i) instanceof MouseListener)
            {
                //Si, allora chiamo i metodi del mouse
                ((MouseListener)this.apps.get(i)).mouseMove(e);
                ((MouseListener)this.apps.get(i)).mouseClick(e);
            }
        }
    }
    
    
    public void KeyboardAction(KeyboardEvent e)
    {
        //Scorriamo tutte le app attualmente in esecuzione
        for(int i=0; i<this.apps.size(); i++)
        {
            //Questa app è stata pensata per gestire gli eventi della tastiera?
            if(this.apps.get(i) instanceof KeyboardListener)
            {
                //Si, allora chiamo i metodi della tastiera
                ((KeyboardListener)this.apps.get(i)).keyPressed(e);
            }
        }
    }
}
