/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing_sql_project;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arkaa
 */
public class MyConn {
    private static String servername = "127.0.0.1";
    private static String username = "root";
    private static String dbname = "uses_db";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    public static Connection getConnection(){
        Connection conn = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        try {
            conn = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get connection ->" + MyConn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
}
