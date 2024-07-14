/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.bean;

/**
 *
 * @author HANIPUTERI
 */
public class LoginBean {
    private String admin_email;
    private String admin_pss;
    
    public String getAdminEmail() {
        return admin_email;
    }
    public String getAdminPass() {
        return admin_pss;
    }
    public void setAdminEmail(String admin_email) {
        this.admin_email = admin_email;
    }
    public void setAdminPass(String admin_pss) {
        this.admin_pss = admin_pss;
    }
}
