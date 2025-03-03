package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import insurance.pojo.*;
import java.util.*;

public final class hospitalPendingReq_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <link\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/swiper@8/swiper-bundle.min.css\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />\n");
      out.write("    <link\n");
      out.write("      href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" href=\"./stylesheets/hospitalHome.css\" />\n");
      out.write("    <link rel=\"icon\" href=\"../src/imges/长.png\" style=\"width: 30px\" />\n");
      out.write("    </head>\n");
      out.write("<body onkeypress=\"load()\">\n");
      out.write("\n");
      out.write("    <div id=\"maindiv\">\n");
      out.write("      <div id=\"sidenav\">\n");
      out.write("        <h3>Multi Speciality Hospital</h3>\n");
      out.write("        <div id=\"dashboard\">\n");
      out.write("          <p>DASHBOARD</p>\n");
      out.write("          <a href=\"hospitalHome.jsp\" >\n");
      out.write("            <div class=\"dashboarditems\" id=\"home\">\n");
      out.write("              <i class=\"ri-home-5-line icons\"></i>\n");
      out.write("              <p class=\"entries\">Home</p>\n");
      out.write("            </div>\n");
      out.write("          </a>\n");
      out.write("          <a href=\"hospitalAppointment.jsp\">\n");
      out.write("            <div class=\"dashboarditems\" id=\"app\">\n");
      out.write("              <i class=\"ri-calendar-2-line icons\"></i>\n");
      out.write("              <p class=\"entries\">Appointments</p>\n");
      out.write("            </div>\n");
      out.write("          </a>\n");
      out.write("          <a href=\"hospitalPatient.jsp\">\n");
      out.write("            <div class=\"dashboarditems\" id=\"pat\">\n");
      out.write("              <i class=\"ri-user-add-line icons\"></i>\n");
      out.write("              <p class=\"entries\">Patients</p>\n");
      out.write("            </div>\n");
      out.write("          </a>\n");
      out.write("          <a href=\"hospitalPendingReq.jsp\">\n");
      out.write("            <div class=\"dashboarditems active\" id=\"pr\">\n");
      out.write("              <i class=\"ri-book-read-line icons\"></i>\n");
      out.write("              <p class=\"entries\">Pending Request</p>\n");
      out.write("            </div>\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        ");

            ArrayList<ClaimDetailsPojo> cp=(ArrayList<ClaimDetailsPojo>)request.getAttribute("claimDetails");
            if(cp!=null)
            {
                request.setAttribute("disp","display");
                if(cp.get(0).getCause().equals(""))
                {
                    request.setAttribute("cause","Reverted Cla!m Req.");
                }
                else
                {
                    request.setAttribute("cause","Cause : "+cp.get(0).getCause());
                }
            }
            else
            request.setAttribute("disp","display-none");
        
      out.write("\n");
      out.write("        <div id=\"detailsection\">\n");
      out.write("        <div id=\"upper\" class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${disp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("<!--        <i class=\"ri-emotion-unhappy-line\" id=\"ex\"></i>-->\n");
      out.write("         <!--<ion-icon id=\"ex\" name=\"alert-circle-outline\"></ion-icon>-->\n");
      out.write("        <h3>!! ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cause}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("      </div>\n");
      out.write("        ");

            ArrayList<ClaimDetailsPojo> cdp=(ArrayList<ClaimDetailsPojo>)request.getAttribute("claimDetails");
            if(cdp!=null)
            {
                for(ClaimDetailsPojo c:cdp)
                {
                    out.println("<div class='claimdiv'>");
                    out.println("<div class='claim'>");
                    out.println(" <img");
                    out.println("  src='https://static.vecteezy.com/system/resources/previews/002/641/198/original/invoice-icon-vector.jpg'/>");
                    out.println("<div class='claimhead'>");
                    out.println("<h3>"+c.getClaimHeading()+"</h3>");
                    out.println("<p class='grey towrap'>"+c.getTreatmentDesc()+"</p>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("<div class='claimdetails'>");
                    out.println("<div class='amount'>");
                    out.println("<p class='grey'> Sum </p>");
                    out.println("<h4>Rs."+c.getClaimAmount()+" </h4>");
                    out.println("</div>");
                    out.println(" <div class='docs'>");
                    out.println("<p class='grey'>Doc.</p>");
                    out.println(" <h4><i class='ri-download-line'></i></h4>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</div>");
                }
            }
            
        
      out.write("\n");
      out.write("        </div>\n");
      out.write("<!--        <div id=\"detailsection\">\n");
      out.write("        <div class=\"claimdiv\">\n");
      out.write("            <div class=\"claim\">\n");
      out.write("              <img\n");
      out.write("                src=\"https://static.vecteezy.com/system/resources/previews/002/641/198/original/invoice-icon-vector.jpg\"\n");
      out.write("                alt=\"\"\n");
      out.write("              />\n");
      out.write("              <div class=\"claimhead\">\n");
      out.write("                <h3>_Claim Heading</h3>\n");
      out.write("                <p class=\"grey towrap\">_ClaimDesc</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"claimdetails\">\n");
      out.write("              <div class=\"amount\">\n");
      out.write("                <p class=\"grey\">Sum</p>\n");
      out.write("                <h4>Rs. </h4>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"docs\">\n");
      out.write("                <p class=\"grey\">Doc.</p>\n");
      out.write("                <h4><i class=\"ri-download-line\"></i></h4>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>-->\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        <script >\n");
      out.write("        function toggle() {\n");
      out.write("  var maindiv = document.querySelector(\"#maindiv\");\n");
      out.write("  maindiv.classList.toggle(\"active\");\n");
      out.write("  var container = document.querySelector(\".container\");\n");
      out.write("  container.classList.toggle(\"active\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("function load()\n");
      out.write("{\n");
      out.write("    location.href=\"PendingRequestServlet\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Form Validation Code */\n");
      out.write("const slidePage = document.querySelector(\".slide-page\");\n");
      out.write("const nextBtnFirst = document.querySelector(\".firstNext\");\n");
      out.write("const prevBtnSec = document.querySelector(\".prev-1\");\n");
      out.write("const nextBtnSec = document.querySelector(\".next-1\");\n");
      out.write("const prevBtnThird = document.querySelector(\".prev-2\");\n");
      out.write("const nextBtnThird = document.querySelector(\".next-2\");\n");
      out.write("const prevBtnFourth = document.querySelector(\".prev-3\");\n");
      out.write("const submitBtn = document.querySelector(\".submit\");\n");
      out.write("const progressText = document.querySelectorAll(\".step p\");\n");
      out.write("const progressCheck = document.querySelectorAll(\".step .check\");\n");
      out.write("const bullet = document.querySelectorAll(\".step .bullet\");\n");
      out.write("let current = 1;\n");
      out.write("nextBtnFirst.addEventListener(\"click\", function (event) {\n");
      out.write("  event.preventDefault();\n");
      out.write("  slidePage.style.marginLeft = \"-25%\";\n");
      out.write("  bullet[current - 1].classList.add(\"active\");\n");
      out.write("  progressCheck[current - 1].classList.add(\"active\");\n");
      out.write("  progressText[current - 1].classList.add(\"active\");\n");
      out.write("  current += 1;\n");
      out.write("});\n");
      out.write("nextBtnSec.addEventListener(\"click\", function (event) {\n");
      out.write("  event.preventDefault();\n");
      out.write("  slidePage.style.marginLeft = \"-50%\";\n");
      out.write("  bullet[current - 1].classList.add(\"active\");\n");
      out.write("  progressCheck[current - 1].classList.add(\"active\");\n");
      out.write("  progressText[current - 1].classList.add(\"active\");\n");
      out.write("  current += 1;\n");
      out.write("});\n");
      out.write("nextBtnThird.addEventListener(\"click\", function (event) {\n");
      out.write("  event.preventDefault();\n");
      out.write("  slidePage.style.marginLeft = \"-75%\";\n");
      out.write("  bullet[current - 1].classList.add(\"active\");\n");
      out.write("  progressCheck[current - 1].classList.add(\"active\");\n");
      out.write("  progressText[current - 1].classList.add(\"active\");\n");
      out.write("  current += 1;\n");
      out.write("});\n");
      out.write("submitBtn.addEventListener(\"click\", function () {\n");
      out.write("  bullet[current - 1].classList.add(\"active\");\n");
      out.write("  progressCheck[current - 1].classList.add(\"active\");\n");
      out.write("  progressText[current - 1].classList.add(\"active\");\n");
      out.write("  current += 1;\n");
      out.write("  setTimeout(function () {\n");
      out.write("    alert(\"Your Form Successfully Signed up\");\n");
      out.write("    location.reload();\n");
      out.write("  }, 800);\n");
      out.write("});\n");
      out.write("prevBtnSec.addEventListener(\"click\", function (event) {\n");
      out.write("  event.preventDefault();\n");
      out.write("  slidePage.style.marginLeft = \"0%\";\n");
      out.write("  bullet[current - 2].classList.remove(\"active\");\n");
      out.write("  progressCheck[current - 2].classList.remove(\"active\");\n");
      out.write("  progressText[current - 2].classList.remove(\"active\");\n");
      out.write("  current -= 1;\n");
      out.write("});\n");
      out.write("prevBtnThird.addEventListener(\"click\", function (event) {\n");
      out.write("  event.preventDefault();\n");
      out.write("  slidePage.style.marginLeft = \"-25%\";\n");
      out.write("  bullet[current - 2].classList.remove(\"active\");\n");
      out.write("  progressCheck[current - 2].classList.remove(\"active\");\n");
      out.write("  progressText[current - 2].classList.remove(\"active\");\n");
      out.write("  current -= 1;\n");
      out.write("});\n");
      out.write("prevBtnFourth.addEventListener(\"click\", function (event) {\n");
      out.write("  event.preventDefault();\n");
      out.write("  slidePage.style.marginLeft = \"-50%\";\n");
      out.write("  bullet[current - 2].classList.remove(\"active\");\n");
      out.write("  progressCheck[current - 2].classList.remove(\"active\");\n");
      out.write("  progressText[current - 2].classList.remove(\"active\");\n");
      out.write("  current -= 1;\n");
      out.write("});\n");
      out.write("\n");
      out.write("/* Input Type Currency */\n");
      out.write("\n");
      out.write("$(\"input[data-type='currency']\").on({\n");
      out.write("  keyup: function () {\n");
      out.write("    formatCurrency($(this));\n");
      out.write("  },\n");
      out.write("  blur: function () {\n");
      out.write("    formatCurrency($(this), \"blur\");\n");
      out.write("  },\n");
      out.write("});\n");
      out.write("\n");
      out.write("function formatNumber(n) {\n");
      out.write("  // format number 1000000 to 1,234,567\n");
      out.write("  return n.replace(/\\D/g, \"\").replace(/\\B(?=(\\d{3})+(?!\\d))/g, \",\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("function formatCurrency(input, blur) {\n");
      out.write("  // appends $ to value, validates decimal side\n");
      out.write("  // and puts cursor back in right position.\n");
      out.write("\n");
      out.write("  // get input value\n");
      out.write("  var input_val = input.val();\n");
      out.write("\n");
      out.write("  // don't validate empty input\n");
      out.write("  if (input_val === \"\") {\n");
      out.write("    return;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  // original length\n");
      out.write("  var original_len = input_val.length;\n");
      out.write("\n");
      out.write("  // initial caret position\n");
      out.write("  var caret_pos = input.prop(\"selectionStart\");\n");
      out.write("\n");
      out.write("  // check for decimal\n");
      out.write("  if (input_val.indexOf(\".\") >= 0) {\n");
      out.write("    // get position of first decimal\n");
      out.write("    // this prevents multiple decimals from\n");
      out.write("    // being entered\n");
      out.write("    var decimal_pos = input_val.indexOf(\".\");\n");
      out.write("\n");
      out.write("    // split number by decimal point\n");
      out.write("    var left_side = input_val.substring(0, decimal_pos);\n");
      out.write("    var right_side = input_val.substring(decimal_pos);\n");
      out.write("\n");
      out.write("    // add commas to left side of number\n");
      out.write("    left_side = formatNumber(left_side);\n");
      out.write("\n");
      out.write("    // validate right side\n");
      out.write("    right_side = formatNumber(right_side);\n");
      out.write("\n");
      out.write("    // On blur make sure 2 numbers after decimal\n");
      out.write("    if (blur === \"blur\") {\n");
      out.write("      right_side += \"00\";\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Limit decimal to only 2 digits\n");
      out.write("    right_side = right_side.substring(0, 2);\n");
      out.write("\n");
      out.write("    // join number by .\n");
      out.write("    input_val = \"$\" + left_side + \".\" + right_side;\n");
      out.write("  } else {\n");
      out.write("    // no decimal entered\n");
      out.write("    // add commas to number\n");
      out.write("    // remove all non-digits\n");
      out.write("    input_val = formatNumber(input_val);\n");
      out.write("    input_val = \"$\" + input_val;\n");
      out.write("\n");
      out.write("    // final formatting\n");
      out.write("    if (blur === \"blur\") {\n");
      out.write("      input_val += \".00\";\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  // send updated string to input\n");
      out.write("  input.val(input_val);\n");
      out.write("\n");
      out.write("  // put caret back in the right position\n");
      out.write("  var updated_len = input_val.length;\n");
      out.write("  caret_pos = updated_len - original_len + caret_pos;\n");
      out.write("  input[0].setSelectionRange(caret_pos, caret_pos);\n");
      out.write("}\n");
      out.write("\n");
      out.write("var claimform = document.querySelector(\"#claimform\");\n");
      out.write("\n");
      out.write("// imput fields\n");
      out.write("var claimname = document.querySelector(\"#claimname\");\n");
      out.write("var claimdes = document.querySelector(\"#claimdes\");\n");
      out.write("var currencyfield = document.querySelector(\"#currency-field\");\n");
      out.write("\n");
      out.write("claimform.addEventListener(\"submit\", () => {\n");
      out.write("  var ip1 = claimname.value;\n");
      out.write("  var ip2 = claimdes.value;\n");
      out.write("  var ip3 = currencyfield.value;\n");
      out.write("  var obj = {\n");
      out.write("    ip1: ip1,\n");
      out.write("    ip2: ip2,\n");
      out.write("    ip3: ip3,\n");
      out.write("  };\n");
      out.write("  // arr.push(obj);\n");
      out.write("  localStorage.setItem(++localStorage.length, JSON.stringify(obj));\n");
      out.write("  // let stored = JSON.parse(localStorage.getItem(`data");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("`));\n");
      out.write("});\n");
      out.write("// console.log(i);\n");
      out.write("\n");
      out.write("var submit = document.querySelector(\".submit\");\n");
      out.write("var detailsection = document.querySelector(\"#detailsection\");\n");
      out.write("\n");
      out.write("function StartGame() {\n");
      out.write("  var i = localStorage.length;\n");
      out.write("  for (var x = 0; x < i; x++) {\n");
      out.write("    var temp = x + 1;\n");
      out.write("    var ip1 = JSON.parse(localStorage.getItem(`");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${temp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("`)).ip1;\n");
      out.write("    var ip2 = JSON.parse(localStorage.getItem(`");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${temp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("`)).ip2;\n");
      out.write("    var ip3 = JSON.parse(localStorage.getItem(`");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${temp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("`)).ip3;\n");
      out.write("    var div = document.createElement(\"div\");\n");
      out.write("    div.classList.add(\"claimdet\");\n");
      out.write("    div.innerHTML = `<div class=\"claimdiv\">\n");
      out.write("            <div class=\"claim\">\n");
      out.write("              <img\n");
      out.write("                src=\"https://static.vecteezy.com/system/resources/previews/002/641/198/original/invoice-icon-vector.jpg\"\n");
      out.write("                alt=\"\"\n");
      out.write("              />\n");
      out.write("              <div class=\"claimhead\">\n");
      out.write("                <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ip1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                <p class=\"grey towrap\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ip2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"claimdetails\">\n");
      out.write("              <div class=\"amount\">\n");
      out.write("                <p class=\"grey\">Sum</p>\n");
      out.write("                <h4>Rs. ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ip3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"docs\">\n");
      out.write("                <p class=\"grey\">Doc.</p>\n");
      out.write("                <h4><i class=\"ri-download-line\"></i></h4>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>`;\n");
      out.write("    detailsection.appendChild(div);\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("if(localStorage.length > 0){\n");
      out.write("  document.querySelector(\"#sendreq\").style.display = \"initial\";\n");
      out.write("  document.querySelector(\".newshowdiv\").style.display = \"flex\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("  </body>\n");
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
