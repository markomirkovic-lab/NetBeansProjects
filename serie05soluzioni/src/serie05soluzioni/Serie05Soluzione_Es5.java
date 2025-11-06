package serie05soluzioni;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Serie05Soluzione_Es5
{
    private JPanel pnlAdd;
    private JLabel lblAdd;
    private JTextField txtAdd;
    private JButton btnAdd;
    private JButton btnClear;
    
    private JPanel pnlCbo;
    private JComboBox cboData;
    private JList lstData;
    private DefaultListModel lstDataModel;
    private JScrollPane lstDataScroll;    
    
    private JPanel pnlResult;
    private JTextArea txtResult;
    private JScrollPane lstResultScroll;    
        
            
    
    public Serie05Soluzione_Es5()
    {
        this.createAndShowGUI();
    }

    
    
    private void createAndShowGUI() 
    {        
        //Instanziamo un JFrame        
        JFrame frame = new JFrame("TopLevel");        
                
        //Indichiamo cosa fare al momento della chiusura della finestra
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        //------------------------------------------------------------------
        lblAdd=new JLabel("Inserisci testo da aggiungere");
        
        txtAdd=new JTextField("");
        txtAdd.setColumns(20);
        txtAdd.setToolTipText("Inserisci un testo da aggiungere alle liste");
        
        btnAdd=new JButton("Add");
        btnAdd.setMnemonic('A');
        btnAdd.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                String tmp=txtAdd.getText().trim();
                
                if(!tmp.equals(""))
                {
                    cboData.addItem(tmp);
                    lstDataModel.addElement(tmp);                
                    txtAdd.setText("");
                    txtAdd.requestFocusInWindow();
                }
            }
        });
        
        btnClear=new JButton("Clear");
        btnClear.setMnemonic('C');
        btnClear.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                txtAdd.setText("");
                cboData.removeAllItems();
                lstDataModel.clear();
                txtResult.setText("");
            }
        });        
        
        
        pnlAdd=new JPanel();
        pnlAdd.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 3));
        pnlAdd.setBorder(BorderFactory.createEmptyBorder(5, 5, 2, 5)); //Inserisco un bordo interno        
        pnlAdd.add(lblAdd);
        pnlAdd.add(txtAdd);
        pnlAdd.add(btnAdd);
        pnlAdd.add(btnClear);
        
        
        //------------------------------------------------------------------
        cboData=new JComboBox();
        cboData.addItemListener( new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent event) 
            {
               if (event.getStateChange() == ItemEvent.SELECTED) 
               {
                   String tmp="Hai selezionato dalla JComboBox la riga: \n" + event.getItem();
                   txtResult.setText(tmp);     
               }
            }             
        });        
                
        lstDataModel=new DefaultListModel();
        lstData=new JList(lstDataModel);
        lstDataScroll=new JScrollPane(lstData);
        lstData.setVisibleRowCount(4);
        lstData.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);        
        lstData.addListSelectionListener( new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent lse)
            {
                String tmp="";
                
                if(lstData.getSelectedIndex()!=0)   //Ha selezionato qualcosa?
                {
                    tmp+="Hai selezionato dalla JList le righe: " + Arrays.toString(lstData.getSelectedIndices()) + "\n";
                    
                    Object[] selected=lstData.getSelectedValuesList().toArray();
                    for(int i=0; i<selected.length; i++)
                        tmp+=(String)selected[i]+"\n";
                }
                txtResult.setText(tmp);                
            }
        });
        
                
        pnlCbo=new JPanel();
        pnlCbo.setLayout(new BorderLayout(5,5)); 
        pnlCbo.setBorder(BorderFactory.createEmptyBorder(5, 5, 2, 5)); //Inserisco un bordo interno     
        pnlCbo.add(cboData, BorderLayout.NORTH);
        pnlCbo.add(lstDataScroll, BorderLayout.SOUTH);
        
        
        //------------------------------------------------------------------
        txtResult=new JTextArea();
        txtResult.setRows(5);
        lstResultScroll=new JScrollPane(txtResult);

        pnlResult=new JPanel();
        pnlResult.setLayout(new GridLayout(1,1));        
        pnlResult.setBorder(BorderFactory.createEmptyBorder(5, 5, 2, 5)); //Inserisco un bordo interno     
        pnlResult.add(lstResultScroll);        
        
        
        //---------------------------------------------------------------------
        //Impostiamo il Layout e aggiungiamo i nostri componenti        
        frame.getContentPane().setLayout(new BorderLayout(5,5));
        frame.getContentPane().add(pnlAdd, BorderLayout.NORTH);
        frame.getContentPane().add(pnlCbo, BorderLayout.CENTER);
        frame.getContentPane().add(pnlResult, BorderLayout.SOUTH); 
        
 
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
                new Serie05Soluzione_Es5();
            }
        });        
    }       
}
