package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head><title>Login Page</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, intial-scale=1.0\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/nav.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/login.css\">\n");
      out.write("        <style>\n");
      out.write(".dropbtn {\n");
      out.write("  background-color: white;\n");
      out.write("  color: black;\n");
      out.write("  padding: 16px;\n");
      out.write("  font-size: 20px;\n");
      out.write("  border: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("  position: relative;\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("  display: none;\n");
      out.write("  position: absolute;\n");
      out.write("  background-color: #f1f1f1;\n");
      out.write("  min-width: 160px;\n");
      out.write("  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("  z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("  color: black;\n");
      out.write("  padding: 12px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {background-color: white;}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {display: block;}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropbtn {background-color: white;}\n");
      out.write("</style>\n");
      out.write("\t</head>\n");
      out.write("\t\t<body style=\"font-family: BR Firma; background-repeat:no-repeat; background-size:cover;\" background=\"image/bg.jpg\">\n");
      out.write("\t\t\t<!-----navigation------>\n");
      out.write("\t\t\t<nav>\n");
      out.write("\t\t\t\t<!--logo-->\n");
      out.write("\t\t\t\t<div class=\"head\">\n");
      out.write("\t\t\t\t\t<a href=\"Navigation.html\" class=\"logo\" ><img src= \"image/logo.png\" alt=\"\" height=\"115px\"></a>\n");
      out.write("\t\t\t\t\t<div class=\"acc\">\n");
      out.write("\t\t\t\t\t\t<a href=\"https://www.instagram.com/izzati.alias/\" target=\"_blank\" ><img src=\"image/account.png\" style=\"width:47px;\"></a>\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown\">\n");
      out.write("                                                <button class=\"dropbtn\">Login As</button>\n");
      out.write("                                                <div class=\"dropdown-content\">\n");
      out.write("                                                  <a href=\"adminlogin.jsp\">Admin</a>\n");
      out.write("                                                  <a href=\"login.jsp\">Customer</a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</nav><br>\n");
      out.write("\t\t\t\n");
      out.write("\t    <!--Login Section -->\n");
      out.write("\t        <div class=\"contain\">\n");
      out.write("\t\t\t\t<form action=\"LoginServlet\" method=\"post\">\n");
      out.write("\t\t\t\t\t<h1>Login</h1>\n");
      out.write("\t\t\t\t\t<p>Please enter your email and password:</p>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"cust_email\" placeholder=\"Email\" style=\"height:30px; width:400px;\"><br><br>\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"cust_pss\" placeholder=\"Password\" style=\"height:30px; width:400px;\"><br><br>\n");
      out.write("\t\t\t\t\t<input type =\"submit\" value=\"Login\" name=\"login\" class=\"button\"><br><br>\n");
      out.write("\t\t\t\t\t<p>Don't you have an account?<a href=\"register.jsp\">Create One</a></p\n");
      out.write("                                        \n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t    </div>\n");
      out.write("    </body>\n");
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
