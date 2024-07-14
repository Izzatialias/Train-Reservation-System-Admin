package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mvc.bean.Schedule;
import com.mvc.dao.SchedDAO;
import util.DBConnection;
import java.sql.*;

public final class admindelete_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Connection conn = DBConnection.createConnection();
    Statement stmt = conn.createStatement();
    String sql = "SELECT SCHED_ID, CAST(SCHED_ID AS CHAR(2))"
                + "FROM SCHEDULE ORDER BY SCHED_ID";
    ResultSet rs = stmt.executeQuery(sql);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title> Delete Leave </title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <style>\n");
      out.write("        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap');\n");
      out.write("        *{\n");
      out.write("          margin: 0;\n");
      out.write("          padding: 0;\n");
      out.write("          box-sizing: border-box;\n");
      out.write("          font-family: 'Poppins', sans-serif;\n");
      out.write("        }\n");
      out.write("        .sidebar{\n");
      out.write("          position: fixed;\n");
      out.write("          top: 0;\n");
      out.write("          left: 0;\n");
      out.write("          height: 100%;\n");
      out.write("          width: 260px;\n");
      out.write("          background: #11101d;\n");
      out.write("          z-index: 100;\n");
      out.write("          transition: all 0.5s ease;\n");
      out.write("        }\n");
      out.write("        .sidebar.close{\n");
      out.write("          width: 78px;\n");
      out.write("        }\n");
      out.write("        .sidebar .logo-details{\n");
      out.write("          height: 60px;\n");
      out.write("          width: 100%;\n");
      out.write("          display: flex;\n");
      out.write("          align-items: center;\n");
      out.write("        }\n");
      out.write("        .sidebar .logo-details i{\n");
      out.write("          font-size: 30px;\n");
      out.write("          color: #fff;\n");
      out.write("          height: 50px;\n");
      out.write("          min-width: 78px;\n");
      out.write("          text-align: center;\n");
      out.write("          line-height: 50px;\n");
      out.write("        }\n");
      out.write("        .sidebar .logo-details .logo_name{\n");
      out.write("          font-size: 22px;\n");
      out.write("          color: #fff;\n");
      out.write("          font-weight: 600;\n");
      out.write("          transition: 0.3s ease;\n");
      out.write("          transition-delay: 0.1s;\n");
      out.write("        }\n");
      out.write("        .sidebar.close .logo-details .logo_name{\n");
      out.write("          transition-delay: 0s;\n");
      out.write("          opacity: 0;\n");
      out.write("          pointer-events: none;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-links{\n");
      out.write("          height: 100%;\n");
      out.write("          padding: 30px 0 150px 0;\n");
      out.write("          overflow: auto;\n");
      out.write("        }\n");
      out.write("        .sidebar.close .nav-links{\n");
      out.write("          overflow: visible;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-links::-webkit-scrollbar{\n");
      out.write("          display: none;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-links li{\n");
      out.write("          position: relative;\n");
      out.write("          list-style: none;\n");
      out.write("          transition: all 0.4s ease;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-links li:hover{\n");
      out.write("          background: #1d1b31;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-links li .iocn-link{\n");
      out.write("          display: flex;\n");
      out.write("          align-items: center;\n");
      out.write("          justify-content: space-between;\n");
      out.write("        }\n");
      out.write("        .sidebar.close .nav-links li .iocn-link{\n");
      out.write("          display: block\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-links li i{\n");
      out.write("          height: 50px;\n");
      out.write("          min-width: 78px;\n");
      out.write("          text-align: center;\n");
      out.write("          line-height: 50px;\n");
      out.write("          color: #fff;\n");
      out.write("          font-size: 20px;\n");
      out.write("          cursor: pointer;\n");
      out.write("          transition: all 0.3s ease;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-links li.showMenu i.arrow{\n");
      out.write("          transform: rotate(-180deg);\n");
      out.write("        }\n");
      out.write("        .sidebar.close .nav-links i.arrow{\n");
      out.write("          display: none;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-links li a{\n");
      out.write("          display: flex;\n");
      out.write("          align-items: center;\n");
      out.write("          text-decoration: none;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-links li a .link_name{\n");
      out.write("          font-size: 18px;\n");
      out.write("          font-weight: 400;\n");
      out.write("          color: #fff;\n");
      out.write("          transition: all 0.4s ease;\n");
      out.write("        }\n");
      out.write("        .sidebar.close .nav-links li a .link_name{\n");
      out.write("          opacity: 0;\n");
      out.write("          pointer-events: none;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-links li .sub-menu{\n");
      out.write("          padding: 6px 6px 14px 80px;\n");
      out.write("          margin-top: -10px;\n");
      out.write("          background: #1d1b31;\n");
      out.write("          display: none;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-links li.showMenu .sub-menu{\n");
      out.write("          display: block;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-links li .sub-menu a{\n");
      out.write("          color: #fff;\n");
      out.write("          font-size: 15px;\n");
      out.write("          padding: 5px 0;\n");
      out.write("          white-space: nowrap;\n");
      out.write("          opacity: 0.6;\n");
      out.write("          transition: all 0.3s ease;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-links li .sub-menu a:hover{\n");
      out.write("          opacity: 1;\n");
      out.write("        }\n");
      out.write("        .sidebar.close .nav-links li .sub-menu{\n");
      out.write("          position: absolute;\n");
      out.write("          left: 100%;\n");
      out.write("          top: -10px;\n");
      out.write("          margin-top: 0;\n");
      out.write("          padding: 10px 20px;\n");
      out.write("          border-radius: 0 6px 6px 0;\n");
      out.write("          opacity: 0;\n");
      out.write("          display: block;\n");
      out.write("          pointer-events: none;\n");
      out.write("          transition: 0s;\n");
      out.write("        }\n");
      out.write("        .sidebar.close .nav-links li:hover .sub-menu{\n");
      out.write("          top: 0;\n");
      out.write("          opacity: 1;\n");
      out.write("          pointer-events: auto;\n");
      out.write("          transition: all 0.4s ease;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-links li .sub-menu .link_name{\n");
      out.write("          display: none;\n");
      out.write("        }\n");
      out.write("        .sidebar.close .nav-links li .sub-menu .link_name{\n");
      out.write("          font-size: 18px;\n");
      out.write("          opacity: 1;\n");
      out.write("          display: block;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-links li .sub-menu.blank{\n");
      out.write("          opacity: 1;\n");
      out.write("          pointer-events: auto;\n");
      out.write("          padding: 3px 20px 6px 16px;\n");
      out.write("          opacity: 0;\n");
      out.write("          pointer-events: none;\n");
      out.write("        }\n");
      out.write("        .sidebar .nav-links li:hover .sub-menu.blank{\n");
      out.write("          top: 50%;\n");
      out.write("          transform: translateY(-50%);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .one {\n");
      out.write("          width: 80%;\n");
      out.write("          margin-left: 10%;\n");
      out.write("          background-color: black;\n");
      out.write("          height: 400px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .sidebar .profile-details{\n");
      out.write("          position: fixed;\n");
      out.write("          bottom: 0;\n");
      out.write("          width: 260px;\n");
      out.write("          display: flex;\n");
      out.write("          align-items: center;\n");
      out.write("          justify-content: space-between;\n");
      out.write("          background: #1d1b31;\n");
      out.write("          padding: 12px 0;\n");
      out.write("          transition: all 0.5s ease;\n");
      out.write("        }\n");
      out.write("        .sidebar.close .profile-details{\n");
      out.write("          background: none;\n");
      out.write("        }\n");
      out.write("        .sidebar.close .profile-details{\n");
      out.write("          width: 78px;\n");
      out.write("        }\n");
      out.write("        .sidebar .profile-details .profile-content{\n");
      out.write("          display: flex;\n");
      out.write("          align-items: center;\n");
      out.write("        }\n");
      out.write("        .sidebar .profile-details img{\n");
      out.write("          height: 52px;\n");
      out.write("          width: 52px;\n");
      out.write("          object-fit: cover;\n");
      out.write("          border-radius: 16px;\n");
      out.write("          margin: 0 14px 0 12px;\n");
      out.write("          background: #1d1b31;\n");
      out.write("          transition: all 0.5s ease;\n");
      out.write("        }\n");
      out.write("        .sidebar.close .profile-details img{\n");
      out.write("          padding: 10px;\n");
      out.write("        }\n");
      out.write("        .sidebar .profile-details .profile_name,\n");
      out.write("        .sidebar .profile-details .job{\n");
      out.write("          color: #fff;\n");
      out.write("          font-size: 18px;\n");
      out.write("          font-weight: 500;\n");
      out.write("          white-space: nowrap;\n");
      out.write("        }\n");
      out.write("        .sidebar.close .profile-details i,\n");
      out.write("        .sidebar.close .profile-details .profile_name,\n");
      out.write("        .sidebar.close .profile-details .job{\n");
      out.write("          display: none;\n");
      out.write("        }\n");
      out.write("        .sidebar .profile-details .job{\n");
      out.write("          font-size: 12px;\n");
      out.write("        }\n");
      out.write("        .home-section{\n");
      out.write("          position: relative;\n");
      out.write("          background: #E4E9F7;\n");
      out.write("          height: 100vh;\n");
      out.write("          left: 260px;\n");
      out.write("          width: calc(100% - 260px);\n");
      out.write("          transition: all 0.5s ease;\n");
      out.write("        }\n");
      out.write("        .sidebar.close ~ .home-section{\n");
      out.write("          left: 78px;\n");
      out.write("          width: calc(100% - 78px);\n");
      out.write("        }\n");
      out.write("        .home-section .home-header{\n");
      out.write("          height: 60px;\n");
      out.write("          display: flex;\n");
      out.write("          align-items: center;\n");
      out.write("        }\n");
      out.write("        .home-section .home-header .bx-menu,\n");
      out.write("        .home-section .home-header .text{\n");
      out.write("          color: #11101d;\n");
      out.write("          font-size: 35px;\n");
      out.write("        }\n");
      out.write("        .home-section .home-header .bx-menu{\n");
      out.write("          margin: 0 15px;\n");
      out.write("          cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .home-section .home-header .text{\n");
      out.write("          font-size: 26px;\n");
      out.write("          font-weight: 600;\n");
      out.write("        }\n");
      out.write("        .home-section .home-content{\n");
      out.write("            /*height: 550px;*/\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            margin: 0 15px;\n");
      out.write("        }\n");
      out.write("        .home-section .home-content .bx-menu,\n");
      out.write("        .home-section .home-content .text{\n");
      out.write("            color: #11101d;\n");
      out.write("            font-size: 15px;\n");
      out.write("        }\n");
      out.write("        .home-section .home-content .bx-menu{\n");
      out.write("          margin: 0 15px;\n");
      out.write("          cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .home-section .home-content .text{\n");
      out.write("          font-size: 26px;\n");
      out.write("          font-weight: 600;\n");
      out.write("        }\n");
      out.write("        @media (max-width: 420px) {\n");
      out.write("          .sidebar.close .nav-links li .sub-menu{\n");
      out.write("            display: none;\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    <!-- Boxiocns CDN Link -->\n");
      out.write("    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("   </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"sidebar close\">\n");
      out.write("      <div class=\"logo-details\">\n");
      out.write("        <i class='bx bxl-c-plus-plus'></i>\n");
      out.write("        <span class=\"logo_name\">EMS</span>\n");
      out.write("      </div>\n");
      out.write("      <ul class=\"nav-links\">\n");
      out.write("        <li>\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class='bx bx-grid-alt' ></i>\n");
      out.write("            <span class=\"link_name\">Dashboard</span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"sub-menu blank\">\n");
      out.write("            <li><a class=\"link_name\" href=\"#\">Category</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <div class=\"iocn-link\">\n");
      out.write("            <a href=\"#\">\n");
      out.write("              <i class='bx bx-collection' ></i>\n");
      out.write("              <span class=\"link_name\">Employee</span>\n");
      out.write("            </a>\n");
      out.write("            <i class='bx bxs-chevron-down arrow' ></i>\n");
      out.write("          </div>\n");
      out.write("          <ul class=\"sub-menu\">\n");
      out.write("            <li><a class=\"link_name\" href=\"#\">Employee</a></li>\n");
      out.write("            <li><a href=\"AddEmployee.jsp\">Add Employee</a></li>\n");
      out.write("            <li><a href=\"ListEmployee.jsp\">List Employee</a></li>\n");
      out.write("            <li><a href=\"viewEmployee.jsp\">View Employee</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <div class=\"iocn-link\">\n");
      out.write("            <a href=\"#\">\n");
      out.write("              <i class='bx bx-book-alt' ></i>\n");
      out.write("              <span class=\"link_name\">Department</span>\n");
      out.write("            </a>\n");
      out.write("            <i class='bx bxs-chevron-down arrow' ></i>\n");
      out.write("          </div>\n");
      out.write("          <ul class=\"sub-menu\">\n");
      out.write("            <li><a class=\"link_name\" href=\"#\">Department</a></li>\n");
      out.write("            <li><a href=\"AddDept.jsp\">Add Department</a></li>\n");
      out.write("            <li><a href=\"ListDepartment.jsp\">List Department</a></li>\n");
      out.write("            <li><a href=\"viewDepartment.jsp\">View Department</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <div class=\"iocn-link\">\n");
      out.write("            <a href=\"#\">\n");
      out.write("              <i class='bx bx-calendar-check' ></i>\n");
      out.write("              <span class=\"link_name\">Leave</span>\n");
      out.write("            </a>\n");
      out.write("            <i class='bx bxs-chevron-down arrow' ></i>\n");
      out.write("          </div>\n");
      out.write("          <ul class=\"sub-menu\">\n");
      out.write("            <li><a class=\"link_name\" href=\"#\">Leave</a></li>\n");
      out.write("            <li><a href=\"AddLeave.jsp\">Add Leave</a></li>\n");
      out.write("            <li><a href=\"ListLeave.jsp\">List Leave</a></li>\n");
      out.write("            <li><a href=\"viewLeave.jsp\">View Leave</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a href=\"./LogoutServlet\">\n");
      out.write("            <i class='bx bx-log-out' ></i>\n");
      out.write("            <span class=\"link_name\">Logout</span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"sub-menu blank\">\n");
      out.write("            <li><a class=\"link_name\" href=\"#\">Logout</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <section class=\"home-section\">\n");
      out.write("      <div class=\"home-header\">\n");
      out.write("        <i class='bx bx-menu' ></i>\n");
      out.write("        <span class=\"text\">Employee Management System</span>\n");
      out.write("      </div>\n");
      out.write("        <div class=\"home-content\">\n");
      out.write("            <span>\n");
      out.write("                ");

                    int shed_id = Integer.parseInt(request.getParameter("shed_id"));
                    Schedule sched;
                    SchedDAO dao = new SchedDAO();
                    sched = dao.getSchedule(shed_id);
                
      out.write("\n");
      out.write("                <h1>Delete Leave</h1>\n");
      out.write("                <form action=\"Scheduler\" method=\"GET\">\n");
      out.write("                    <table border=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Employee ID:</td>\n");
      out.write("                            <td>\n");
      out.write("                                <select name=\"shed_id\" disabled>\n");
      out.write("                                    ");
 // Iterate over the ResultSet
                                        while(rs.next()) { 
      out.write("\n");
      out.write("                                        <option value='");
      out.print(rs.getInt("shed_id") );
      out.write("'>\n");
      out.write("                                        </option>\n");
      out.write("                                    ");
 }
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Reason:</td>\n");
      out.write("                            <td><input type=\"textarea\" name=\"depart\" value=\"");
      out.print(sched.getDepart());
      out.write("\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Date:</td>\n");
      out.write("                            <td><input type=\"text\" name=\"arrival\" value=\"");
      out.print(sched.getArrival());
      out.write("\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Date:</td>\n");
      out.write("                            <td><input type=\"date\" name=\"departDate\" value=\"");
      out.print(sched.getDepartDate());
      out.write("\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Date:</td>\n");
      out.write("                            <td><input type=\"time\" name=\"departTime\" value=\"");
      out.print(sched.getDepartTime());
      out.write("\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"hidden\" name=\"operation\" value=\"D\">\n");
      out.write("                                <input type=\"hidden\" name=\"sched_id\" value=\"");
      out.print(sched.getSchedId());
      out.write("\">\n");
      out.write("                            </td>\n");
      out.write("                            <td><input type=\"submit\" value=\"Delete\"</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("                ");

                    rs.close();//CLose result set
                    stmt.close();//Close the statement
                    conn.close();//Close the connection
                
      out.write("\n");
      out.write("            </span>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    <!--<div class=\"one\">test</div>-->\n");
      out.write("    <script>\n");
      out.write("      let arrow = document.querySelectorAll(\".arrow\");\n");
      out.write("      for (var i = 0; i < arrow.length; i++) {\n");
      out.write("        arrow[i].addEventListener(\"click\", (e)=>{\n");
      out.write("      let arrowParent = e.target.parentElement.parentElement;//selecting main parent of arrow\n");
      out.write("      arrowParent.classList.toggle(\"showMenu\");\n");
      out.write("        });\n");
      out.write("      }\n");
      out.write("      let sidebar = document.querySelector(\".sidebar\");\n");
      out.write("      let sidebarBtn = document.querySelector(\".bx-menu\");\n");
      out.write("      console.log(sidebarBtn);\n");
      out.write("      sidebarBtn.addEventListener(\"click\", ()=>{\n");
      out.write("        sidebar.classList.toggle(\"close\");\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}