package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head><title>Home Page</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, intial-scale=1.0\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/nav.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/home.css\">\n");
      out.write("\t</head>\n");
      out.write("\t<body style=\"font-family: BR Firma; background-repeat:no-repeat; background-size:cover;\" background=\"image/bg.jpg\">\n");
      out.write("\t\t\t<!-----navigation------>\n");
      out.write("\t\t\t<nav>\n");
      out.write("\t\t\t\t<!--logo-->\n");
      out.write("\t\t\t\t<div class=\"head\">\n");
      out.write("\t\t\t\t\t<a href=\"Navigation.html\" class=\"logo\" ><img src= \"image/logo.png\" alt=\"\" height=\"115px\"></a>\n");
      out.write("\t\t\t\t\t<div class=\"acc\">\n");
      out.write("\t\t\t\t\t\t<a href=\"https://www.instagram.com/izzati.alias/\" target=\"_blank\" ><img src=\"image/account.png\" style=\"width:47px;\"></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"./LogoutServlet\" style=\"margin-left:20px;padding-top:15px;\">Logout</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</nav><br>\n");
      out.write("            <!--Home Section -->\n");
      out.write("                <div class=\"border\"></div>\n");
      out.write("                <div class=\"contain\">\n");
      out.write("                    <h4><b>Hi, where would you like to go?:</b></h4>\n");
      out.write("                    <hr>\n");
      out.write("                       <form action=\"Search\" method=\"post\">\n");
      out.write("\t\t\t\t\t<p><b>From:</b></p>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"departing_location\" placeholder=\"\" style=\"height:30px; width:400px;\"><br><br>\n");
      out.write("\t\t\t\t\t<p><b>To:</b></p>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"arriving_location\" placeholder=\"\" style=\"height:30px; width:400px;\"><br><br>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                        <!--<p><b>Depart date:</b></p>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"depart_date\" placeholder=\"\" style=\"height:30px; width:400px;\"><br><br>\n");
      out.write("\t\t\t\t\t<p><b>Arrived date:</b></p>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"username\" placeholder=\"\" style=\"height:30px; width:400px;\"><br><br>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                        <p><b>Passengers:</b></p>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"username\" placeholder=\"\" style=\"height:30px; width:400px;\"><br><br>-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                        <input type =\"submit\" value=\"search\" name=\"search\" class=\"button\"><br>\n");
      out.write("\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t   \n");
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
