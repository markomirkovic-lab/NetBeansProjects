package provaswing;

import java.awt.Dimension;
import javax.swing.JFrame;
//import javax.swing.*;

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
        //frame.setTitle("TopLevel");
        
        //Dimensione prefferita della finestra
        //
        frame.setPreferredSize(new Dimension(300,300));
        //frame.setMinimumSize(new Dimension(300,300));
        
        //Indichiamo cosa fare al momento della chiusura della finestra.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                             //System.exit();
          //DISPOSE_ON_CLOSE e' di default, run infinito
          //distruggi la finestra ma non chiudere l'applicazione
        //JFrame.DISPOSE_ON_CLOSE
        //JFrame.DO_NOTHING_ON_CLOSE
        //JFrame.EXIT_ON_CLOSE
        //JFrame.HIDE_ON_CLOSE
 
        //Mostriamo l'applicativo
        //Ridimensiona al di la della dimensione prefferita
        //Contenittore si addatta al contenuto
        frame.pack();
        
        
        
        //Altezza cliente (interno)
        System.out.println(frame.getHeight());
        
        //Clase rettangolo che da l'altezza
        //Altezza totale
        System.out.println(frame.getContentPane().getBounds().height);
        //fa partire il loop degli eventi
        frame.setVisible(true);
        //tutti i sistemi moderni funzionano ad eventi
    }
 
    public static void main(String[] args) {
        //Gli applicativi GUI sono multitasking
        //vanno fatti partire usando un thread (lo si vedrà più avanti nel corso)
        //Annonimous inner class:
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            //run e' il main di un altra thread
            public void run() 
            {
                //istruzioni che vanno eseguite per quella thread
                new JFrameDemo01();
            }
        });
    }    
}
