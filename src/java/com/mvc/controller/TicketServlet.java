/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.controller;

import com.mvc.bean.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mvc.bean.Ticket;
import com.mvc.dao.registerDao;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author ACER
 */
@WebServlet(name = "TicketServlet", urlPatterns = {"/TicketServlet"})
public class TicketServlet extends HttpServlet {

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
            out.println("<title>Servlet TicketServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TicketServlet at " + request.getContextPath() + "</h1>");
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
            Ticket tick = new Ticket();
        
        String ticket_ID = request.getParameter("ticket_ID");
        System.out.println("Operation"+ ticket_ID);
        String ticket_num = request.getParameter("ticket_num");
        System.out.println("Operation"+ ticket_num);
        String date_avail = request.getParameter("date_avail");
        System.out.println("Operation"+ date_avail);
        String depart = request.getParameter("depart");
        System.out.println("Operation"+ depart);
        String destination = request.getParameter("destination");
        System.out.println("Operation"+ destination);
        String operation = request.getParameter("operation"); 
        System.out.println("Operation"+ operation);
        
        if(!errorMsgs.isEmpty()){
                request.setAttribute("errorMsgs",errorMsgs);
                request.setAttribute("operation",operation);
                RequestDispatcher view = request.getRequestDispatcher("erroradd.jsp");
                view.forward(request, response);
                return;
            }
            
            tick.setTicket_ID(Integer.parseInt(ticket_ID));
            tick.setTicket_num(Integer.parseInt(ticket_num));
            tick.setDate_avail(date_avail);
            tick.setDepart(depart);
            tick.setDestination(destination);
            
            if (operation.equals("C")){
                registerDao dao = new registerDao();
                dao.addTicket(tick);
                
                request.setAttribute("ticket",tick);
                RequestDispatcher view = request.getRequestDispatcher("SuccessTrain.jsp");
                view.forward(request, response);
            
            }
    } catch (Exception ex){
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
