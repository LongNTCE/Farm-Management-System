package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"./css/login.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body class=\"signup-body\">\n");
      out.write("        <div class=\"container py-3 h-50\">\n");
      out.write("            <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("                <div class=\"col-xl-10\">\n");
      out.write("                    <div class=\"card rounded-3 text-black\">\n");
      out.write("                        <div class=\"row g-0\">\n");
      out.write("                            <div class=\"col-12 col-lg-6 d-flex align-items-center login-panel gradient-custom-2\">\n");
      out.write("                                <div class=\"text-white px-3 py-4 p-md-5 mx-md-4\">\n");
      out.write("                                    <h4 class=\"mb-4\">Hơn cả một phần mềm</h4>\n");
      out.write("                                    <p class=\"small mb-0\">Chúng tôi mong muốn được hỗ trợ người dân trong việc nhập xuất báo cáo theo chuẩn VIETGAP</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12 col-lg-6\">\n");
      out.write("                                <div class=\"card-body p-md-5 mx-md-4\">\n");
      out.write("\n");
      out.write("                                    <div class=\"text-center\">\n");
      out.write("                                        <img src=\"./images/shrimp.jpg\" alt=\"logo\">\n");
      out.write("                                        <h4 class=\"\">Phần mềm quản lý báo cáo nuôi tôm theo chuẩn VIETGAP</h4>\n");
      out.write("                                        <h6 class=\"text-primary mt-3\">Đăng kí cho chủ cơ sở</h6>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <form action=\"signup\" method=\"post\">\n");
      out.write("                                        <p>Chọn vai trò đi thằng lồn</p>\n");
      out.write("                                        <select class=\"form-select form-select-sm mb-2\"  name=\"signup_role\" aria-label=\".form-select-sm example\">\n");
      out.write("\n");
      out.write("                                            <option  value=\"signup_type_employee\">Nhân Công</option>\n");
      out.write("                                            <option  value=\"signup_type_fowner\">Chủ cơ sở</option>\n");
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-outline mb-2\">\n");
      out.write("                                            <input type=\"text\" name=\"signup_username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${signup_user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"\" class=\"form-control\"  required=\"required\" title=\"Nhập 6 đến 20 kí tự bao gồm chữ cái và số.\" placeholder=\"Tên đầy đủ\"/><p class=\"text-danger\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-outline mb-2\">\n");
      out.write("                                            <input type=\"text\" name=\"signup_email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${signup_email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\"  placeholder=\"Email\" required=\"required\" pattern=\"[^@\\s]+@[^@\\s]+\\.[^@\\s]+\" title=\"Email không hợp lệ.\" /><p class=\"text-danger\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-outline mb-2\">\n");
      out.write("                                            <input type=\"text\" pattern=\"[0][0-9]{9}\" name=\"signup_phoneNum\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${signup_phoneNum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"\" required=\"required\" class=\"form-control\" title=\"Số điện thoại không hợp lệ.\" placeholder=\"Số điện thoại\"/><p class=\"text-danger\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-outline mb-2\">\n");
      out.write("                                            <input type=\"password\" name=\"signup_pass\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${signup_pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" onmouseover=\"mouseoverPass();\" onmouseout=\"mouseoutPass();\" id=\"pass1\" class=\"form-control\" placeholder=\"Mật khẩu\" required=\"required\" /><p class=\"text-danger\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error5}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-outline mb-2\">\n");
      out.write("                                            <input type=\"password\" name=\"signup_repass\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${signup_repass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" onmouseover=\"mouseoverPass2();\" onmouseout=\"mouseoutPass2();\" id=\"pass2\" class=\"form-control\" placeholder=\"Nhập lại mật khẩu\" required=\"required\" /><p class=\"text-danger\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error5}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"text-center pt-1 mb-5\">\n");
      out.write("                                            <button class=\"btn btn-primary btn-block fa-lg gradient-custom-2 mb-6 py-2 px-5\" type=\"submit\">Đăng kí</button>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"d-flex align-items-center justify-content-center\">\n");
      out.write("                                            <p class=\"mb-0 me-2\">Bạn đã có sẵn tài khoản? </p>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-outline-danger\"> <a href=\"./login.jsp\" class=\"text-decoration-none\">Đăng nhập</a></button>\n");
      out.write("                                        </div>\n");
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
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function mouseoverPass(obj) {\n");
      out.write("                var obj = document.getElementById('pass1');\n");
      out.write("                obj.type = \"text\";\n");
      out.write("            }\n");
      out.write("            function mouseoutPass(obj) {\n");
      out.write("                var obj = document.getElementById('pass1');\n");
      out.write("                obj.type = \"password\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function mouseoverPass2(obj) {\n");
      out.write("                var obj = document.getElementById('pass2');\n");
      out.write("                obj.type = \"text\";\n");
      out.write("            }\n");
      out.write("            function mouseoutPass2(obj) {\n");
      out.write("                var obj = document.getElementById('pass2');\n");
      out.write("                obj.type = \"password\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
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
