package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.servlet.*;

public final class admin_005fdash_005fstudentStatus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-sm p-2 sticky-top navbar-dark \">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h5 style=\"color: yellow;\">Admin</h5>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <button type=\"button\" class=\"navbar-toggler \" data-toggle=\"collapse\" data-target=\"#mymenu\">\n");
      out.write("                    <span class=\"navbar-toggler-icon \"></span>\n");
      out.write("\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse  text-center\" id=\"mymenu\">\n");
      out.write("                    <ul class=\" navbar-nav ml-auto\" >\n");
      out.write("                        \n");
      out.write("                         <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\" href=\"admin_dash_studentStatus.jsp\">Status</a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link \" href=\"admin_dash_studentD.jsp\">Student</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link \" href=\"admin_dash_noticeD.jsp\">Notice</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link \" href=\"admin_dash_addNotice.jsp\">Add Notice</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"admin_dash_helpdesk.jsp\">Help Desk</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item p-1 \">\n");
      out.write("                            <a class=\" btn btn-danger btn-sm \" href=\"admin_login.jsp\">Logout</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>     \n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid contact-form \">\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("            <h5 class=\"text-center text-success \">STUDENT DETAILS</h5>\n");
      out.write("            <hr>       \n");
      out.write("\n");
      out.write("            <div class=\"row \">\n");
      out.write("                <div class=\" col-md-12\">\n");
      out.write("                    <table class=\"table border\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr class=\" bg-info text-white\">\n");
      out.write("                                <th>Sch./Roll No.</th>\n");
      out.write("                                <th>Name</th> \n");
      out.write("                                <th>Degree</th> \n");
      out.write("                                <th>Mobile</th>\n");
      out.write("                                <th>Status</th>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>   \n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                Connection con;
//                                PreparedStatement ps;
                                ResultSet x;
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board", "root", "");

                                String query = "select * from studentregister";
                                Statement st = con.createStatement();

                                x = st.executeQuery(query);

                                while (x.next()) {
                                    String scholar = x.getString("scholar");

                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(x.getString("scholar"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(x.getString("name"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(x.getString("degree"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(x.getString("mobile"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(x.getString("status"));
      out.write("</td>\n");
      out.write("                               \n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                }

                            
      out.write("\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div style=\"margin-top: 100px\" >  \n");
      out.write("            <div class=\"p-2 text-center text-white \" style=\"background-color:#27354e;\" >\n");
      out.write("                <p class=\"footer\">Copyright &copy;2021 | Designed By Sneha |</p> \n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("\n");
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
