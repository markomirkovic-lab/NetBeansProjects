package provaswing;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;


public class JFrameDemo03_GridBagLayout
{
    public JFrameDemo03_GridBagLayout()
    {
        createAndShowGUI();
    }      
    
    private void createAndShowGUI() 
    {
        //Instanziamo un JFrame        
        JFrame frame = new JFrame("TopLevel");        
                
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
        testo.setText("Testo");
        
        
        //Impostiamo il Layout e aggiungiamo i nostri componenti
        frame.getContentPane().setLayout(new GridBagLayout());
        /*
            Come funziona GridBagLayout.
            Ad ogni componente viene associato un GridBagConstraints
            che ne determina il comportamento.
            In particolare si specificano sempre
            - gridy/gridx           Coordinata riga/colonna del componente
            - gridwidth/gridheight  Span del componenete
            - fill                  Il componenete dovrà espandere e occupare tutto lo spazio dedicato? Oppure resta alle dimensioni minime?
            - anchor                Indica verso quale parte della cella il componente è ancorato
            - inset                 Spazio fra il componente e i bordi della cella
            - ipadx/ipady           Spazio aggiunto all'esterno della cella, in pratica ingrandirà
            - weightx, weighty      Numeri fra 0 e 1 che consentono di indicare a quale componente dare priorità per aggiungere eventuale spazio disponibile
        */
        
        
        //Specifico il comportamento della griglia
        GridBagConstraints gbc = new GridBagConstraints();                
        gbc.gridy = 0;      //Riga 0
        gbc.gridx = 0;      //Colonna 0
        gbc.gridwidth =1;   //Span 1     
        gbc.fill = GridBagConstraints.HORIZONTAL;   //Se hai spazio, riempi la larghezza
        frame.getContentPane().add(label, gbc);
        
        gbc = new GridBagConstraints();                
        gbc.gridy = 0;      //Riga 0         
        gbc.gridx = 1;      //Colonna 1
        gbc.gridwidth =2;   //Span 2
        gbc.fill = GridBagConstraints.HORIZONTAL;   //Se hai spazio, riempi la larghezza
        frame.getContentPane().add(button1,gbc);

        gbc = new GridBagConstraints();        
        gbc.gridx = 0;      //Riga 0
        gbc.gridy = 1;      //Colonna 1 
        gbc.gridheight =2;  //Span verticale 2
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx=50;
        gbc.ipady=50;        
        frame.getContentPane().add(button2, gbc);
        
        gbc = new GridBagConstraints();                
        gbc.gridx = 1;
        gbc.gridy = 1; 
        gbc.insets = new Insets(5,5,0,0);          //Bordo sopra e a sinistra
        gbc.anchor= GridBagConstraints.SOUTHEAST;  //Ancora in basso a destra rispetto alla cella
        frame.getContentPane().add(button3, gbc); 
        
        gbc = new GridBagConstraints();        
        gbc.gridx = 2;
        gbc.gridy = 2;                       
        gbc.anchor= GridBagConstraints.NORTHWEST;  //Ancora in alto a sisnistra rispetto alla cella
        frame.getContentPane().add(testo, gbc);                
        
 
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
                new JFrameDemo03_GridBagLayout();
            }
        });
    }    
}
