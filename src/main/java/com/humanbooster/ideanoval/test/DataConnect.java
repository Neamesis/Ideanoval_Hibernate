package com.humanbooster.ideanoval.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Nea on 07/09/2016.
 */
public class DataConnect {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate_ideanoval","root","");
        return connection;
    }

    public static void closeConnection (Connection c){
        try{
            c.close();
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }

}
