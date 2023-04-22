/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bms;

/**
 *
 * @author swetu
 */
public class Employee {
    private int eid;
    private String first;
    private String last;
    private String email;
    private String phone;
    private EmployeeType empType;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public EmployeeType getEmpType() {
        return empType;
    }

    public void setEmpType(EmployeeType empType) {
        this.empType = empType;
    }

    public Employee(int eid, String first, String last, String email, String phone, EmployeeType empType) {
        this.eid = eid;
        this.first = first;
        this.last = last;
        this.email = email;
        this.phone = phone;
        this.empType = empType;
    }

    @Override
    public String toString() {
        return "Employee{" + "eid=" + eid + ", first=" + first + ", last=" + last + ", email=" + email + ", phone=" + phone + ", empType=" + empType + '}';
    }
    
    
}
