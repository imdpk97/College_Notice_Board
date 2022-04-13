package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.servlet.*;

public final class notice_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            if (request.getParameter("id") == null)
                response.sendRedirect("admin_dash_noticeD.jsp");
            else {
                int id = Integer.parseInt(request.getParameter("id"));
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board", "root", "");
                    String sql = "select * from notifications where id=?";
                    PreparedStatement smt = con.prepareStatement(sql);
                    smt.setInt(1, id);
                    ResultSet rs = smt.executeQuery();
                    if (rs.next()) {
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"UpdateNotice?op=update\" method=\"post\">\n");
      out.write("            <div class=\"container-fluid contact-form \">\n");
      out.write("\n");
      out.write("                <hr>\n");
      out.write("                <h5 class=\"text-center text-success \">Notice Update</h5>\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("                <div class=\"row \">\n");
      out.write("                    <div class=\" col-md-12\">\n");
      out.write("                        <table class=\"table border\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr class=\" bg-info text-white\">\n");
      out.write("\n");
      out.write("                                    <th>Date</th>\n");
      out.write("                                    <th>Subject</th>\n");
      out.write("                                    <th>File</th> \n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                            <td><input type=\"text\" name=\"s_date\" id=\"s_date\"   value=\"");
      out.print(rs.getString("s_date"));
      out.write("\"/></td>\n");
      out.write("\n");
      out.write("                            <td><input type=\"text\" name=\"sub\" id=\"name\" required=\"required\" value=\"");
      out.print(rs.getString("sub"));
      out.write("\"/></td>\n");
      out.write("\n");
      out.write("                            <td><input type=\"file\" name=\"file\" id=\"userid\" value=\"");
      out.print(rs.getString("filename"));
      out.write("\"/></td>\n");
      out.write("\n");
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
      out.write("            <button class=\"btn btn-primary\"><a href=\"admin_notes.jsp\" style=\"text-decoration: none; color: white\">Back</a></button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div style=\"margin-top: 270px\">  \n");
      out.write("            <div class=\"p-2 text-center text-white \" style=\"background-color:#27354e;\" >\n");
      out.write("                <p class=\"footer\">Copyright &copy;2021 | Designed By Sneha |</p> \n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html> \n");
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
      out.write("<!--        <div >  \n");
      out.write("            <div class=\"p-2 text-center text-white \" style=\"background-color:#27354e; margin-top: 80px;\" >\n");
      out.write("                <p class=\"footer\">Copyright &copy;2021 | Designed by Sneha |</p> \n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("\n");
      out.write("         Optional JavaScript \n");
      out.write("         jQuery first, then Popper.js, then Bootstrap JS \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>-->");
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
