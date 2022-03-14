package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <html lang=\"en\">\n");
      out.write("\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("    <meta name=\"description\" content=\"\" />\n");
      out.write("    <meta name=\"author\" content=\"\" />\n");
      out.write("    <title>Register - SB Admin</title>\n");
      out.write("    <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js\"\n");
      out.write("      crossorigin=\"anonymous\"></script>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body class=\"bg-primary\">\n");
      out.write("    <div id=\"layoutAuthentication\">\n");
      out.write("      <div id=\"layoutAuthentication_content\">\n");
      out.write("        <main>\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("              <div class=\"col-lg-7\">\n");
      out.write("                <div class=\"card shadow-lg border-0 rounded-lg mt-5\">\n");
      out.write("                  <div class=\"card-header\">\n");
      out.write("                    <h3 class=\"text-center font-weight-light my-4\">Create Account</h3>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                    <form action=\"signup\" method=\"POST\">\n");
      out.write("                      <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                      <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                      <div class=\"form-floating mb-3\">\n");
      out.write("                        <input class=\"form-control\" id=\"inputEmail\" type=\"text\" placeholder=\"User name\"\n");
      out.write("                          name=\"username\" />\n");
      out.write("                        <label for=\"inputEmail\">User name</label>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"row mb-3\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                          <div class=\"form-floating mb-3 mb-md-0\">\n");
      out.write("                            <input class=\"form-control\" id=\"inputPassword\" type=\"password\"\n");
      out.write("                              placeholder=\"Create a password\" name=\"password\" />\n");
      out.write("                            <label for=\"inputPassword\">Password</label>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                          <div class=\"form-floating mb-3 mb-md-0\">\n");
      out.write("                            <input class=\"form-control\" id=\"inputPasswordConfirm\" type=\"password\"\n");
      out.write("                              placeholder=\"Confirm password\" name=\"repass\" />\n");
      out.write("                            <label for=\"inputPasswordConfirm\">Confirm Password</label>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"mt-4 mb-0\">\n");
      out.write("                        <div class=\"d-grid\"><button class=\"btn btn-primary btn-block\" type=\"submit\">Create\n");
      out.write("                            Account</button></div>\n");
      out.write("                      </div>\n");
      out.write("                    </form>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"card-footer text-center py-3\">\n");
      out.write("                    <div class=\"small\"><a href=\"login\">Have an account? Go to login</a></div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </main>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("      crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"js/scripts.js\"></script>\n");
      out.write("  </body>\n");
      out.write("\n");
      out.write("  </html>");
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
