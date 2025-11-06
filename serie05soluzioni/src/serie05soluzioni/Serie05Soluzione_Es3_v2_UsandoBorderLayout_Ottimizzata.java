package serie05soluzioni;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Serie05Soluzione_Es3_v2_UsandoBorderLayout_Ottimizzata
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
        String[] caption={"Cls", "Bck", "", "Close", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
        JButton[] btn=new JButton[caption.length];
        
        JPanel pnlCenter=new JPanel(new GridLayout(5, 4, DISTANZA, DISTANZA));
        pnlCenter.setBorder(BorderFactory.createEmptyBorder(DISTANZA, DISTANZA, DISTANZA, DISTANZA));        
        
        for(int i=0; i<caption.length; i++)
        {
            btn[i]=new JButton(caption[i]);
            if(caption[i].equals(""))
                btn[i].setVisible(false);
            pnlCenter.add(btn[i]);
        }
        
        
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

