package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <!--Bootstrap 5-->\n");
      out.write("        <link\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer class=\"mt-5\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-2\">\n");
      out.write("                        <h5 class=\"mb-2\">Contact</h5>\n");
      out.write("                        <ul class=\"nav\">\n");
      out.write("                            <li class=\"nav-item mb-2\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link p-0 text-muted\"><i class=\"fas fa-phone-alt\"></i> 0123456789</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item mb-2\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link p-0 text-muted\"><i class=\"fas fa-envelope-open-text\"></i> abc@gmail.com</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item mb-2\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link p-0 text-muted\"><i class=\"fas fa-map\"></i> Number 400, NVC noi dai, Ninh Kieu,\n");
      out.write("                                    Can Tho</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-2\">\n");
      out.write("                        <h5 class=\"mb-3\">Standards</h5>\n");
      out.write("                        <ul class=\"nav flex-column\">\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item mb-3\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link p-0 text-muted\"><img src=\"./images/globalgap.jpg\" height=\"40px\"\n");
      out.write("                                                                                 width=\"40px\" /></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item mb-3\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link p-0 text-muted\"><img src=\"./images/vietgap.jpg\" height=\"40px\"\n");
      out.write("                                                                                 width=\"40px\" /></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-2\">\n");
      out.write("                        <h5>Explore</h5>\n");
      out.write("                        <ul class=\"nav flex-column\">\n");
      out.write("                            <li class=\"nav-item mb-2\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link p-0 text-muted\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item mb-2\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link p-0 text-muted\">Features</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item mb-2\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link p-0 text-muted\">Pricing</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item mb-2\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link p-0 text-muted\">FAQs</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item mb-2\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link p-0 text-muted\">About</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-4 offset-1\">\n");
      out.write("                        <form>\n");
      out.write("                            <h5>Subscribe to our newsletter</h5>\n");
      out.write("                            <p>Monthly digest of whats new and exciting from us.</p>\n");
      out.write("                            <div class=\"d-flex w-100 gap-2\">\n");
      out.write("                                <label for=\"newsletter1\" class=\"visually-hidden\">Email address</label>\n");
      out.write("                                <input id=\"newsletter1\" type=\"text\" class=\"form-control\" placeholder=\"Email address\" />\n");
      out.write("                                <button class=\"btn btn-primary\" type=\"button\">Subscribe</button>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"d-flex justify-content-center py-4 my-4 border-top \">\n");
      out.write("                    <p>© 2021 Company, Inc. All rights reserved.</p>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </footer>\n");
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
