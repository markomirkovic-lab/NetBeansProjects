package provaswing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

                            //se facciamo extend JFrameDemo01
public class JFrameDemo02
{
    public JFrameDemo02()
    {
        createAndShowGUI();
    }    
    
    
    /*
    abbb74cdec
    abbb74cdef
    abbb74cdej
    
    */
    
                            //possiamo richimare il createAndShowGUI() della 01
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
        
//        JMenuItem itemLeft = new JMenuItem("Left");
//        principale.add(itemLeft);
        JMenuItem itemCenter = new JMenuItem("Center");
        principale.add(itemCenter);
        JMenuItem itemRight = new JMenuItem("Right");
        principale.add(itemRight);
        
        //proviamo ad aggiungere altalcuni sottolivelli:
        JMenuItem terzo = new JMenuItem("Terzo livello");
        JMenu terzoA = new JMenu("Terzo 2 livello");
        secondario.add(terzo);
        secondario.add(terzoA);
        
        JMenuItem quarto = new JMenuItem("Quarto livello");
        JMenuItem quartoA = new JMenuItem("Quarto 2 livello");
        terzoA.add(quarto);
        terzoA.add(quartoA);
        
        
        /*
        JMenuItem itemLeft = new JMenuItem("Left");
        itemLeft.addActionListener(new ActionListener()
            {
                @Override       //e contiene info sull'evento appena successo
                public void actionPerformed(ActionEvent e)
                {
                    orangeLabel.setHorizonalAlignment(JLabel.LEFT);
                    //system.exit(0);
                }
            }
        );
        
        */
        menuBar.setOpaque(true);
        menuBar.setBackground(Color.YELLOW);
        
        frame.setJMenuBar(menuBar);     //Sostituiamo il JMenuBar di default con quello che abbiamo relaizzato noi
 
        //Aggiungiamo una label rossa.
        JLabel redLabel = new JLabel();
        redLabel.setText("Hello world");
        redLabel.setOpaque(true);
        redLabel.setBackground(Color.MAGENTA);   
        //redLabel.setHorizontalTextPosition(50);
        //redLabel.
        frame.getContentPane().add(redLabel, null);
        
        //Mostriamo l'applicativo
        frame.setResizable(true);
        frame.setMinimumSize(new Dimension(200,200));
        //frame.setMaximumSize(new Dimension(1400,700));
        frame.pack();
        //con null centra il frame all'interno dello schermo
        //utile per JDialog, si puo passare (JFrame)
        //frame.setLocationRelativeTo(null);
        //oppure una posizione ben specifica:
        frame.setLocation(100, 100);
        frame.setVisible(true);
        
        //form closing
        //save x y
        //file init o 
        
        
        
        
        
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
