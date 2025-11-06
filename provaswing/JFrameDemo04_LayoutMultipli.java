package provaswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JFrameDemo04_LayoutMultipli
{
    public JFrameDemo04_LayoutMultipli()
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
        //Preparo un JPanel con un layout manager
        JPanel panel1=new JPanel();   
        panel1.setBackground(Color.yellow);
        panel1.setLayout(new BorderLayout(5,5));
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); //Inserisco un bordo interno        
        panel1.add(label, BorderLayout.LINE_START);        
        panel1.add(testo, BorderLayout.LINE_END);                

        
        //Preparo un JPanel con un layout manager
        JPanel panel2=new JPanel();                 
        panel2.setBackground(Color.red);
        panel2.setLayout(new GridLayout(2,2));
        panel2.setPreferredSize(new Dimension(300,150));
        panel2.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); //Inserisco un bordo interno
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);        

        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        frame.getContentPane().add(panel1);
        frame.getContentPane().add(panel2);
        
        
 
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
                new JFrameDemo04_LayoutMultipli();
            }
        });
    }    
}
