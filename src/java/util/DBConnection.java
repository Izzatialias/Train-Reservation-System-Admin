/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HANIPUTERI
 */
public class DBConnection {
    public static Connection createConnection(){
        Connection conn = null;
        String driver = "org.apache.derby.jdbc.ClientDriver";//Java db driver
        String url = "jdbc:derby://localhost:1527/trainDB";//Java db
        String dbUser = "root", dbPassword ="root";
        
        try {
            try {
                Class.forName(driver);
            }
            catch (ClassNotFoundException e){
                e.printStackTrace();
            }
            //connect to db
            conn = DriverManager.getConnection(url, dbUser, dbPassword);
            System.out.println("Printing connection object "+conn);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
