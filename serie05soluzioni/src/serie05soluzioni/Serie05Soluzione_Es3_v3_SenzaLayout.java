/****************************************************************
 * Dimostrazione di come la gestione del posizionamento manuale 
 * è complessa e fonte di tempo gettato al vento!
 ****************************************************************/
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



public class Serie05Soluzione_Es3_v3_SenzaLayout
{
    private static void createAndShowGUI() 
    {        
        final int WIDTH=300;
        final int HEIGHT=300;
        
        
        //Instanziamo un JFrame        
        JFrame frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        
                
        //Indichiamo cosa fare al momento della chiusura della finestra
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        //Impostiamo il Layout e aggiungiamo i nostri componenti
        frame.getContentPane().setLayout(null);
        
        
        //Aggiungiamogli un menu, opaco
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(new JMenu("File"));
        menuBar.setOpaque(true);        
        frame.setJMenuBar(menuBar);   

        
        //Faccio un pack per determinare le dimensioni disponibili della finestra
        frame.pack();     
        
        
        final int DISTANZA=5;
        final int TEXTHEIGHT=25;
        final int BUTTONWIDTH=(frame.getContentPane().getBounds().width-2*DISTANZA-3*DISTANZA)/4;
        final int BUTTONHEIGHT=(frame.getContentPane().getBounds().height-menuBar.getBounds().height-2*DISTANZA-TEXTHEIGHT-DISTANZA)/5;
        
                        

        //Prepariamo la textbox, che starà in un suo JPanel        
        JTextField txtRisultati=new JTextField("");
        txtRisultati.setBounds(DISTANZA, DISTANZA, frame.getContentPane().getBounds().width-2*DISTANZA, TEXTHEIGHT);
        frame.getContentPane().add(txtRisultati);
        
        //Prepariamo i bottoni        
        String[] caption={"Cls", "Bck", "", "Close", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
        JButton[] btn=new JButton[caption.length];
        
        JPanel pnlCenter=new JPanel(new GridLayout(5, 4, DISTANZA, DISTANZA));
        
        int x=DISTANZA;
        int y=DISTANZA+TEXTHEIGHT+DISTANZA;
        for(int i=0; i<caption.length; i++)
        {
            btn[i]=new JButton(caption[i]);
            if(caption[i].equals(""))
                btn[i].setVisible(false);
            
            //Calcolo la posizione sullo schermo
            if(i%4==0 && i>=4)
            {
                //Cambia la riga
                y+=BUTTONHEIGHT+DISTANZA;
                x=DISTANZA;
            }
            else if(i!=0)
                x+=BUTTONWIDTH+DISTANZA;
            
            btn[i].setBounds(x, y, BUTTONWIDTH, BUTTONHEIGHT);
            
            frame.getContentPane().add(btn[i]);
        }
        
        
        
 
        //Mostriamo l'applicativo
        frame.pack();
        frame.setVisible(true);

        System.out.println(frame.getContentPane().getBounds().height);
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



