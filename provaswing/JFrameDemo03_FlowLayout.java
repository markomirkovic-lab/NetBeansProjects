package provaswing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;


public class JFrameDemo03_FlowLayout
{
    public JFrameDemo03_FlowLayout()
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
         
        //Aggiungiamogli un menu, opaco
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(new JMenu("Menu Principale"));
        menuBar.setOpaque(true);
        frame.setJMenuBar(menuBar);   
                        
 
        //Aggiungiamo una label
        JLabel label = new JLabel();
        label.setText("Hello world");
        label.setOpaque(true);        

        //Aggiungiamo due Bottoni
        JButton button1 = new JButton();
        button1.setText("1");
        button1.setOpaque(true);

        JButton button2 = new JButton();
        button2.setText("2");
        button2.setOpaque(true);
        
        JButton button3 = new JButton();
        button3.setText("3");
        button3.setOpaque(true);
        
        //Aggiungiamo un testo
        JTextField testo=new JTextField();
        testo.setText("Testo libero");
        
        
        //Impostiamo il Layout e aggiungiamo i nostri componenti
        // AL CONTAINER DEL FRAME ASSEGNO LAYOUNT MANAGER: FlowLayout
        // RIGHT = TRAILING (CODA)
        frame.getContentPane().setLayout(new FlowLayout(FlowLayout.TRAILING, 5, 10));
        frame.getContentPane().add(label);
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        frame.getContentPane().add(button3);        
        frame.getContentPane().add(testo);                
        
 
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
                new JFrameDemo03_FlowLayout();
            }
        });
    }    
}
