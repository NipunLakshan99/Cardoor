/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.34
 * Generated at: 2020-05-13 13:11:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StaffMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">  \r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://bootswatch.com/4/slate/bootstrap.min.css\" >\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\" integrity=\"sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/stylesheet.css\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"CSS/favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("\r\n");
      out.write("<title>System User Home</title>  \r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write(" body{\r\n");
      out.write("  font-family: 'Nunito';\r\n");
      out.write("  background-image:url(CSS/img/back.jpg);\r\n");
      out.write("  background-size:cover;\r\n");
      out.write("  background-attachment:fixed;\r\n");
      out.write(" }\r\n");
      out.write(" </style>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<body onload=\"startTime()\">\r\n");
      out.write("<!--- Clock Display ------> \r\n");
      out.write("        <script>\r\n");
      out.write("            function startTime() {\r\n");
      out.write("                var today = new Date();\r\n");
      out.write("                var h = today.getHours();\r\n");
      out.write("                var m = today.getMinutes();\r\n");
      out.write("                var s = today.getSeconds();\r\n");
      out.write("                m = checkTime(m);\r\n");
      out.write("                s = checkTime(s);\r\n");
      out.write("                document.getElementById('txt').innerHTML =\r\n");
      out.write("                        h + \":\" + m + \":\" + s;\r\n");
      out.write("                var t = setTimeout(startTime, 500);\r\n");
      out.write("            }\r\n");
      out.write("            function checkTime(i) {\r\n");
      out.write("                if (i < 10) {\r\n");
      out.write("                    i = \"0\" + i\r\n");
      out.write("                }\r\n");
      out.write("                ;  // add zero in front of numbers < 10\r\n");
      out.write("                return i;\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <!------------------------------->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"preloader bg-dark text-light\" >\r\n");
      out.write("            <div class=\"preloader-spinner\" >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div id=\"header-top\" class=\"d-none d-xl-block\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"loader-content\">\r\n");
      out.write("                                <!--<img src=\"CSS/img/preloader.gif\">-->\r\n");
      out.write("                                <p id=\"txt\"></p>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-lg-3 text-left \">\r\n");
      out.write("                                <i class=\"fas fa-map-marker-alt\"></i> &nbsp; 12/5, Malabe, Sri Lanka\r\n");
      out.write("                            </div>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-lg-3 text-center\">\r\n");
      out.write("                                <i class=\"fas fa-phone-volume\"></i> +011 2 354 354\r\n");
      out.write("                            </div>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-lg-3 text-center\">\r\n");
      out.write("                                <i class=\"far fa-clock\"></i> Mon-Fri 09.00 - 17.00\r\n");
      out.write("                            </div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"header-social-icons text-right\">\r\n");
      out.write("                                <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>&nbsp;\r\n");
      out.write("                                <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>&nbsp;\r\n");
      out.write("                                <a href=\"#\"><i class=\"fab fa-facebook\"></i></a>&nbsp;\r\n");
      out.write("                                <a href=\"#\"><i class=\"fab fa-youtube\"></i></a>&nbsp;\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\"> \r\n");
      out.write("\t <div class=\"col-lg-4\">\r\n");
      out.write("                        <a href=\"index.html\" class=\"logo\">\r\n");
      out.write("                            <img src=\"CSS/img/logo.png\" alt=\"JSOFT\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("  \t\t<div class=\"collapse navbar-collapse\" id=\"navbarColor02\">\r\n");
      out.write("    \t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("        <li class=\"nav-item active\">\r\n");
      out.write("\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("        <section>\r\n");
      out.write("        \r\n");
      out.write("            <hr>\r\n");
      out.write("            <h1 class=\"page-header text-center text-dark\"><b>SystemUser Panel</b></h1>\r\n");
      out.write("            <hr>\r\n");
      out.write("\t\r\n");
      out.write("\t<h1 style=\"color: #ffffff; margin-left: 580px;\"></h1><br/><br/><br/> \r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t <div class=\"btn-group-vertical\" data-toggle=\"buttons\">\r\n");
      out.write(" \t\t <a href=\"Home.jsp\"><button type=\"button\" class=\"btn btn-primary\">CARDOORHOMEPAGE</button></a>\r\n");
      out.write(" \t\t <a href=\"viewvehicles.jsp\"><button type=\"button\" class=\"btn btn-primary\">ADD VEHICLES</button></a>\r\n");
      out.write(" \t\t <a href=\"viewvehicles.jsp\"><button type=\"button\" class=\"btn btn-primary\">VIEW AVAILABLE VEHICLES</button></a>\r\n");
      out.write(" \t\t <a href=\"viewdrivers.jsp\"><button type=\"button\" class=\"btn btn-primary\">ADD DRIVERS</button></a>\r\n");
      out.write("  \t\t <a href=\"viewdrivers.jsp\"><button type=\"button\" class=\"btn btn-primary\">VIEW CURRENT DRIVERS</button></a>\r\n");
      out.write("  \t\t <a href=\"viewbookings.jsp\"><button type=\"button\" class=\"btn btn-primary\">VIEW CUSTOMER'S BOOKINGS</button></a>\r\n");
      out.write("  \t\t <a href=\"viewbookings.jsp\"><button type=\"button\" class=\"btn btn-primary\">VIEW CUSTOMER'S PAYMENT</button></a>\r\n");
      out.write(" \t\t <a href=\"#\"><button type=\"button\" class=\"btn btn-primary\">Customer's FEEDBACK</button></a>\r\n");
      out.write(" \t\t <a href=\"Home.jsp\"><button type=\"button\" class=\"btn btn-primary\">Exit</button></a>\r\n");
      out.write("  \r\n");
      out.write("\t </div>\r\n");
      out.write("\t <div class=\"wed\">\r\n");
      out.write("\t <img src=\"CSS/img/vehicle/wedding.jpg\" width=\"700\" height=\"400\" class=\"img\"/>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t <br/>\r\n");
      out.write("\t <br/>\r\n");
      out.write(" \r\n");
      out.write(" \t<section id=\"adddriver\" class=\"py-5\" style=\" background-color: #242422;\">\r\n");
      out.write("\t\t<div class=\"footer-bottom-area\">\r\n");
      out.write("        \t<div class=\"container\">\r\n");
      out.write("           \t\t <div class=\"row\">\r\n");
      out.write("               \t\t <div class=\"col-lg-12 text-center\">\r\n");
      out.write("                    \t<p style=\"color: #8a8a7c;\">Copyright &copy; <script>document.write(new Date().getFullYear());</script> All Rights Reserved | Sri Lanka</p>\r\n");
      out.write("               \t\t </div>\r\n");
      out.write("            \t </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("        </section>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
