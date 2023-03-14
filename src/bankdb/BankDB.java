/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankdb;

import java.sql.SQLException;

/**
 *
 * @author Sam
 */
public class BankDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        DBConnector dbconn = new DBConnector();
        dbconn.createDB();
        dbconn.addCustomer("Debbie", 1, 1000);
    }
    
}
