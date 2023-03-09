/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package org.testng.swt301;

import java.util.Date;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
<<<<<<< HEAD
=======
import java.util.Date;
import javax.naming.NamingException;
>>>>>>> 60bdf3ea8c463eb5566797981b4f00fd94a33603
import org.testng.customer.CustomerDAO;
import org.testng.customer.CustomerDTO;

/**
 *
 * @author Admin
 */
public class DemoTestNG {

    public class UpdatePasswordTest {

<<<<<<< HEAD
        //Account
=======
//        @Test
//        public void testUpdatePasswordWithEmptyPassword() {
//            String email = "example@example.com";
//            String password = "";
//            try {
//                Swt301Testng updatePassword = new Swt301Testng();
//                boolean result = updatePassword.updatePassword(email, password);
//                Assert.assertFalse(result);
//            } catch (ClassNotFoundException | SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        @Test
//        public void testUpdatePasswordWithShortPassword() {
//            String email = "example@example.com";
//            String password = "short";
//            try {
//                Swt301Testng updatePassword = new Swt301Testng();
//                boolean result = updatePassword.updatePassword(email, password);
//                Assert.assertFalse(result);
//            } catch (ClassNotFoundException | SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        @Test
//        public void testUpdatePasswordWithValidInput() {
//            String email = "nguyenphat2711@gmail.com";
//            String password = "phatnt";
//            try {
//                Swt301Testng updatePassword = new Swt301Testng();
//                boolean result = updatePassword.updatePassword(email, password);
//                Assert.assertFalse(result);
//            } catch (ClassNotFoundException | SQLException e) {
//                e.printStackTrace();
//            }
//        }

        //Test login function
>>>>>>> 60bdf3ea8c463eb5566797981b4f00fd94a33603
        @Test
        public void testLoginWithValidInput() {
            String email = "nguyenphat2711@gmail.com";
            String password = "phatnt";
            try{
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = dao.checkLogin(email, password);
                Assert.assertEquals(dto.getEmail(), email);
            } catch(ClassNotFoundException | NamingException | SQLException e){
                e.printStackTrace();
            }
        }
        
        @Test
        public void testLoginWithEmptyUsernameInput() {
            String email = "";
            String password = "phatnt";
            try{
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = dao.checkLogin(email, password);
                Assert.assertEquals(dto.getEmail(), email);
            } catch(ClassNotFoundException | NamingException | SQLException e){
                e.printStackTrace();
            }
        }
        
        
        @Test
        public void testLoginWithEmptyPasswordInput() {
            String email = "nguyenphat2711@gmail.com";
            String password = "";
            try{
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = dao.checkLogin(email, password);
                Assert.assertEquals(dto.getEmail(), email);
            } catch(ClassNotFoundException | NamingException | SQLException e){
                e.printStackTrace();
            }
        }
        
        
        @Test
        public void testLoginWithEmptyUsernameAndPasswordInput() {
            String email = "";
            String password = "";
            try{
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = dao.checkLogin(email, password);
                Assert.assertEquals(dto.getEmail(), email);
            } catch(ClassNotFoundException | NamingException | SQLException e){
                e.printStackTrace();
            }
        }
        
        
        @Test
        public void testLoginWithInvalidPasswordInput() {
            String email = "nguyenphat2711@gmail.com";
            String password = "123456789";
            try{
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = dao.checkLogin(email, password);
                Assert.assertEquals(dto.getEmail(), email);
            } catch(ClassNotFoundException | NamingException | SQLException e){
                e.printStackTrace();
            }
        }
<<<<<<< HEAD

        //Test login function
        @Test
        public void testLoginWithValidInput() {
            String email = "nguyenphat2711@gmail.com";
            String password = "phatnt";
            try {
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = dao.checkLogin(email, password);
                boolean result = true;
                if (dto == null) {
                    result = false;
                }
                Assert.assertTrue(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void testLoginWithEmptyUsernameInput() {
            String email = "";
            String password = "phatnt";
            try {
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = dao.checkLogin(email, password);
                boolean result = true;
                if (dto == null) {
                    result = false;
                }
                Assert.assertFalse(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void testLoginWithEmptyPasswordInput() {
            String email = "nguyenphat2711@gmail.com";
            String password = "";
            try {
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = dao.checkLogin(email, password);
                boolean result = true;
                if (dto == null) {
                    result = false;
                }
                Assert.assertFalse(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void testLoginWithEmptyUsernameAndPasswordInput() {
            String email = "";
            String password = "";
            try {
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = dao.checkLogin(email, password);
                boolean result = true;
                if (dto == null) {
                    result = false;
                }
                Assert.assertFalse(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void testLoginWithInvalidPasswordInput() {
            String email = "nguyenphat2711@gmail.com";
            String password = "123456789";
            try {
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = dao.checkLogin(email, password);
                boolean result = true;
                if (dto == null) {
                    result = false;
                }
                Assert.assertFalse(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

=======
        
        
        
>>>>>>> 60bdf3ea8c463eb5566797981b4f00fd94a33603
        @Test
        public void testLoginWithInvalidUsernameInput() {
            String email = "nguyenphat27gmail.com";
            String password = "phatnt";
<<<<<<< HEAD
            try {
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = dao.checkLogin(email, password);
                boolean result = true;
                if (dto == null) {
                    result = false;
                }
                Assert.assertFalse(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

=======
            try{
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = dao.checkLogin(email, password);
                Assert.assertEquals(dto.getEmail(), email);
            } catch(ClassNotFoundException | NamingException | SQLException e){
                e.printStackTrace();
            }
        }
        
        
>>>>>>> 60bdf3ea8c463eb5566797981b4f00fd94a33603
        @Test
        public void testLoginWithWrongInput() {
            String email = "nguyenphat27gmail.com";
            String password = "phat123nt";
<<<<<<< HEAD
            try {
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = dao.checkLogin(email, password);
                boolean result = true;
                if (dto == null) {
                    result = false;
                }
                Assert.assertFalse(result);
            } catch (ClassNotFoundException | SQLException e) {
=======
            try{
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = dao.checkLogin(email, password);
                Assert.assertEquals(dto.getEmail(), email);
            } catch(ClassNotFoundException | NamingException | SQLException e){
>>>>>>> 60bdf3ea8c463eb5566797981b4f00fd94a33603
                e.printStackTrace();
            }
        }
        //end test case for login function
<<<<<<< HEAD

        //Product
        @Test
        public void testUpdateProductWithEmptyName() {
            String name = "";
            String description = "newdescription";
            int quantity = 1;
            float price = 1;
            int size = 1;
            try {
                Swt301Testng updateProduct = new Swt301Testng();
                boolean result = updateProduct.updateProduct(name,
                        description, quantity, price, size);
                Assert.assertFalse(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void testUpdateProductWithEmptyQuantity() {
            String name = "newname";
            String description = "newdescription";
            int quantity = Integer.parseInt("");
            float price = 1;
            int size = 1;
            try {
                Swt301Testng updateProduct = new Swt301Testng();
                boolean result = updateProduct.updateProduct(name,
                        description, quantity, price, size);
                Assert.assertFalse(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void testUpdateProductWithNegativeQuantity() {
            String name = "newname";
            String description = "newdescription";
            int quantity = -1;
            float price = 1;
            int size = 1;
            try {
                Swt301Testng updateProduct = new Swt301Testng();
                boolean result = updateProduct.updateProduct(name,
                        description, quantity, price, size);
                Assert.assertFalse(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void testCreateWithEmptyInput() throws ParseException {
            String name = "";
            String email = "";
            String password = "";
            String date = "1-1-1999";
            Date df = new SimpleDateFormat("MM-dd-yyyy").parse(date);
            try {
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = new CustomerDTO(name, password, df, email,
                        "0123456789", "phatsanhasugoidesuyo", true, 1, true, 1);
                boolean result = dao.createAccount(dto);
                Assert.assertFalse(result);
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void testCreateWithNotEmptyInputWithTrueFormatEmail() throws ParseException {
            String name = "phatsanhasugoi";
            String email = "dungsanha@sugoi.com";
            String password = "12345abcde";
            String date = "1-1-1999";
            Date df = new SimpleDateFormat("MM-dd-yyyy").parse(date);
            try {
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = new CustomerDTO(name, password, df, email,
                        "0123456789", "phatsanhasugoidesuyo", true, 1, true, 1);
                boolean result = dao.createAccount(dto);
                Assert.assertTrue(result);
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
=======
        
//        @Test
//        public void testCreateAccountWithEmptyInput() throws ParseException {
//            Date birthDate = new SimpleDateFormat("yyyy-MM-dd")
//                        .parse("29-2-2002");
//            CustomerDTO dto = new CustomerDTO("", "", birthDate, "", "0123456789", "other", false, 1, true, 0);
//            try{
//                CustomerDAO dao = new CustomerDAO();
//                boolean result = dao.createAccount(dto);
//                Assert.assertEquals(result, true);
//            } catch(ClassNotFoundException | NamingException | SQLException e){
//                e.printStackTrace();
//            }
//        }
//        
//        @Test
//        public void testCreateAccountWithValidUsernameInput() {
//            String email = "nguyenphat27gmail.com";
//            String password = "phatnt";
//            try{
//                CustomerDAO dao = new CustomerDAO();
//                CustomerDTO dto = dao.checkLogin(email, password);
//                Assert.assertEquals(dto.getEmail(), email);
//            } catch(ClassNotFoundException | NamingException | SQLException e){
//                e.printStackTrace();
//            }
//        }
>>>>>>> 60bdf3ea8c463eb5566797981b4f00fd94a33603
    }
}
