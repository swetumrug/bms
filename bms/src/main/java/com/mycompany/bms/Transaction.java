/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bms;

import java.time.Instant;

/**
 *
 * @author swetu
 */
public class Transaction {
    private int tid;
    private TransactionType tranType;
    private float amount;
    private Instant datetime;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public TransactionType getTranType() {
        return tranType;
    }

    public void setTranType(TransactionType tranType) {
        this.tranType = tranType;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Instant getDatetime() {
        return datetime;
    }

    public void setDatetime(Instant datetime) {
        this.datetime = datetime;
    }

    public Transaction(int tid, TransactionType tranType, float amount, Instant datetime) {
        this.tid = tid;
        this.tranType = tranType;
        this.amount = amount;
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Transaction{" + "tid=" + tid + ", tranType=" + tranType + ", amount=" + amount + ", datetime=" + datetime + '}';
    }

    
}
