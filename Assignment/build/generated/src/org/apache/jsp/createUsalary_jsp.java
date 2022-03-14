package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createUsalary_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Static Navigation - SB Admin</title>\n");
      out.write("    <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
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
      out.write("\n");
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
      out.write("                        <a class=\"nav-link\" href=\"tables.html\">\n");
      out.write("                            <div class=\"sb-nav-link-icon\"><i class=\"fas fa-table\"></i></div>\n");
      out.write("                            Tables\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("            <div id=\"layoutSidenav_content\">\n");
      out.write("                <main>\n");
      out.write("                    <div class=\"container-fluid px-4\">\n");
      out.write("                        <h1 class=\"mt-4\">Static Navigation</h1>\n");
      out.write("                        <ol class=\"breadcrumb mb-4\">\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"index.html\">Dashboard</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item active\">Static Navigation</li>\n");
      out.write("                        </ol>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </main>\n");
      out.write("                <form action=\"usalary\" method=\"POST\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("\n");
      out.write("                        <hr>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <!-- left column -->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- edit form column -->\n");
      out.write("                            <div class=\"col-md-7 personal-info\">\n");
      out.write("\n");
      out.write("                                <h3>Personal info</h3>\n");
      out.write("\n");
      out.write("                                <form class=\"form-horizontal\" role=\"form\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-lg-3 control-label\">ID:</label>\n");
      out.write("                                        <div class=\"col-lg-8\">\n");
      out.write("                                            <input class=\"form-control\" name=\"id\" type=\"text\" value=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div> \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-lg-3 control-label\">Date:</label>\n");
      out.write("                                        <div class=\"col-lg-8\">\n");
      out.write("                                            <input class=\"form-control\" name=\"date\" type=\"date\" value=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-lg-3 control-label\">Money:</label>\n");
      out.write("                                        <div class=\"col-lg-8\">\n");
      out.write("                                            <input class=\"form-control\" name=\"money\" type=\"text\" value=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-lg-3 control-label\">Status:</label>\n");
      out.write("                                        <div class=\"col-lg-8\">\n");
      out.write("                                            <select name=\"status\">\n");
      out.write("                                                <option>Completed </option>\n");
      out.write("                                                <option>Not Completed </option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-3 control-label\"></label>\n");
      out.write("                                        <div class=\"col-md-8\">\n");
      out.write("                                            <input type=\"submit\" class=\"btn btn-primary\" value=\"Save Changes\">\n");
      out.write("                                            <span></span>\n");
      out.write("                                            <a href=\"usahome\"> <input type=\"button\" href=\"usahome\" class=\"btn btn-default\"\n");
      out.write("                                                    value=\"Cancel\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("                crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"js/scripts.js\"></script>\n");
      out.write("        </body>\n");
      out.write("\n");
      out.write("        </html>");
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
