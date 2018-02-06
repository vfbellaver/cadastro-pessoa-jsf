/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vagner Bellaver
 */
public class ConnectionFactory {
     String driver = "jdbc:mysql";
    String url = "localhost";
    String port = "3306";
    String database = "bd_jsf";
    String user = "root";
    String password = "";

    public Connection getConnection(){
        try {
            return DriverManager.getConnection(driver+"://"+url+":"+port+"/"+database,user,password);
        } catch (SQLException ex) {
            System.out.println("ERRO AO CONECTAR "+ex.getMessage());
            return null;
        }
         
    }
    
}
