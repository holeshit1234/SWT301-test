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
import javax.naming.NamingException;
import org.testng.customer.CustomerDAO;
import org.testng.customer.CustomerDTO;
import org.testng.product.ProductDAO;

/**
 *
 * @author Admin
 */
public class DemoTestNG {

    public class UpdatePasswordTest {
        
        
        //Test Login function
        @Test
        public void testLoginWithValidInput() {
            String email = "nguyenphat2711@gmail.com";
            String password = "phatnt";
            try {
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = dao.checkLogin(email, password);
                boolean result = false;
                if (dto != null) {
                    result = true;
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
                boolean result = false;
                if (dto != null) {
                    result = true;
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
                boolean result = false;
                if (dto != null) {
                    result = true;
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
                boolean result = false;
                if (dto != null) {
                    result = true;
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
                boolean result = false;
                if (dto != null) {
                    result = true;
                }
                Assert.assertFalse(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void testLoginWithInvalidUsernameInput() {
            String email = "nguyenphat27gmail.com";
            String password = "phatnt";
            try {
                CustomerDAO dao = new CustomerDAO();
                CustomerDTO dto = dao.checkLogin(email, password);
                boolean result = false;
                if (dto != null) {
                    result = true;
                }
                Assert.assertFalse(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        @Test
        public void testLoginWithWrongInput() {
            String email = "nguyenphat27gmail.com";
            String password = "phat123nt";
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
        
        //end test login function
        
        
        //Test search function
        @Test
        public void testSearchWithNotEmptyInput(){
            String txtSearchValue = "ring";
            try {
                ProductDAO dao = new ProductDAO();
                int numberOfItem = dao.searchProduct(txtSearchValue);
                Assert.assertEquals(numberOfItem, 0);
            } catch (ClassNotFoundException | SQLException | NamingException e) {
                e.printStackTrace();
            }
        }
        
        
        @Test
        public void testSearchWithEmptyInput(){
            String txtSearchValue = "";
            try {
                ProductDAO dao = new ProductDAO();
                int numberOfItem = dao.searchProduct(txtSearchValue);
                Assert.assertEquals(numberOfItem, 0);
            } catch (ClassNotFoundException | SQLException | NamingException e) {
                e.printStackTrace();
            }
        }
        
        

        @Test
        public void testUpdatePasswordWithEmptyPassword() {
            String email = "example@example.com";
            String password = "";
            try {
                Swt301Testng updatePassword = new Swt301Testng();
                boolean result = updatePassword.updatePassword(email, password);
                Assert.assertFalse(result);
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
            String email = "nguyenphat2711@gmail.com";
            String password = "phatnt";
            try {
                Swt301Testng updatePassword = new Swt301Testng();
                boolean result = updatePassword.updatePassword(email, password);
                Assert.assertFalse(result);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        //end test case for login function

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

//        @Test
//        public void testUpdateProductWithEmptyQuantity() {
//            String name = "newname";
//            String description = "newdescription";
//            int quantity = Integer.parseInt("");
//            float price = 1;
//            int size = 1;
//            try {
//                Swt301Testng updateProduct = new Swt301Testng();
//                boolean result = updateProduct.updateProduct(name,
//                        description, quantity, price, size);
//                Assert.assertFalse(result);
//            } catch (ClassNotFoundException | SQLException e) {
//                e.printStackTrace();
//            }
//        }

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
    }
}
