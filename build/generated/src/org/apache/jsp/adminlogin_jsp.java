package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head><title>Admin Login Page</title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, intial-scale=1.0\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/nav.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/adminlogin.css\">\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("        <style>\r\n");
      out.write(".dropbtn {\r\n");
      out.write("  background-color: #04AA6D;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 16px;\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  border: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content {\r\n");
      out.write("  display: none;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  background-color: #f1f1f1;\r\n");
      out.write("  min-width: 160px;\r\n");
      out.write("  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\r\n");
      out.write("  z-index: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content a {\r\n");
      out.write("  color: black;\r\n");
      out.write("  padding: 12px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content a:hover {background-color: #ddd;}\r\n");
      out.write("\r\n");
      out.write(".dropdown:hover .dropdown-content {display: block;}\r\n");
      out.write("\r\n");
      out.write(".dropdown:hover .dropbtn {background-color: #3e8e41;}\r\n");
      out.write("</style>\r\n");
      out.write("\t\t<body style=\"font-family: BR Firma; background-repeat:no-repeat; background-size:cover;\" background=\"images/bg.jpg\">\r\n");
      out.write("\t\t\t<!-----navigation------>\r\n");
      out.write("\t\t\t<nav>\r\n");
      out.write("\t\t\t\t<!--logo-->\r\n");
      out.write("\t\t\t\t<div class=\"head\">\r\n");
      out.write("\t\t\t\t\t<a href=\"Navigation.html\" class=\"logo\" ><img src= \"images/logo.jpg\" alt=\"\" height=\"115px\"></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"acc\">\r\n");
      out.write("                                            <img src=\"images/account.jpg\" style=\"width:47px;\"></a>\r\n");
      out.write("                                            \r\n");
      out.write("                                            <div class=\"dropdown\">\r\n");
      out.write("                                                <button class=\"dropbtn\">Dropdown</button>\r\n");
      out.write("                                                <div class=\"dropdown-content\">\r\n");
      out.write("                                                  <a href=\"adminlogin.jsp\">Admin</a>\r\n");
      out.write("                                                  <a>Customer</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</nav><br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t    <!--Login Section -->\r\n");
      out.write("\t        <div class=\"contain\">\r\n");
      out.write("\t\t\t\t<form action=\"AdminLoginServlet\" method=\"post\" onsubmit=\"return validate\"()>\r\n");
      out.write("\t\t\t\t\t<h1>Admin Login</h1>\r\n");
      out.write("\t\t\t\t\t<p>Please enter your email and password:</p>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"admin_email\" placeholder=\"Admin Email\" style=\"height:30px; width:400px;\"><br><br>\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"admin_pss\" placeholder=\"Password\" style=\"height:30px; width:400px;\"><br><br>\r\n");
      out.write("                                        <span style=\"color:red\">\r\n");
      out.write("                                            ");
      out.print((request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage"));
      out.write("\r\n");
      out.write("                                        </span><br>\r\n");
      out.write("\t\t\t\t\t<input type =\"submit\" value=\"Login\" name=\"login\" class=\"button\"><br><br>\r\n");
      out.write("                                </form>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("                </body>\r\n");
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
