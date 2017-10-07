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
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/banking","root","root");
        return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            e.printStackTrace();
        }
        return null;
    }
}
