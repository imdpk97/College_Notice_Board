package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <title>Student</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <nav class=\"navbar navbar-expand-sm p-2 sticky-top navbar-dark \">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h6 style=\"color: yellow;\">College Notice Board</h6>\n");
      out.write("            \n");
      out.write("              \n");
      out.write("            <button type=\"button\" class=\"navbar-toggler \" data-toggle=\"collapse\" data-target=\"#mymenu\">\n");
      out.write("                <span class=\"navbar-toggler-icon \"></span>\n");
      out.write("                \n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse  text-center\" id=\"mymenu\">\n");
      out.write("            <ul class=\" navbar-nav ml-auto\" >\n");
      out.write("                <li class=\"nav-item  \">\n");
      out.write("                    <a class=\"nav-link \" href=\"home.jsp\">Home</a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                                 \n");
      out.write("                <li class=\"nav-item active  \">\n");
      out.write("                  <a class=\"nav-link \" href=\"student_login.jsp\">Student</a>\n");
      out.write("              </li>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"student_helpdesk.jsp\">Help Desk</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"admin_login.jsp\">Admin</a>\n");
      out.write("                </li>\n");
      out.write("               \n");
      out.write("            </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>     \n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("   <div class=\"container py-5\">\n");
      out.write("        <div class=\"row justify-content-center align-items-center \">\n");
      out.write("      \n");
      out.write("          <div class=\"col-md-5 \" style=\"background-color: rgb(227, 239, 250);\">\n");
      out.write("                   \n");
      out.write("              <div class=\"col-md-12 py-4\">\n");
      out.write("                  <div class=\"text-center text-info\" >\n");
      out.write("                      <h4> Student Login</h4>\n");
      out.write("                  </div>\n");
      out.write("                      <hr class=\"bg-info\">\n");
      out.write("                      \n");
      out.write("                        \n");
      out.write("                      \n");
      out.write("                           <form action=\"StudentLog\" method=\"POST\">\n");
      out.write("                   \n");
      out.write("                           <div class=\"form-group\">\n");
      out.write("                                <label >Email</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"uemail\" Required placeholder=\"Enter Email\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label >Password</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"upass\" Required placeholder=\"Password\">\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Login</button>\n");
      out.write("                             <a class=\"text-success px-3\" href=\"student_reg.jsp\">Click here to  New Student Registration</a>\n");
      out.write("                          </form>\n");
      out.write("\n");
      out.write("                             \n");
      out.write("                        </div>   \n");
      out.write("                          \n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                   </div>  \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("   <div  style=\"margin-top: 100px\">  \n");
      out.write("        <div class=\"p-2 text-center text-white \" style=\"background-color:#27354e;\" >\n");
      out.write("            <p class=\"footer\">Copyright &copy;2021 | Designed By Sneha |</p> \n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("   \n");
      out.write("\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("     Required meta tags \n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("     Bootstrap CSS \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <title>Student</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <nav class=\"navbar navbar-expand-sm p-2 sticky-top navbar-dark \">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h6 class=\"text-info\">College Notice Board</h6>\n");
      out.write("            \n");
      out.write("              \n");
      out.write("            <button type=\"button\" class=\"navbar-toggler \" data-toggle=\"collapse\" data-target=\"#mymenu\">\n");
      out.write("                <span class=\"navbar-toggler-icon \"></span>\n");
      out.write("                \n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse  text-center\" id=\"mymenu\">\n");
      out.write("            <ul class=\" navbar-nav ml-auto\" >\n");
      out.write("                <li class=\"nav-item  \">\n");
      out.write("                    <a class=\"nav-link \" href=\"home.jsp\">Home</a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                                 \n");
      out.write("                <li class=\"nav-item active  \">\n");
      out.write("                  <a class=\"nav-link \" href=\"student_login.jsp\">Student</a>\n");
      out.write("              </li>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"help_desk.jsp\">Help Desk</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"admin_login.jsp\">Admin</a>\n");
      out.write("                </li>\n");
      out.write("               \n");
      out.write("            </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>     \n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("   <div class=\"container py-5\">\n");
      out.write("        <div class=\"row justify-content-center align-items-center \">\n");
      out.write("      \n");
      out.write("          <div class=\"col-md-5 \" style=\"background-color: rgb(227, 239, 250);\">\n");
      out.write("                   \n");
      out.write("              <div class=\"col-md-12 py-4\">\n");
      out.write("                  <div class=\"text-center text-info\" >\n");
      out.write("                      <h4> Student Login</h4>\n");
      out.write("                  </div>\n");
      out.write("                      <hr class=\"bg-info\">\n");
      out.write("                      \n");
      out.write("                        \n");
      out.write("                      \n");
      out.write("                           <form action=\"StudentLog\" method=\"POST\">\n");
      out.write("                   \n");
      out.write("                           <div class=\"form-group\">\n");
      out.write("                                <label >Email</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"uemail\"  Required placeholder=\"Enter Email\">\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label >Password</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"upass\" Required placeholder=\"Password\">\n");
      out.write("                            \n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Login</button>\n");
      out.write("                             <a class=\"text-success px-3\" href=\"student_reg.jsp\">Click here to Student New Registration</a>\n");
      out.write("                          </form>\n");
      out.write("\n");
      out.write("                             \n");
      out.write("                        </div>   \n");
      out.write("                          \n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                   </div>  \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("   <div  style=\"margin-top: 100px\">  \n");
      out.write("        <div class=\"p-2 text-center text-white \" style=\"background-color:#27354e;\" >\n");
      out.write("            <p class=\"footer\">Copyright &copy;2021 | Designed by Sneha |</p> \n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("   \n");
      out.write("\n");
      out.write("     Optional JavaScript \n");
      out.write("     jQuery first, then Popper.js, then Bootstrap JS \n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("</html>-->\n");
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
