/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-03-01 10:46:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"/news/resources/css/home_bg_img.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- 可选的Bootstrap主题文件（一般不使用） -->\r\n");
      out.write("<!--  <script src=\"http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap-theme.min.css\"></script>-->\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->\r\n");
      out.write("<script src=\"http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js\">\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write(" <!-- Le styles -->\r\n");
      out.write("    <link href=\"../assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("      body {\r\n");
      out.write("        padding-top: 40px;\r\n");
      out.write("        padding-bottom: 40px;\r\n");
      out.write("        margin-top:100px;\r\n");
      out.write("        background-color: #f5f5f5;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .form-signin {\r\n");
      out.write("        max-width: 300px;\r\n");
      out.write("        padding: 19px 29px 29px;\r\n");
      out.write("        margin: 0 auto 20px;\r\n");
      out.write("        background-color: #fff;\r\n");
      out.write("        border: 1px solid #e5e5e5;\r\n");
      out.write("        -webkit-border-radius: 5px;\r\n");
      out.write("           -moz-border-radius: 5px;\r\n");
      out.write("                border-radius: 5px;\r\n");
      out.write("        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);\r\n");
      out.write("           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);\r\n");
      out.write("                box-shadow: 0 1px 2px rgba(0,0,0,.05);\r\n");
      out.write("      }\r\n");
      out.write("      .form-signin .form-signin-heading,\r\n");
      out.write("      .form-signin .checkbox {\r\n");
      out.write("        margin-bottom: 10px;\r\n");
      out.write("      }\r\n");
      out.write("      .form-signin input[type=\"text\"],\r\n");
      out.write("      .form-signin input[type=\"password\"] {\r\n");
      out.write("        font-size: 16px;\r\n");
      out.write("        height: auto;\r\n");
      out.write("        margin-bottom: 15px;\r\n");
      out.write("        padding: 7px 9px;\r\n");
      out.write("      }\r\n");
      out.write("\t  .login{\r\n");
      out.write("\t  \tmargin-left: 20px\r\n");
      out.write("\t  }\r\n");
      out.write("\t  .register{\r\n");
      out.write("\t  margin-right:30px\r\n");
      out.write("\t   }\r\n");
      out.write("    </style>\r\n");
      out.write("    <link href=\"../assets/css/bootstrap-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"../assets/js/html5shiv.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <!-- Fav and touch icons -->\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"../assets/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"../assets/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("      <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"../assets/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("                    <link rel=\"apple-touch-icon-precomposed\" href=\"../assets/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("                                   <link rel=\"shortcut icon\" href=\"../assets/ico/favicon.png\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("      <form class=\"form-signin\" action=\"DoLogin\" >\r\n");
      out.write("        <h2 class=\"form-signin-heading\">Please sign in</h2>\r\n");
      out.write("        <input id=\"account\" name=\"account\" type=\"text\" class=\"input-block-level\" placeholder=\"Email address\">\r\n");
      out.write("        <input id=\"password\" name=\"password\" type=\"password\" class=\"input-block-level\" placeholder=\"Password\">\r\n");
      out.write("        <label class=\"checkbox\">\r\n");
      out.write("          <input type=\"checkbox\" value=\"remember-me\"> Remember me\r\n");
      out.write("        </label>\r\n");
      out.write("        <button class=\"btn btn-large btn-primary login\" type=\"submit\">Sign in</button>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("      </form>\r\n");
      out.write("\r\n");
      out.write("    </div> <!-- /container -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Le javascript\r\n");
      out.write("    ================================================== -->\r\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("    <script src=\"../assets/js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"../assets/js/bootstrap-transition.js\"></script>\r\n");
      out.write("    <script src=\"../assets/js/bootstrap-alert.js\"></script>\r\n");
      out.write("    <script src=\"../assets/js/bootstrap-modal.js\"></script>\r\n");
      out.write("    <script src=\"../assets/js/bootstrap-dropdown.js\"></script>\r\n");
      out.write("    <script src=\"../assets/js/bootstrap-scrollspy.js\"></script>\r\n");
      out.write("    <script src=\"../assets/js/bootstrap-tab.js\"></script>\r\n");
      out.write("    <script src=\"../assets/js/bootstrap-tooltip.js\"></script>\r\n");
      out.write("    <script src=\"../assets/js/bootstrap-popover.js\"></script>\r\n");
      out.write("    <script src=\"../assets/js/bootstrap-button.js\"></script>\r\n");
      out.write("    <script src=\"../assets/js/bootstrap-collapse.js\"></script>\r\n");
      out.write("    <script src=\"../assets/js/bootstrap-carousel.js\"></script>\r\n");
      out.write("    <script src=\"../assets/js/bootstrap-typeahead.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
