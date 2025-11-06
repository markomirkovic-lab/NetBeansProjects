package aa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author marko.mirkovic
 */
//           Studente         Persona
public class AaJFrame extends javax.swing.JFrame
{

    /**
     * Creates new form AaJFrame
     */
    public AaJFrame()
    {
        initComponents();
        
        saveButton.addActionListener(new SaveButton());
        
        //classe annonima
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
                System.out.println("Sono l'evento implementato tramite una classe apposita");
            }
        });
        
//        saveButton.addMouseListener(new MouseListener() {
//            
//        
//        
//        });
        
        //classe apposita
        saveButton.addMouseListener(new MouseListener()
        {
            
            //press-release-(se il mouse e' sullo stesso bottone)-click
            //click (rimane il mouse sul bottone)
            @Override
            public void mouseClicked(MouseEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                
                
                System.out.println("Sono l'evento implementato tramite MouseListener");
                
                
                //e.
                //e.isConsumed()
                //
                
                //e.consume()
                //evento gestito, java non fa piu' l'azione di default
                
                
                //e.getSource()
                //alcuni listener possono avere piu' ...
                //quale bottone e' stato premuto
                
                

            }

            //
            @Override
            public void mousePressed(MouseEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            //lascio il bottone
            @Override
            public void mouseReleased(MouseEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            //
            @Override
            public void mouseEntered(MouseEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            //
            @Override
            public void mouseExited(MouseEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
        key1Button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mousePressed(MouseEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseReleased(MouseEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        });
        
        
        key0Button.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        saveButton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            System.out.println("Sono l'evento implementato tramite MouseAdapter");
         }
         });
        
        key0Button.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Sono l'evento implementato tramite MouseAdapter - key0Button");
            }
         });
                
         key1Button.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Sono l'evento implementato tramite MouseAdapter - key1Button");
            }
         });       
                
                
        
        WindowListener wl = new WindowListener()
        {
            @Override
            public void windowOpened(WindowEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                //e.
            }

            @Override
            public void windowIconified(WindowEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
                
            
        };
    }
        
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroupPluto = new javax.swing.ButtonGroup();
        buttonGroupCactus = new javax.swing.ButtonGroup();
        saveButton = new javax.swing.JButton();
        key0Button = new javax.swing.JButton();
        key1Button = new javax.swing.JButton();
        key2Button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        textField1 = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        saveButton.setText("Save");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                saveButtonMouseClicked(evt);
            }
        });
        saveButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveButtonActionPerformed(evt);
            }
        });

        key0Button.setText("0");
        key0Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                key0ButtonActionPerformed(evt);
            }
        });

        key1Button.setText("1");
        key1Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                keypadActionPerfomed(evt);
            }
        });

        key2Button.setText("2");
        key2Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                keypadActionPerfomed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.BorderLayout(5, 5));

        jButton1.setText("jButton1");
        jPanel2.add(jButton1, java.awt.BorderLayout.PAGE_START);

        jButton2.setText("jButton2");
        jPanel2.add(jButton2, java.awt.BorderLayout.PAGE_END);

        jButton3.setText("jButton3");
        jButton3.setMaximumSize(new java.awt.Dimension(50, 23));
        jButton3.setMinimumSize(new java.awt.Dimension(50, 23));
        jPanel2.add(jButton3, java.awt.BorderLayout.LINE_START);

        jButton4.setText("jButton4");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton4.setMaximumSize(new java.awt.Dimension(50, 23));
        jButton4.setMinimumSize(new java.awt.Dimension(50, 23));
        jButton4.setPreferredSize(new java.awt.Dimension(50, 23));
        jPanel2.add(jButton4, java.awt.BorderLayout.LINE_END);

        jButton5.setText("jButton5");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setMaximumSize(new java.awt.Dimension(50, 23));
        jButton5.setMinimumSize(new java.awt.Dimension(50, 23));
        jButton5.setPreferredSize(new java.awt.Dimension(50, 23));
        jButton5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, java.awt.BorderLayout.CENTER);

        buttonGroupPluto.add(jRadioButton1);
        jRadioButton1.setText("jRadioButton1");

        buttonGroupPluto.add(jRadioButton2);
        jRadioButton2.setText("jRadioButton2");

        buttonGroupPluto.add(jRadioButton3);
        jRadioButton3.setText("jRadioButton3");

        buttonGroupCactus.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton4");

        buttonGroupCactus.add(jRadioButton5);
        jRadioButton5.setText("jRadioButton5");

        textField1.setText("textField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(key1Button)
                            .addComponent(key2Button)
                            .addComponent(key0Button)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(saveButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jRadioButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton5))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jRadioButton1)
                            .addGap(37, 37, 37)
                            .addComponent(jRadioButton4))
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(saveButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton5))
                .addGap(3, 3, 3)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(key0Button)
                        .addGap(24, 24, 24)
                        .addComponent(key1Button)
                        .addGap(18, 18, 18)
                        .addComponent(key2Button))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveButtonActionPerformed
    {//GEN-HEADEREND:event_saveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonActionPerformed

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_saveButtonMouseClicked
    {//GEN-HEADEREND:event_saveButtonMouseClicked
        // TODO add your handling code here:
        // evt.
        JOptionPane.showMessageDialog(this, "Evento da Designer", "Click",
                                      JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_saveButtonMouseClicked

    private void keypadActionPerfomed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_keypadActionPerfomed
    {//GEN-HEADEREND:event_keypadActionPerfomed
        // TODO add your handling code here:
        // evt evento (classe apposita con info specifiche dell'evento appena sucesso)
        // (JButton) e' casting (addattameno / non trasformazione -> iterpretazione)
        // tutti i bottoni nel nostro caso dono JButton
        JButton btn = (JButton) evt.getSource();
        System.out.println("Ho premuto il buttone " + btn.getText());
    }//GEN-LAST:event_keypadActionPerfomed

    private void key0ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_key0ButtonActionPerformed
    {//GEN-HEADEREND:event_key0ButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Evento da Bottone 0", "Click",
                                      JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_key0ButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton5ActionPerformed
    {//GEN-HEADEREND:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(AaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new AaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupCactus;
    private javax.swing.ButtonGroup buttonGroupPluto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JButton key0Button;
    private javax.swing.JButton key1Button;
    private javax.swing.JButton key2Button;
    private javax.swing.JButton saveButton;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
