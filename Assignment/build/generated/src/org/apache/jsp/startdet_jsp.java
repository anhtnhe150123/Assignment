package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class startdet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>Dashboard - SB Admin</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"sb-nav-fixed\">\n");
      out.write("        <nav class=\"sb-topnav navbar navbar-expand navbar-dark bg-dark\">\n");
      out.write("            <!-- Navbar Brand-->\n");
      out.write("            <a class=\"navbar-brand ps-3\" href=\"index.jsp\">Start Bootstrap</a>\n");
      out.write("            <!-- Sidebar Toggle-->\n");
      out.write("            <button class=\"btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0\" id=\"sidebarToggle\" href=\"#!\"><i\n");
      out.write("                    class=\"fas fa-bars\"></i></button>\n");
      out.write("            <!-- Navbar Search-->\n");
      out.write("            <form class=\"d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input class=\"form-control\" type=\"text\" placeholder=\"Search for...\" aria-label=\"Search for...\"\n");
      out.write("                           aria-describedby=\"btnNavbarSearch\" />\n");
      out.write("                    <button class=\"btn btn-primary\" id=\"btnNavbarSearch\" type=\"button\"><i\n");
      out.write("                            class=\"fas fa-search\"></i></button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <!-- Navbar-->\n");
      out.write("            <ul class=\"navbar-nav ms-auto ms-md-0 me-3 me-lg-4\">\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\"\n");
      out.write("                       aria-expanded=\"false\"><i class=\"fas fa-user fa-fw\"></i></a>\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"logout\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <div id=\"layoutSidenav\">\n");
      out.write("            <div id=\"layoutSidenav_nav\">\n");
      out.write("                <nav class=\"sb-sidenav accordion sb-sidenav-dark\" id=\"sidenavAccordion\">\n");
      out.write("                    <div class=\"sb-sidenav-menu\">\n");
      out.write("                        <div class=\"nav\">\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\">Core</div>\n");
      out.write("                            <a class=\"nav-link\" href=\"index.html\">\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-tachometer-alt\"></i></div>\n");
      out.write("                                Dashboard\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\">Interface</div>\n");
      out.write("                            <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapsePages\"\n");
      out.write("                               aria-expanded=\"false\" aria-controls=\"collapsePages\">\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-book-open\"></i></div>\n");
      out.write("                                Pages\n");
      out.write("                                <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"collapse\" id=\"collapsePages\" aria-labelledby=\"headingTwo\"\n");
      out.write("                                 data-bs-parent=\"#sidenavAccordion\">\n");
      out.write("                                <nav class=\"sb-sidenav-menu-nested nav\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"password.html\">Change Password</a>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\">Addons</div>\n");
      out.write("                            <a class=\"nav-link\" href=\"TableController.java\">\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-table\"></i></div>\n");
      out.write("                                Tables\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"layoutSidenav_content\">\n");
      out.write("                <main>\n");
      out.write("                    <div class=\"container-fluid px-4\">\n");
      out.write("                        <h1 class=\"mt-4\">Tables</h1>\n");
      out.write("                        <ol class=\"breadcrumb mb-4\">\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"home\">Dashboard</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item active\">Tables</li>\n");
      out.write("                        </ol>\n");
      out.write("                        <div class=\"card mb-4\">\n");
      out.write("                            <div class=\"card-header\">\n");
      out.write("                                <i class=\"fas fa-table me-1\"></i>\n");
      out.write("                                EMPLOYEE TABLE\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <table id=\"datatablesSimple\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>#</th>\n");
      out.write("                                            <th>User name</th>\n");
      out.write("                                            <th>Start time</th>\n");
      out.write("                                            <th>Date</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAttendss}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"K\"> \n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${K.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${K.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${K.startTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${K.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </c:forEach>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </main>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/datatables-simple-demo.js\"></script>\n");
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
}
