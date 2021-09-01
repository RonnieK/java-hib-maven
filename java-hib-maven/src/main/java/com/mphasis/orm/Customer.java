package com.mphasis.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer {

    @Id
    @SequenceGenerator(name="seq", sequenceName = "oracle_seq")
//    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq")
    @GeneratedValue( strategy=GenerationType.AUTO)
//    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long custId;
    private String fullName;
    private double acctBalance;
    
//    public Customer(int i, String string, double j) {
//        this.custId = i;
//        this.fullName = string;
//        this.acctBalance = j;
//    }
    
    public long getCustId() {
        return custId;
    }
    public void setCustId(long custId) {
        this.custId = custId;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getAcctBalance() {
        return acctBalance;
    }
    public void setAcctBalance(double acctBalance) {
        this.acctBalance = acctBalance;
    }
}