/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import com.mycompany.bms.Employee;
import com.mycompany.bms.EmployeeType;
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
public class EmployeeTest {

    Employee employeef; //Declare
    Employee employeep; //Declare

    public EmployeeTest() {
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
        employeef = new Employee(11, "Haresh", "Godhani", "haresh@gmail.com", "6303339999", EmployeeType.FullTime);
        employeep = new Employee(12, "Rina", "Patel", "rina@gmail.com", "8476664455", EmployeeType.PartTime);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testEid1() {
        assertEquals(employeef.getEid(), 11);
    }

    @Test
    public void testFirst1() {
        assertEquals(employeef.getFirst(), "Haresh");
    }

    @Test
    public void testLast1() {
        assertEquals(employeef.getLast(), "Godhani");
    }

    @Test
    public void testEmail1() {
        assertEquals(employeef.getEmail(), "haresh@gmail.com");
    }

    @Test
    public void testPhone1() {
        assertEquals(employeef.getPhone(), "6303339999");
    }

    @Test
    public void testEmployeeType1() {
        assertEquals(employeef.getEmpType(), EmployeeType.FullTime);
    }

    @Test
    public void testEid2() {
        assertEquals(employeep.getEid(), 12);
    }

    @Test
    public void testFirst2() {
        assertEquals(employeep.getFirst(), "Rina");
    }

    @Test
    public void testLast2() {
        assertEquals(employeep.getLast(), "Patel");
    }

    @Test
    public void testEmail2() {
        assertEquals(employeep.getEmail(), "rina@gmail.com");
    }

    @Test
    public void testPhone2() {
        assertEquals(employeep.getPhone(), "8476664455");
    }

    @Test
    public void testEmployeeType2() {
        assertEquals(employeep.getEmpType(), EmployeeType.PartTime);
    }
    
    @Test
    public void testToStringf(){
        assertEquals(employeef.toString(),"Employee{eid=11, first=Haresh, last=Godhani, email=haresh@gmail.com, phone=6303339999, empType=FullTime}");
    }
    
    
@Test
    public void testToStringp(){
        assertEquals(employeep.toString(),"Employee{eid=12, first=Rina, last=Patel, email=rina@gmail.com, phone=8476664455, empType=PartTime}");
    }
}
