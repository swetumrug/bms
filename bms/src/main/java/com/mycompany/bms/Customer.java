/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bms;

import java.util.ArrayList;

/**
 *
 * @author swetu
 */
public class Customer {
    private int cid;
    private String first;
    private String last;
    private String email;
    private String phone;
    ArrayList<Account> accList = new ArrayList<Account>();

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
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

    public ArrayList<Account> getAccList() {
        return accList;
    }

    public void setAccList(ArrayList<Account> accList) {
        this.accList = accList;
    }

    public Customer(int cid, String first, String last, String email, String phone) {
        this.cid = cid;
        this.first = first;
        this.last = last;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" + "cid=" + cid + ", first=" + first + ", last=" + last + ", email=" + email + ", phone=" + phone + ", accList=" + accList + '}';
    }
    
    
}