/*****************************************
 * 
 *   Cercate il commento "//ggg: Soluzione"
 * 
 * 
 ****************************************/




package serie05soluzioni;


import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;


//Copia la classe di partenza, togliendo il public
class JFrameDemo02
{
    public static void createAndShowGUI() 
    {
        //Instanziamo un JFrame        
        JFrame frame = new JFrame("TopLevel");
        frame.setPreferredSize(new Dimension(300,300));
                
        //Indichiamo cosa fare al momento della chiusura della finestra
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Aggiungiamogli un menu, opaco e giallo
        JMenuBar menuBar = new JMenuBar();
        JMenu principale= new JMenu("Menu Principale");        
        menuBar.add(principale);
        JMenu secondario= new JMenu("Menu Secondario");
        principale.add(secondario);
        
        //ggg: Soluzione. Es5.1
        JMenu terziario= new JMenu("Menu Terziario");
        principale.add(terziario);  //Aggiungo il menu al menu principale

        JMenu secondario2= new JMenu("Menu Secondario 2");
        secondario.add(secondario2);  //Aggiungo il meno al menu secondario

        
        
        menuBar.setOpaque(true);
        //menuBar.setBackground(Color.YELLOW);          //ggg: Soluzione. Es5.2. Color continee molte costanti con i colori base predefiniti
        menuBar.setBackground(new Color(23,128,201));   //ggg: Soluzione. Es5.2. Oppure potete costruire un oggetto Color indicando le gradazioni rosse, verdi e blu
        frame.setJMenuBar(menuBar);
 
        //Aggiungiamo una label rossa.
        JLabel redLabel = new JLabel();
        redLabel.setText("Hello world");
        redLabel.setOpaque(true);
        redLabel.setBackground(Color.RED);   
        frame.getContentPane().add(redLabel, null);
        
        //Mostriamo l'applicativo
        frame.pack();
        frame.setVisible(true);
    }
 
}



public class Serie05Soluzione_Es1_Es2
{
    public static void main(String[] args)
    {
        //Gli applicativi GUI sono multitasking
        //vanno fatti partire usando un thread (lo si vedrà più avanti nel corso)
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new JFrameDemo02().createAndShowGUI();
            }
        });
    }    
}
