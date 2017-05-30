/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author xavier
 */
public class Database {
    private static Connection connection;
    public static Connection getConnection(){
        if(connection == null){
            try{
                String url ="jdbc:mysql1://localhost3306/";
            }catch(SQLException e){
            }
        }
    }
}
