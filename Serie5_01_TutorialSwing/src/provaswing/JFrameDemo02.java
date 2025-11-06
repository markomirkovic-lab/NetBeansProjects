package provaswing;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;


public class JFrameDemo02
{
    public JFrameDemo02()
    {
        createAndShowGUI();
    }    
    
    private void createAndShowGUI() 
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
        menuBar.setOpaque(true);
        menuBar.setBackground(Color.YELLOW);
        frame.setJMenuBar(menuBar);     //Sostituiamo il JMenuBar di default con quello che abbiamo relaizzato noi
 
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
 
    public static void main(String[] args) {
        //Gli applicativi GUI sono multitasking
        //vanno fatti partire usando un thread (lo si vedrà più avanti nel corso)
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new JFrameDemo02();
            }
        });
    }    
}
