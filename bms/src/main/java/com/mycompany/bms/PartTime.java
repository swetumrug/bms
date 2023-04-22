/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bms;

/**
 *
 * @author swetu
 */
public class PartTime extends Employee{
    private float hours;
    private float rate; 

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public PartTime(float hours, float rate, int eid, String first, String last, String email, String phone, EmployeeType empType) {
        super(eid, first, last, email, phone, empType);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "PartTime{" + "hours=" + hours + ", rate=" + rate + '}'+ super.toString();
    }
    
    
}
