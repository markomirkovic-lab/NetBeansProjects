/*****************************************
 * Soluzione basata sull'esercizio 5.3
 * 
 * ogni tasto ha UN oggetto condiviso
 * alla gestione degli eventi, 
 * usiamo però il gestore degli eventi 
 * del mouse!
 * 
 * Gli eventi sono gestiti con un 
 * MouseAdapter
 *****************************************/


package serie05soluzioni;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Serie05Soluzione_Es4_v3_EventiGestitiConUnOggettoMouseAdapter
{
    private static void createAndShowGUI() 
    {
        final int DISTANZA=5;
        final int WIDTH=300;
        final int HEIGHT=300;
        
        
        //Instanziamo un JFrame        
        JFrame frame = new JFrame("Telefono");
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
        String[] caption={"1", "2", "3", "4", "5", "6", "7", "8", "9", "Call", "0", "Stop/R"};
        JButton[] btn=new JButton[caption.length];
        
        JPanel pnlCenter=new JPanel(new GridLayout(4, 3, DISTANZA, DISTANZA));
        pnlCenter.setBorder(BorderFactory.createEmptyBorder(DISTANZA, DISTANZA, DISTANZA, DISTANZA));        
        
        
        //Generiamo UN MouseAdapter per gestire il click del mouse
        MouseAdapter ma=new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent me)
            {                
                //Il componente è un pulsante?
                if(me.getSource() instanceof JButton)
                {
                    //Prendo un riferimento al componente che ha generato l'evento
                    JButton c=(JButton)me.getSource();

                    if(c.getText().equals("Call"))
                        JOptionPane.showMessageDialog(frame, "Chiamata in corso", "Calling...", JOptionPane.INFORMATION_MESSAGE);
                    else if(c.getText().equals("Stop/R"))
                        txtRisultati.setText("");
                    else
                        txtRisultati.setText(txtRisultati.getText()+c.getText());
                }
            }
        };  
        
        for(int i=0; i<caption.length; i++)
        {
            btn[i]=new JButton(caption[i]);
            if(caption[i].equals(""))
                btn[i].setVisible(false);
            pnlCenter.add(btn[i]);
            
            //Preparo un listener
            btn[i].setActionCommand(caption[i]);
            btn[i].addMouseListener(ma);           //Aggiungo il gestore, identico per ogni pulsante
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

