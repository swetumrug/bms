/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import com.mycompany.bms.Bank;
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
public class BankTest {
    Bank bank;
    public BankTest() {
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
        bank = new Bank(1, "UnionBank", "5647894320", "http://unionbank.com");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
     @Test
    public void testBid() {
        assertEquals(bank.getBid(),1);
    }
    @Test
    public void testName() {
        assertEquals(bank.getName(),"UnionBank");
    }
    @Test
    public void testPhone() {
        assertEquals(bank.getPhone(),"5647894320");
    }
     @Test
    public void testWebURL() {
        assertEquals(bank.getWebURL(), "http://unionbank.com");
    }
    
    @Test
    public void testToString(){
        assertEquals(bank.toString(),"Bank{bid=1, name=UnionBank, phone=5647894320, webURL=http://unionbank.com, cusList=[], empList=[]}");
    }
       
}