package cap5e2;

import java.awt.Color; 
import java.awt.Dimension; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JMenu; 
import javax.swing.JMenuBar;

/**
 *
 * @author marko.mirkovic
 * @version 16 October 2022
 */

/*
Il sito ufficiale dovrà diventare la vostra guida preferita: 
https://docs.oracle.com/javase/tutorial/uiswing/components/index.html  
*/
public class JFrameDemo02 
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
        
        //Indichiamo cosa fare alla chiusura della finestra   
        //Indica al JFrame di chiudere tutte le sue risorse.
        //È l’opzione di default
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Aggiungiamogli un menu, opaco e giallo-----------------
        
        //JMenuBar  
        //Abbiamo aggiunto una barra dei menu gialla e opaca.   
        //Notate che per aggiungerla abbiamo usato l’istruzione
        // frame.setJMenuBar(menuBar);    
        JMenuBar menuBar = new JMenuBar();    
        
        
        //JMenu è il menu contenuto dalla barra dei menu
        JMenu principale= new JMenu("Menu Principale");                 
        menuBar.add(principale); 
        //Abbiamo aggiunto anche un secondo menu, figlio del primo menu
        JMenu secondario= new JMenu("Menu Secondario");         
        principale.add(secondario);  
        
        menuBar.setOpaque(true);         
        menuBar.setBackground(Color.YELLOW);
        
        //Non tutti i S.O. accettano un colore (ad esempio il Mac)
        
        frame.setJMenuBar(menuBar);
        
        //Aggiungiamo una label rossa.
        //JLabel  Abbiamo aggiunto una label rossa che occupa tutto il 
        //contentpane.  
        //Notate che per aggiungerla abbiamo chiesto al JFrame di ritornarci
        //il contentpane sul quale abbiamo poi invocato il metodo add
        // frame.getContentPane().add(redLabel, null)
        JLabel redLabel = new JLabel();         
        redLabel.setText("Hello world");         
        redLabel.setOpaque(true);
        redLabel.setBackground(Color.RED);                
        frame.getContentPane().add(redLabel, null);
        //setOpaque
        //If true the component paints every pixel within its bounds. 
        //Otherwise, the component may not paint some or all of its pixels, 
        //allowing the underlying pixels to show through.
        
        //• Per aggiungere dei componenti ad altri, si usa il metodo add 
        //• Il design si struttura in modo gerarchico, pensate al menu
        //   JMenuBar
        //          JMenu
        //              JMenu 
        
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
