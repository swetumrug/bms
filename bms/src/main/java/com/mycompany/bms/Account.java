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
public class Account {

    private int aid;
    private AccountType accType;
    private float balance;
    ArrayList<Transaction> transactionList = new ArrayList<Transaction>();

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public AccountType getAccType() {
        return accType;
    }

    public void setAccType(AccountType accType) {
        this.accType = accType;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(ArrayList<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public Account(int aid, AccountType accType, float balance) {
        this.aid = aid;
        this.accType = accType;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "aid=" + aid + ", accType=" + accType + ", balance=" + balance + ", transactionList=" + transactionList + '}';
    }
    
    
}
