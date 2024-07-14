package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class schedule_005fsuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

String admin_email = (String)session.getAttribute("admin_email"); //get attributes from session
if (admin_email == null) { //if null (user not login) redirect to login page
request.setAttribute("errMessage", "You have not login");
out.println( "<script> location.href='./adminlogin.jsp'; </script>");
}

      out.write('\n');
      out.write('\n');
      com.mvc.bean.Schedule Schedule = null;
      Schedule = (com.mvc.bean.Schedule) _jspx_page_context.getAttribute("Schedule", PageContext.REQUEST_SCOPE);
      if (Schedule == null){
        throw new java.lang.InstantiationException("bean Schedule not found within scope");
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head><title>New schedule</title>\n");
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
      out.write("                                            <a href=\"./AdminLogoutServlet\">Logout</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</nav><br>\n");
      out.write("                        \n");
      out.write("                        ");
      out.write("\n");
      out.write("                        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty successMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <div class=\"success-message\">\n");
      out.write("                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${successMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </c:if>\n");
      out.write("                        \n");
      out.write("                        ");
      out.write("\n");
      out.write("                        <div class=\"contain\">\n");
      out.write("                            <form>\n");
      out.write("                            <div style=\"text-align: left;\">\n");
      out.write("                                        <h1>New Schedule have been added</h1>\n");
      out.write("                            </div>\n");
      out.write("                                    <div style=\"text-align: left;\">\n");
      out.write("                                        <h4>From:</h4>\n");
      out.write("                                        ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString(org.apache.jasper.runtime.JspRuntimeLibrary.handleGetProperty(_jspx_page_context.findAttribute("schedule"), "depart")));
      out.write("<br>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div style=\"text-align: left;\">\n");
      out.write("                                        <h4>To</h4>\n");
      out.write("                                                ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString(org.apache.jasper.runtime.JspRuntimeLibrary.handleGetProperty(_jspx_page_context.findAttribute("schedule"), "arrival")));
      out.write("<br>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div style=\"text-align: left;\">\n");
      out.write("                                        <h4>Date</h4>\n");
      out.write("                                            ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString(org.apache.jasper.runtime.JspRuntimeLibrary.handleGetProperty(_jspx_page_context.findAttribute("schedule"), "departDate")));
      out.write("<br>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div style=\"text-align: left;\">\n");
      out.write("                                        <h4>Time:</h4>\n");
      out.write("                                        ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString(org.apache.jasper.runtime.JspRuntimeLibrary.handleGetProperty(_jspx_page_context.findAttribute("schedule"), "departTime")));
      out.write("<br>\n");
      out.write("                                    </div><br>\n");
      out.write("\t\t\t\t\t<input type =\"submit\" value=\"ADD NEW\" name=\"submit\" class=\"button\"><br><br>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
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
