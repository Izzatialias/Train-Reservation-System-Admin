/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dao;

import com.mvc.bean.Customer;
import com.mvc.bean.Ticket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 */
public class registerDao {
    public registerDao(){} //default constructor
    
    public Connection con = DBConnection.createConnection();
    
    public void addCustomer(Customer bean){
        int custID = bean.getCustID();
        String cust_name = bean.getCust_name();
        String cust_email = bean.getCust_email();
        String cust_pss = bean.getCust_pss();
        String phoneNo = bean.getPhoneNo();
        int age = bean.getAge();
        String sql = "insert into customer (custID, cust_name, age, phoneNo, cust_email, cust_pss)"
                + " values (?,?,?,?,?,?)";
        PreparedStatement ps;
        try {
            //create preparestatement
            ps = con.prepareStatement(sql);
            ps.setInt(1, custID);
            ps.setString(2, cust_name);
            ps.setInt(3, age);
            ps.setString(4, phoneNo);
            ps.setString(5, cust_email);
            ps.setString(6, cust_pss);
            ps.executeUpdate();
            con.close();            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
    
    public Customer getCustomer(int custID){
        try {
            String sql = "Select * from customers where custID = "+custID;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            String cust_name = rs.getString("cust_name");
            String cust_email = rs.getString("cust_email");
            String cust_pss = rs.getString("cust_pss");
            String phoneNo = rs.getString("phoneNo");
            int age = rs.getInt("age");
            Customer cust = new Customer(custID,cust_name,cust_email,cust_pss,phoneNo,age);
            con.close();
            return cust;
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        return null;
    }
    
    public void updateCustomer(Customer bean){
        int custID = bean.getCustID();
        String cust_name = bean.getCust_name();
        String cust_email = bean.getCust_email();
        String cust_pss = bean.getCust_pss();
        String phoneNo = bean.getPhoneNo();
        int age = bean.getAge();
        String sql = "update customers set cust_name=?,cust_email=?,cust_pss=?,phoneNo=?,age=?"
                + " where custID = "+custID;
        
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, cust_name);
            ps.setString(2, cust_email);
            ps.setString(3, cust_pss);
            ps.setString(4, phoneNo);
            ps.setInt(7, age);
            ps.executeUpdate();
            con.close();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    
//    public void deleteStaff(int emp_id){
//        String sql = "delete from employees2 where emp_id = "+emp_id;
//        PreparedStatement ps;
//        try {
//            ps = con.prepareStatement(sql);
//            ps.executeUpdate();
//            con.close();
//        }
//        catch (Exception ex){
//            System.out.println(ex);
//        }
//    }
    
    public List<Customer> getAllCustomer(){
        List<Customer> customers = new ArrayList<>();
        try {
            String sql = "select * from Customers";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int custID = rs.getInt("custID");
                String cust_name = rs.getString("cust_name");
                String cust_email = rs.getString("cust_email");
                String cust_pss = rs.getString("cust_pss");
                String phoneNo = rs.getString("phoneNo");
                int age = rs.getInt("age");
                Customer cust = new Customer(custID,cust_name,cust_email,cust_pss,phoneNo,age);
                customers.add(cust);
            }
            con.close();
            return customers
                    ;
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        return null;
    }
    
    public void addTicket(Ticket bean){
        int ticket_ID = bean.getTicket_ID();
        int ticket_num = bean.getTicket_num();
        String date_avail = bean.getDate_avail();
        String depart = bean.getDepart();
        String destination = bean.getDestination();
        String sql = "insert into Ticket (ticket_ID, ticket_num, date_avail, depart, destination)"
                + " values (?,?,?,?,?)";
        PreparedStatement ps;
        try {
            //create preparestatement
            ps = con.prepareStatement(sql);
            ps.setInt(1, ticket_ID);
            ps.setInt(2, ticket_num);
            ps.setString(3, date_avail);
            ps.setString(4, depart);
            ps.setString(5, destination);
            ps.executeUpdate();
            con.close();            
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
}
