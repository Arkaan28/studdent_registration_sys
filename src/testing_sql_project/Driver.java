/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing_sql_project;

/**
 *
 * @author arkaa
 */
import java.sql.*;

public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            Connection myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/uses_db","root","");
            
            Statement st = myconn.createStatement();
            
            ResultSet rs = st.executeQuery("select * from users");
            
            while (rs.next()){
                System.out.println(rs.getString("username"));
            }
            
        } catch (SQLException e) {
        }
    }
    
}
