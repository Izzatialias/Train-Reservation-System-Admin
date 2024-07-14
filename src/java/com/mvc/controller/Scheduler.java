/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.controller;

import com.mvc.bean.Schedule;
import com.mvc.dao.SchedDAO;
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
public class Scheduler extends HttpServlet {

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
            int sched_id = Integer.parseInt(request.getParameter("sched_id"));
            String depart = request.getParameter("depart");
            String arrival = request.getParameter("arrival");
            String departDate = request.getParameter("departDate");
            String departTime = request.getParameter("departTime");
            String operation = request.getParameter("operation");

            // Convert the departDateStr to a Date object
//            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            Date departDate = null;
//            try {
//                departDate = dateFormat.parse(departDateStr);
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
            
//            if (sched_id != null && !sched_id.isEmpty())
//                sched_id = "0"; //do form validation
//            
//            if(depart == null || depart.trim().length() == 0){
//                errorMsgs.add("Please enter the departing location.");
//            }
//            if(arrival == null || arrival.trim().length() == 0){
//                errorMsgs.add("Please enter the arrival location.");
//            }
//            departDate = null;
//            dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            if (departDateStr == null || departDateStr.trim().length() == 0) {
//                errorMsgs.add("Please enter the departure date.");
//            } else {
//                try {
//                    departDate = dateFormat.parse(departDateStr);
//                } catch (ParseException e) {
//                    errorMsgs.add("Invalid departure date format. Please use the format yyyy-MM-dd.");
//                }
//            }
//
//            // Validate departTime
//            Time departTime = null;
//            if (departTimeStr == null || departTimeStr.trim().length() == 0) {
//                errorMsgs.add("Please enter the departure time.");
//            } else {
//                try {
//                    LocalTime localTime = LocalTime.parse(departTimeStr);
//                    departTime = Time.valueOf(localTime);
//                } catch (DateTimeParseException e) {
//                    errorMsgs.add("Invalid departure time format. Please use the format HH:mm:ss.");
//                }
//            }
            
            // If there are any error messages, handle them accordingly
//            if (!errorMsgs.isEmpty()) {
//                // Set the error messages as a request attribute
//                request.setAttribute("errorMsgs", errorMsgs);
//                request.setAttribute("operation",operation);
//                RequestDispatcher view = request.getRequestDispatcher("erroradd.jsp");
//                view.forward(request, response);
//                return;
//            }
//            SchedDAO schedDAO = new SchedDAO();
//            schedDAO.addSchedule(sched);
//           
//            RequestDispatcher dispatcher = request.getRequestDispatcher("/test.jsp");
//            dispatcher.forward(request, response);
            
//            sched.setSchedId(Integer.parseInt(sched_id));
//            sched.setDepart(depart);
//            sched.setArrival(arrival);
//            sched.setDepartDate(departDateStr);
//            sched.setDepartTime(departTimeStr);
            Schedule sched = new Schedule(sched_id, depart, arrival, departDate, departTime);

            if (operation.equals("C")){
                SchedDAO dao = new SchedDAO();
                dao.addSchedule(sched);
         
                request.setAttribute("schedule",sched);
                RequestDispatcher view = request.getRequestDispatcher("adminhome.jsp");
                view.forward(request, response);
            }
            if (operation.equals("U")){
                SchedDAO dao = new SchedDAO();
                dao.updateSchedule(sched);

               request.setAttribute("schedule",sched);
               RequestDispatcher view = request.getRequestDispatcher("adminhome.jsp");
               view.forward(request, response);
            
            }
            if (operation.equals("D")){
                int id = sched_id;
                SchedDAO dao = new SchedDAO();
                dao.deleteSchedule(id);

                request.setAttribute("schedule",sched);
                RequestDispatcher view = request.getRequestDispatcher("adminhome.jsp");
                view.forward(request, response);
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
