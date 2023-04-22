/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import com.mycompany.bms.EmployeeType;
import com.mycompany.bms.FullTime;
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
public class FullTimeTest {
    FullTime fulltime;
    public FullTimeTest() {
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
        fulltime = new FullTime(5000.0f,11, "Haresh", "Godhani", "haresh@gmail.com", "6303339999", EmployeeType.FullTime);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testSalary(){
        assertEquals(fulltime.getSalary(), 5000.0f);
    }
     
    @Test
    public void testEid() {
        assertEquals(fulltime.getEid(), 11);
    }

    @Test
    public void testFirst() {
        assertEquals(fulltime.getFirst(), "Haresh");
    }

    @Test
    public void testLast() {
        assertEquals(fulltime.getLast(), "Godhani");
    }

    @Test
    public void testEmail() {
        assertEquals(fulltime.getEmail(), "haresh@gmail.com");
    }

    @Test
    public void testPhone1() {
        assertEquals(fulltime.getPhone(), "6303339999");
    }

    @Test
    public void testEmployeeType1() {
        assertEquals(fulltime.getEmpType(), EmployeeType.FullTime);
    }

    @Test
    public void testToString(){
        assertEquals(fulltime.toString(), "FullTime{salary=5000.0}Employee{eid=11, first=Haresh, last=Godhani, email=haresh@gmail.com, phone=6303339999, empType=FullTime}");
    }
}
