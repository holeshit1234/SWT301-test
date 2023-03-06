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
            String email = "example@example.com";
            String password = "";
            try {
                Swt301Testng updatePassword = new Swt301Testng();
                boolean result = updatePassword.updatePassword(email, password);
                Assert.assertTrue(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void testUpdatePasswordWithShortPassword() {
            String email = "example@example.com";
            String password = "short";
            try {
                Swt301Testng updatePassword = new Swt301Testng();
                boolean result = updatePassword.updatePassword(email, password);
                Assert.assertFalse(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void testUpdatePasswordWithValidInput() {
            String email = "example@example.com";
            String password = "newpassword";
            try {
                Swt301Testng updatePassword = new Swt301Testng();
                boolean result = updatePassword.updatePassword(email, password);
                Assert.assertTrue(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
