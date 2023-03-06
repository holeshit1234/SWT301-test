/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package org.testng.swt301;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DemoTestNG {

    public class UpdatePasswordTest {

        @Test
        public void testUpdatePasswordWithEmptyPassword() {
            String password = "";
            try {
                Swt301Testng dao = new Swt301Testng();
                boolean result = dao.updatePassword(password);
                Assert.assertFalse(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void testUpdatePasswordWithShortPassword() {
            String password = "short";
            try {
                Swt301Testng updatePassword = new Swt301Testng();
                boolean result = updatePassword.updatePassword(password);
                Assert.assertFalse(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void testUpdatePasswordWithValidInput() {
            String password = "newpassword";
            try {
                Swt301Testng updatePassword = new Swt301Testng();
                boolean result = updatePassword.updatePassword(password);
                Assert.assertTrue(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
