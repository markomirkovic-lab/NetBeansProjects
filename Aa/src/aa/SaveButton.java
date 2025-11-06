package aa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author marko.mirkovic
 * @version 14 November 2022
 */ //       Classe astratta richiede implements
public class SaveButton implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Sono l'event implementato tramite una classe apposita");
    }

}
