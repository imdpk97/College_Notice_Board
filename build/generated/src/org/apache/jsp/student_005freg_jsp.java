package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_005freg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("        <title>Student</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-sm p-2 sticky-top navbar-dark \">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h6 style=\"color: yellow;\">College Notice Board</h6>\n");
      out.write("\n");
      out.write("                <button type=\"button\" class=\"navbar-toggler \" data-toggle=\"collapse\" data-target=\"#mymenu\">\n");
      out.write("                    <span class=\"navbar-toggler-icon \"></span>\n");
      out.write("\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse  text-center\" id=\"mymenu\">\n");
      out.write("                    <ul class=\" navbar-nav ml-auto\" >\n");
      out.write("                        <li class=\"nav-item  \">\n");
      out.write("                            <a class=\"nav-link \" href=\"home.jsp\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item active  \">\n");
      out.write("                            <a class=\"nav-link \" href=\"student_login.jsp\">Student</a>\n");
      out.write("                        </li>\n");
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
      out.write("        <div class=\"container py-2\">\n");
      out.write("            <div class=\"row justify-content-center align-items-center \">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6 \" style=\"background-color: rgb(227, 239, 250);\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-14 py-3\">\n");
      out.write("                        <div class=\"text-center text-info\" >\n");
      out.write("                            <h4> Student Registration</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <hr class=\"bg-info\">\n");
      out.write("                        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty loginError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <script>\n");
      out.write("                                window.addEventListener(\"load\", function () {\n");
      out.write("                                    alert(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\");\n");
      out.write("                                }\n");
      out.write("                            </script>\n");
      out.write("                        </c:if>\n");
      out.write("\n");
      out.write("                        <form action=\"StudentReg\" method=\"POST\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label >Scholar No./Roll No.</label>\n");
      out.write("                                <input type=\"Username\" class=\"form-control\" name=\"uscholar\" Required placeholder=\"Enter Roll No.\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputPassword1\">Name</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"uname\" Required placeholder=\"Enter your name\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleFormControlSelect1\">Degree</label>\n");
      out.write("                                <select class=\"form-control\" name=\"udegree\" id=\"exampleFormControlSelect1\">\n");
      out.write("\n");
      out.write("                                    <option>MCA</option>\n");
      out.write("                                    <option>M.Tech</option>\n");
      out.write("                                    <option>B.Tech</option>\n");
      out.write("\n");
      out.write("                                </select>\n");
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
      out.write("                                <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"upass\" Required placeholder=\"Password\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Register</button>\n");
      out.write("                            <a class=\"text-success px-3\" href=\"student_login.jsp\">Click here to Student Login</a>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>   \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div  style=\"margin-top: 30px\">  \n");
      out.write("            <div class=\"p-2 text-center text-white \" style=\"background-color:#27354e;\" >\n");
      out.write("                <p class=\"footer\">Copyright &copy;2021 | Designed By Sneha |</p> \n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("\n");
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
