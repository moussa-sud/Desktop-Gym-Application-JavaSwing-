/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQLConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import jdk.internal.org.jline.terminal.TerminalBuilder;

/**
 *
 * @author MOUSSA
 */
public class ConnectionProvider {
    
    static private String USER_NAME = "root" ;
    static private String PASSWORD  = "" ;
    static private String URL = "jdbc:mysql://localhost/moussatigui1";
   
    
    public static Connection getCon() throws ClassNotFoundException { 
        
        try {
            
//             In the modern JDBC implementations, DriverManager class in Java, can automatically 
//             locate and load the appropriate driver when a connection is requested. 
            
//        Class.forName("com.mysql.cj.jdbc.Driver"); 

        Connection con = DriverManager.getConnection(URL , USER_NAME,  PASSWORD );
        
        //// it's so important to return the connection 
        
        return con ;
        
    } catch ( SQLException ex) {
        
            System.out.println(ex.getMessage()); 
            
        return null;
    }
        
        
        
    }
    
}
