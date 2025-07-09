package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005ffacility_005fviewall_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>Document</title>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\"crossorigin=\"anonymous\"></script>\n");
      out.write("        <!--Bootstrap 5-->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\" />\n");
      out.write("        <!--Font awesome-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\"\n");
      out.write("              integrity=\"sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==\"\n");
      out.write("              crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/home.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/crud.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/manage.css\" />\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\n");
      out.write("                integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\n");
      out.write("                integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\n");
      out.write("                integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container mb-5\">\n");
      out.write("            <nav class=\"navbar navbar-dark navbar-expand-lg  bg-success fixed-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#Navbar\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\"><img src=\"./images/logo.png\" height=\"30\" width=\"61\" alt=\"\" /></a>\n");
      out.write("                    <div class=\"collapse navbar-collapse \" id=\"Navbar\">\n");
      out.write("                        <ul class=\" navbar-nav ms-auto\" >\n");
      out.write("                            <!--Home-->\n");
      out.write("                            <li class=\"nav-item dropdown dropdown-mega dropdown-mega-home position-static\">\n");
      out.write("                                <a class=\"nav-link \" href=\"#\" data-bs-toggle=\"dropdown\" data-bs-auto-close=\"outside\">Trang chú</a>\n");
      out.write("                            </li>\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"logout\">Đăng xuất </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <!--Main layout-->\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div class=\"mt-5\">\n");
      out.write("                <div class=\"mt-5\">\n");
      out.write("                    <a href=\"home\" class=\"text-decoration-none mt-5\"> <h6><i class=\"fa fa-arrow-left ms-auto mt-3\" aria-hidden=\"true\"></i>Trở về trang trước</h6> \n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <h2>Danh sách tất cả cơ sở</h2>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <nav>\n");
      out.write("                            <div class=\"nav nav-tabs\" id=\"nav-tab\" role=\"tablist\">\n");
      out.write("                                <button\n");
      out.write("                                    class=\"nav-link active nav-link-farm\"\n");
      out.write("                                    id=\"nav-link-farm\"\n");
      out.write("                                    data-bs-toggle=\"tab\"\n");
      out.write("                                    data-bs-target=\"#nav-home\"\n");
      out.write("                                    type=\"button\"\n");
      out.write("                                    role=\"tab\"\n");
      out.write("                                    aria-controls=\"nav-home\"\n");
      out.write("                                    aria-selected=\"true\"\n");
      out.write("                                    >\n");
      out.write("                                    Tất cả cơ sở\n");
      out.write("                                </button>\n");
      out.write("                                <!--Nav Link-->\n");
      out.write("                                <a\n");
      out.write("                                    href=\"./facility_add.jsp\"\n");
      out.write("                                    id=\"add-farm-button\"\n");
      out.write("                                    class=\"ms-2 m-1 btn btn-primary add-farm-button\"\n");
      out.write("                                    >\n");
      out.write("                                    Thêm cơ sở\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </nav>\n");
      out.write("                        <div class=\"tab-content mt-3\" id=\"nav-tabContent\">\n");
      out.write("                            <!--Facility List-->\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col col-lg-4\">\n");
      out.write("                                        <div class=\"card mb-3 farm-card\">\n");
      out.write("                                            <div class=\"row no-gutters\">\n");
      out.write("                                                <div class=\"col-md-4\" style=\"max-height: 100%\">\n");
      out.write("                                                    <img\n");
      out.write("                                                        src=\"./images/jumbotron.jpg\"\n");
      out.write("                                                        class=\"card-img\"\n");
      out.write("                                                        alt=\"...\"\n");
      out.write("                                                        />\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-8\">\n");
      out.write("                                                    <div class=\"card-body\">\n");
      out.write("                                                        <h4 class=\"card-title\">CƠ sở 1</h4>\n");
      out.write("                                                        <div class=\"row mt-2\">\n");
      out.write("                                                            <div class=\"col-12\">\n");
      out.write("                                                                <a\n");
      out.write("                                                                    href=\"\"\n");
      out.write("                                                                    type=\"button\"\n");
      out.write("                                                                    class=\"col-12 btn btn-primary\"\n");
      out.write("                                                                    >\n");
      out.write("                                                                    Xem chi tiết\n");
      out.write("                                                                </a>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <!--Manage-->\n");
        out.write("                                <li class=\"nav-item dropdown dropdown-mega position-static\">\n");
        out.write("                                    <a class=\"nav-link dropdown-toggle\" href=\"https://getbootstrap.com/docs/4.0/utilities/spacing/\" data-bs-toggle=\"dropdown\" data-bs-auto-close=\"outside\">Quản lý</a>\n");
        out.write("                                    <div class=\"dropdown-menu shadow\">\n");
        out.write("                                        <div class=\"mega-content px-4\">\n");
        out.write("                                            <div class=\"container-fluid\">\n");
        out.write("                                                <div class=\"row\">\n");
        out.write("                                                    <div class=\"col-12\">Bạn muốn quản lý??</div>\n");
        out.write("                                                    <div class=\"col-12 col-sm-12 col-md-6 py-4 mega-container mega-container-div1\">\n");
        out.write("                                                        <!--                                        <img src=\"./images/morenew1withblur.jpg\" alt=\"\">-->\n");
        out.write("                                                        <div onclick=\"location.href = 'manage_viewall'\" class=\"bottom-left justify-content-center\">\n");
        out.write("                                                            Cơ sở</div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                </li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"nav-item\">\n");
        out.write("                                    <a class=\"nav-link\" href=\"./login.jsp\">Đăng nhập </a>\n");
        out.write("                                </li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
