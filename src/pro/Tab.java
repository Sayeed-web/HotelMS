/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ahmadullah taheri
 */
public class Tab {
      static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 

   static  String DB_URL = "jdbc:mysql://localhost/hotel";

   //  Database credentials

   static  String USER = "root";

   static  String PASS = "123456";

   //String sql="";

public static void main(String[] args) {

     

   Connection conn = null;

   Statement stmt = null;

   String sql="";

  

try{

   //STEP 2: Register JDBC driver

      Class.forName("com.mysql.jdbc.Driver");

  

   conn = DriverManager.getConnection(DB_URL,USER,PASS);

     

stmt = conn.createStatement();

      //creating table

      sql = "CREATE TABLE if not exists REGISTRATION " +

                   "(id INTEGER not NULL, " +

                   " first VARCHAR(255), " +

                   " last VARCHAR(255), " +

                   " age INTEGER, " +

                   " PRIMARY KEY ( id ))";

     System.out.println("SSSSSSSSSSSSS");

      stmt.executeUpdate(sql);

     System.out.println("QQQQQQQQQQQQQ");

      //inserting data

      sql = "Insert into registration values (2, 'first2', 'last2', 20)";

      stmt.executeUpdate(sql);

      sql = "Insert into registration values (3, 'first2', 'last2', 20)";

      stmt.executeUpdate(sql);

      sql = "Insert into registration values (4, 'first2', 'last2', 20)";

      stmt.executeUpdate(sql);

      sql = "Insert into registration values (5, 'first2', 'last2', 20)";

      stmt.executeUpdate(sql);

      sql = "Insert into registration values (6, 'first2', 'last2', 20)";

      stmt.executeUpdate(sql);

      sql = "Insert into registration values (7, 'first2', 'last2', 20)";

      stmt.executeUpdate(sql);

      sql = "Insert into registration values (8, 'first2', 'last2', 20)";

      stmt.executeUpdate(sql);

      sql = "Insert into registration values (9, 'first2', 'last2', 20)";

      stmt.executeUpdate(sql);

      sql = "Insert into registration values (10, 'first2', 'last2', 20)";

      stmt.executeUpdate(sql);

      sql = "Insert into registration values (11, 'first2', 'last2', 20)";

      sql = "Insert into registration values (12, 'first2', 'last2', 20)";

      sql = "Insert into registration values (14, 'first2', 'last2', 20)";

      stmt.executeUpdate(sql);

System.out.println("RRRRRRRRRRRR");

     

      //STEP 6: Clean-up environment

     

      stmt.close();

      conn.close();

   }catch(SQLException se){

      //Handle errors for JDBC

      se.printStackTrace();

   }catch(Exception e){

      //Handle errors for Class.forName

      e.printStackTrace();

   }finally{

      //finally block used to close resources

      try{

         if(stmt!=null)

            stmt.close();

      }catch(SQLException se2){

      }// nothing we can do

      try{

         if(conn!=null)

            conn.close();

      }catch(SQLException se){

         se.printStackTrace();

      }//end finally try

   }//end try

   System.out.println("Goodbye!");

}//end main

}//end
    

