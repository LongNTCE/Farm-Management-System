package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.9.2/umd/popper.min.js\" integrity=\"sha512-2rNj2KJ+D8s1ceNasTIex6z4HWyOnEYLVC3FigGOmyQCZc2eBXKgOxQmo3oKLHyfcj53uz4QMsRCWNbLd32Q1g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"./css/login.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body class=\"login-body\">\n");
      out.write("        <div class=\"container py-5 h-150\">\n");
      out.write("            <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("                <div class=\"col-xl-10\">\n");
      out.write("                    <div class=\"card rounded-3 text-black\">\n");
      out.write("                        <div class=\"row g-0\">\n");
      out.write("                            <div class=\"col-12 col-lg-6\">\n");
      out.write("                                <div class=\"card-body p-md-5 mx-md-4\">\n");
      out.write("\n");
      out.write("                                    <div class=\"text-center\">\n");
      out.write("                                        <img src=\"./images/shrimp.jpg\" alt=\"logo\">\n");
      out.write("                                        <h4 class=\"mt-1 mb-5 pb-1\">Phần mềm quản lý quy trình nuôi tôm theo chuẩn VIETGAP</h4>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <form action=\"login\" method=\"post\">             \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"form-outline\">\n");
      out.write("                                            <input type=\"text\" name=\"login_username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login_username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" placeholder=\"Email\" required=\"required\"/><p class=\"text-danger\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-outline\">\n");
      out.write("                                            <input type=\"password\" name=\"login_pass\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login_pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" placeholder=\"Mật khẩu\" required=\"required\"/><p class=\"text-danger\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        <input type =\"checkbox\">Rememberme\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <h5 class=\" text-center\">Đăng nhập với vai trò</h5>\n");
      out.write("                                        <select class=\"form-select form-select-sm mb-2\"  id=\"login_role\" name=\"login_role\" aria-label=\".form-select-sm example\">\n");
      out.write("\n");
      out.write("                                            <option  value=\"login_type_employee\">Nhân Công</option>\n");
      out.write("                                            <option  value=\"login_type_fowner\">Chủ cơ sở</option>\n");
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"text-center pt-1 mb-5 py-3\">\n");
      out.write("                                            <button class=\"btn btn-primary btn-block fa-lg gradient-custom-2 mb-6 py-2 px-5\" type=\"submit\">Đăng nhập</button>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </form>\n");
      out.write("                                    <div class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                                        <p class=\"mb-0 me-2\">Tạo tài khoản mới cho </p>\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-outline-danger\"><a class=\"text-decoration-none\" href=\"signup\">Chủ cơ sở</a>\n");
      out.write("                                        </button>\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-outline-danger ms-2\"><a class=\"text-decoration-none\" href=\"SignUp_EmployeeControl\">Nhân công</a>\n");
      out.write("                                        </button>\n");
      out.write("                                        <!--                                            <button type=\"submit\" class=\"btn btn-outline-danger\"> <a class=\"text-decoration-none\" href=\"./employee_signup.jsp\">Tạo tài khoản cho nhân công</a>\n");
      out.write("                                                                                    </button>-->\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12 col-lg-6 d-flex align-items-center signup-panel gradient-custom-2\">\n");
      out.write("                                <div class=\"text-white px-3 py-4 p-md-5 mx-md-4\">\n");
      out.write("                                    <h4 class=\"mb-4\">We are more than just a company</h4>\n");
      out.write("                                    <p class=\"small mb-0\">Login now so you can experience the new thing in shrimp management process</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
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
