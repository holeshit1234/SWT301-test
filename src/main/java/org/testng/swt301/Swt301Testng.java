/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package org.testng.swt301;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.testng.annotations.Test;
import org.testng.util.DBHelper;

/**
 *
 * @author Admin
 */
public class Swt301Testng {

    public boolean checkLogin(String email, String password)
            throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Select Name, Email, Phone, Address, Role "
                        + "From Customer "
                        + "Where Email = ? And Password = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, email);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    result = true;
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return result;
    }

    public boolean updatePassword(String email, String password)
            throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            String sql = "Update Customer "
                    + "Set Password = ? "
<<<<<<< HEAD
                    + "Where Email LIKE 'chaunhattruong4747@gmail.com'";
            stm = con.prepareStatement(sql);
            if (password.trim().length() >= 6) {
                stm.setString(1, password);
=======
                    + "Where Email = ?";
            stm = con.prepareStatement(sql);
            if (password.trim().length() >= 6) {
                stm.setString(1, password);
                stm.setString(2, email);
>>>>>>> 60bdf3ea8c463eb5566797981b4f00fd94a33603
                int effectedRows = stm.executeUpdate();
                if (effectedRows > 0) {
                    result = true;
                }
            }
<<<<<<< HEAD

=======
>>>>>>> 60bdf3ea8c463eb5566797981b4f00fd94a33603
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return result;
    }

    public boolean updateProduct(String name, String description, int quantity,
            float price, int size)
            throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            String sql = "Update Product "
                    + "Set Name = ?, Description = ?, Quantity = ?, Price = ?, "
                    + "Size = ? "
                    + "Where ProductID = 1";
            stm = con.prepareStatement(sql);
            stm.setString(1, name);
            stm.setString(2, description);
            if (quantity > 0 || price > 0 || size > 0) {
                stm.setInt(3, quantity);
                stm.setFloat(4, price);
                stm.setInt(5, size);
                int effectedRows = stm.executeUpdate();
                if (effectedRows > 0) {
                    result = true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return result;
    }
}
