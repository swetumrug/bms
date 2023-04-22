/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import com.mycompany.bms.Customer;
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
public class CustomerTest {
    
    Customer customer;
    
    public CustomerTest() {
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
        customer = new Customer(6, "Anusha", "Nayani", "anusha@gmail.com", "1234567890");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testCid(){
        assertEquals(customer.getCid(), 6);
    }
    
    @Test
    public void testFirst(){
        assertEquals(customer.getFirst(), "Anusha");
    }
    
    @Test
    public void testLast(){
        assertEquals(customer.getLast(), "Nayani");
    }
    
    @Test
    public void testEmail(){
        assertEquals(customer.getEmail(), "anusha@gmail.com");
    }
    
    @Test
    public void testphone(){
        assertEquals(customer.getPhone(), "1234567890");
    }
    
     @Test
    public void testToString(){
        assertEquals(customer.toString(), "Customer{cid=6, first=Anusha, last=Nayani, email=anusha@gmail.com, phone=1234567890, accList=[]}");
    }
    
}