
package project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ConVsTables {
      


public static void main(String[] args) {

     

   Connection conn = null;

   Statement stmt = null;

   String sql="";

  

try{

   
            conn=ConnectionProvider.getCon();


     

stmt = conn.createStatement();

      //creating table

      sql = "CREATE TABLE if not exists users " +

                   "( name VARCHAR(200), " +

                   " email VARCHAR(200), " +

                   " password VARCHAR(50), " +

                   " securityQuestion VARCHAR(500), " +
                   
                   " answer VARCHAR(200), " +
                                
                   " address VARCHAR(200), " +
                                 
                  " status VARCHAR(20)) ";
      sql=("create table room(roomNo varchar(10),roomType varchar(10),bed varchar(200),price int ,status varchar(20)) "); 
        
        sql=("create table customer(id int,name varchar(200),mobileNumber varchar(20),nationality varchar(200),gender varchar(50),email varchar(200),idProof varchar(200),address varchar(500),checkIn varchar(50),roomNo varchar(10),bed varchar(200),roomType varchar(200),pricePerday int(10),numberOfDayStay int(10),totalAmount varchar(200),checkout varchar(50))");


      stmt.executeUpdate(sql);

      JOptionPane.showMessageDialog(null,"Table Created Successfuly");



     

      //STEP 6: Clean-up environment

     

      stmt.close();

      conn.close();

   }catch(SQLException se){
       //Handle errors for JDBC

   }catch(Exception e){
       //Handle errors for Class.forName

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
      }//end finally try

   }//end try


}//end main
}//end

    

