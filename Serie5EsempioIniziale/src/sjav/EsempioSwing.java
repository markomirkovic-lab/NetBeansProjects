package sjav;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EsempioSwing extends JFrame
{
    private JButton b;
    private JLabel l;
    private int numClicks;
    
    //Costruttore
    public EsempioSwing() 
    {
        //Questa DEVE essere la prima istruzione
        super();
        
        //Nessun Layout automatico
        setLayout(null);            

        //Creo il bottone... 
        this.b = new JButton("Click me");   
        b.setBounds(10, 10, 250, 50);
        
        //...e lo aggancio alla finestra
        this.add(b);

        //Creo la label... 
        this.l = new JLabel("Label");
        l.setBounds(10, 60, 250, 50);
        
        //... e la aggancio alla finestra
        this.add(l);
        

        //Aggancio una classe anonima che reagisce agli eventi ActionPerformed, ma solo per questo bottone        
        b.addActionListener(
            new java.awt.event.ActionListener() 
            {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) 
                {
                    numClicks++;
            
                    l.setText("Mi hai cliccato " + numClicks + " volte");

                    //Casto a JButton e ho il riferimento all'oggetto che mi ha chiamato
                    ((JButton)(e.getSource())).setText("Cliccato " + numClicks);
                }                
            }
        );         
        
        
        this.setSize(350,250);
        this.setVisible(true);
        
        
        numClicks=0;
    }
    
    
    
    
    public static void main(String[] args) 
    {
        //Creo un oggetto di me stesso
        EsempioSwing io=new EsempioSwing();
    }
    
}
