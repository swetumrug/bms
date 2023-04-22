/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bms;

/**
 *
 * @author swetu
 */
public class FullTime extends Employee{
    private float salary;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public FullTime(float salary, int eid, String first, String last, String email, String phone, EmployeeType empType) {
        super(eid, first, last, email, phone, empType);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FullTime{" + "salary=" + salary + '}' + super.toString();
    }
    
    
}
