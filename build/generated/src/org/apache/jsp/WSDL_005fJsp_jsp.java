package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WSDL_005fJsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"pass()\">\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <form action =\"#\" method=\"post\" id=\"form\">\n");
      out.write("            Username: <input type=\"text\" name=\"username\" placeholder=\"Must be of length 5 to 12\" maxlength=\"12\" required/> <br/>\n");
      out.write("            <br/>\n");
      out.write("            Password: <input type=\"password\" name=\"password\" placeholder=\"Must be of length 7 to 12\" required/> <br/>\n");
      out.write("            <br/>\n");
      out.write("            Name: <input type =\"text\" name=\"name\" required/><br/>\n");
      out.write("            <br/>\n");
      out.write("            Address:<input type=\"text\" name=\"address\" /><br/>\n");
      out.write("            <br/>\n");
      out.write("            Country:<select name=\"country\">\n");
      out.write("                <option value=\"India\">India</option>\n");
      out.write("                <option value=\"USA\">USA</option>\n");
      out.write("            </select><br/>\n");
      out.write("            Zipcode: <input type=\"text\" name=\"pincode\" required/> <br/>\n");
      out.write("            Email: <input type=\"text\" name=\"email\" required /><br/>\n");
      out.write("            Sex: <input type=\"radio\" name=\"sex\" value=\"Male\" id=\"male\" required/>\n");
      out.write("            <label for=\"male\">Male</label>\n");
      out.write("            <input type=\"radio\" name=\"sex\" value=\"Female\" id=\"fem\" required />\n");
      out.write("            <label for=\"fem\">Female</label><br/>\n");
      out.write("            Language: <input type=\"checkbox\" name=\"language\" value=\"English\" id=\"english\"  required />\n");
      out.write("            <label for=\"english\">English</label>\n");
      out.write("            <input type=\"checkbox\" name=\"language\" value=\"Non english\" id=\"non\"  required /> \n");
      out.write("            <label for=\"non\">Non English</label>\n");
      out.write("            <br/>\n");
      out.write("            About: <textarea rows=\"10\" cols=\"20\"></textarea><br/>\n");
      out.write("            \n");
      out.write("            <p id=\"one\" name=\"first\"></p>\n");
      out.write("            <p id=\"two\" name=\"second\"></p>\n");
      out.write("            <p id=\"three\" name=\"third\"></p>\n");
      out.write("            Captcha: <input type=\"number\" name=\"captcha\" required /><br/>\n");
      out.write("            <input type=\"submit\" value=\"Submit\" onclick=\"summa()\" id=\"butt\"/><br/>\n");
      out.write("        </form>\n");
      out.write("        <script>\n");
      out.write("            var z,c,a,b;\n");
      out.write("            function pass(){\n");
      out.write("         z=Math.floor(Math.random()*4);\n");
      out.write("        switch (z) {\n");
      out.write("            case 0: c='+';\n");
      out.write("                    break;\n");
      out.write("            case 1: c='-';\n");
      out.write("                    break;\n");
      out.write("            case 2: c='*';\n");
      out.write("                    break;\n");
      out.write("            case 3: c='/';\n");
      out.write("                    break;\n");
      out.write("                default: c='+';    \n");
      out.write("        }\n");
      out.write("        document.getElementById(\"one\").innerHTML =Math.floor(Math.random()*101);\n");
      out.write("        a=document.getElementById(\"one\").innerHTML;\n");
      out.write("        document.getElementById(\"two\").innerHTML =c;\n");
      out.write("        document.getElementById(\"three\").innerHTML =Math.floor(Math.random()*101);\n");
      out.write("        b=document.getElementById(\"three\").innerHTML;\n");
      out.write("    }\n");
      out.write("        function summa(){\n");
      out.write("            \n");
      out.write("            document.getElementById(\"form\").action=\"/WSDLWebApplication/WSDL_Servlet?x=\"+a+\"&y=\"+b+\"&z=\"+c;\n");
      out.write("            document.getElementById(\"form\").submit();\n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

//    try {
//	Calculator.Calculator service = new Calculator.Calculator();
//	Calculator.CalculatorSoap port = service.getCalculatorSoap();
//	 // TODO initialize WS operation arguments here
//	int intA = 0;
//	int intB = 0;
//	// TODO process result here
//	int result = port.add(intA, intB);
//	out.println("Result = "+result);
//    } catch (Exception ex) {
//	// TODO handle custom exceptions here
//    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
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
