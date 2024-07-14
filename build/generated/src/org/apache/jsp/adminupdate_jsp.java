package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head><title>Update Schedule</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, intial-scale=1.0\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/nav.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/adminaddnew.css\">\n");
      out.write("\t</head>\n");
      out.write("\t\t<body style=\"font-family: BR Firma; background-repeat:no-repeat; background-size:cover;\" background=\"images\\bg.jpg\">\n");
      out.write("\t\t\t<!-----navigation------>\n");
      out.write("\t\t\t<nav>\n");
      out.write("\t\t\t\t<!--logo-->\n");
      out.write("\t\t\t\t<div class=\"head\">\n");
      out.write("\t\t\t\t\t<a href=\"Navigation.html\" class=\"logo\"><img src= \"images\\logo.jpg\" alt=\"\" height=\"75px\"></a>\n");
      out.write("\t\t\t\t\t<div class=\"acc\">\n");
      out.write("\t\t\t\t\t\t<a href=\"./AdminLogoutServlet\">Logout</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</nav><br>\n");
      out.write("\t        <div class=\"contain\">\n");
      out.write("\t\t\t\t<form action=\"adminupdate.jsp\" method=\"POST\">\n");
      out.write("                                    <input type=\"hidden\" name=\"operation\" value=\"U\">                                                                            \n");
      out.write("\n");
      out.write("                                    <div style=\"text-align: left;\">\n");
      out.write("                                        <h1>UPDATE SCHEDULE</h1>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div style=\"text-align: left;\">\n");
      out.write("                                        <h3>Train Information</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                        <div style=\"text-align: left;\">\n");
      out.write("                                        <input type=\"text\" name=\"sched_id\" id=\"depart\" required style=\"height:30px; width:400px;\">\n");
      out.write("                                        <input type=\"hidden\" name=\"operation\" value=\"U\">                                                                            \n");
      out.write("                                    </div>\n");
      out.write("                                    <div style=\"text-align: left;\">\n");
      out.write("                                        <h4>From:</h4>\n");
      out.write("                                        <input type=\"text\" name=\"depart\" id=\"depart\" required style=\"height:30px; width:400px;\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div style=\"text-align: left;\">\n");
      out.write("                                        <h4>To</h4>\n");
      out.write("                                                <input type=\"text\" name=\"arrival\" id=\"arrival\" required style=\"height:30px; width:400px;\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div style=\"text-align: left;\">\n");
      out.write("                                        <h4>Date</h4>\n");
      out.write("                                            <input type=\"date\" name=\"departDate\" id=\"departDate\" required style=\"height:30px; width:400px;\">     \n");
      out.write("                                    </div>\n");
      out.write("                                    <div style=\"text-align: left;\">\n");
      out.write("                                        <h4>Time:</h4>\n");
      out.write("                                        <p><input type=\"time\" name=\"departTime\" id=\"departTime\" required style=\"height:30px; width:400px;\">\n");
      out.write("                                    </div><br>\n");
      out.write("\t\t\t\t\t<input type =\"submit\" value=\"UPDATE\" name=\"update\" class=\"button\"><br><br>\n");
      out.write("\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t    </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
