package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class studentD_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Edit Employee</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       ");

            if (request.getParameter("scholar") == null)
                response.sendRedirect("admin_dash_studentD.jsp");
            else {
                int scholar = Integer.parseInt(request.getParameter("scholar"));
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board", "root", "");
                    String sql = "select * from studentregister where scholar=?";
                    PreparedStatement smt = con.prepareStatement(sql);
                    smt.setInt(1, scholar);
                    ResultSet rs = smt.executeQuery();
                    if (rs.next()) {
      out.write("\n");
      out.write("\n");
      out.write("                    <form action=\"StudentDetailsEdit?op=update\" method=\"POST\" >\n");
      out.write("            <div class=\"container-fluid contact-form \">\n");
      out.write("\n");
      out.write("                <hr>\n");
      out.write("                <h4 class=\"text-center text-success \">Notice Update</h4>\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("                <div class=\"row \">\n");
      out.write("                    <div class=\" col-md-12\">\n");
      out.write("                        <table class=\"table border\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr class=\" bg-info text-white\">\n");
      out.write("\n");
      out.write("                                    <th>Name</th>\n");
      out.write("                                    <th>Degree</th>\n");
      out.write("                                    <th>Email</th> \n");
      out.write("                                    <th>Mobile</th> \n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                            <input type=\"hidden\" name=\"scholar\" value=\"");
      out.print(scholar);
      out.write("\"/>\n");
      out.write("\n");
      out.write("                            <td><input type=\"text\" name=\"name\" id=\"name\"   value=\"");
      out.print(rs.getString("name"));
      out.write("\"/></td>\n");
      out.write("\n");
      out.write("                            <td><input type=\"text\" name=\"degree\" id=\"pdegree\" required=\"required\" value=\"");
      out.print(rs.getString("degree"));
      out.write("\"/></td>\n");
      out.write("\n");
      out.write("                            <td><input type=\"email\" name=\"email\" id=\"temail\" value=\"");
      out.print(rs.getString("email"));
      out.write("\"/></td>\n");
      out.write("\n");
      out.write("                            <td><input type=\"text\" name=\"mobile\" id=\"mobile\" value=\"");
      out.print(rs.getString("mobile"));
      out.write("\"/></td>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--<center><button class=\"btn btn-success\"><input type=\"submit\" value=\"Update\"></button></center>-->\n");
      out.write("            <center><button class=\"btn btn-success\">Update</button></center>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        ");
}
                } catch (Exception e) {
                    System.out.println("Error  " + e.getMessage());
                }
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"text-center mb-3\">\n");
      out.write("\n");
      out.write("            <!--<button type=\"submit\" class=\"btn btn-primary\" href=\"admin_notes.jsp\">Back</button>-->\n");
      out.write("            <button class=\"btn btn-primary\"><a href=\"admin_dash_studentD.jsp\" style=\"text-decoration: none; color: white\">Back</a></button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div style=\"margin-top: 270px\">  \n");
      out.write("            <div class=\"p-2 text-center text-white \" style=\"background-color:#27354e;\" >\n");
      out.write("                <p class=\"footer\">Copyright &copy;2021 | Designed By Sneha |</p> \n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("</body>\n");
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
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
