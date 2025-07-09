package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pond_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("        <script\n");
      out.write("            src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("        ></script>\n");
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
      out.write("        <script src=\"./js/modal.js\"></script>\n");
      out.write("        <script src=\"./js/manage.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/manage.css\" />\n");
      out.write("\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <!--JQuery 3.6.1-->\n");
      out.write("        <script\n");
      out.write("            src=\"//ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js\"\n");
      out.write("            language=\"javascript\"\n");
      out.write("            type=\"text/javascript\"\n");
      out.write("        ></script>\n");
      out.write("\n");
      out.write("        <script\n");
      out.write("            src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\n");
      out.write("            integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("        ></script>\n");
      out.write("        <script\n");
      out.write("            src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\n");
      out.write("            integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("        ></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container mb-5\">\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./navBar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--Main layout-->\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div class=\"container dark-grey-text mt-5\">\n");
      out.write("                <!--Grid row-->\n");
      out.write("                <div class=\"row wow fadeIn mt-5\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div >\n");
      out.write("                            <a href=\"#\" class=\"text-decoration-none\"> <h6><i class=\"fa fa-arrow-left ms-auto mt-3\" aria-hidden=\"true\"></i>Trở về trang trước</h6> \n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <h2 class=\"d-flex justify-content-center\">Chi tiết ao</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <!--Grid column-->\n");
      out.write("                    <div class=\"col-md-6 mb-4\">\n");
      out.write("                        <!--Content-->\n");
      out.write("                        <div class=\"p-4\">\n");
      out.write("                            <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pondDetail.pondName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                             <table class=\"table-borderless\">\n");
      out.write("\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("\n");
      out.write("                                        <td>Diện tích ao</td>\n");
      out.write("                                        <td><b> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pondDetail.pondSquare}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b> </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("\n");
      out.write("                                        <td>Mã số ao</td>\n");
      out.write("                                        <td><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pondDetail.pondCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b></td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        <!--Content-->\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--Grid column-->\n");
      out.write("                    <div class=\"col-md-6 mt-5\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"row mt-2\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <a href=\"pondInventory_Management?pondID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pondDetail.pondID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"submit\" class=\"col-10 m-1 btn btn-primary\">\n");
      out.write("                                Báo cáo kho của ao \n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <a href=\"./pondSurvivalRate_Management?pondID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pondDetail.pondID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"submit\" class=\"col-10 m-1 btn btn-primary\">\n");
      out.write("                                Báo cáo tỷ lệ sống\n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <a href=\"pondWaterEnv_Management?pondID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pondDetail.pondID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"submit\" class=\"col-10 m-1 btn btn-primary\">\n");
      out.write("                                Báo cáo môi trường nước \n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <h5>Lựa chọn thao tác của bạn</h5>\n");
      out.write("                        <div class=\"row mb-2\">\n");
      out.write("                            <a href=\"./pond_edit.jsp\" type=\"button\" class=\"btn btn-primary col-5 m-1\">\n");
      out.write("                                Sửa chi tiết ao\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"DeletePondControl\" type=\"button\" class=\"btn btn-danger col-5 m-1\">\n");
      out.write("                                Xóa ao\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <h5>Chuyển tới vụ mùa khác</h5>\n");
      out.write("                        <form action=\"movepond\" method=\"post\">\n");
      out.write("                            <div class=\"row mb-2\">\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <select class=\"form-select\"  name=\"selectcrop\" aria-label=\"Default select example\">\n");
      out.write("                                        <option selected disabled>Open this select menu</option>\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <button href=\"\" type=\"submit\" class=\"btn btn-primary col-6\">\n");
      out.write("                                        Chuyển\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!--Grid column-->\n");
      out.write("                </div>\n");
      out.write("                <!--Grid row-->\n");
      out.write("\n");
      out.write("                <hr />\n");
      out.write("\n");
      out.write("                <!--Grid row-->\n");
      out.write("                <div class=\"row d-flex justify-content-center wow fadeIn\">\n");
      out.write("                    <!--Grid column-->\n");
      out.write("                    <div class=\"col-md-6 text-center\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!--Grid column-->\n");
      out.write("                </div>\n");
      out.write("                <!--Grid row-->\n");
      out.write("\n");
      out.write("                <!--Grid row-->\n");
      out.write("                <div class=\"row wow fadeIn\">\n");
      out.write("                    <!--Grid column-->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"row mt-3\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!--Grid row-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--Main layout-->\n");
      out.write("\n");
      out.write("        <!--Footer-->\n");
      out.write("        <div class=\"container mb-5\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--/.Footer-->\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCropByFacilityID}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cropID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cropName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
