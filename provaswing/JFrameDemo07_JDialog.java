package provaswing;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;



public class JFrameDemo07_JDialog
{
    private JButton button1;
    private JButton button2;
    private JTextField testo;   
    
    
    public JFrameDemo07_JDialog()
    {
        createAndShowGUI();
    }

    
    
    private void createAndShowGUI() 
    {        
        //Instanziamo un JFrame        
        JFrame frame = new JFrame("TopLevel");
        frame.setPreferredSize(new Dimension(300,200));        
                
        //Indichiamo cosa fare al momento della chiusura della finestra
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        //------------------------------------------------------------------        
        //Aggiungiamo un bottone che reagirà al click
        button1 = new JButton();
        button1.setText("Esempi di messaggio"); 
        button1.addMouseListener( new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent me)
            {
                JOptionPane.showMessageDialog(frame, "Messaggio di warning", "Titolo", JOptionPane.WARNING_MESSAGE);
                JOptionPane.showMessageDialog(frame, "Messaggio di error", "Titolo", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(frame, "Messaggio di question", "Titolo", JOptionPane.QUESTION_MESSAGE);
                
                int n = JOptionPane.showConfirmDialog(frame, "Sicuri?", "Domanda", JOptionPane.YES_NO_CANCEL_OPTION);
                testo.setText(n+"");
                
                String[] options = {"Sicuramente si", "Non credo!"};
                n = JOptionPane.showOptionDialog(frame, "Sicuri?", "Domandina", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
                                                     options,   //Lista dei testi per i bottoni
                                                     options[0] //Bottone predefinito
                                                 ); 
                testo.setText(testo.getText() + " - " + n);
                
                String[] possibilities = {"ham", "spam", "yam"};
                String s = (String)JOptionPane.showInputDialog(frame, "Complete the sentence:\nGreen eggs and...", "Customized Dialog",
                                                               JOptionPane.PLAIN_MESSAGE,
                                                               null,
                                                               possibilities,
                                                               possibilities[0]);
                
               if ((s != null) && (s.length() > 0)) 
               {
                    testo.setText(testo.getText() + " - Green eggs and " + s);    
               }                    
            }
        });
        
        //------------------------------------------------------------------
        //Aggiungiamo un testo che reagirà alla pressione di un tasto
        testo=new JTextField();
        testo.setText("JTextField");          
        
        
        
        //---------------------------------------------------------------------
        //Impostiamo il Layout e aggiungiamo i nostri componenti
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));

        frame.getContentPane().add(button1);
        frame.getContentPane().add(testo); 
 
        //Mostriamo l'applicativo
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new JFrameDemo07_JDialog();
            }
        });         
    }   
}