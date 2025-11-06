package provaswing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;


public class JFrameDemo03_BorderLayout
{
    public JFrameDemo03_BorderLayout()
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
        button1.setText("1");//inizailizzato ad 1
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
        
        //possiamo usare le aree che ci interessa commentando quelle
        //quelle che non vogliamo usare
        //Impostiamo il Layout e aggiungiamo i nostri componenti
        //al contennitore del frame imposto layoutmanager
        //superclasse.   5 gap orizzontale 5 gap vertical
        frame.getContentPane().setLayout(new BorderLayout(5,5));  
        //north
        frame.getContentPane().add(label, BorderLayout.PAGE_START);
        //west
        frame.getContentPane().add(button1, BorderLayout.LINE_START);
        //center
        frame.getContentPane().add(button2, BorderLayout.CENTER);
        //east
        frame.getContentPane().add(button3, BorderLayout.LINE_END); 
        //south
        frame.getContentPane().add(testo, BorderLayout.PAGE_END);   
        //.getContentPane() can be omitted (backward compatibility)
        
        
        JMenuItem itemLeft = new JMenuItem("Left");
        itemLeft.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setHorizontalAlignment(JLabel.LEFT);
            }
        });
        
        
        
 
        //Mostriamo l'applicativo
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        //                       istanza di dimensione
        frame.setMinimumSize(new Dimension(250,200));
    }
 
    public static void main(String[] args) {
        //Gli applicativi GUI sono multitasking
        //vanno fatti partire usando un thread (lo si vedrà più avanti nel corso)
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new JFrameDemo03_BorderLayout();
            }
        });
    }    
}
