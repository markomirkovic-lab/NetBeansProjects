/*****************************************
 * 
 * Cercate la stringa "//ggg: Soluzione"
 * 
 *****************************************/
package serie06;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Es6_Soluzione
{
    private Connection c;
    private Statement stmt; 
    
    private JFrame frame;
    private JPanel upper;
    private JLabel lblTitolo;
    private JTextField txtTitolo;
    private JLabel lblEditore;
    private JComboBox cboEditore;       //ggg: Soluzione. Converto il textfield in combobox. private JTextField txtEditore;
    private JLabel lblISBN;
    private JTextField txtISBN;
    private JLabel lblRistampa;         //ggg: Soluzione. Aggiunto label ristampa
    private JCheckBox chkRistampa;      //ggg: Soluzione. Aggiunto checkbox ristampa
    private JLabel lblGenere;
    private JComboBox cboGenere;
    private JButton btnInsert;
    private JButton btnSelect;
    private JButton btnDelete;          //ggg: Soluzione. Aggiunto pulsante elimina
    
    private JPanel lower;
    private JTextArea txtResult;
    
    
    public Es6_Soluzione()
    {
        this.prepareOrOpenDB();
        
        
        this.createAndShowGUI();
    }
    
    
    public void prepareOrOpenDB()
    {
        String sql;
        int res;
        
        try
        {
            Class.forName("org.sqlite.JDBC");
                        
            //Controlliamo se esiste
            boolean create;
            File db=new File("SwingJDBC.db");
            
            if(db.exists())
                create=false;
            else
                create=true;
            
            c = DriverManager.getConnection("jdbc:sqlite:SwingJDBC.db");

            stmt = c.createStatement();

            if(create)
            {                    
                sql = "CREATE TABLE LIBRO (" +
                      " TITOLO         TEXT    NOT NULL, " + 
                      " EDITORE        TEXT    NOT NULL, " + 
                      " ISBN           LONG, " +
                      " RISTAMPA       INT, " +     //ggg: Soluzione agigungo un nuovo campo
                      " GENERE         TEXT)";
                res=stmt.executeUpdate(sql);


                sql = "CREATE TABLE GENERE (" +
                      " GENERE         TEXT    NOT NULL)";
                res=stmt.executeUpdate(sql);


                sql="INSERT INTO GENERE (GENERE) VALUES ('Giallo')";
                res=stmt.executeUpdate(sql);
                sql="INSERT INTO GENERE (GENERE) VALUES ('Fantasy')";
                res=stmt.executeUpdate(sql);
                sql="INSERT INTO GENERE (GENERE) VALUES ('Fantascienza')";
                res=stmt.executeUpdate(sql);
                sql="INSERT INTO GENERE (GENERE) VALUES ('Thriller')";
                res=stmt.executeUpdate(sql);
                sql="INSERT INTO GENERE (GENERE) VALUES ('Storico')";
                res=stmt.executeUpdate(sql);
                
                
                //ggg: Soluzione       
                //Creiamo la tabella degli editori
                sql = "CREATE TABLE EDITORE (" +
                      " EDITORE         TEXT    NOT NULL)";
                res=stmt.executeUpdate(sql);

                //La popoliamo
                sql="INSERT INTO EDITORE (EDITORE) VALUES ('Mondadori')";
                res=stmt.executeUpdate(sql);
                sql="INSERT INTO EDITORE (EDITORE) VALUES ('Feltrinelli')";
                res=stmt.executeUpdate(sql);
                sql="INSERT INTO EDITORE (EDITORE) VALUES ('Hoepli')";
                res=stmt.executeUpdate(sql);
                sql="INSERT INTO EDITORE (EDITORE) VALUES ('Einaudi')";
                res=stmt.executeUpdate(sql);
            }
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(Es6_Soluzione.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    
    private void createAndShowGUI() 
    {
        //Instanziamo un JFrame, lo divideremo in due pannelli        
        frame = new JFrame("JDBC Example");
        frame.setPreferredSize(new Dimension(300,300) );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //Pepariamo il pannello superiore
        upper=new JPanel(new GridLayout(7,2,5,5));  //ggg: Soluzione. portato le righe da 5 a 7, per accogliere anche la ristampa e il pulsante delete
        upper.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        lblTitolo=new JLabel("Titolo");
        txtTitolo=new JTextField("");
        upper.add(lblTitolo);
        upper.add(txtTitolo);
        
        lblEditore=new JLabel("Editore");                
        cboEditore=new JComboBox(this.getCombo("EDITORE", "EDITORE"));      //ggg: Soluzione. Converto il textfiled in combobox. txtEditore=new JTextField("");
        upper.add(lblEditore);
        upper.add(cboEditore);        

        lblISBN=new JLabel("ISBN");
        txtISBN=new JTextField("");        
        upper.add(lblISBN);
        upper.add(txtISBN);        

        lblRistampa=new JLabel("Ristampa");
        chkRistampa=new JCheckBox("");        
        upper.add(lblRistampa);
        upper.add(chkRistampa);        

        
        lblGenere=new JLabel("Genere");
        cboGenere=new JComboBox(this.getCombo("GENERE", "GENERE"));      //ggg: Soluzione. Chiamo il nuvo metodo generico. cboGenere=new JComboBox(this.getGeneri());
        upper.add(lblGenere);
        upper.add(cboGenere);        
        
        btnInsert=new JButton("Insert");
        btnInsert.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                String titolo=txtTitolo.getText().trim().replaceAll("'", "''");
                String editore=((String)(cboEditore.getSelectedItem())).replaceAll("'", "''");   //ggg: Soluzione. Adatto txtEditroe in cboEditore. txtEditroe.getText().trim().replaceAll("'", "''"); 
                String isbn=txtISBN.getText().trim();
                int ristampa=chkRistampa.isSelected() ? 1 : 0;      //ggg: Soluzione. Inserito la gestione del checkbox
                String genere=((String)(cboGenere.getSelectedItem())).replaceAll("'", "''");
                
                //Primo controllo: i campi obbgligatori
                if(titolo.equals("") || 
                   editore.equals("") ||
                   isbn.equals("") ||
                   genere.equals(""))
                    JOptionPane.showMessageDialog(frame, "Tutti i campi sono obbligatori", "Campi obbligatori", JOptionPane.WARNING_MESSAGE);
                else
                {
                    try
                    {
                        int i=Integer.parseInt(isbn);
                        
                        stmt.executeUpdate("INSERT INTO LIBRO (TITOLO,EDITORE,ISBN,RISTAMPA,GENERE) VALUES (" +     //ggg: Soluzione. Aggiunto RISTAMPA
                                           "'" + titolo + "'" + 
                                           ",'" + editore + "'" + 
                                           "," + i +
                                           "," + ristampa  +   //ggg: Soluzione. Aggiunto Ristampa
                                           ",'" + genere + "'" +
                                           ")");
                    }
                    catch(NumberFormatException nfe)
                    {
                        JOptionPane.showMessageDialog(frame, "ISBN deve essere numerico", "Formato campo", JOptionPane.WARNING_MESSAGE);
                    }
                    catch (SQLException ex)
                    {
                        JOptionPane.showMessageDialog(frame, "INSERT Fallito", "DB Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println(ex.getMessage());
                    }
                }
                
                txtTitolo.setText("");
                cboEditore.setSelectedItem("");     //ggg: Soluzione. Adatto txtEditore in cboEditore. txtEditore.setText("");
                txtISBN.setText("");
                chkRistampa.setSelected(false);     //ggg: Soluzione. Reset della ristampa
                cboGenere.setSelectedItem("");                
            }            
        });
        
        btnSelect=new JButton("Select");
        btnSelect.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                String titolo=txtTitolo.getText().trim().replaceAll("'", "''");
                String editore=((String)(cboEditore.getSelectedItem())).replaceAll("'", "''");   //ggg: Soluzione. Adatto txtEditore in cboEditore. txtEditore.getText().trim().replaceAll("'", "''");
                String isbn=txtISBN.getText().trim();
                int ristampa=chkRistampa.isSelected() ? 1 : 0;      //ggg: Soluzione. Inserito la gestione del checkbox
                String genere=((String)(cboGenere.getSelectedItem())).replaceAll("'", "''");
                
                String text="";
                
                try
                {
                    String sql="SELECT * FROM LIBRO WHERE 1=1";
                    if(!titolo.equals(""))
                        sql+=" and titolo like '%" + titolo + "%'";
                    if(!editore.equals(""))
                        sql+=" and editore like '%" + editore + "%'";
                    if(!isbn.equals(""))
                    {
                        int i=Integer.parseInt(isbn);
                        sql+=" and isbn =" + i + "";
                    }
                    if(ristampa==1)                //ggg: Soluzione. Aggiunto filtro per ristampa
                        sql+=" and ristampa=1";   
                    if(!genere.equals(""))
                        sql+=" and genere = '" + genere + "'";                    
                    
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next())
                    {
                        //ggg: Soluzione. --------------------------------------------------------------------------*
                        text+=rs.getString("titolo") +" "+ rs.getString("editore") + " " + rs.getInt("isbn") +" "+ (rs.getInt("ristampa")==1 ? "Ristampa" : "") +" "+ rs.getString("genere") + "\n";
                    }            
                    rs.close();
                    
                    txtResult.setText(text);
                }
                catch(NumberFormatException nfe)
                {
                    JOptionPane.showMessageDialog(frame, "ISBN deve essere numerico", "Formato campo", JOptionPane.WARNING_MESSAGE);
                }
                catch (SQLException ex)
                {
                    JOptionPane.showMessageDialog(frame, "INSERT Fallito", "DB Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println(ex.getMessage());
                }
            }        
        });
        
        
        btnDelete=new JButton("Delete All");        //ggg: Soluzione. Aggiunto Delete
        btnDelete.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    String[] options = {"Si", "No"};
                    int n = JOptionPane.showOptionDialog(frame, "Sicuri di volere eliminare tutti i record", "Delete", JOptionPane.YES_NO_OPTION, 
                                                                                                                       JOptionPane.QUESTION_MESSAGE, 
                                                                                                                       null,
                                                                                                                       options, 
                                                                                                                       options[1]);                    
                    
                    if(n==0)
                    {                                        
                        int deletedRecords=stmt.executeUpdate("DELETE FROM LIBRO");
                    
                        JOptionPane.showMessageDialog(frame, "Eliminati: " + deletedRecords + " record", "Delete", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                catch (SQLException ex)
                {
                    JOptionPane.showMessageDialog(frame, "Delete Fallito", "DB Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println(ex.getMessage());
                }
            }
        });        
        
        upper.add(btnInsert);
        upper.add(btnSelect);         
        upper.add(btnDelete);         
        
        
        //Prepariamo il pannello inferiore
        JPanel lower=new JPanel(new BorderLayout());        
        lower.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));
        
        txtResult=new JTextArea(10,10);   //10 righe almeno
        lower.add(txtResult, BorderLayout.CENTER);
        
        
        //Aggiungiamo i due pannelli al JFrame
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.PAGE_AXIS));
        frame.getContentPane().add(upper);
        frame.getContentPane().add(lower);
        
        
        

        frame.pack();
        frame.setVisible(true);        
    }

    
    //ggg: Soluzione. Sostituito il metodo getGeneri con uno generico
    //public String[] getGeneri()
    public String[] getCombo(String tabella, String attributo)
    {
        ArrayList<String> al=new ArrayList();
        
        al.add("");
        
        try
        {
            String sql="select " + attributo + " from " + tabella + " order by " + attributo;
            ResultSet rs=stmt.executeQuery(sql);

            while( rs.next() )
            {
                al.add( rs.getString(attributo) );
            }
            rs.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Es6_Soluzione.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        return( al.toArray(new String[al.size()]) );
    }
    
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new Es6_Soluzione();                
            }
        });        
    }
    
}

