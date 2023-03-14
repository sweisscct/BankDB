/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sam
 */
public class DBConnector {
    // final = constant, cannot change
    private final String DB_URL = "jdbc:mysql://localhost";
    private final String USER = "pooa";
    private final String PASSWD = "pooa";
    
    public void createDB() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWD);
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE DATABASE bank;");
            System.out.println("DB Created");
            stmt.execute("USE bank;");
            stmt.execute("CREATE TABLE accounts ("
                    + "name VARCHAR(40),"
                    + "id INT(10) NOT NULL PRIMARY KEY,"
                    + "balance INT(10)"
                    + ");");
            System.out.println("Table Created.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    String dbName = "hospital";
//    String DB_URL = "jdbc:mysql://localhost/" + dbName;
//    String USER = "ooc2022";
//    String PASS = "ooc2022";  
    
//                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            Statement stmt = conn.createStatement();
//            stmt.execute("USE hospital;");
}
