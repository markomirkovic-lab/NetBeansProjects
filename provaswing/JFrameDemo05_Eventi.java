package provaswing;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrameDemo05_Eventi
{
    public JFrameDemo05_Eventi()
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
        testo.addMouseListener(new TestoMouseListener());
        testo.addKeyListener(new TestoKeyListener());

        
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
                new JFrameDemo05_Eventi();
            }
        });
    }    
}


//----------------------------------------------------------------------------
class TestoMouseListener implements MouseListener
{

    @Override
    public void mouseClicked(MouseEvent me)
    {
        System.out.println("mouseClicked: " + me.getSource() + " " + me.getButton() + " " + me.getX() + " " + me.getY() );
    }

    @Override
    public void mousePressed(MouseEvent me)
    {
        System.out.println("mousePressed: " + me.getButton() + " " + me.getX() + " " + me.getY() );
    }

    @Override
    public void mouseReleased(MouseEvent me)
    {
        System.out.println("mouseReleased: " + me.getButton() + " " + me.getX() + " " + me.getY() );
    }

    @Override
    public void mouseEntered(MouseEvent me)
    {
        System.out.println("mouseEntered: " + me.getButton() + " " + me.getX() + " " + me.getY() );
    }

    @Override
    public void mouseExited(MouseEvent me)
    {
        System.out.println("mouseExited: " + me.getButton() + " " + me.getX() + " " + me.getY() );
    }    
}

//-------------------------------------------------------------------------------

class TestoKeyListener implements KeyListener
{

    @Override
    public void keyTyped(KeyEvent ke)
    {
        System.out.println("keyTyped: " + ke.getKeyCode() );
    }

    @Override
    public void keyPressed(KeyEvent ke)
    {
        System.out.println("keyPressed: " + ke.getKeyCode() );
    }

    @Override
    public void keyReleased(KeyEvent ke)
    {
        System.out.println("keyReleased: " + ke.getKeyCode() );
    }    
}