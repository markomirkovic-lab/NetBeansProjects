package cap5e2;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * 
 * @author marko.mirkovic
 * @version 16 October 2022
 */
public class JFrameDemo01 
{
    private static void createAndShowGUI()
    {
        //Istanziamo un JFrame-----------------------
        
        //Istanzia il JFrame fornendo un nome della finestra.
        JFrame frame = new JFrame("TopLevel");
        
        //Imposta la dimensione della finestra a 300pixel di larghezza e 300 
        //di altezza.  Notate che viene istanziato un oggetto Dimension al
        //volo (non è necessario  memorizzarlo in una variabile in quanto non
        //lo si utilizzerà più nel resto del programma).
        frame.setPreferredSize(new Dimension(300,300));
        
        //Mostriamo l'applicativo---------------------
        //Assembla i componenti aggiunti (vedremo in seguito i flow-layout).
        //Dopo il pack è possibile digitare   
        // frame.getContentPane().getBounds().height oppure
        //frame.getContentPane().getBounds().width  
        //per ottenere le reali dimensioni interne della finestra.
        frame.pack();
        
        //Rende visibile il JFrame ottenendo questo 
        frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        //Gli applicativi GUI sono multitasking
        //vanno fatti partire usare un thread:
        //una GUI opera in ambiente multitasking
        //La main lancia un thread che crea un oggetto della classe JFrameDemo01
        
        //Il costuttore esegue il metodo che andrà a disegnare il JFrame
        
        javax.swing.SwingUtilities.invokeLater(
        new Runnable()
        {
            public void run()
            {
                    createAndShowGUI();
            }       
        });
        
    }
}
