package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insuranceReqHistory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./stylesheets/InsuranceHome.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div id=\"maindiv\">\n");
      out.write("      <div id=\"sidenav\">\n");
      out.write("        <h3>Star Health Inc.</h3>\n");
      out.write("        <div id=\"dashboard\">\n");
      out.write("          <p id=\"head\">DASHBOARD</p>\n");
      out.write("          <a href=\"insuranceHomePage.jsp\">\n");
      out.write("            <div class=\"dashboarditems\" id=\"home\">\n");
      out.write("              <i class=\"ri-home-5-line icons\"></i>\n");
      out.write("              <p class=\"entries\">Home</p>\n");
      out.write("            </div>\n");
      out.write("          </a>\n");
      out.write("          <a href=\"InsuranceClaimPage.jsp\">\n");
      out.write("            <div class=\"dashboarditems\" id=\"app\">\n");
      out.write("              <i class=\"ri-health-book-line\"></i>\n");
      out.write("              <p class=\"entries\">Claim Request</p>\n");
      out.write("            </div>\n");
      out.write("          </a>\n");
      out.write("          <a href=\"insuranceClientsPage.jsp\">\n");
      out.write("            <div class=\"dashboarditems\" id=\"pat\">\n");
      out.write("              <i class=\"ri-empathize-line\"></i>\n");
      out.write("              <p class=\"entries\">Clients</p>\n");
      out.write("            </div>\n");
      out.write("          </a>\n");
      out.write("          <a href=\"insuranceReqHistory.jsp\">\n");
      out.write("            <div class=\"dashboarditems active\" id=\"pr\">\n");
      out.write("              <i class=\"ri-exchange-funds-line\"></i>\n");
      out.write("              <p class=\"entries\">Request History</p>\n");
      out.write("            </div>\n");
      out.write("          </a>\n");
      out.write("          <!-- <a class=\"card1\" href=\"#\">\n");
      out.write("            <p>Let's upgrade your plan</p>\n");
      out.write("            <img src=\"/12083074_Wavy_Bus-03_Single-06.png\" alt=\"\" />\n");
      out.write("            <div class=\"go-corner\" href=\"#\">\n");
      out.write("              <div class=\"go-arrow\"><i class=\"ri-arrow-right-s-line\"></i></div>\n");
      out.write("            </div>\n");
      out.write("          </a> -->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        <div id=\"comingsoon\">\n");
      out.write("            <img src=\"./images/comingsoon_h.png\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
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
