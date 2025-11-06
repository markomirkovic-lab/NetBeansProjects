package jframeDemo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class JFrameDemo03_Mix {

    private static void createAndShowGUI() {
        // Instanziamo un JFrame.
        JFrame frame = new JFrame("TopLevel");
        frame.setPreferredSize(new Dimension(300, 300));

        // Indichiamo cosa fare al momento della chiusura della finestra.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Aggiungiamogli un menu, opaco.
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(new JMenu("Menu Principale"));
        menuBar.setOpaque(true);
        frame.setJMenuBar(menuBar);


        // Aggiungiamo una label.
        JLabel label = new JLabel();
        label.setText("Hello world");
        label.setOpaque(true);

        // Aggiungiamo due Bottoni.
        JButton button1 = new JButton();
        button1.setText("1");
        button1.setOpaque(true);

        JButton button2 = new JButton();
        button2.setText("2");
        button2.setOpaque(true);

        // Aggiungiamo un testo.
        JTextField testo = new JTextField();
        testo.setText("Testo libero");


        // Istanziamo un JPanel da utilizzare come componente CENTRAL del
        // layout BorderLayout (JPanel con i margini).
        // Da notare che il BorderLayout supporta un solo componente per ognuna
        // delle sue 5 aree possibili, se in un'area si vogliono aggiungere più
        // componenti, allora dobbiamo inserire un contenitore (JPanel) e
        // all'interno del contenitore inseriremo i componenti necessari.
        JPanel jpCentral = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));

        // Istanziamo 5 button da inserire nel contenitore.
        JButton button3 = new JButton();
        button3.setText("AAAA");
        JButton button4 = new JButton();
        button4.setText("BBBB");
        JButton button5 = new JButton();
        button5.setText("CCCC");
        JButton button6 = new JButton();
        button6.setText("DDDD");
        JButton button7 = new JButton();
        button7.setText("EEEE");

        jpCentral.add(button3);
        jpCentral.add(button4);
        jpCentral.add(button5);
        jpCentral.add(button6);
        jpCentral.add(button7);

        // Istanziamo un JPanel utilizzato per ottenere dei margini.
        JPanel jpMargins = new JPanel(new BorderLayout(5, 5));
        jpMargins.setBorder(new EmptyBorder(6, 10, 10, 10));

        // Aggiungiamo i nostri componenti al JPanel con i margini.
        jpMargins.add(label, BorderLayout.PAGE_START);
        jpMargins.add(button1, BorderLayout.LINE_START);
        jpMargins.add(jpCentral, BorderLayout.CENTER);
        jpMargins.add(button2, BorderLayout.LINE_END);
        jpMargins.add(testo, BorderLayout.PAGE_END);

        frame.getContentPane().add(jpMargins);

        // Mostriamo l'applicativo.
        //frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Gli applicativi GUI sono multitasking e vanno fatti partire usando
        // una thread (lo si vedrà più avanti nel corso).
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
