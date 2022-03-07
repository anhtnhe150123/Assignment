package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class position_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("    <meta name=\"description\" content=\"\" />\n");
      out.write("    <meta name=\"author\" content=\"\" />\n");
      out.write("    <title>Sidenav Light - SB Admin</title>\n");
      out.write("    <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"sb-nav-fixed\">\n");
      out.write("    <nav class=\"sb-topnav navbar navbar-expand navbar-dark bg-dark\">\n");
      out.write("        <!-- Navbar Brand-->\n");
      out.write("        <a class=\"navbar-brand ps-3\" href=\"index.html\">Start Bootstrap</a>\n");
      out.write("        <!-- Sidebar Toggle-->\n");
      out.write("        <button class=\"btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0\" id=\"sidebarToggle\" href=\"#!\"><i\n");
      out.write("                class=\"fas fa-bars\"></i></button>\n");
      out.write("        <!-- Navbar Search-->\n");
      out.write("        <form class=\"d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input class=\"form-control\" type=\"text\" placeholder=\"Search for...\" aria-label=\"Search for...\"\n");
      out.write("                    aria-describedby=\"btnNavbarSearch\" />\n");
      out.write("                <button class=\"btn btn-primary\" id=\"btnNavbarSearch\" type=\"button\"><i\n");
      out.write("                        class=\"fas fa-search\"></i></button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <!-- Navbar-->\n");
      out.write("        <ul class=\"navbar-nav ms-auto ms-md-0 me-3 me-lg-4\">\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\"\n");
      out.write("                    aria-expanded=\"false\"><i class=\"fas fa-user fa-fw\"></i></a>\n");
      out.write("                <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"#!\">Settings</a></li>\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"#!\">Activity Log</a></li>\n");
      out.write("                    <li>\n");
      out.write("                        <hr class=\"dropdown-divider\" />\n");
      out.write("                    </li>\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"#!\">Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("    <div id=\"layoutSidenav\">\n");
      out.write("        <div id=\"layoutSidenav_nav\">\n");
      out.write("            <nav class=\"sb-sidenav accordion sb-sidenav-light\" id=\"sidenavAccordion\">\n");
      out.write("                <div class=\"sb-sidenav-menu\">\n");
      out.write("                    <div class=\"nav\">\n");
      out.write("                        <div class=\"sb-sidenav-menu-heading\">Core</div>\n");
      out.write("                        <a class=\"nav-link\" href=\"index.html\">\n");
      out.write("                            <div class=\"sb-nav-link-icon\"><i class=\"fas fa-tachometer-alt\"></i></div>\n");
      out.write("                            Dashboard\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"sb-sidenav-menu-heading\">Interface</div>\n");
      out.write("                        <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\"\n");
      out.write("                            data-bs-target=\"#collapseLayouts\" aria-expanded=\"false\" aria-controls=\"collapseLayouts\">\n");
      out.write("                            <div class=\"sb-nav-link-icon\"><i class=\"fas fa-columns\"></i></div>\n");
      out.write("                            Layouts\n");
      out.write("                            <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"collapse\" id=\"collapseLayouts\" aria-labelledby=\"headingOne\"\n");
      out.write("                            data-bs-parent=\"#sidenavAccordion\">\n");
      out.write("                            <nav class=\"sb-sidenav-menu-nested nav\">\n");
      out.write("                                <a class=\"nav-link\" href=\"layout-static.html\">Static Navigation</a>\n");
      out.write("                                <a class=\"nav-link\" href=\"layout-sidenav-light.html\">Light Sidenav</a>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                        <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapsePages\"\n");
      out.write("                            aria-expanded=\"false\" aria-controls=\"collapsePages\">\n");
      out.write("                            <div class=\"sb-nav-link-icon\"><i class=\"fas fa-book-open\"></i></div>\n");
      out.write("                            Pages\n");
      out.write("                            <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"collapse\" id=\"collapsePages\" aria-labelledby=\"headingTwo\"\n");
      out.write("                            data-bs-parent=\"#sidenavAccordion\">\n");
      out.write("                            <nav class=\"sb-sidenav-menu-nested nav accordion\" id=\"sidenavAccordionPages\">\n");
      out.write("                                <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\"\n");
      out.write("                                    data-bs-target=\"#pagesCollapseAuth\" aria-expanded=\"false\"\n");
      out.write("                                    aria-controls=\"pagesCollapseAuth\">\n");
      out.write("                                    Authentication\n");
      out.write("                                    <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"collapse\" id=\"pagesCollapseAuth\" aria-labelledby=\"headingOne\"\n");
      out.write("                                    data-bs-parent=\"#sidenavAccordionPages\">\n");
      out.write("                                    <nav class=\"sb-sidenav-menu-nested nav\">\n");
      out.write("                                        <a class=\"nav-link\" href=\"login.html\">Login</a>\n");
      out.write("                                        <a class=\"nav-link\" href=\"register.html\">Register</a>\n");
      out.write("                                        <a class=\"nav-link\" href=\"password.html\">Forgot Password</a>\n");
      out.write("                                    </nav>\n");
      out.write("                                </div>\n");
      out.write("                                <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\"\n");
      out.write("                                    data-bs-target=\"#pagesCollapseError\" aria-expanded=\"false\"\n");
      out.write("                                    aria-controls=\"pagesCollapseError\">\n");
      out.write("                                    Error\n");
      out.write("                                    <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"collapse\" id=\"pagesCollapseError\" aria-labelledby=\"headingOne\"\n");
      out.write("                                    data-bs-parent=\"#sidenavAccordionPages\">\n");
      out.write("                                    <nav class=\"sb-sidenav-menu-nested nav\">\n");
      out.write("                                        <a class=\"nav-link\" href=\"401.html\">401 Page</a>\n");
      out.write("                                        <a class=\"nav-link\" href=\"404.html\">404 Page</a>\n");
      out.write("                                        <a class=\"nav-link\" href=\"500.html\">500 Page</a>\n");
      out.write("                                    </nav>\n");
      out.write("                                </div>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"sb-sidenav-menu-heading\">Addons</div>\n");
      out.write("                        <a class=\"nav-link\" href=\"charts.html\">\n");
      out.write("                            <div class=\"sb-nav-link-icon\"><i class=\"fas fa-chart-area\"></i></div>\n");
      out.write("                            Charts\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"nav-link\" href=\"tables.html\">\n");
      out.write("                            <div class=\"sb-nav-link-icon\"><i class=\"fas fa-table\"></i></div>\n");
      out.write("                            Tables\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sb-sidenav-footer\">\n");
      out.write("                    <div class=\"small\">Logged in as:</div>\n");
      out.write("                    Start Bootstrap\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"layoutSidenav_content\">\n");
      out.write("            <main>\n");
      out.write("                <section class=\"py-5\">\n");
      out.write("                    <div class=\"container px-4 px-lg-5 mt-5\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-3 mb-5\">\n");
      out.write("                                <h3>Position</h3>\n");
      out.write("                                <ul class=\"list-group\">\n");
      out.write("                                    <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listPositions}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"C\">\n");
      out.write("                                        <li class=\"list-group-item\"><a\n");
      out.write("                                                href=\"position?positionId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.positionId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.positionName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                                    </c:forEach>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <div class=\"row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 justify-content-center\">\n");
      out.write("                                    <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listEmployees}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"P\">\n");
      out.write("                                        <div class=\"col mb-5\">\n");
      out.write("                                                <!-- Product image-->\n");
      out.write("                                                    <img class=\"card-img-top\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${P.imageUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"...\" />\n");
      out.write("                                                </a>\n");
      out.write("                                                <!-- Product details-->\n");
      out.write("                                                <div class=\"card-body p-4\">\n");
      out.write("                                                    <div class=\"text-center\">\n");
      out.write("                                                        <!-- Product name-->\n");
      out.write("                                                        <h5 class=\"fw-bolder\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${P.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>                                                \n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <!-- Product actions-->\n");
      out.write("                                                <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
      out.write("                                                    <div class=\"text-center\">\n");
      out.write("                                                        <a class=\"btn btn-outline-dark mt-auto\" href=\"#\">View Detail</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </c:forEach>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"js/scripts.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
}
