/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.controller;

import com.mvc.bean.LoginBean;
import com.mvc.dao.LoginDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HANIPUTERI
 */
public class AdminLoginServlet extends HttpServlet {

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
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
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
        // get admin_email & admin_pass from adminlogin.jsp page
        String admin_email = request.getParameter("admin_email");
        String admin_pss = request.getParameter("admin_pss");
        LoginBean loginBean = new LoginBean(); //creating object LoginBean
        loginBean.setAdminEmail(admin_email); //setting the email and password
        loginBean.setAdminPass(admin_pss); //through the loginBean object
        LoginDAO loginDao = new LoginDAO(); //creating object for LoginDao, this class
        //cotains main logic for user authentication
        String userValidate = loginDao.authenticateUser(loginBean); //Calling authenticateUser function
        if(userValidate.equals("SUCCESS")) //If function returns success string then user will be
            { //rooted to index.jsp
            HttpSession session=request.getSession(); //to register session
            session.setAttribute("admin_email",admin_email); // to set the attribute to the session
            //request.getRequestDispatcher("/index.jsp").forward( request, response);//RequestDispatcher is used
            //to redirect to Home.jsp page
            RequestDispatcher rd = request.getRequestDispatcher ("/adminhome.jsp"); //RequestDispatcher is used
            rd.forward(request, response); //to redirect to adminhome.jsp page
            }
        else
            {
            request.setAttribute("errMessage", userValidate);//returns Invalid user credentials (fail login)
            RequestDispatcher rd = request.getRequestDispatcher ("/adminlogin.jsp"); //RequestDispatcher is used
            rd.forward(request, response); //to redirect to Login.jsp page
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
