/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dao;

import com.mvc.bean.LoginBean;
import com.mvc.bean.Customer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.DBConnection;

/**
 *
 * @author HANIPUTERI
 */
public class LoginDAO {
    public String authenticateUser(LoginBean loginBean){
        String admin_email = loginBean.getAdminEmail(); //keeping user entered value
        String admin_pss = loginBean.getAdminPass();//in temporary variable
        Connection con = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            con = DBConnection.createConnection();//establishing connection
            stmt = con.createStatement(); //stmt used to write queries
            String sql; //sql select stmt
            sql = "select * from administrator where admin_email = '"+admin_email+
            "' and admin_pss = '"+admin_pss+"'";
            resultSet = stmt.executeQuery(sql);// execute query
            if (resultSet.next()) { //record found (enter username & password
            return "SUCCESS"; //match with value in db
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return "Invalid user credentials"; //Just returning appropriate message otherwise
    }
    
    public String authenticateUser(Customer login){
        String cust_email = login.getCust_email(); //keeping user entered value
        String cust_pss = login.getCust_pss();//in temporary variable
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            conn = DBConnection.createConnection();//establishing connection
            stmt = conn.createStatement(); //stmt used to write queries
            String sql; //sql select stmt
            sql = "select * from Customer where cust_email = '"+cust_email+
            "' and cust_pss = '"+cust_pss+"'";
            resultSet = stmt.executeQuery(sql);// execute query
            if (resultSet.next()) { //record found (enter username & password
            return "SUCCESS"; //match with value in db
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return "Invalid user credentials"; //Just returning appropriate message otherwise
    }
}
