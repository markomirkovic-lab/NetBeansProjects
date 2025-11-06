package provaswing;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;



public class JFrameDemo06_Componenti
{
    //Questo è il modo più pulito di procedere
    //Si dichiarano come variabili di classe gli oggetti grafici, 
    //così risultano noti a tutti i metodi della classe
    
    private JLabel label;
    private JButton button1;
    private JTextField testo;   
    private JPasswordField pwd;
    private JTextArea txa;    
    
    private JCheckBox chk1, chk2;
    private JRadioButton rdb1, rdb2;
    private ButtonGroup blocco1, blocco2;
    
    private JComboBox cbo;
    
    private JList lst;
    private DefaultListModel lstListModel;
    private JScrollPane lstListScroll;
        
    private JTable tblFullControlledByProgrammer;    
    private JScrollPane tblFullControlledTableScroll;    
    
    private JTable tblAutomatic;    
    private TableModel tblAutomaticTableModel;
    private JScrollPane tblAutomaticTableScroll;    

    private JTable tblDefault;    
    private DefaultTableModel tblDefaultTableModel;
    private JScrollPane tblDefaultTableScroll;    

    
    public JFrameDemo06_Componenti()
    {
        this.createAndShowGUI();
    }

    
    
    private void createAndShowGUI() 
    {        
        //Instanziamo un JFrame        
        JFrame frame = new JFrame("TopLevel");
        frame.setPreferredSize(new Dimension(300,640));        
                
        //Indichiamo cosa fare al momento della chiusura della finestra
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  



        
        //------------------------------------------------------------------
        //Aggiungiamo una label che reagirà al focus
        label = new JLabel();
        label.setText("JLabel");          
        label.addFocusListener( new FocusAdapter()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                label.setText("La label ha ottenuto il focus");
            }
        });



        
        //------------------------------------------------------------------        
        //Aggiungiamo un bottone che reagirà al click
        button1 = new JButton();
        button1.setText("JButton"); 
        button1.addMouseListener( new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent me)
            {
                label.setText("JButton cliccato");
            }
        });
        


        
        //------------------------------------------------------------------
        //Aggiungiamo un testo che reagirà alla pressione di un tasto
        testo=new JTextField();
        testo.setText("JTextField");
        testo.addKeyListener(new KeyAdapter() 
        {
            @Override
            public void keyPressed(KeyEvent ke)
            {
                label.setText("JTextField premuto: " + ke.getKeyChar());
            }
        });        
        


        
        //------------------------------------------------------------------
        //Aggiungiamo una password
        pwd=new JPasswordField();
        pwd.setText("Password");    
        


        
        //------------------------------------------------------------------
        //Aggiungiamo un'area di testo
        txa=new JTextArea();
        txa.setText("Testo\nassai\nlungo.");          


        
        
        //------------------------------------------------------------------
        //Aggiungiamo delle checkBoxes e dei radiobutton
        
        //Preparo il listener, ne useremo uno per i quattro check e radio
        //Reagirà al cambiamento di stato
        CheckAndRadioItemListener crl=new CheckAndRadioItemListener();
        
        chk1=new JCheckBox("Blocco 1. Checkbox 1 (Q)");
        chk1.setMnemonic(KeyEvent.VK_Q); 
        chk1.setSelected(true);
        chk1.setName("chk1");   //Grazie al nome potrò identificare il widget
        chk1.addItemListener( crl );
        
        chk2=new JCheckBox("Blocco 1. Checkbox 2 (A)");        
        chk2.setMnemonic(KeyEvent.VK_A); 
        chk2.setSelected(false); 
        chk2.setName("chk2");
        chk2.addItemListener( crl );
        
        rdb1=new JRadioButton("Blocco 2. Radiobutton 1");
        rdb1.setSelected(true);
        rdb1.setName("rdb1");
        rdb1.addItemListener( crl );
        
        rdb2=new JRadioButton("Blocco 2. Radiobutton 2");        
        rdb2.setSelected(false);         
        rdb2.setName("rdb2");
        rdb2.addItemListener( crl );
        
        //Ho due buttongroup per escludere mutualmente la selezione
        //Non dobbiamo scrivere nulla, è il ButtonGroup che si occupa di tutto
        //Provate ad eliminarli
        blocco1=new ButtonGroup();
        blocco1.add(chk1);              //chk1 e chk2 si escludono a vicenda
        blocco1.add(chk2);
        
        blocco2=new ButtonGroup();
        blocco2.add(rdb1);              //rdb1 e rdb2 si escludono a vicenda
        blocco2.add(rdb2);


        
        
        //------------------------------------------------------------------
        //Aggiungiamo un combobox
        String[] animali = { "Cane", "Gatto", "Criceto", "Cavallo", 
                             "Mucca", "Coccodrillo"  };
        cbo=new JComboBox(animali);
        cbo.addItem("Pecora");
        cbo.removeItem("Pecora");  
        cbo.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                label.setText("JComboBox: " + cbo.getSelectedIndex() + " " + cbo.getSelectedItem());
            }            
        });
        


        
        //------------------------------------------------------------------
        //Aggiungiamo una listbox
        //Nota bene:
        //  La JList è un contenitore. I dati sono gestito dal ListModel, quindi aggiungere, togliere, modificare i dati va eseguita sul model!
        
        lstListModel=new DefaultListModel();        //ListModel dei dati
        
        for(int i=0; i<animali.length; i++)         //Popoliamo il ListModel   
            lstListModel.addElement(animali[i]);
        
        lstListModel.addElement("Pecora");          //Aggiungiamo a mano altri elementi
        lstListModel.removeElement("Pecora"); 
        
        lst=new JList(lstListModel);                //Aggiungo il ListModel alla JList
        lst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);        
        lst.setVisibleRowCount(4);
        lst.setSelectedIndex(2);

        //Cosa fare quando si seleziona una o più voci?
        lst.addListSelectionListener( new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent lse)
            {
                //lst.getSelectedIndices()      Array con gli indici delle voci selezionate
                //lst.getSelectedValuesList()   List con le voci selezionate
                //lst.getSelectedIndex()        L'indice della prima voce selezionata
                //lst.getSelectedValue()        La prima voce selezionata                
                label.setText("JList: " + Arrays.toString(lst.getSelectedIndices()) + " " + lst.getSelectedValuesList() + " " + lst.getSelectedIndex() + " " + lst.getSelectedValue());
            }            
        });
        
        //Selezionare delle voci da codice
        int[] selezionati={0,2};
        lst.setSelectedIndices( selezionati );
        
        //Scrollbar per la JList
        lstListScroll=new JScrollPane(lst);
        

        
        
        //------------------------------------------------------------------
        //Aggiungiamo una JTable il cui comportamento è dettato da un TableModel.
        //Questo significa che tutte le operazioni sulla tabella sono programmate da noi!!!!
        //  TableModel è un'interfaccia che prevede pochi essenziali metodi; da questa deriveremo la nostra classe
        //  AbstractTableModel implements TableModel: è una classe astratta che estende TableModel
        //
        //      JTable <--> TableModel <--> Dati
        //
        //È nostro compito gestire i dati e l'interazione nella classe che realizeremo.
        //Attenzione: se si usa il Designer di NetBeans, per personalizzare
        //            dovrete cliccare con il destro sulla JTable e selezionare "Customize Code..."
        //http://docs.oracle.com/javase/tutorial/uiswing/components/table.html#selection
        

        //Costruisco la JTable e al costruttore passo un TableModel
        //Attenzione! Non posso castare il TableModel della tabella
        //      TableModel t=(DefaultTableModel)tbl.getModel();
        //in quanto esso è implementato come una InnerClass anonima ed è un'interfaccia!
        tblFullControlledByProgrammer = new JTable(new AbstractTableModel()
        {
            //Matrice dei dati, importante indicare la classe!
            Object[][] data = {{new Integer(11), new Double(12.1), new String("13a")},
                               {new Integer(21), new Double(22.2), new String("23b")},
                               {new Integer(31), new Double(32.3), new String("33c")},
                               {new Integer(41), new Double(42.4), new String("43d")}};

            //Array con i titoli delle colonne
            String[] columnNames = {"Interi","Virgola","Stringhe"}; 
            
            //Array che precisa se quali celle sono modificabili
            boolean[] canEdit = {false, false, true};

    
            //Metodo che ritorna il tipo della colonna
            @Override
            public Class getColumnClass(int columnIndex) 
            {
                return(tblFullControlledByProgrammer.getValueAt(0,columnIndex).getClass());
            }

            //Metodo che ritorna se una cella è editabile
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) 
            {
                return canEdit[columnIndex];
            }

            @Override
            public int getRowCount() 
            {
                return(data.length);
            }

            @Override
            public int getColumnCount() 
            {
                return(columnNames.length);
            }

            @Override
            public Object getValueAt(int row, int col) 
            {
                return(data[row][col]);
            }
            
            @Override
            public void setValueAt(Object value, int row, int col) 
            {
                data[row][col] = value;
                fireTableCellUpdated(row, col);
            }            
        });
        
        //Listener sul cambiamento dei dati
        tblFullControlledByProgrammer.getModel().addTableModelListener(new TableModelListener() 
        {
            @Override
            public void tableChanged(TableModelEvent e) 
            {
                //Ha effettuato in insert o un delete o un update
                if(e.getType()==TableModelEvent.INSERT || 
                   e.getType()==TableModelEvent.DELETE ||
                   e.getType()==TableModelEvent.UPDATE)
                {
                    //Eseguo l'autosizing di tutte le colonne, purtroppo devo farlo a mano
                    final TableModel tm=tblFullControlledByProgrammer.getModel();
                    final TableColumnModel columnModel = tblFullControlledByProgrammer.getColumnModel();
                    
                    final int MINWIDTH=15;
                    final int MAXWIDTH=500;                    
                    for(int column=0; column<tm.getColumnCount(); column++) 
                    {
                        int width=MINWIDTH;                    
                        for(int row=0; row<tm.getRowCount(); row++) 
                        {
                            TableCellRenderer renderer = tblFullControlledByProgrammer.getCellRenderer(row, column);
                            Component comp = tblFullControlledByProgrammer.prepareRenderer(renderer, row, column);
                            width = Math.max(comp.getPreferredSize().width +1 , width);
                        }
                        //Check max width
                        width=Math.min(width,MAXWIDTH);
                        columnModel.getColumn(column).setPreferredWidth(width);                                            
                    }
                }
            }
        });        
        
        
        //La JTable ha anche un SelectionModel, sul quale possiamo agganciare un Listener
        tblFullControlledByProgrammer.getSelectionModel().addListSelectionListener(new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent event) 
            {
                //Rileva sia cambiamenti dati con i tasti freccia che con il mouse
                
                //tbl.getSelectedRow()      Prima riga selezionata
                //tbl.getSelectedRows()     Array delle righe selezionate
                //tbl.getSelectedColumn()   Prima colonna selezionata
                //tbl.getSelectedColumns()  Array delle colonne selezionate
                //tbl.getValueAt(r,c)       Valore alla riga e colonna, ricordo che i tipi di ogni colonna sono visibili con tblTableModel.getColumnClass(col)
                label.setText("JTable: row " + Arrays.toString(tblFullControlledByProgrammer.getSelectedRows()) + 
                              " col " + Arrays.toString(tblFullControlledByProgrammer.getSelectedColumns()) + 
                              " data: " + tblFullControlledByProgrammer.getValueAt(tblFullControlledByProgrammer.getSelectedRow(), tblFullControlledByProgrammer.getSelectedColumn()));                
            }
        });                
        
        //selezione multipla
        tblFullControlledByProgrammer.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        //Nessuna linea orizzontale e verticale
        tblFullControlledByProgrammer.setShowHorizontalLines(false);
        tblFullControlledByProgrammer.setShowVerticalLines(false);
        
        //ScrollPane per la table
        tblFullControlledTableScroll = new JScrollPane(tblFullControlledByProgrammer);


        
        
        
        //------------------------------------------------------------------
        //Aggiungiamo una JTable il cui comportamento è dettato dal DefaultTableModel messo a disposizione da Java.
        //Semplifica molto le cose, è sufficiente fornire il nome delle colonne e i dati iniziali.
        //
        //      JTable <--> DefaulTableModel
        //Attenzione: se si usa il Designer di NetBeans, per personalizzare
        //            dovrete cliccare con il destro sulla JTable e selezionare "Customize Code..."
        //http://docs.oracle.com/javase/tutorial/uiswing/components/table.html#selection
        
        Object[][] data = {{new Integer(1), new Double(1.1), new String("1a")},
                           {new Integer(2), new Double(2.2), new String("2b")},
                           {new Integer(3), new Double(3.3), new String("3c")},
                           {new Integer(4), new Double(4.4), new String("4d")}};
        String[] columnNames = {"Column 1","Column 2","Column 3"};
        

        //Creo la tabella con le colonne e i dati indicati
        tblAutomatic = new JTable(data, columnNames);

        //Ottengo il TableModel, uno generico, mi permette di aggiungere i listener ma non posso fare molto di più
        tblAutomaticTableModel = tblAutomatic.getModel();
        
        //Aggiungo un listener, è esattamente uguale a quanto fatto sull'altra JTable
        //Listener sul cambiamento dei dati
        tblAutomaticTableModel.addTableModelListener(new TableModelListener() 
        {
            @Override
            public void tableChanged(TableModelEvent e) 
            {
                //Ha effettuato in insert o un delete o un update
                if(e.getType()==TableModelEvent.INSERT || 
                   e.getType()==TableModelEvent.DELETE ||
                   e.getType()==TableModelEvent.UPDATE)
                {
                    //Eseguo l'autosizing di tutte le colonne, purtroppo devo farlo a mano
                    final TableModel tm=tblAutomatic.getModel();
                    final TableColumnModel columnModel = tblAutomatic.getColumnModel();
                    
                    final int MINWIDTH=15;
                    final int MAXWIDTH=500;                    
                    for(int column=0; column<tm.getColumnCount(); column++) 
                    {
                        int width=MINWIDTH;                    
                        for(int row=0; row<tm.getRowCount(); row++) 
                        {
                            TableCellRenderer renderer = tblAutomatic.getCellRenderer(row, column);
                            Component comp = tblAutomatic.prepareRenderer(renderer, row, column);
                            width = Math.max(comp.getPreferredSize().width +1 , width);
                        }
                        //Check max width
                        width=Math.min(width,MAXWIDTH);
                        columnModel.getColumn(column).setPreferredWidth(width);                                            
                    }
                }
            }
        });     
        
        //Aggiungo un listener che reagisce se cambiano i dati selezionati
        tblAutomatic.getSelectionModel().addListSelectionListener(new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent event) 
            {
                //Rileva sia cambiamenti dati con i tasti freccia che con il mouse
                
                //tbl.getSelectedRow()      Prima riga selezionata
                //tbl.getSelectedRows()     Array delle righe selezionate
                //tbl.getSelectedColumn()   Prima colonna selezionata
                //tbl.getSelectedColumns()  Array delle colonne selezionate
                //tbl.getValueAt(r,c)       Valore alla riga e colonna, ricordo che i tipi di ogni colonna sono visibili con tblTableModel.getColumnClass(col)
                label.setText("JTable2: row " + Arrays.toString(tblAutomatic.getSelectedRows()) + 
                              " col " + Arrays.toString(tblAutomatic.getSelectedColumns()) + 
                              " data: " + tblAutomatic.getValueAt(tblAutomatic.getSelectedRow(), tblAutomatic.getSelectedColumn()));                
            }
        });         
        
        //Cambio un valore
        tblAutomaticTableModel.setValueAt(333, 2, 0);
        
        //ScrollPane per la table
        tblAutomaticTableScroll = new JScrollPane(tblAutomatic);


        //------------------------------------------------------------------
        //Aggiungiamo una JTable il cui comportamento è dettato dal DefaultTableModel messo a disposizione da Java.
        //Semplifica molto le cose, è sufficiente fornire il nome delle colonne e i dati iniziali.
        //
        //      JTable <--> DefaultTableModel
        //
        //  DefaultTableModel è una classe reale che estende AbstractTableModel
        //
        //Contiene tutta una serie di metodi comodi:
        //  addColumn
        //  addRow
        //  insertRow
        //
        //Attenzione: se si usa il Designer di NetBeans, per personalizzare
        //            dovrete cliccare con il destro sulla JTable e selezionare "Customize Code..."
        //https://www.thoughtco.com/defaulttablemodel-example-program-2033893
                
        tblDefaultTableModel = new DefaultTableModel(data,columnNames);
        tblDefault = new JTable(tblDefaultTableModel);
   
        //Aggiungiamo una colonna, il DefaultTableModel mette a disposizione addColumn
        Object[] newData = {new Boolean(true), new Boolean(false), new Boolean(true), new Boolean(false)};
        tblDefaultTableModel.addColumn("Column 4", newData);
        
        //Aggiungiamo una riga
        Object[] newRowData = {new Integer(5), new Double(5.5), new String("5e"), new Boolean(false)};
        tblDefaultTableModel.addRow(newRowData);
        
        //Inseriamo una riga
        Object[] insertRowData = {new Integer(8), new Double(8.8), new String("8f"), new Boolean(true)};
        tblDefaultTableModel.insertRow(2,insertRowData);
        
        //Spostiamo le righe da 2 a 4 alla riga 0
        tblDefaultTableModel.moveRow(2, 4, 0);
        
        //Cambiamo un valore
        tblDefaultTableModel.setValueAt("8888", 3, 2);
        
        //Aggiungo un listener, è esattamente uguale a quanto fatto sull'altra JTable
        //Listener sul cambiamento dei dati
        tblDefaultTableModel.addTableModelListener(new TableModelListener() 
        {
            @Override
            public void tableChanged(TableModelEvent e) 
            {
                //Ha effettuato in insert o un delete o un update
                if(e.getType()==TableModelEvent.INSERT || 
                   e.getType()==TableModelEvent.DELETE ||
                   e.getType()==TableModelEvent.UPDATE)
                {
                    //Eseguo l'autosizing di tutte le colonne, purtroppo devo farlo a mano
                    final TableModel tm=tblDefault.getModel();
                    final TableColumnModel columnModel = tblDefault.getColumnModel();
                    
                    final int MINWIDTH=15;
                    final int MAXWIDTH=500;                    
                    for(int column=0; column<tm.getColumnCount(); column++) 
                    {
                        int width=MINWIDTH;                    
                        for(int row=0; row<tm.getRowCount(); row++) 
                        {
                            TableCellRenderer renderer = tblDefault.getCellRenderer(row, column);
                            Component comp = tblDefault.prepareRenderer(renderer, row, column);
                            width = Math.max(comp.getPreferredSize().width +1 , width);
                        }
                        //Check max width
                        width=Math.min(width,MAXWIDTH);
                        columnModel.getColumn(column).setPreferredWidth(width);                                            
                    }
                }
            }
        });     
        
        //Aggiungo un listener che reagisce se cambiano i dati selezionati
        tblDefault.getSelectionModel().addListSelectionListener(new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent event) 
            {
                //Rileva sia cambiamenti dati con i tasti freccia che con il mouse
                
                //tbl.getSelectedRow()      Prima riga selezionata
                //tbl.getSelectedRows()     Array delle righe selezionate
                //tbl.getSelectedColumn()   Prima colonna selezionata
                //tbl.getSelectedColumns()  Array delle colonne selezionate
                //tbl.getValueAt(r,c)       Valore alla riga e colonna, ricordo che i tipi di ogni colonna sono visibili con tblTableModel.getColumnClass(col)
                label.setText("JTable3: row " + Arrays.toString(tblDefault.getSelectedRows()) + 
                              " col " + Arrays.toString(tblDefault.getSelectedColumns()) + 
                              " data: " + tblDefault.getValueAt(tblDefault.getSelectedRow(), tblDefault.getSelectedColumn()));                
            }
        });         
            
        //ScrollPane per la table
        tblDefaultTableScroll = new JScrollPane(tblDefault);

        
        //---------------------------------------------------------------------
        //Impostiamo il Layout e aggiungiamo i nostri componenti
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));

        frame.getContentPane().add(label);
        frame.getContentPane().add(button1);
        frame.getContentPane().add(testo); 
        frame.getContentPane().add(pwd); 
        frame.getContentPane().add(txa); 
        frame.getContentPane().add(chk1);
        frame.getContentPane().add(chk2);
        frame.getContentPane().add(rdb1);
        frame.getContentPane().add(rdb2);
        frame.getContentPane().add(cbo);
        frame.getContentPane().add(lstListScroll);
        frame.getContentPane().add(tblFullControlledTableScroll);
        frame.getContentPane().add(tblAutomaticTableScroll);
        frame.getContentPane().add(tblDefaultTableScroll);
        
        
 
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
                new JFrameDemo06_Componenti();
            }
        });        
    }   
    
    
    
    //-----------------------------------------------------------------------
    //Classe interna. Significa che vede le variabili private della classe
    //che la contiene.
    //In questo esempio gestiremo con un solo metodo i click sui checkbox e 
    //radiobutton
    class CheckAndRadioItemListener implements ItemListener 
    {
        @Override
        public void itemStateChanged(ItemEvent ie)
        {
            String nome=((JComponent)(ie.getItem())).getName();
            label.setText(nome + " " + ie.getStateChange());
        }
    }
}

