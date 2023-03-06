/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.testng.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Chau Nhat Truong
 */
public class DBHelper {

    public static Connection makeConnection()
            throws ClassNotFoundException, SQLException {
        //1. Load Driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //2. Create URL Connection String
        //Syntax: protocol:servername://ip:port;databaseName=UB[;instanceName=Instance]
        String url = "jdbc:sqlserver://localhost:1433;"
                + "databaseName=SWP391;instanceName=SQLEXPRESS";
        //3. Open Connection
        Connection con = DriverManager.getConnection(url, "sa", "12345");
        return con;
    }
}
