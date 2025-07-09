package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pond_005fwaterEnv_005fdetail_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>Document</title>\n");
      out.write("\n");
      out.write("        <!--Bootstrap 5-->\n");
      out.write("        <link\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <!--Font awesome-->\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\"\n");
      out.write("            integrity=\"sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            referrerpolicy=\"no-referrer\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/crud.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body class=\"add-crop-body\">\n");
      out.write("        <div class=\"container py-3 h-50\">\n");
      out.write("            <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("                <div class=\"col-xl-10\">\n");
      out.write("                    <div class=\"card rounded-3 text-black\">\n");
      out.write("                        <div class=\"row g-0\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-12 offset-lg-3 col-lg-6\">\n");
      out.write("                                <div class=\"card-body p-md-5 mx-md-4\">\n");
      out.write("\n");
      out.write("                                      <a href=\"#\" class=\"text-decoration-none\"> <h6><i class=\"fa fa-arrow-left ms-auto\" aria-hidden=\"true\"></i> Back to previous</h6> \n");
      out.write("                                        </a>\n");
      out.write("                                        <h3 class=\"mt-1 mb-3 pb-1 text-center\">Thêm báo cáo môi trường nước</h3>\n");
      out.write("                                  \n");
      out.write("\n");
      out.write("                                    <form action=\"AddWaterEnvRecord\" method=\"post\">\n");
      out.write("\n");
      out.write("                                        <div class=\"form-outline mb-2\">\n");
      out.write("                                            <input\n");
      out.write("                                                type=\"date\"\n");
      out.write("                                                id=\"\"\n");
      out.write("                                                required=\"required\"\n");
      out.write("                                                name=\"add_envDate\"\n");
      out.write("                                                class=\"form-control\"\n");
      out.write("                                                placeholder=\"Ngày tháng năm\"\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                    <div class=\"form-outline mb-2\">        \n");
      out.write("              \n");
      out.write("                                 </div>        \n");
      out.write("\n");
      out.write("                                        <div class=\"form-outline mb-2\">\n");
      out.write("                                            <input\n");
      out.write("                                                type=\"double\"\n");
      out.write("                                                id=\"\"\n");
      out.write("                                                required=\"required\"\n");
      out.write("                                                name=\"add_dissolveOxygen_morning\"\n");
      out.write("                                                class=\"form-control\"\n");
      out.write("                                                placeholder=\"Oxy hòa tan sáng (mg/l)\"\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                         <div class=\"form-outline mb-2\">\n");
      out.write("                                            <input\n");
      out.write("                                                type=\"double\"\n");
      out.write("                                                id=\"\"\n");
      out.write("                                                required=\"required\"\n");
      out.write("                                                name=\"add_dissolveOxygen_afternoon\"\n");
      out.write("                                                class=\"form-control\"\n");
      out.write("                                                placeholder=\"Oxy hòa tan chiều (mg/l)\"\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                           <div class=\"form-outline mb-2\">\n");
      out.write("                                            <input\n");
      out.write("                                                type=\"double\"\n");
      out.write("                                                id=\"\"\n");
      out.write("                                                required=\"required\"\n");
      out.write("                                                name=\"add_pH_morning\"\n");
      out.write("                                                class=\"form-control\"\n");
      out.write("                                                placeholder=\"Độ pH sáng\"\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                         <div class=\"form-outline mb-2\">\n");
      out.write("                                            <input\n");
      out.write("                                                type=\"double\"\n");
      out.write("                                                id=\"\"\n");
      out.write("                                                required=\"required\"\n");
      out.write("                                                name=\"add_pH_afternoon\"\n");
      out.write("                                                class=\"form-control\"\n");
      out.write("                                                placeholder=\"Độ pH chiều\"\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                         <div class=\"form-outline mb-2\">\n");
      out.write("                                            <input\n");
      out.write("                                                type=\"double\"\n");
      out.write("                                                id=\"\"\n");
      out.write("                                                required=\"required\"\n");
      out.write("                                                name=\"add_temperature_morning\"\n");
      out.write("                                                class=\"form-control\"\n");
      out.write("                                                placeholder=\"Nhiệt độ buổi sáng\"\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                           <div class=\"form-outline mb-2\">\n");
      out.write("                                            <input\n");
      out.write("                                                type=\"double\"\n");
      out.write("                                                id=\"\"\n");
      out.write("                                                required=\"required\"\n");
      out.write("                                                name=\"add_temperature_afternoon\"\n");
      out.write("                                                class=\"form-control\"\n");
      out.write("                                                placeholder=\"Nhiệt độ buổi chiều\"\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                       <div class=\"form-outline mb-2\">\n");
      out.write("                                            <input\n");
      out.write("                                                type=\"double\"\n");
      out.write("                                                id=\"\"\n");
      out.write("                                                required=\"required\"\n");
      out.write("                                                name=\"add_salinity\"\n");
      out.write("                                                class=\"form-control\"\n");
      out.write("                                                placeholder=\"Độ mặn (phần nghìn)\"\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                         <div class=\"form-outline mb-2\">\n");
      out.write("                                            <input\n");
      out.write("                                                type=\"double\"\n");
      out.write("                                                id=\"\"\n");
      out.write("                                                required=\"required\"\n");
      out.write("                                                name=\"add_purity\"\n");
      out.write("                                                class=\"form-control\"\n");
      out.write("                                                placeholder=\"Độ trong (cm3)\"\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                           <div class=\"form-outline mb-2\">\n");
      out.write("                                            <input\n");
      out.write("                                                type=\"double\"\n");
      out.write("                                                id=\"\"\n");
      out.write("                                                required=\"required\"\n");
      out.write("                                                name=\"add_NH3\"\n");
      out.write("                                                class=\"form-control\"\n");
      out.write("                                                placeholder=\"nH3 (mg/l)\"\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"form-outline mb-2\">\n");
      out.write("                                            <input\n");
      out.write("                                                type=\"double\"\n");
      out.write("                                                id=\"\"\n");
      out.write("                                                required=\"required\"\n");
      out.write("                                                name=\"add_alkali\"\n");
      out.write("                                                class=\"form-control\"\n");
      out.write("                                                placeholder=\"Độ kiềm (mg/l)\"\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                         <div class=\"form-outline mb-2\">\n");
      out.write("                                              <label class=\"col-6\">H2S (mg/l)</label>\n");
      out.write("                                            <input\n");
      out.write("                                                type=\"double\"\n");
      out.write("                                                id=\"\"\n");
      out.write("                                                required=\"required\"\n");
      out.write("                                                name=\"add_H2S\"\n");
      out.write("                                                class=\"form-control\"\n");
      out.write("                                                placeholder=\"\"\n");
      out.write("                                                />\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                           \n");
      out.write("                                        \n");
      out.write("                                       \n");
      out.write("                                        \n");
      out.write("                                          \n");
      out.write("\n");
      out.write("                                        <div class=\"text-center pt-1 mb-5\">\n");
      out.write("                                            <button class=\"btn btn-primary btn-block fa-lg gradient-custom-2 mb-6 py-2 px-5\" type=\"submit\">Thêm chi tiết</button>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
