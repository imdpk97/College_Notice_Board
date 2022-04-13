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
      out.write("\n");
      out.write("        <title>HOME</title>\n");
      out.write("        <style>\n");
      out.write("            hr{\n");
      out.write("                height: 2px;\n");
      out.write("                background-color: greenyellow;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("        </style> \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-sm p-2 sticky-top navbar-dark \">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h5 style=\"color: yellow;\">College Notice Board</h5>\n");
      out.write("\n");
      out.write("                <!--class=\"text-info\"-->\n");
      out.write("\n");
      out.write("<!--                <button type=\"button\" class=\"navbar-toggler \" data-toggle=\"collapse\" data-target=\"#mymenu\">\n");
      out.write("                    <span class=\"navbar-toggler-icon \"></span>\n");
      out.write("\n");
      out.write("                </button>-->\n");
      out.write("                <div class=\"collapse navbar-collapse  text-center\" id=\"mymenu\">\n");
      out.write("                    <ul class=\" navbar-nav ml-auto\" >\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link \" href=\"home.jsp\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item \">\n");
      out.write("                            <a class=\"nav-link \" href=\"student_login.jsp\">Student</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"student_helpdesk.jsp\">Help Desk</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"admin_login.jsp\">Admin</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>     \n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"container py-5 z-depth-1\">\n");
      out.write("\n");
      out.write("            <!--Section: Content-->\n");
      out.write("            <section class=\" text-center text-lg-left dark-grey-text\">\n");
      out.write("\n");
      out.write("                <!--Grid row-->\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <!--Grid column-->\n");
      out.write("                    <div class=\"col-md-5 mb-4 py-4 mb-md-0\">\n");
      out.write("\n");
      out.write("                        <h3 class=\"font-weight-bold\">Welcome to College Notice Board</h3>\n");
      out.write("                        <hr>\n");
      out.write("\n");
      out.write("                        <ul>\n");
      out.write("                            <li>This web application helps the students to retrieve all the notices directly through their cell phones, laptops and computers.</li>\n");
      out.write("                        </ul>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>If any students face any type of problems related to notifications and forget password then they can convey to us using HelpDesk tab.</li>\n");
      out.write("                        </ul> \n");
      out.write("                        <ul>  \n");
      out.write("                            <li>First of all new students have to register themselves to see the Notice-Board and also they can download the notices.</li>\n");
      out.write("                        </ul> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-6 mb-9 mb-md-0\">\n");
      out.write("                        <!--Image-->\n");
      out.write("                        <div class=\"view overlay z-depth-1-half\">\n");
      out.write("                            <img src=\"image/snarv.jpeg\" class=\"img-fluid\" style=\"margin-left: 100px; \"alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </div>  \n");
      out.write("\n");
      out.write("        <div  style=\"margin-top: 40px\">  \n");
      out.write("            <div class=\"p-2 text-center text-white \" style=\"background-color:#27354e;\" >\n");
      out.write("                <p class=\"footer\">Copyright &copy;2021 | Designed By Pawan Kumar  |</p> \n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html> \n");
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
