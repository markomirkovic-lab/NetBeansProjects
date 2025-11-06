package serie05soluzioni;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Serie05Soluzione_Es3_v1_UsandoBorderLayout
{
    private static void createAndShowGUI() 
    {
        final int DISTANZA=5;
        final int WIDTH=300;
        final int HEIGHT=300;
        
        
        //Instanziamo un JFrame        
        JFrame frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(WIDTH,HEIGHT));
                
        //Indichiamo cosa fare al momento della chiusura della finestra
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        //Aggiungiamogli un menu, opaco
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(new JMenu("File"));
        menuBar.setOpaque(true);
        frame.setJMenuBar(menuBar);   
                        

        //Prepariamo la textbox, che starà in un suo JPanel        
        JTextField txtRisultati=new JTextField("");
        
        JPanel pnlTop=new JPanel(new GridLayout(1, 1, DISTANZA, DISTANZA));
        pnlTop.add(txtRisultati);
        pnlTop.setBorder(BorderFactory.createEmptyBorder(DISTANZA, DISTANZA, 0, DISTANZA));
        
        
        //Prepariamo i bottoni
        JButton b1=new JButton("Cls");
        JButton b2=new JButton("Bck");
        JButton b3=new JButton("Vuoto");
        b3.setVisible(false);               //Lo rendo invisibile
        JButton b4=new JButton("Close");
        JButton b5=new JButton("7");
        JButton b6=new JButton("8");
        JButton b7=new JButton("9");
        JButton b8=new JButton("/");
        JButton b9=new JButton("4");
        JButton b10=new JButton("5");
        JButton b11=new JButton("6");
        JButton b12=new JButton("*");
        JButton b13=new JButton("1");
        JButton b14=new JButton("2");
        JButton b15=new JButton("3");
        JButton b16=new JButton("-");
        JButton b17=new JButton("0");
        JButton b18=new JButton(".");
        JButton b19=new JButton("=");
        JButton b20=new JButton("+");

        JPanel pnlCenter=new JPanel(new GridLayout(5, 4, DISTANZA, DISTANZA));
        pnlCenter.setBorder(BorderFactory.createEmptyBorder(DISTANZA, DISTANZA, DISTANZA, DISTANZA));        
        pnlCenter.add(b1);
        pnlCenter.add(b2);
        pnlCenter.add(b3);
        pnlCenter.add(b4);        
        pnlCenter.add(b5);        
        pnlCenter.add(b6);        
        pnlCenter.add(b7);        
        pnlCenter.add(b8);        
        pnlCenter.add(b9);        
        pnlCenter.add(b10);        
        pnlCenter.add(b11);        
        pnlCenter.add(b12);        
        pnlCenter.add(b13);        
        pnlCenter.add(b14);        
        pnlCenter.add(b15);        
        pnlCenter.add(b16);        
        pnlCenter.add(b17);        
        pnlCenter.add(b18);                
        pnlCenter.add(b19);        
        pnlCenter.add(b20);         
        
        
        //Impostiamo il Layout e aggiungiamo i nostri componenti
        frame.getContentPane().setLayout(new BorderLayout());
        
        frame.getContentPane().add(pnlTop, BorderLayout.NORTH);
        frame.getContentPane().add(pnlCenter, BorderLayout.CENTER);              
        
 
        //Mostriamo l'applicativo
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Gli applicativi GUI sono multitasking
        //vano fatti partire usando un thread (lo si vedrà più avanti nel corso)
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                createAndShowGUI();
            }
        });
    }     
}

