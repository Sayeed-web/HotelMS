/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ahmadullah taheri
 */
public class Conecction {
    public static Connection getcon ()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","123456");
            return con;
        }
        catch (Exception e)
        {
            return null;
        }
    }
    
}
