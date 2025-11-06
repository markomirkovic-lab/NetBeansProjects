package serie06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class S06_SQLiteDB
{
    public static void main(String[] args)
    {
        SQLiteTest();
    }
    
    
    
    public static void SQLiteTest()
    {
        String sql;
        int res;
        
        try
        {
            //Questo codice lo si esegue una sola volta a inizio programma e serve per caricare il driver
            Class.forName("org.sqlite.JDBC");
            
            
            
            //Connessione al DB.
            //Qui usiamo il try-with-resources che, a differenza del try, esegue in automatico il metodo close dell'oggetto passato in argomento.
            //try-with-resources è stato introdotto da Java 7.
            try(Connection c = DriverManager.getConnection("jdbc:sqlite:c:\\temp\\test.db"))
            {
            
                //Apertura di uno statement
                try( Statement stmt = c.createStatement() )
                {
                    //---------------------------------------------------------
                    //Eseguiamo qualche query senza risultati restituiti
                    
                    sql="DROP TABLE IF EXISTS ANAGRAFICO";
                    res=stmt.executeUpdate(sql);
                    System.out.println(res + ": " + sql);


                    sql = "CREATE TABLE ANAGRAFICO (" +
                          " NOME           TEXT    NOT NULL, " + 
                          " COGNOME        TEXT    NOT NULL, " + 
                          " PESO           REAL, " +
                          " ALTEZZA        INT, " +                            
                          " DATANASCITA    DATE," +
                          " ORA            TIME )";
                    res=stmt.executeUpdate(sql);
                    System.out.println(res + ": " + sql);

                    sql="DELETE FROM ANAGRAFICO";
                    res=stmt.executeUpdate(sql);
                    System.out.println(res + ": " + sql);
                    
                    sql="INSERT INTO ANAGRAFICO (NOME,COGNOME,PESO,ALTEZZA,DATANASCITA,ORA) VALUES ('Paolino', 'Paperino', 23,121,date('1934-06-09'),time('08:35'))";
                    res=stmt.executeUpdate(sql);
                    System.out.println(res + ": " + sql);

                    
                    
                    //---------------------------------------------------------
                    //Eseguiamo ora una query con risultati restituiti
                    sql = "SELECT * FROM ANAGRAFICO ORDER BY NOME";
                    try( ResultSet rs=stmt.executeQuery(sql) )
                    {
                        while(rs.next())
                        {
                            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getDouble(3) + " " + rs.getInt(4)+ " " + rs.getString(5)+ " " + rs.getString(6));
                        }            
                        //Close automatico grazie al try-with-resources. rs.close();
                    }
                    
                    
                    
                    //---------------------------------------------------------
                    //Inseriamo alcuni dati fittizi
                    sql="INSERT INTO ANAGRAFICO (NOME,COGNOME,PESO,ALTEZZA,DATANASCITA,ORA) VALUES ('Paperina', 'Duck', 21,119,date('1940-06-07'),time('11:23'))";
                    res=stmt.executeUpdate(sql);
                    sql="INSERT INTO ANAGRAFICO (NOME,COGNOME,PESO,ALTEZZA,DATANASCITA,ORA) VALUES ('Pippo', 'Goofy', 47,170,date('1932-05-02'),time('20:44'))";
                    res=stmt.executeUpdate(sql);
                    sql="INSERT INTO ANAGRAFICO (NOME,COGNOME,PESO,ALTEZZA,DATANASCITA,ORA) VALUES ('Topolino', 'Mouse', 17,115,date('1928-11-18'),time('14:59'))";
                    res=stmt.executeUpdate(sql);

                    sql="INSERT INTO ANAGRAFICO (NOME,COGNOME,PESO,ALTEZZA,DATANASCITA,ORA) VALUES ('Topolino', 'Mouse', 17,115,date('1928-11-18'),time('14:59'))";
                    res=stmt.executeUpdate(sql);

                    
                    //Selezioniamo tutti i dati
                    sql = "SELECT * FROM ANAGRAFICO ORDER BY NOME";
                    try( ResultSet rs=stmt.executeQuery(sql) )
                    {
                        //Ci spostiamo sul secondo record
                        rs.next();
                        //Ci spostiamo sul terzo record
                        rs.next();
                        //Ci spostiamo sul quarto record
                        rs.next();
                        
                        System.out.println(rs.getString(2) + " " + rs.getString("cognome"));

                        //Close automatico grazie al try-with-resources. rs.close();
                    }
                    
                    
                    
                    //---------------------------------------------------------
                    //SqlInjection demo
                    System.out.println("SQL Injection test");
                    String injection="xxx','xxx',0,0,'',''); delete from anagrafico; INSERT INTO ANAGRAFICO (NOME,COGNOME,PESO,ALTEZZA,DATANASCITA,ORA) VALUES ('Topolino";
                    sql="INSERT INTO ANAGRAFICO (NOME,COGNOME,PESO,ALTEZZA,DATANASCITA,ORA) VALUES ('" + injection + "', 'Mouse', 17,115,date('1928-11-18'),time('14:59'))";
                    System.out.println(sql);
                    res=stmt.executeUpdate(sql);
                    //Selelzioniamo tutti i dati
                    sql = "SELECT * FROM ANAGRAFICO ORDER BY NOME";
                    try( ResultSet rs=stmt.executeQuery(sql) )
                    {
                        while(rs.next())
                            System.out.println(rs.getString(2));

                        //Close automatico grazie al try-with-resources. rs.close();
                    }
                    
                    


                    //Chiusura dello statement
                    //Close automatico grazie al try-with-resources. stmt.close();
                }

                 
                
                //---------------------------------------------------------
                //Query precompilate
                sql="INSERT INTO ANAGRAFICO (NOME,COGNOME,PESO,ALTEZZA,DATANASCITA,ORA) VALUES (?, ?, ?, ?, date(?), time(?))";            
                try( PreparedStatement pcmd=c.prepareStatement(sql) )
                {            
                    pcmd.setString(1, "Paperon");       //Il quote della stringa è già eseguito dallo statement
                    pcmd.setString(2, "De' Paperoni");
                    pcmd.setDouble(3, 47.84);
                    pcmd.setInt(4, 118);
                    pcmd.setString(5, "1947-12-15");
                    pcmd.setString(6, "23:14");
                    pcmd.executeUpdate();

                    //Close automatico grazie al try-with-resources. pcmd.close();
                }                 
                
                
                
                
                
                //Chiudo la connessione al DB
                //Close automatico grazie al try-with-resources. c.close();
            }
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(Serie06_FullExample.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
}
