package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class help_005fdesk_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("        <title>Help</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-sm p-2 sticky-top navbar-dark \">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h6 style=\"color: yellow;\">College Notice Board</h6>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <button type=\"button\" class=\"navbar-toggler \" data-toggle=\"collapse\" data-target=\"#mymenu\">\n");
      out.write("                    <span class=\"navbar-toggler-icon \"></span>\n");
      out.write("\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse  text-center\" id=\"mymenu\">\n");
      out.write("                    <ul class=\" navbar-nav ml-auto\" >\n");
      out.write("                        <li class=\"nav-item  \">\n");
      out.write("                            <a class=\"nav-link \" href=\"home.jsp\">Home</a>\n");
      out.write("                        </li>             \n");
      out.write("\n");
      out.write("                        <li class=\"nav-item  \">\n");
      out.write("                            <a class=\"nav-link \" href=\"student_login.jsp\">Student</a>\n");
      out.write("                        </li>         \n");
      out.write("\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\" href=\"help_desk.jsp\">Help Desk</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"admin_login.jsp\">Admin</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>     \n");
      out.write("        </nav>  \n");
      out.write("\n");
      out.write("        <div class=\"container py-5\">\n");
      out.write("            <div class=\"row justify-content-center align-items-center \">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6 \" style=\"background-color: rgb(227, 239, 250);\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-12 py-4\">\n");
      out.write("                        <div class=\"text-center text-info\" >\n");
      out.write("                            <h4>Help Desk </h4>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <hr class=\"bg-info\">\n");
      out.write("\n");
      out.write("                        <form action=\"HelpDesk\" method=\"POST\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputPassword1\">Name</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"uname\" Required placeholder=\"Enter your name\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputPassword1\">Email</label>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" name=\"uemail\" Required placeholder=\"Enter your email\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputPassword1\">Mobile No. </label>\n");
      out.write("                                <input type=\"number\" class=\"form-control\" name=\"umobile\"Required placeholder=\"Mobile Number\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"comment\">Message</label>\n");
      out.write("                                <textarea class=\"form-control\" rows=\"4\" name=\"msg\" placeholder=\"Enter you concern\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Send</button>\n");
      out.write("\n");
      out.write("                        </form>      \n");
      out.write("\n");
      out.write("                    </div>   \n");
      out.write("\n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("\n");
      out.write("        <div >  \n");
      out.write("            <div class=\"p-2 text-center text-white \" style=\"background-color:#27354e;\" >\n");
      out.write("                <p class=\"footer\">Copyright &copy;2021 | Designed by Sneha |</p> \n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("\n");
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
