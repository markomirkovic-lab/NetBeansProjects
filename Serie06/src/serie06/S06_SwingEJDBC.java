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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class S06_SwingEJDBC
{
    private Connection c;
    private Statement stmt; 
    
    private JFrame frame;
    private JPanel upper;
    private JLabel lblTitolo;
    private JTextField txtTitolo;
    private JLabel lblEditore;
    private JTextField txtEditore;
    private JLabel lblISBN;
    private JTextField txtISBN;
    private JLabel lblGenere;
    private JComboBox cboGenere;
    private JButton btnInsert;
    private JButton btnSelect;
    private JPanel lower;
    private JTextArea txtResult;
    
    
    public S06_SwingEJDBC()
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
            }
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(Serie06_FullExample.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    
    private void createAndShowGUI() 
    {
        //Instanziamo un JFrame, lo divideremo in due pannelli        
        frame = new JFrame("JDBC Example");
        frame.setPreferredSize(new Dimension(300,300) );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //Pepariamo il pannello superiore
        upper=new JPanel(new GridLayout(5,2,5,5));
        upper.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        lblTitolo=new JLabel("Titolo");
        txtTitolo=new JTextField("");
        upper.add(lblTitolo);
        upper.add(txtTitolo);
        
        lblEditore=new JLabel("Editore");
        txtEditore=new JTextField("");        
        upper.add(lblEditore);
        upper.add(txtEditore);        

        lblISBN=new JLabel("ISBN");
        txtISBN=new JTextField("");        
        upper.add(lblISBN);
        upper.add(txtISBN);        
        
        lblGenere=new JLabel("Genere");
        cboGenere=new JComboBox(this.getGeneri());
        upper.add(lblGenere);
        upper.add(cboGenere);        
        
        btnInsert=new JButton("Insert");
        btnInsert.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                String titolo=txtTitolo.getText().trim().replaceAll("'", "''");
                String editore=txtEditore.getText().trim().replaceAll("'", "''");
                String isbn=txtISBN.getText().trim();
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
                        
                        stmt.executeUpdate("INSERT INTO LIBRO (TITOLO,EDITORE,ISBN,GENERE) VALUES (" +
                                           "'" + titolo + "'" + 
                                           ",'" + editore + "'" + 
                                           "," + i + 
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
                txtEditore.setText("");
                txtISBN.setText("");
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
                String editore=txtEditore.getText().trim().replaceAll("'", "''");
                String isbn=txtISBN.getText().trim();
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
                    if(!genere.equals(""))
                        sql+=" and genere = '" + genere + "'";                    
                    
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next())
                    {
                        text+=rs.getString("titolo") +" "+ rs.getString("editore") + " " + rs.getInt("isbn") +" "+ rs.getString("genere") + "\n";
                    }            
                    rs.close();     //Necessario il close in quanto non si usa il try-with-resources
                    
                    //Versione con il try-with-resources
                    /*
                    try(ResultSet rs=stmt.executeQuery(sql))
                    {
                        while(rs.next())
                        {
                            text+=rs.getString("titolo") +" "+ rs.getString("editore") + " " + rs.getInt("isbn") +" "+ rs.getString("genere") + "\n";
                        }
                    }
                    */
                        
                    
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
        
        upper.add(btnInsert);
        upper.add(btnSelect);         
        
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

    
    public String[] getGeneri()
    {
        ArrayList<String> al=new ArrayList();
        
        al.add("");
        
        try
        {
            String sql="select genere from genere order by genere";
            ResultSet rs=stmt.executeQuery(sql);

            while( rs.next() )
            {
                al.add( rs.getString("genere") );
            }
            rs.close();     //Necessario il close in quanto non si usa il try-with-resources
        }
        catch (SQLException ex)
        {
            Logger.getLogger(S06_SwingEJDBC.class.getName()).log(Level.SEVERE, null, ex);
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
                new S06_SwingEJDBC();                
            }
        });        
    }
    
}
