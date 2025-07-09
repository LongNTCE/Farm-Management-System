package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>Document</title>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\"crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <!--Bootstrap 5-->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\" />\n");
      out.write("\n");
      out.write("        <!--Font awesome-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\"\n");
      out.write("              integrity=\"sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==\"\n");
      out.write("              crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/home.css\" />\n");
      out.write("\n");
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <header style=\"background-image: url(./images/jumbotron.jpg)\" class=\"jumbotron align-item-center\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row row-header\">\n");
      out.write("                    <div class=\"col-12 col-sm-6\">\n");
      out.write("                        <h1><b>Phần mềm quản lý nuôi tôm chuẩn VIETGAP</b></h1>\n");
      out.write("                        <p>\n");
      out.write("                            We head to the target of user-friendly in shrimp management software and procedure. Your happiness in experience also our \n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-sm justify-content-center align-items-center align-self-center\">\n");
      out.write("                        <img src=\"./images/img/logo.png\" class=\"img-fluid\" alt=\"\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-sm justify-content-center align-items-center align-self-center\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-warning btn-block nav-link align-self-center\">\n");
      out.write("                            <span>Begin your management</span>\n");
      out.write("                            <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.accEmp.employeeEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("                            <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.foEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("                            <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.foID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("                            <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.accEmp.employeeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-dark navbar-expand-lg  bg-success fixed-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#Navbar\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\"><img src=\"./images/logo.png\" height=\"30\" width=\"61\" alt=\"\" /></a>\n");
      out.write("                <div class=\"collapse navbar-collapse \" id=\"Navbar\">\n");
      out.write("                    <ul class=\" navbar-nav ms-auto\" >\n");
      out.write("\n");
      out.write("                        <!--Home-->\n");
      out.write("                        <li class=\"nav-item dropdown dropdown-mega dropdown-mega-home position-static\">\n");
      out.write("                            <a class=\"nav-link \" href=\"#\" data-bs-toggle=\"dropdown\" data-bs-auto-close=\"outside\">Trang chú</a>\n");
      out.write("\n");
      out.write("                          \n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"logout\">Đăng xuất </a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <section class=\"stories-s-1 mt-5 mb-5 p-3\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"content-section free-text-wrap\">\n");
      out.write("                        <h2>Hear What Our Growers are Saying About Us</h2>\n");
      out.write("                        <p>\n");
      out.write("                            Hear directly from Rivulis customers and learn about their\n");
      out.write("                            experience and the results they have achieved using our micro\n");
      out.write("                            irrigation products and solutions.\n");
      out.write("                        </p>\n");
      out.write("                        <h4 class=\"reset-typography\">\n");
      out.write("                            <b>Choose the crop solution you’d like to learn about:</b>\n");
      out.write("                        </h4>\n");
      out.write("                        <div class=\"custom-type-select\">\n");
      out.write("                            <select class=\"form-select\" aria-label=\"Default select example\">\n");
      out.write("                                <option selected>Crop Rotation</option>\n");
      out.write("                                <option> Intensifation</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <div class=\"row news-card-row p-3\">\n");
      out.write("                <div class=\"card col-6\">\n");
      out.write("                    <img class=\"card-img-top\" src=\"./images/home_banner.jpg\" alt=\"Card image cap\" />\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("                        <p class=\"card-text\">\n");
      out.write("                            This is a wider card with supporting text below as a natural\n");
      out.write("                            lead-in to additional content. This content is a little bit\n");
      out.write("                            longer.\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"card-text\">\n");
      out.write("                            <small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card col-6\">\n");
      out.write("                    <img class=\"card-img-top\" src=\"./images/home_banner.jpg\" alt=\"Card image cap\" />\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("                        <p class=\"card-text\">\n");
      out.write("                            This is a wider card with supporting text below as a natural\n");
      out.write("                            lead-in to additional content. This content is a little bit\n");
      out.write("                            longer.\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"card-text\">\n");
      out.write("                            <small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card col-6 mt-4\">\n");
      out.write("                    <img class=\"card-img-top\" src=\"./images/home_banner.jpg\" alt=\"Card image cap\" />\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("                        <p class=\"card-text\">\n");
      out.write("                            This is a wider card with supporting text below as a natural\n");
      out.write("                            lead-in to additional content. This content is a little bit\n");
      out.write("                            longer.\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"card-text\">\n");
      out.write("                            <small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card col-6 mt-4\">\n");
      out.write("                    <img class=\"card-img-top\" src=\"./images/home_banner.jpg\" alt=\"Card image cap\" />\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("                        <p class=\"card-text\">\n");
      out.write("                            This is a wider card with supporting text below as a natural\n");
      out.write("                            lead-in to additional content. This content is a little bit\n");
      out.write("                            longer.\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"card-text\">\n");
      out.write("                            <small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card col-6 mt-4\">\n");
      out.write("                    <img class=\"card-img-top\" src=\"./images/home_banner.jpg\" alt=\"Card image cap\" />\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("                        <p class=\"card-text\">\n");
      out.write("                            This is a wider card with supporting text below as a natural\n");
      out.write("                            lead-in to additional content. This content is a little bit\n");
      out.write("                            longer.\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"card-text\">\n");
      out.write("                            <small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card col-6 mt-4\">\n");
      out.write("                    <img class=\"card-img-top\" src=\"./images/home_banner.jpg\" alt=\"Card image cap\" />\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("                        <p class=\"card-text\">\n");
      out.write("                            This is a wider card with supporting text below as a natural\n");
      out.write("                            lead-in to additional content. This content is a little bit\n");
      out.write("                            longer.\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"card-text\">\n");
      out.write("                            <small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"footer-connect \">\n");
      out.write("                <div class=\"row mt-5\">\n");
      out.write("                    <div class=\"col-xl-4 col-md-6\">\n");
      out.write("                        <h2>We want to help you <br /><b>HIGHEST QUANTITY</b></h2>\n");
      out.write("                        <h4>Let’s connect and begin discussing your farm needs</h4>\n");
      out.write("                        <img class=\"footer-connect-image1 offset-1\" src=\"./images/morenews1.jpg\">\n");
      out.write("                        <img class=\"footer-connect-image2 offset-4 \" src=\"./images/morenews2.jpg\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-4\">\n");
      out.write("                        <!-- Bootstrap 5 starter form -->\n");
      out.write("                        <form id=\"contactForm\">\n");
      out.write("                            <!-- Name input -->\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <input class=\"form-control\" id=\"name\" type=\"text\" placeholder=\"Name\" />\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Email address input -->\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <input class=\"form-control\" id=\"emailAddress\" type=\"email\" placeholder=\"Email Address\" />\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Phone number input -->\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Phone Number\" />\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Message input -->\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <textarea class=\"form-control\" id=\"message\" type=\"text\" placeholder=\"Message\"\n");
      out.write("                                          style=\"height: 10rem\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Form submit button -->\n");
      out.write("                            <div class=\"d-grid\">\n");
      out.write("                                <button class=\"btn btn-success btn-lg\" type=\"submit\">\n");
      out.write("                                    Submit\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div class=\"near-footer\">\n");
      out.write("                    <div class=\"col-xl-4\">\n");
      out.write("                        <img class=\"near-footer-img\" src=\"./images/nuoitomsu.jpg\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"contact-us-link\">\n");
      out.write("                <a href=\"https://rivulis.com/about/#contact\" class=\"p-2\">We are here to help you GROW BEYOND. Contact us to get\n");
      out.write("                    started.</a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <footer class=\"mt-5\">\n");
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
      out.write("                <div class=\"d-flex justify-content-between py-4 my-4 border-top\">\n");
      out.write("                    <p>© 2021 Company, Inc. All rights reserved.</p>\n");
      out.write("                    <ul class=\"list-unstyled d-flex\">\n");
      out.write("                        <li class=\"ms-3\">\n");
      out.write("                            <a class=\"link-dark\" href=\"#\"><svg class=\"bi\" width=\"24\" height=\"24\">\n");
      out.write("                                <use xlink:href=\"#twitter\"></use>\n");
      out.write("                                </svg></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"ms-3\">\n");
      out.write("                            <a class=\"link-dark\" href=\"#\"><svg class=\"bi\" width=\"24\" height=\"24\">\n");
      out.write("                                <use xlink:href=\"#instagram\"></use>\n");
      out.write("                                </svg></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"ms-3\">\n");
      out.write("                            <a class=\"link-dark\" href=\"#\"><svg class=\"bi\" width=\"24\" height=\"24\">\n");
      out.write("                                <use xlink:href=\"#facebook\"></use>\n");
      out.write("                                </svg></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
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
        out.write("                            <!--Manage-->\n");
        out.write("                            <li class=\"nav-item dropdown dropdown-mega position-static\">\n");
        out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"https://getbootstrap.com/docs/4.0/utilities/spacing/\" data-bs-toggle=\"dropdown\" data-bs-auto-close=\"outside\">Quản lý</a>\n");
        out.write("                                <div class=\"dropdown-menu shadow\">\n");
        out.write("\n");
        out.write("                                    <div class=\"mega-content px-4\">\n");
        out.write("                                        <div class=\"container-fluid\">\n");
        out.write("                                            <div class=\"row\">\n");
        out.write("                                                <div class=\"col-12\">Bạn muốn quản lý??</div>\n");
        out.write("                                                <div class=\"col-12 col-sm-4 col-md-3 py-4 mega-container\">\n");
        out.write("\n");
        out.write("                                                    <img src=\"./images/morenews1.jpg\" alt=\"\">\n");
        out.write("                                                    <div class=\"bottom-left \"><a href=\"manage_viewall\" class=\"text-white\">Cơ sở</a></div>\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"col-12 col-sm-4 col-md-3 py-4 mega-container\">\n");
        out.write("                                                    <img src=\"./images/morenews1.jpg\" alt=\"\"  >\n");
        out.write("                                                    <div class=\"bottom-left \"><a href=\"manage_viewpond\" class=\"text-white\">Pond</a></div>\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"col-12 col-sm-4 col-md-3 py-4 mega-container\">\n");
        out.write("                                                    <img src=\"./images/morenews1.jpg\" alt=\"\"  >\n");
        out.write("                                                    <div class=\"bottom-left \"><a href=\"manage_viewcrop\" class=\"text-white\">Crop</a></div>\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"col-12 col-sm-4 col-md-3 py-4 mega-container\">\n");
        out.write("                                                    <img src=\"./images/morenews1.jpg\" alt=\"\"  >\n");
        out.write("                                                    <div class=\"bottom-left \"><a href=\"04860877731539&notif_id=1662210974078658&notif_t=group_highlights&ref=notif\" class=\"text-white\">Storehouse</a></div>\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                            </li>\n");
        out.write("                        ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"./aboutus.html\"> Báo cáo</a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
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

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"#\">Thông tin </a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"./login.jsp\">Đăng nhập </a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }
}
