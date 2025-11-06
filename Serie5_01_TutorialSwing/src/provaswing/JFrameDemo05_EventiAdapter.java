package provaswing;

import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrameDemo05_EventiAdapter
{
    public JFrameDemo05_EventiAdapter()
    {
        createAndShowGUI();
    }    
    
    private void createAndShowGUI() 
    {
        //Instanziamo un JFrame        
        JFrame frame = new JFrame("Eventi");
        frame.setPreferredSize(new Dimension(300,300));
        

        //Aggiungiamo un testo
        JTextField testo=new JTextField();
        testo.setText("Cliccami");
        testo.setBounds(50,50,150,20);

        //Gestione eventi
        testo.addMouseListener(new TestoMouseAdapter());
        testo.addKeyListener(new TestoKeyAdapter());

        
        //Impostiamo il Layout e aggiungiamo i nostri componenti
        frame.getContentPane().setLayout(null);           
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
                new JFrameDemo05_EventiAdapter();
            }
        });
    }    
}


//----------------------------------------------------------------------------
class TestoMouseAdapter extends MouseAdapter
{
    @Override
    public void mouseClicked(MouseEvent me)
    {
        System.out.println("mouseClicked: " + me.getButton() + " " + me.getX() + " " + me.getY() );
    }
}

//-------------------------------------------------------------------------------

class TestoKeyAdapter extends KeyAdapter
{
    @Override
    public void keyPressed(KeyEvent ke)
    {
        System.out.println("keyPressed: " + ke.getKeyCode() );
    }   
}