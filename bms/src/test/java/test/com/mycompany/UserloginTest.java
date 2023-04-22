/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import com.mycompany.bms.Userlogin;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author swetu
 */
public class UserloginTest {
    Userlogin userlogin;
    public UserloginTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        userlogin = new Userlogin("Shilpi4Sharma", "SS007", "Shilpi", "Sharma", true);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testUserName(){
       assertEquals(userlogin.getUsername(), "Shilpi4Sharma"); 
    }
    
    @Test
    public void testPassword(){
        assertEquals(userlogin.getPassword(),"SS007");
    }
    
    @Test
    public void testFirst(){
        assertEquals(userlogin.getFirstName(), "Shilpi");
    }
    
    @Test
    public void testLast(){
        assertEquals(userlogin.getLastName(), "Sharma");
    }
    
    @Test
    public void testIsEmployee(){
        assertEquals(userlogin.isIsEmployee(), true);
    }
    
    
}
