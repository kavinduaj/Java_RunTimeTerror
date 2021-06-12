/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.*;

public class Database {
    
    
    private static Connection dbCon;
    

    public static Connection Connect()
    {
        try{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        dbCon = DriverManager.getConnection ("jdbc:mysql://127.0.0.1:3306/Java","root","0312240771");
        System.out.print("Succeed");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Not Detected");
        } catch (SQLException ex) {
            System.out.println("Cannot Connect to the Database " + ex.getErrorCode());
        }
        return dbCon;
    }
    
    
}
