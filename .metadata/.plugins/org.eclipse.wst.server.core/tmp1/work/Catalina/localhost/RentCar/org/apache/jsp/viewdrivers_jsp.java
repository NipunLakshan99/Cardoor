/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.34
 * Generated at: 2020-05-13 13:31:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.javaUtil.DB.DriverDao;
import com.javaClass.*;
import java.util.*;

public final class viewdrivers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/SLIIT/Final%20Project/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/RentCar/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1587475999156L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.javaClass");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.javaUtil.DB.DriverDao");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>  \r\n");
      out.write("<html>  \r\n");
      out.write("<head>  \r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">  \r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://bootswatch.com/4/slate/bootstrap.min.css\" >\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\" integrity=\"sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylesheet.css\">\r\n");
      out.write("         <link rel=\"shortcut icon\" href=\"CSS/favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("\t\t<title>View Drivers</title>  \r\n");
      out.write("</head> \r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(" body{\r\n");
      out.write("  font-family: 'Nunito';\r\n");
      out.write("  background-image:url(images/img1.jpg);\r\n");
      out.write("  background-size:cover;\r\n");
      out.write("  background-attachment:fixed;\r\n");
      out.write("}\r\n");
      out.write("</style> \r\n");
      out.write("<body onload=\"startTime()\">  \r\n");
      out.write("\t\t<!--- Clock Display ------> \r\n");
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
      out.write("                                <!--<img src=\"assets/img/preloader.gif\">-->\r\n");
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
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\"> \r\n");
      out.write("\t <div class=\"col-lg-4\">\r\n");
      out.write("                        <a href=\"index.html\" class=\"logo\">\r\n");
      out.write("                            <img src=\"CSS/img/logo.png\" alt=\"JSOFT\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("  \t\t<div class=\"collapse navbar-collapse\" id=\"navbarColor02\">\r\n");
      out.write("    \t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("        <li class=\"nav-item active\">\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\t\t</nav>\t\r\n");
      out.write("\t\t</br>\r\n");
      out.write("\t\t</br>\r\n");
      out.write("\r\n");
      out.write("\t    \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  \r\n");
      out.write("  \r\n");
      out.write("\t\t<hr>\r\n");
      out.write("            <h1 class=\"page-header text-center text-dark\"><b>Driver List</b></h1>\r\n");
      out.write("            <hr>\r\n");
      out.write("\t\t");
  
			List<Driver> list=DriverDao.getAllRecords();  
			request.setAttribute("list",list);  
		
      out.write("  \r\n");
      out.write(" \t\t <section id=\"adddriver\" class=\"py-5\" style=\" background-color: #cfcdb0;\" > \r\n");
      out.write(" \t\t<table class=\"table table-hover\" border=\"1\" width=\"90%\">\r\n");
      out.write(" \t\t <thead>\r\n");
      out.write(" \t\t \r\n");
      out.write("   \t\t <tr>\r\n");
      out.write("      \t\t<th scope=\"col\">ID</th>\r\n");
      out.write("      \t\t<th scope=\"col\">Name</th>\r\n");
      out.write("      \t\t<th scope=\"col\">Password</th>\r\n");
      out.write("      \t\t<th scope=\"col\">Email</th>\r\n");
      out.write("      \t\t<th scope=\"col\">Phone number</th>\r\n");
      out.write("      \t\t<th scope=\"col\">Ratings</th>\r\n");
      out.write("      \t\t<th scope=\"col\">Edit</th>\r\n");
      out.write("      \t\t<th scope=\"col\">Delete</th>\r\n");
      out.write("      \t</tr>\r\n");
      out.write("  \t\t </thead>\r\n");
      out.write("  \t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("  \t\t</table>  \r\n");
      out.write("  \t\t</section>  \r\n");
      out.write("  \t\t\r\n");
      out.write("    \t<br/><a href=\"driverfourm.jsp\"><button type=\"button\" class=\"btn btn-secondary\">Add New Driver</button></a> <br/><br/>\r\n");
      out.write("    \t<a href=\"SystemU.jsp\"><button type=\"button\" class=\"btn btn-secondary\">Exit</button></a><br/><br/> \r\n");
      out.write("\t\t<section id=\"adddriver\" class=\"py-5\" style=\" background-color: #242422;\">\r\n");
      out.write("\t\t\t<div class=\"footer-bottom-area\">\r\n");
      out.write("        \t\t<div class=\"container\">\r\n");
      out.write("            \t\t<div class=\"row\">\r\n");
      out.write("                \t\t<div class=\"col-lg-12 text-center\">\r\n");
      out.write("                    \t\t<p style=\"color: #8a8a7c;\">Copyright &copy; <script>document.write(new Date().getFullYear());</script> All Rights Reserved | Sri Lanka</p>\r\n");
      out.write("                \t\t</div>\r\n");
      out.write("            \t\t</div>\r\n");
      out.write("        \t\t</div>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("    \t</section>\r\n");
      out.write("</body>  \r\n");
      out.write("</html>  ");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /viewdrivers.jsp(126,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/viewdrivers.jsp(126,4) '${list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /viewdrivers.jsp(126,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("u");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("  \r\n");
            out.write("  \t\t<tr><td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td><td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.getName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td><td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.getPassword()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>  \r\n");
            out.write("  \t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.getEmail()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td><td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.getPhonenumber()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td><td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.getRatings()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>  \r\n");
            out.write("  \t\t<td><a href=\"editdriverform.jsp?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"><button type=\"button\" class=\"btn btn-success\">Edit</button></a></td>  \r\n");
            out.write("  \t\t<td><a href=\"deletedriver.jsp?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"><button type=\"button\" class=\"btn btn-danger\">Delete</button></a></td></tr>  \r\n");
            out.write("  \t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}