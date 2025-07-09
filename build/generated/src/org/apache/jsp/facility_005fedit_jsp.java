package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class facility_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Document</title>\n");
      out.write("\n");
      out.write("    <!--Bootstrap 5-->\n");
      out.write("    <link\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    />\n");
      out.write("\n");
      out.write("    <!--Font awesome-->\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\"\n");
      out.write("      integrity=\"sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("      referrerpolicy=\"no-referrer\"\n");
      out.write("    />\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/crud.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body class=\"edit-facility-body\">\n");
      out.write("    <div class=\"container py-3 h-50\">\n");
      out.write("      <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("        <div class=\"col-xl-10\">\n");
      out.write("          <div class=\"card rounded-3 text-black\">\n");
      out.write("            <div class=\"row g-0\">\n");
      out.write("              <div class=\"col-12 offset-lg-3 col-lg-6\">\n");
      out.write("                <div class=\"card-body p-md-5 mx-md-4\">\n");
      out.write("                  <div class=\"\">\n");
      out.write("                       <a href=\"facilityDetail\" class=\"text-decoration-none\"> <h6><i class=\"fa fa-arrow-left ms-auto\" aria-hidden=\"true\"></i> Trở về trang trước</h6> \n");
      out.write("                                        </a>\n");
      out.write("                    <h3 class=\"mt-1 mb-3 pb-1 text-center\">Chỉnh sửa cơ sở</h3>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <form action=\"editFacility\" method=\"post\">\n");
      out.write("                    <div class=\"row form-outline mb-2\">\n");
      out.write("                         <label class=\"col-7\">Tên cơ sở</label>\n");
      out.write("                      <input\n");
      out.write("                          class=\"col-5\"\n");
      out.write("                        type=\"text\"\n");
      out.write("                        value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.facilityS.fName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                        name=\"edit_fName\"\n");
      out.write("                        required=\"required\"\n");
      out.write("                        class=\"form-control\"\n");
      out.write("                        placeholder=\"\"\n");
      out.write("                        type=\"text\" name=\"add_fName\" title=\"Nhập tối đa 20 kí tự bao gồm chữ cái và số.\" id=\"\" minlenght='1' maxlength=\"20\"\n");
      out.write("                      />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-outline mb-2\">\n");
      out.write("                      <input\n");
      out.write("                        type=\"text\"\n");
      out.write("                        value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.facilityS.fAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                        name=\"edit_fAddress\"\n");
      out.write("                        required=\"required\"\n");
      out.write("                        class=\"form-control\"\n");
      out.write("                        placeholder=\"Địa chỉ\"\n");
      out.write("                        title=\"Nhập tối đa 20 kí tự bao gồm chữ cái và số.\" minlenght='1' maxlength=\"20\"\n");
      out.write("                      />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-outline mb-2\">\n");
      out.write("                      <input\n");
      out.write("                        type=\"text\"\n");
      out.write("                        value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.facilityS.fPhone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                        name=\"edit_fPhone\"\n");
      out.write("                        required=\"required\"\n");
      out.write("                        class=\"form-control\"\n");
      out.write("                        placeholder=\"Số điện thoại cơ sở\"\n");
      out.write("                         pattern=\"[0][0-9]{9}\" title=\"Số điện thoại không hợp lệ.\"\n");
      out.write("                      />\n");
      out.write("                    </div>\n");
      out.write("                        <p class=\"text-danger\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("                    <div class=\"form-outline mb-2\">\n");
      out.write("                      <input\n");
      out.write("                        required=\"required\" type=\"number\"\n");
      out.write("                        value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.facilityS.fCultivatingPondSquare}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                        name=\"edit_fCultivatingPondSquare\"\n");
      out.write("                        class=\"form-control\"\n");
      out.write("                        placeholder=\"Tổng diện tích ao canh tác\"\n");
      out.write("                        min=\"0\" max=\"100000\"  title=\"Tối đa 100000 mét vuông\" \n");
      out.write("                      />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-outline mb-2\">\n");
      out.write("                      <input\n");
      out.write("                        required=\"required\" type=\"number\"\n");
      out.write("                        value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.facilityS.fStoragePondSquare}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                        name=\"edit_fStoragePondSquare\"\n");
      out.write("                        class=\"form-control\"\n");
      out.write("                        placeholder=\"Tổng diện tích ao chứa\"\n");
      out.write("                        min=\"0\" max=\"100000\"\n");
      out.write("                      />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-outline mb-2\">\n");
      out.write("                      <input\n");
      out.write("                        required=\"required\" type=\"number\"\n");
      out.write("                        value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.facilityS.fWastePondSquare}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                        name=\"edit_fWastePondSquare\"\n");
      out.write("                        class=\"form-control\"\n");
      out.write("                        placeholder=\"Diện tích ao chứa bùn thải\"\n");
      out.write("                        min=\"0\" max=\"100000\"\n");
      out.write("                      />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-outline mb-2\">\n");
      out.write("                      <input\n");
      out.write("                        type=\"text\"\n");
      out.write("                        value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.facilityS.fCultivatingObject}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                        name=\"edit_fCultivatingObject\"\n");
      out.write("                        class=\"form-control\"\n");
      out.write("                        placeholder=\"Loài canh tác\"\n");
      out.write("                        required=\"required\"\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                      />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-outline mb-2\">\n");
      out.write("                      <input\n");
      out.write("                        required=\"required\" type=\"number\"\n");
      out.write("                        value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.facilityS.fCultivatingTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                        name=\"edit_fCultivatingTime\"\n");
      out.write("                        class=\"form-control\"\n");
      out.write("                        placeholder=\"Thời gian canh tác\"\n");
      out.write("                      />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"text-center pt-1 mb-5\">\n");
      out.write("                      <button\n");
      out.write("                        class=\"btn btn-primary btn-block fa-lg gradient-custom-2 mb-6 py-2 px-5\"\n");
      out.write("                        type=\"submit\"\n");
      out.write("                      >\n");
      out.write("                        Chỉnh sửa cơ sở\n");
      out.write("                      </button>\n");
      out.write("                    </div>\n");
      out.write("                  </form>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
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
