/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import com.mycompany.bms.Transaction;
import com.mycompany.bms.TransactionType;
import java.time.Instant;
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
public class TransactionTest {

    Transaction transaction1;
    Transaction transaction2;

    public TransactionTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        transaction1 = new Transaction(1, TransactionType.Credit, 1000f, Instant.now());
        transaction2 = new Transaction(2, TransactionType.Debit, 100f, Instant.now());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testTid1() {
        assertEquals(transaction1.getTid(), 1);
    }

    @Test
    public void testTransactionType1() {
        assertEquals(transaction1.getTranType(), TransactionType.Credit);
    }

    @Test
    public void testAmount1() {
        assertEquals(transaction1.getAmount(), 1000f);
    }

   
    @Test
    public void testTid2() {
        assertEquals(transaction2.getTid(), 2);
    }

    @Test
    public void testTransactionType2() {
        assertEquals(transaction2.getTranType(), TransactionType.Debit);
    }

    @Test
    public void testAmount2() {
        assertEquals(transaction2.getAmount(), 100f);
    }

   
    
}
