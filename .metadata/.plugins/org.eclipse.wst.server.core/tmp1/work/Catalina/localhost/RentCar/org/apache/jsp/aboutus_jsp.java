/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.34
 * Generated at: 2020-05-13 08:33:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>About Us</title>    \r\n");
      out.write("        <!-- Required meta tags -->\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://bootswatch.com/4/slate/bootstrap.min.css\" >\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\" integrity=\"sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"CSS/favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("</head>\r\n");
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
      out.write("\r\n");
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
      out.write("                                <i class=\"fas fa-map-marker-alt\"></i> &nbsp; Orex Shopping Complex, Ja-Ela\r\n");
      out.write("                            </div>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-lg-3 text-center\">\r\n");
      out.write("                                <i class=\"fas fa-phone-volume\"></i> 0112 249 249\r\n");
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
      out.write("\t\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("\t\t<div class=\"col-lg-4\">\r\n");
      out.write("                        <a href=\"index.html\" class=\"logo\">\r\n");
      out.write("                            <img src=\"CSS/img/logo.png\" alt=\"JSOFT\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("  \t\t<div class=\"collapse navbar-collapse\" id=\"navbarColor02\">\r\n");
      out.write("    \t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("        <li class=\"nav-item active\">\r\n");
      out.write("        <a href=\"Home.jsp\" class=\"nav-link\" href=\"#\">HOME </a>\r\n");
      out.write("      \t</li>\r\n");
      out.write("      \t<li class=\"nav-item\">\r\n");
      out.write("        <a href=\"vehicles.jsp\" class=\"nav-link\" href=\"#\">AVAILABLE VEHICLES</a>\r\n");
      out.write("      \t</li>\r\n");
      out.write("      \t<li class=\"nav-item\">\r\n");
      out.write("         <a href=\"addbookingform.jsp\" class=\"nav-link\" href=\"#\">BOOK A CAR</a>\r\n");
      out.write("      \t</li>\r\n");
      out.write("      \t<li class=\"nav-item\">\r\n");
      out.write("        <a href=\"contactus.html\" class=\"nav-link\" href=\"#\">CONTACT US</a>\r\n");
      out.write("      \t</li>\r\n");
      out.write("      \t<li class=\"nav-item\">\r\n");
      out.write("        <a href=\"aboutus.jsp\" class=\"nav-link\" href=\"#\">ABOUT US</a>\r\n");
      out.write("      \t</li>\r\n");
      out.write("      \t<li class=\"nav-item\">\r\n");
      out.write("        <a href=\"feedback.jsp\" class=\"nav-link\" href=\"#\">FEEDBACK</a>\r\n");
      out.write("      \t</li>\r\n");
      out.write("    \t</ul>\r\n");
      out.write("    \t<li class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("        <a href=\"login.jsp\" class=\"nav-item nav-link\"><button class=\"btn btn-outline-warning\">Login</button></a>\r\n");
      out.write("    \t</li>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("     \t\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("        <section>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <hr>\r\n");
      out.write("            <h1 class=\"page-header text-center text-dark\"><b>About Us</b></h1>\r\n");
      out.write("            <hr>\r\n");
      out.write("        <!-- Content Row -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            \r\n");
      out.write("       \r\n");
      out.write("        <!-- Map Column -->\r\n");
      out.write("        <div class=\"col-md-8\">\r\n");
      out.write("                 \r\n");
      out.write("        <!-- Embedded Google Map -->\r\n");
      out.write("        <img width=\"700\" height=\"400\" src=\"CSS/img/map1.png\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Contact Details Column -->\r\n");
      out.write("        <div class=\"col-md-4\">\r\n");
      out.write("        <br><br>\r\n");
      out.write("        <p> CARDOOR(Pvt) Ltd is a 100% Sri Lankan owned company that has been incorporated as a limited liability company in April 2000. \r\n");
      out.write("            The company commenced operations in 1995 as a partnership, but due to the rapid expansion of operations and market share, \r\n");
      out.write("            it was incorporated as a limited liability company. We were also a pioneer member in the formation of the RACA (Rent-A-Car Association) in Sri Lanka and \r\n");
      out.write("            Mr.Nevil Fernando  has been the Managing Director of KRCS while also serving as president of the RACA Sri Lanka. </p>\r\n");
      out.write("\r\n");
      out.write("               \r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- </div>row -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--------------------------------------------------->\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<!-- Explore Section -->\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Footer Bottom Start -->\r\n");
      out.write("\t\t<section id=\"adddriver\" class=\"py-5\" style=\" background-color: #242422;\">\r\n");
      out.write("\t\t\t\t<div class=\"footer-bottom-area\">\r\n");
      out.write("      \t\t\t  <div class=\"container\">\r\n");
      out.write("      \t\t      \t<div class=\"row\">\r\n");
      out.write("        \t        <div class=\"col-lg-12 text-center\">\r\n");
      out.write("                    <p style=\"color: #8a8a7c;\">Copyright &copy; <script>document.write(new Date().getFullYear());</script> All Rights Reserved | Sri Lanka</p>\r\n");
      out.write("                \t</div>\r\n");
      out.write("           \t\t \t</div>\r\n");
      out.write("        \t\t  </div>\r\n");
      out.write("   \t\t\t\t</div>\r\n");
      out.write("  \t\t</section>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\t<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
