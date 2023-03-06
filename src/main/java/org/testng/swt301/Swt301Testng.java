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

    public boolean updatePassword(String password)
            throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            String sql = "Update Customer "
                    + "Set Password = ? "
                    + "Where Email = chaunhattruong4747@gmail.com";
            stm = con.prepareStatement(sql);
            if (password.trim().length() >= 6) {
                stm.setString(1, password);
            }

            int effectedRows = stm.executeUpdate();
            if (effectedRows > 0) {
                result = true;
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

    public boolean createAccount(String name, String password, Date dateOfBirth,
            String email, String phone, String address, boolean sex)
            throws SQLException, ClassNotFoundException, ParseException {
        Connection con = null;
        PreparedStatement stm = null;
        boolean result = false;
        try {
            con = DBHelper.makeConnection();
            if (con != null) {
                String sql = "Insert Into Customer("
                        + "Name, Password, DateOfBirth, Email, Phone, Address, "
                        + "Role, RankID, Sex, TypeOfLogin"
                        + ") "
                        + "Values(?, ?, ?, ?, ?, ?, 1, 1, ?, 1"
                        + ")";
                stm = con.prepareStatement(sql);
                stm.setString(1, name);
                stm.setString(2, password);
                if (dateOfBirth != null) {
                    java.sql.Date sqlDate = new java.sql.Date(dateOfBirth.getTime());
                    stm.setDate(3, sqlDate);
                } else {
                    String date = "1-1-1999";
                    DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
                    Date defaultDate = df.parse(date);
                    java.sql.Date sqlDate = new java.sql.Date(defaultDate.getTime());
                    stm.setDate(3, sqlDate);
                }
                stm.setString(4, email);
                stm.setString(5, phone);
                stm.setString(6, address);
                stm.setBoolean(7, sex);
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
