package provaswing;

import java.awt.Dimension;
import javax.swing.JFrame;

public class JFrameDemo01
{
    public JFrameDemo01()
    {
        createAndShowGUI();
    }
    
    private void createAndShowGUI() 
    {
        //Instanziamo un JFrame        
        JFrame frame = new JFrame("TopLevel");
        frame.setPreferredSize(new Dimension(300,300));
        
 
        //Mostriamo l'applicativo
        frame.pack();
        System.out.println(frame.getContentPane().getBounds().height);
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Gli applicativi GUI sono multitasking
        //vanno fatti partire usando un thread (lo si vedrà più avanti nel corso)
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new JFrameDemo01();
            }
        });
    }    
}
