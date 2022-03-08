package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
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
      out.write("    <title>Dashboard - SB Admin</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"sb-nav-fixed\">\n");
      out.write("    <nav class=\"sb-topnav navbar navbar-expand navbar-dark bg-dark\">\n");
      out.write("        <!-- Navbar Brand-->\n");
      out.write("        <a class=\"navbar-brand ps-3\" href=\"index.jsp\">Start Bootstrap</a>\n");
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
      out.write("                    <li><a class=\"dropdown-item\" href=\"logout\">Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("    <div id=\"layoutSidenav\">\n");
      out.write("        <div id=\"layoutSidenav_nav\">\n");
      out.write("            <nav class=\"sb-sidenav accordion sb-sidenav-dark\" id=\"sidenavAccordion\">\n");
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
      out.write("                        <a class=\"nav-link\" href=\"TableController.java\">\n");
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
      out.write("                <form action=\"attendance\" method=\"POST\">\n");
      out.write("                    <div class=\"container-fluid px-4\">\n");
      out.write("                    <h1 class=\"mt-4\">Dashboard</h1>\n");
      out.write("                    <ol class=\"breadcrumb mb-4\">\n");
      out.write("                        <li class=\"breadcrumb-item active\">Dashboard</li>\n");
      out.write("                    </ol>\n");
      out.write("                   <div class=\"row\">\n");
      out.write("                        <div class=\"col-xl-3 col-md-6\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-outline-success\" onclick=\"date()\">Time check</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <div style=\"display: inline-flex;\">\n");
      out.write("                        <input id=\"hvn\" type=\"datetime\" name=\"timer\">\n");
      out.write("                        <input type=\"submit\" value=\"check\">\n");
      out.write("                    </div>\n");
      out.write("                    <script>\n");
      out.write("                        function date() {\n");
      out.write("\n");
      out.write("                            var today = new Date();\n");
      out.write("                            var date = today.getDate() + '-' + (today.getMonth() + 1) + '-' + today.getFullYear();\n");
      out.write("                            var time = today.getHours() + \":\" + today.getMinutes() + \":\" + today.getSeconds();\n");
      out.write("                            var dateTime = date + ' ' + time;\n");
      out.write("\n");
      out.write("                            document.getElementById(\"hvn\").value = dateTime;\n");
      out.write("                        };\n");
      out.write("                    </script>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"card mb-4\">\n");
      out.write("                        <div class=\"card-header\">\n");
      out.write("                            <i class=\"fas fa-table me-1\"></i>\n");
      out.write("                            EMPLOYEE TABLE\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <table id=\"datatablesSimple\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>User Name</th>\n");
      out.write("                                        <th>Start time</th>\n");
      out.write("                                        <th>End time</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tfoot>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>User Name</th>\n");
      out.write("                                        <th>Start time</th>\n");
      out.write("                                        <th>End time</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tfoot>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"js/scripts.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"assets/demo/chart-area-demo.js\"></script>\n");
      out.write("    <script src=\"assets/demo/chart-bar-demo.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"js/datatables-simple-demo.js\"></script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listEmployees}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("E");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${E.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${E.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${E.dateBirth}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        </tr>\n");
          out.write("                                    ");
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
