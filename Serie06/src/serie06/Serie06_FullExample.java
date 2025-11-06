package serie06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Serie06_FullExample
{
    public static void provaSQLite()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            
            //Se il db non esiste lo crea
            //Connection c = DriverManager.getConnection("jdbc:sqlite:c:\\temp\\test.db");
            Connection c = DriverManager.getConnection("jdbc:sqlite:test.db");
            
            
            Statement stmt = c.createStatement();
            
            String sql="DROP IF EXIST TABLE ANAGRAFICO";
            stmt.executeUpdate(sql);

            
            sql = "CREATE TABLE ANAGRAFICO" +
                  " (ID INT PRIMARY KEY     NOT NULL," +
                  " NOME           TEXT    NOT NULL, " + 
                  " COGNOME        TEXT    NOT NULL, " + 
                  " DATANASCITA    DATE," +
                  " ORA            TIME )";
            stmt.executeUpdate(sql);       
            
            
            sql="DELETE FROM ANAGRAFICO";
            stmt.executeUpdate(sql);
            
            sql = "INSERT INTO ANAGRAFICO (ID,NOME,COGNOME,DATANASCITA,ORA) " +
                  "VALUES (1, 'Pinco', 'Pallino', date('2005-11-23'), time('10:23:44') )"; 
            stmt.executeUpdate(sql);
            
            
            sql="SELECT * FROM ANAGRAFICO";
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while ( rs.next() ) 
            {
                int id = rs.getInt("id");
                String  nome = rs.getString("nome");
                String  cognome = rs.getString("cognome");
                String dt  = rs.getString("datanascita");
                String tm  = rs.getString("ora");
                
                System.out.println(id + ": " + nome + " " + cognome + " " + dt + " " + tm);
            }
            rs.close();    //Necessario il close in quanto non si sta usando un try-with-resources.        
            
            c.close();     //Necessario il close in quanto non si sta usando un try-with-resources.        
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(Serie06_FullExample.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
    }
    

    public static void provaMySQL()
    {
        try
        {
            //------------------------------------------------------------------            
            // Passo 1: Caricare il driver
            // Aggiungere la libreria "MySQL JDBC Driver" tramite il comando
            // "Add Library" del context-menu di "Libraries" nel tab "Project".            
            
            
            //------------------------------------------------------------------
            // Passo 2: Registriamo il driver, servirà a inizializzarlo            
            String driver="com.mysql.jdbc.Driver";
            Class.forName(driver);            
            
            
            //------------------------------------------------------------------
            //Connessione al DB
            String url="jdbc:mysql://127.0.0.1:3306/test";            
            Connection con=DriverManager.getConnection(url, "test", "test");


            
            //------------------------------------------------------------------
            //Oggetto Statement per eseguire query non parametriche
            try(Statement cmd=con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE))
            {
                //--------------------------------------------------------------------
                //executeUpdate(): da usare per eseguire delle query DML: INSERT, UPDATE, DELETE
                //                 Oppure delle DDL CREATE TABLE, ...
                cmd.executeUpdate("DELETE FROM tabella");
                System.out.println(cmd.getUpdateCount() + " rows affected");

                //Elimino e ricreo una stored procedure
                cmd.executeUpdate("DROP PROCEDURE IF EXISTS setAltezza");                                
                cmd.executeUpdate("CREATE PROCEDURE `setAltezza`(IN `paramNome` VARCHAR(20), IN `paramAltezza` INT) UPDATE tabella set altezza=paramAltezza WHERE nome = paramNome;");
                cmd.executeUpdate("DROP FUNCTION IF EXISTS getAltezza");
                cmd.executeUpdate("CREATE FUNCTION `getAltezza`(`paramNome` VARCHAR(20)) RETURNS INT UNSIGNED NOT DETERMINISTIC NO SQL SQL SECURITY DEFINER BEGIN DECLARE ret INT; SELECT altezza INTO ret FROM tabella WHERE nome=paramNome; RETURN(ret); END ");

                //Faccio un po' di insert
                for(int i=0; i<10; i++)
                    cmd.executeUpdate("INSERT INTO TABELLA (NOME, ALTEZZA, PESO) VALUES ('Prova" + i + "',170,85.7)");

                
                //------------------------------------------------------------------
                //executeQuery(): da usare per query SELECT
                ResultSet rs=cmd.executeQuery("SELECT * FROM tabella");              
                while(rs.next())
                {
                    System.out.println(rs.getString("nome") + " " + rs.getInt("altezza") + " " + rs.getDouble("peso"));
                    //                 rs.getString(1)              rs.getInt(2)                 rs.getDouble(3)

                    //Se lo Statement è di tipo ResultSet.CONCUR_UPDATABLE si può fare l'update
                    rs.updateInt( "altezza", rs.getInt("altezza")+1 );
                    //                       rs.getInt(2)
                    rs.updateRow();

                    System.out.println("------------------------------------");
                }            
                rs.close();     //Necessario il close in quanto non si sta usando un try-with-resources.        
                
                //close non necessario in quanto si usa il try-with-resources. cmd.close();           
            }


            
            //--------------------------------------------------------------------
            //executeUpdate(): da usare per eseguire delle query parametriche 
            //                 dopo aver introdotto i valori con setType
            //                 DML: INSERT, UPDATE, DELETE
            //                 Oppure delle DDL CREATE TABLE, ...
            String pqry="INSERT INTO TABELLA (NOME, ALTEZZA, PESO) VALUES (? , ?, ?)";            
            try(PreparedStatement pcmd=con.prepareStatement(pqry))
            {            
                //--------------------------------------------------------------------
                //Per eseguire delle query DML: INSERT, UPDATE, DELETE
                //Oppure delle DDL: CREATE TABLE, ...
                //usare executeUpdate() dopo aver introdotto i valori con setType
                for(int i=100; i<110; i++)
                {
                    pcmd.setString(1, "Prova" + i);
                    pcmd.setInt(2, 222);
                    pcmd.setDouble(3, 47.84);
                    pcmd.executeUpdate();
                }
                
                //close automatico in quanto si sta usando un try-with-resource. pcmd.close();
            }            
            
            //------------------------------------------------------------------
            //usare executeQuery() dopo aver introdotto i valori con setType per le SELECT           
            pqry="SELECT * FROM tabella WHERE nome LIKE ? AND altezza>?";
            try(PreparedStatement pcmd=con.prepareStatement(pqry))
            {
                pcmd.setString(1, "%5");
                pcmd.setInt(2, 13);
                ResultSet prs=pcmd.executeQuery();              
                while(prs.next())
                {
                    System.out.println(prs.getString("nome") + " " + prs.getInt("altezza") + " " + prs.getDouble("peso"));
                    System.out.println("------------------------------------");
                }            
                
                //Chiudo lo statement
                prs.close();     //Necessario il close in quanto non si sta usando un try-with-resource.    
                
                //close automatico in quanto si sta usando un try-with-resource. pcmd.close();
            }
            
            
            //--------------------------------------------------------------------
            //Stored procedures
            try(CallableStatement ccmd = con.prepareCall("{call setAltezza(?, ?)}"))
            {
                ccmd.setString("paramNome", "Prova7");  //ccmd.setString(1, "Prova7");
                ccmd.setInt("paramAltezza", 100);       //ccmd.setInt(2, 100);
                ccmd.execute();
                System.out.println("Chiamato stored procedure");
                
                //close automatico in quanto si sta usando un try-with-resource. ccmd.close();
            }

            try(CallableStatement ccmd = con.prepareCall("{?=call getAltezza(?)}"))
            {                
                ccmd.registerOutParameter(1, Types.INTEGER); 
                ccmd.setString(2, "Prova7");                  
                ccmd.execute();
                System.out.println("Chiamato stored function " + ccmd.getInt(1));
                
                //close automatico in quanto si sta usando un try-with-resource. ccmd.close();
            }      
            
            
            
            //----------------------------------------------------------------
            //Chiusura connessioni            
            con.close();    //Necessario il close in quanto non si sta usando un try-with-resource. 
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(Serie06_FullExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public static void performanceTest() 
    {        
        //Scopo del metodo e di misurare in maniera empirica le performances di accesso al db.
        
        try            
        {
            String driver="com.mysql.jdbc.Driver";
            Class.forName(driver);

            String url="jdbc:mysql://127.0.0.1:3306/";            
            Connection con=DriverManager.getConnection(url, "test", "test");

            
            //Creaiamo la struttura
            try(Statement cmd=con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE))
            {
                String sql;
                long start;
                
                sql="DROP DATABASE IF EXISTS testperformance";
                cmd.executeUpdate(sql);
                
                sql="CREATE DATABASE testperformance";
                cmd.executeUpdate(sql);

                sql="USE testperformance";
                cmd.executeUpdate(sql);
                
                sql="CREATE TABLE IF NOT EXISTS `tabella` (" +
                    "   `nome` varchar(20) NOT NULL," +
                    "   `altezza` int(11) NOT NULL," +
                    "   `peso` double NOT NULL" +
                    ") ENGINE=InnoDB DEFAULT CHARSET=latin1";
                cmd.executeUpdate(sql);                        
                
                sql="DROP FUNCTION IF EXISTS getAltezza";
                cmd.executeUpdate(sql);
                
                sql="CREATE FUNCTION `getAltezza`(`paramNome` VARCHAR(20))" +
                    " RETURNS INT UNSIGNED NOT DETERMINISTIC NO SQL SQL SECURITY DEFINER" +
                    " BEGIN" + 
                    "     DECLARE ret INT;"+
                    "     SELECT altezza INTO ret FROM tabella WHERE nome=paramNome;" +
                    "     RETURN(ret);" +
                    " END ";
                cmd.executeUpdate(sql);


                start=System.currentTimeMillis();
                for(int i=0; i<10000; i++)
                {
                    if(i%500==0)
                        System.out.println(i);
                    cmd.executeUpdate("INSERT INTO TABELLA (NOME, ALTEZZA, PESO) VALUES ('Prova" + i + "',170,85.7)");
                }
                System.out.println("Inserito non parametrico: " + (System.currentTimeMillis()-start));
                
                cmd.executeUpdate("delete from tabella");

                try(PreparedStatement pcmd=con.prepareStatement("INSERT INTO TABELLA (NOME, ALTEZZA, PESO) VALUES (?, ?, ?)"))
                {
                    start=System.currentTimeMillis();
                    
                    for(int i=0; i<10000; i++)
                    {
                        if(i%500==0)
                            System.out.println(i);
                        
                        pcmd.setString(1, "Prova" + i);
                        pcmd.setInt(2, 170);
                        pcmd.setDouble(3, 85.7);
                        pcmd.execute();
                    }
                    
                    System.out.println("Inserito parametrico: " + (System.currentTimeMillis()-start));
                    
                    //close automatico in quanto si sta usando un try-with-resource.  pcmd.close();                   
                }
               
                
                //close automatico in quanto si sta usando un try-with-resource. cmd.close();                
            }

            
            //------------------------------------------------------------------
            //Oggetto Statement per eseguire query non parametriche
            try(Statement cmd=con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE))
            {        
                int tmp;

                long start=System.currentTimeMillis();
                
                for(int i=0; i<2500; i++)
                {
                    if(i%500==0)
                        System.out.println(i);                    

                    //Perfomance test
                    ResultSet rs=cmd.executeQuery("SELECT altezza FROM tabella where nome='Prova7'");              
                    while(rs.next())
                    {
                        tmp=rs.getInt("altezza");
                    }            
                    rs.close();     //Necessario il close in quanto non si sta usando un try-with-resource.          
                }
                
                System.out.println("Normale: " + (System.currentTimeMillis()-start));
            }
            
            
            //------------------------------------------------------------------
            //usare executeQuery() dopo aver introdotto i valori con setType per le SELECT           
            try(PreparedStatement pcmd=con.prepareStatement("SELECT altezza FROM tabella where nome=?"))
            {
                int tmp;

                long start=System.currentTimeMillis();
                
                for(int i=0; i<2500; i++)
                {
                    if(i%500==0)
                        System.out.println(i);
                    
                    pcmd.setString(1, "Prova7");
                    ResultSet prs=pcmd.executeQuery();              
                    while(prs.next())
                    {
                        tmp=prs.getInt("altezza");
                    }            
                
                    //Chiudo lo statement
                    prs.close();    //Necessario il close in quanto non si sta usando un try-with-resource.        
                }
                System.out.println("Parametrica: " + (System.currentTimeMillis()-start));
                
                //close automatico in quanto si sta usando un try-with-resource. pcmd.close();
            } 
            
            
            
            //------------------------------------------------------------------
            //Stored procedures           
            try(CallableStatement ccmd = con.prepareCall("{?=call getAltezza(?)}"))
            {                
                int tmp;

                long start=System.currentTimeMillis();
                ccmd.registerOutParameter(1, Types.INTEGER); 
                for(int i=0; i<2500; i++)
                {
                    if(i%500==0)
                        System.out.println(i);                                 
                    
                    ccmd.setString(2, "Prova7");
                    ccmd.execute();
                    tmp=ccmd.getInt(1);
                }                
                
                System.out.println("Stored procedure: " + (System.currentTimeMillis()-start));                
                
                //close automatico in quanto si sta usando un try-with-resource. ccmd.close();                
            }             
            
            con.close();    //Necessario il close in quanto non si sta usando un try-with-resource. 
            
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Serie06_FullExample.class.getName()).log(Level.SEVERE, null, ex);
        }        
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(Serie06_FullExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public static void main(String[] args) 
    {
        performanceTest();        
        provaSQLite();
        provaMySQL();
    }
    
    
}
