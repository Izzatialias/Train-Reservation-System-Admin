/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.bean;

import java.io.Serializable;

/**
 *
 */
public class Customer implements Serializable{
    private int custID;
    private String cust_name;
    private String cust_email;
    private String cust_pss;
    private String phoneNo;
    private int age;

    public Customer() {
    }

    public Customer(int custID, String cust_name, String cust_email, String cust_pss, String phoneNo, int age) {
        this.custID = custID;
        this.cust_name = cust_name;
        this.cust_email = cust_email;
        this.cust_pss = cust_pss;
        this.phoneNo = phoneNo;
        this.age = age;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_email() {
        return cust_email;
    }

    public void setCust_email(String cust_email) {
        this.cust_email = cust_email;
    }

    public String getCust_pss() {
        return cust_pss;
    }

    public void setCust_pss(String cust_pss) {
        this.cust_pss = cust_pss;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
