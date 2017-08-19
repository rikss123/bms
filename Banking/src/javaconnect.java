/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan Gupta
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection con=null;
    public static Connection ConnecrDb()
    {
        try{
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Rohan Gupta\\Documents\\NetBeansProjects\\Banking\\Banks.db");
        return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
        return null;
    }
}
