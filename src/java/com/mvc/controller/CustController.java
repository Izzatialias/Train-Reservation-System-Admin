/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.controller;

import com.mvc.bean.Customer;
import com.mvc.dao.registerDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.LinkedList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aniqi
 */
public class CustController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StfController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StfController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            List errorMsgs = new LinkedList();
            Customer cust = new Customer();
            String custID = request.getParameter("custID");
                        System.out.println("Operation"+ custID);
            String cust_name = request.getParameter("cust_name");
                        System.out.println("Operation"+ cust_name);
            String cust_email = request.getParameter("cust_email");
                        System.out.println("Operation"+ cust_email);
            String cust_pss = request.getParameter("cust_pss");
                        System.out.println("Operation"+ cust_pss);
            String phoneNo = request.getParameter("phoneNo");
                        System.out.println("Operation"+ phoneNo);
            String age = request.getParameter("age");
            System.out.println("Operation"+ age);
            String operation = request.getParameter("operation"); 
            System.out.println("Operation"+ operation);
            
            
            if(custID == null) custID = "0";
            
            //(e) do form validation
            
            if(cust_name == null || cust_name.trim().length() == 0){
                errorMsgs.add("Please enter the customer's name.");
            }
            if(cust_email == null || cust_email.trim().length() == 0){
                errorMsgs.add("Please enter the email.");
            }
            if(cust_pss == null || cust_pss.trim().length() == 0){
                errorMsgs.add("Please enter the password.");
            }
            if(phoneNo == null || phoneNo.trim().length() == 0){
                errorMsgs.add("Please enter the phone number.");
            }
            if(age == null) age  ="0";
            
            //(f) dispatch to error.jsp. refer to lab 7; exercise 2 task 2
            
            if(!errorMsgs.isEmpty()){
                request.setAttribute("errorMsgs",errorMsgs);
                request.setAttribute("operation",operation);
                RequestDispatcher view = request.getRequestDispatcher("erroradd.jsp");
                view.forward(request, response);
                return;
            }
            
            cust.setCustID(Integer.parseInt(custID));
            cust.setCust_name(cust_name);
            cust.setCust_email(cust_email);
            cust.setCust_pss(cust_pss);
            cust.setPhoneNo(phoneNo);
            cust.setAge(Integer.parseInt(age));
            
            if (operation.equals("C")){
                registerDao dao = new registerDao();
                dao.addCustomer(cust);
                
                request.setAttribute("customer",cust);
                RequestDispatcher view = request.getRequestDispatcher("login.jsp");
                view.forward(request, response);
            }
            if (operation.equals("U")){
                registerDao dao = new registerDao();
                dao.updateCustomer(cust);

                RequestDispatcher view = request.getRequestDispatcher("ListCustomer.jsp");
                view.forward(request, response);
            }
            if (operation.equals("D")){
                int id = Integer.parseInt(custID);
                registerDao dao = new registerDao();
//                dao.deleteCustomer(id);

                RequestDispatcher view = request.getRequestDispatcher("ListCustomer.jsp");
                view.forward(request, response);
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
