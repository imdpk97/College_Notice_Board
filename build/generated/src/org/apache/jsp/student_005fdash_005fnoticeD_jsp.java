package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.servlet.*;

public final class student_005fdash_005fnoticeD_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Student</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-sm p-2 sticky-top navbar-dark \">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h5 style=\"color: yellow;\">Student</h5>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--                <button type=\"button\" class=\"navbar-toggler \" data-toggle=\"collapse\" data-target=\"#mymenu\">\n");
      out.write("                    <span class=\"navbar-toggler-icon \"></span>\n");
      out.write("\n");
      out.write("                </button>-->\n");
      out.write("                <div class=\"collapse navbar-collapse  text-center\" id=\"mymenu\">\n");
      out.write("                    <ul class=\" navbar-nav ml-auto\" >\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item active \">\n");
      out.write("                            <a class=\"nav-link \" href=\"student_dash_noticeD.jsp\">Notice/Circular</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item p-1 \">\n");
      out.write("                            <a class=\" btn btn-danger btn-sm \" href=\"student_login.jsp\">Logout</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>     \n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"container py-1\">\n");
      out.write("            \n");
      out.write("            <div class=\"row justify-content-center align-items-center \">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-12\" style=\"background-color: rgb(227, 239, 250);\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-18 mt-2 py-2\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-12 py-3\">   \n");
      out.write("                            \n");
      out.write("                            <div class=\"text-center text-info\" >\n");
      out.write("                                <h4>Notice Board</h4>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <hr class=\"bg-info\">    \n");
      out.write("\n");
      out.write("                            ");

                                Connection con;
//                                PreparedStatement ps;
                                ResultSet x;
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board", "root", "");

                                String query = "select * from notifications";
                                Statement st = con.createStatement();

                                x = st.executeQuery(query);

                                while (x.next()) {


                            
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"px-1\">\n");
      out.write("                                \n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"card-body p-2\">\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-2\">\n");
      out.write("                                                <p class=\"\"><b class=\"text-center text-success\">Date</b> : ");
      out.print(x.getString("s_date"));
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"col-7  \">\n");
      out.write("                                                <p><b class=\"text-center text-success\">Subject</b> : ");
      out.print(x.getString("sub"));
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            ");
      out.write("\n");
      out.write("\n");
      out.write("                                            <div class=\"col-3  text-right\">\n");
      out.write("                                                <button type=\"download\" class=\"btn btn-primary\"><a href=\"NoticeDownload?fileName=");
      out.print(x.getString(4));
      out.write("\" style=\"color: white\">Download</a></button>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("\n");
      out.write("                            ");

                                }

                            
      out.write("       \n");
      out.write("                        </div>   \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div style=\"margin-top: 70px\">  \n");
      out.write("            <div class=\"p-2 text-center text-white \" style=\"background-color:#27354e;\" >\n");
      out.write("                <p class=\"footer\">Copyright &copy;2021 | Designed By Sneha |</p> \n");
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
