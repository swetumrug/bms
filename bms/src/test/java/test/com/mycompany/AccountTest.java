/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import com.mycompany.bms.Account;
import com.mycompany.bms.AccountType;
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
public class AccountTest {
    Account account1;
    Account account2;
    public AccountTest() {
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
         account1 = new Account(7001, AccountType.Saving, 500.0f);
         account2 = new Account(7002, AccountType.Checking, 1500.0f);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testAid1(){
      assertEquals(account1.getAid(), 7001);  
    }
    
    @Test
    public void testAccountType1(){
        assertEquals(account1.getAccType(), AccountType.Saving);
    }
    
    @Test
    public void testBalance1(){
      assertEquals(account1.getBalance(), 500.0f);  
    }
    
    @Test
    public void testAid2(){
      assertEquals(account2.getAid(), 7002);  
    }
    
    @Test
    public void testAccountType2(){
        assertEquals(account2.getAccType(), AccountType.Checking);
    }
    
    @Test
    public void testBalance2(){
      assertEquals(account2.getBalance(), 1500.0f);  
    }
    
    @Test
    public void testToString1(){
        assertEquals(account1.toString(),"Account{aid=7001, accType=Saving, balance=500.0, transactionList=[]}");
    }
    
    @Test
    public void testToString2(){
        assertEquals(account2.toString(),"Account{aid=7002, accType=Checking, balance=1500.0, transactionList=[]}");
    }
}
