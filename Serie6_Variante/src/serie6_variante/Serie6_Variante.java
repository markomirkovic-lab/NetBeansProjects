/*********************************************************************
 * 
 * 
 * 
 *      ATTENZIONE !!!!!!!!!!!!!!!!!!!!
 * 
 * 
 * 
 *      Cercate i commenti //ggg: 
 *      Indicano le differenze applicate al codice di base 
 * 
 * 
 * 
 *      ATTENZIONE !!!!!!!!!!!!!!!!!!!!
 * 
 * 
 *********************************************************************/





package serie6_variante;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Serie6_Variante
{
    private Connection c;
    private Statement stmt; 
    
    private JFrame frame;
    private JPanel upper;
    private JLabel lblTitolo;
    private JTextField txtTitolo;
    private JLabel lblEditore;
    private JComboBox cboEditore;   //ggg: Cambiato da text a combo
    private JLabel lblISBN;
    private JTextField txtISBN;
    private JLabel lblGenere;       //ggg: 4 nuovi campi
    private JComboBox cboGenere;
    private JLabel lblCopie;        
    private JTextField txtCopie;
    private JLabel lblRistampa;
    private JCheckBox chkRistampa;    
    private JButton btnInsert;
    private JButton btnSelect;
    private JPanel lower;
    private JTextArea txtResult;
    
    
    public Serie6_Variante()
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
                      " RISTAMPA       TEXT, " +    //ggg: aggiunto
                      " COPIE          INT, " +     //ggg: aggiunto                   
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
                sql="INSERT INTO GENERE (GENERE) VALUES ('Fumetti')";
                res=stmt.executeUpdate(sql);                
                
                
                //ggg: nuova tabella e rispettivi dati
                sql = "CREATE TABLE EDITORE (" +
                      " EDITORE         TEXT    NOT NULL)";
                res=stmt.executeUpdate(sql);

                sql="INSERT INTO EDITORE (EDITORE) VALUES ('Feltrinelli')";
                res=stmt.executeUpdate(sql);                
                sql="INSERT INTO EDITORE (EDITORE) VALUES ('Casagrande')";
                res=stmt.executeUpdate(sql);                
                sql="INSERT INTO EDITORE (EDITORE) VALUES ('Hoepli')";
                res=stmt.executeUpdate(sql);                
                sql="INSERT INTO EDITORE (EDITORE) VALUES ('Dado''')";
                res=stmt.executeUpdate(sql);                
            }
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(Serie6_Variante.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    
    private void createAndShowGUI() 
    {
        //Instanziamo un JFrame, lo divideremo in due pannelli        
        frame = new JFrame("JDBC Example");
        frame.setPreferredSize(new Dimension(300,300) );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //Pepariamo il pannello superiore
        upper=new JPanel(new GridLayout(7,2,5,5));      //ggg: Aggiunto due righe, passando da 5 a 7
        upper.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        lblTitolo=new JLabel("Titolo");
        txtTitolo=new JTextField("");
        upper.add(lblTitolo);
        upper.add(txtTitolo);
        
        //ggg: Cambio editore da text a combo
        /*
        lblEditore=new JLabel("Editore");
        txtEditore=new JTextField("");        
        upper.add(lblEditore);
        upper.add(txtEditore);        
        */
        lblEditore=new JLabel("Editore");
        cboEditore=new JComboBox(getEditori());        //ggg: copio la stessa soluzione usate per la combo del genere
        upper.add(lblEditore);
        upper.add(cboEditore);        

        lblISBN=new JLabel("ISBN");
        txtISBN=new JTextField("");        
        upper.add(lblISBN);
        upper.add(txtISBN);        
        
        lblGenere=new JLabel("Genere");
        cboGenere=new JComboBox(this.getGeneri());
        upper.add(lblGenere);
        upper.add(cboGenere);        
        
        //ggg: Aggiungo copie
        lblCopie=new JLabel("Numero copie");
        txtCopie=new JTextField();
        upper.add(lblCopie);
        upper.add(txtCopie);         
        
        //ggg: Aggiungo ristampa
        lblRistampa=new JLabel("Ristampa");
        chkRistampa=new JCheckBox();
        upper.add(lblRistampa);
        upper.add(chkRistampa);         
        
        
        
        btnInsert=new JButton("Insert");
        btnInsert.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                String titolo=txtTitolo.getText().trim().replaceAll("'", "''");
                String editore=((String)(cboEditore.getSelectedItem())).replaceAll("'", "''");  //ggg: adattato per il combo
                String isbn=txtISBN.getText().trim();
                String genere=((String)(cboGenere.getSelectedItem())).replaceAll("'", "''");
                
                String copie=txtCopie.getText().trim(); //ggg: aggiunto
                String ristampa=chkRistampa.isSelected() ? "1" : "N";  //ggg: gestione del selected
                
                /* //ggg: Chi ha usato un int in banca dati, dovrebbe scrivere una delle due varianti seguenti
                
                    boolean ristampaChk=chkRistampa.isSelected();                
                    String ristampa;
                    if(ristampaChk)
                        ristampa="1";
                    else
                        ristampa="0";
                
                
                    oppure
                
                    String ristampa=chkRistampa.isSelected() ? "1" : "0";
                */
                
                
                
                //Primo controllo: i campi obbgligatori
                if(titolo.equals("") || 
                   editore.equals("") ||
                   isbn.equals("") ||
                   genere.equals("") ||
                   ristampa.equals("") ||   //ggg: Aggiunto
                   copie.equals("") )       //ggg: Aggiunto
                    JOptionPane.showMessageDialog(frame, "Tutti i campi sono obbligatori", "Campi obbligatori", JOptionPane.WARNING_MESSAGE);
                else
                {
                    try
                    {
                        int i=Integer.parseInt(isbn);
                        int c=Integer.parseInt(copie);  //ggg: aggiunto
                        
                        stmt.executeUpdate("INSERT INTO LIBRO (TITOLO,EDITORE,ISBN,GENERE,RISTAMPA,COPIE) VALUES (" +
                                           "'" + titolo + "'" + 
                                           ",'" + editore + "'" + 
                                           "," + i + 
                                           ",'" + genere + "'" +
                                           ",'" + ristampa + "'" +   //ggg: aggiunto. Chi ha usato un int in banca dati scriverà: "," + ristampa +
                                           "," + c + "" +        //ggg: aggiunto
                                           ")");
                    }
                    catch(NumberFormatException nfe)
                    {
                        JOptionPane.showMessageDialog(frame, "ISBN e copie devono essere numerici", "Formato campo", JOptionPane.WARNING_MESSAGE);
                    }
                    catch(SQLException ex)
                    {
                        JOptionPane.showMessageDialog(frame, "INSERT Fallito", "DB Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println(ex.getMessage());
                    }
                }
                
                txtTitolo.setText("");
                cboEditore.setSelectedItem("");                //ggg: adattato
                txtISBN.setText("");
                cboGenere.setSelectedItem("");                
                chkRistampa.setSelected(false);                //ggg: aggiunto
                txtCopie.setText("");                          //ggg: aggiunto
            }            
        });
        
        btnSelect=new JButton("Select");
        btnSelect.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                String titolo=txtTitolo.getText().trim().replaceAll("'", "''");
                String editore=((String)(cboEditore.getSelectedItem())).replaceAll("'", "''");  //ggg: adattato
                String isbn=txtISBN.getText().trim();
                String genere=((String)(cboGenere.getSelectedItem())).replaceAll("'", "''");
                
                String copie=txtCopie.getText().trim(); //ggg: aggiunto. Copiato dalla insert                
                String ristampa=chkRistampa.isSelected() ? "S" : "N";  //ggg: gestione del selected. Copiato dalla insert                                

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
                    if(!copie.equals(""))   //ggg: copiato e adattato da ISBN
                    {
                        int c=Integer.parseInt(copie);
                        sql+=" and copie =" + c + "";
                    }
                    if(!genere.equals(""))
                        sql+=" and genere = '" + genere + "'";                    
                    
                    /* //ggg: Nota stilistica.
                              Di solito non si usa una checkbox come filtro in quanto avrà sempre un valore (o true o false) 
                              mentre generalmente l'utente vuole vedere tutti i valori. 
                              Sarebbe quindi preferibile usare un menu a discesa. 
                    */
                    if(!ristampa.equals(""))    //ggg: inserito
                        sql+=" and ristampa like '%" + ristampa + "%'";                    
                    
                    
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next())
                    {
                        //ggg: inserito nuovi campi. Badate all'uso del ternario
                        text+=rs.getString("titolo") 
                              + " " + rs.getString("editore") 
                              + " " + rs.getInt("isbn") 
                              + " " + rs.getString("genere") 
                              + " " + rs.getString("copie") 
                              + " " + (rs.getString("ristampa").equals("S") ? "Ristampa" : "")  //ggg: Notate l'uso dell'operatore ternario
                              + "\n";
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
            rs.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Serie6_Variante.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        return( al.toArray(new String[al.size()]) );
    }
    
    
    //ggg: Copiata pari pari dall getGeneri
    public String[] getEditori()
    {
        ArrayList<String> al=new ArrayList();
        
        al.add("");
        
        try
        {
            String sql="select editore from editore order by editore";  //ggg: Adattato query
            ResultSet rs=stmt.executeQuery(sql);

            while( rs.next() )
            {
                al.add( rs.getString("editore") );      //ggg: Adattato campo
            }
            rs.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Serie6_Variante.class.getName()).log(Level.SEVERE, null, ex);
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
                new Serie6_Variante();                
            }
        });        
    }
}
