package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005finicio_005fprincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Bienvenido</title>\n");
      out.write("         <link href=\"css/Principal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("                <img src=\"imagenes/onitech.png\" alt=\"\"/>\n");
      out.write("                <li><a href=\"index_inicio_principal.jsp\">Inicio</a></li>\n");
      out.write("                \n");
      out.write("                <li><a href=\"index_producto.jsp\">Productos</a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index_marcas.jsp\">Marcas</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"\">Ventas</a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index_cliente.jsp\">Clientes</a></li>\n");
      out.write("                        <li><a href=\"index_empleado.jsp\">Empleados</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"index_puesto.jsp\">Puestos</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"\">Compras</a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index_prooveedores.jsp\">Proveedores</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"\">Reportes</a></li>\n");
      out.write("                  <li>\n");
      out.write("                    ");

       response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
       if(session.getAttribute("txtUsuario")==null&&session.getAttribute("nombre")==null){
           response.sendRedirect("index.html");
       }  
      out.write("\n");
      out.write("                    <a > \n");
      out.write("                        <form action=\"sr_cerrar_sesion\" >\n");
      out.write("                            <input class=\"cerrar_sesion\" type=\"submit\"  value=\"Cerrar Sesion\">\n");
      out.write("                        </form>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("   \n");
      out.write("         <div class=\"contenedor\">\n");
      out.write("            <div class=\"flex22\"></div>\n");
      out.write("          <img class=\"Imagen_pol\" src=\"imagenes/kung1.jpg\">  \n");
      out.write("          <div class=\"flex23\">\n");
      out.write("              </div>\n");
      out.write("         </div>\n");
      out.write("       \n");
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
