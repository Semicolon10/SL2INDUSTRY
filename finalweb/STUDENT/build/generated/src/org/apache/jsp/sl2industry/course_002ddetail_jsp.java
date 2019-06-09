package org.apache.jsp.sl2industry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class course_002ddetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>SL2INDUSTRY | Our Mission</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"assets/img/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Font awesome -->\r\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Slick slider -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/slick.css\">\r\n");
      out.write("    <!-- Fancybox slider -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/jquery.fancybox.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("    <!-- Theme color -->\r\n");
      out.write("    <link id=\"switcher\" href=\"assets/css/theme-color/default-theme.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Main style sheet -->\r\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Fonts -->\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Roboto:400,400italic,300,300italic,500,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <script>\r\n");
      out.write("            src=\"https://code.jquery.com/jquery-3.3.1.js\"\r\n");
      out.write("            integrity=\"sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=\"\r\n");
      out.write("            crossorigin=\"anonymous\">\r\n");
      out.write("    </script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(function(){\r\n");
      out.write("            $(\"#header\").load(\"header.jsp\");\r\n");
      out.write("            $(\"#footer\").load(\"footer.jsp\");\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  <!-- include Header -->\r\n");
      out.write("  <div id=\"header\"></div>\r\n");
      out.write("  <!-- end include header -->\r\n");
      out.write(" <!-- Page breadcrumb -->\r\n");
      out.write(" <section id=\"mu-page-breadcrumb\">\r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("     <div class=\"row\">\r\n");
      out.write("       <div class=\"col-md-12\">\r\n");
      out.write("         <div class=\"mu-page-breadcrumb-area\">\r\n");
      out.write("           <h2>Our Mission</h2>\r\n");
      out.write("           <ol class=\"breadcrumb\">\r\n");
      out.write("            <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("            <li class=\"active\">Our Mission</li>\r\n");
      out.write("          </ol>\r\n");
      out.write("         </div>\r\n");
      out.write("       </div>\r\n");
      out.write("     </div>\r\n");
      out.write("   </div>\r\n");
      out.write(" </section>\r\n");
      out.write(" <!-- End breadcrumb -->\r\n");
      out.write(" <section id=\"mu-course-content\">\r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("     <div class=\"row\">\r\n");
      out.write("       <div class=\"col-md-12\">\r\n");
      out.write("         <div class=\"mu-course-content-area\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-md-9\">\r\n");
      out.write("                <!-- start course content container -->\r\n");
      out.write("                <div class=\"mu-course-container mu-course-details\">\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                      <div class=\"mu-latest-course-single\">\r\n");
      out.write("                        <figure class=\"mu-latest-course-img\">\r\n");
      out.write("                          <a href=\"#\"><img src=\"assets/img/courses/first.jpg\" alt=\"img\"></a>\r\n");
      out.write("                        </figure>\r\n");
      out.write("                        <div class=\"mu-latest-course-single-content\">\r\n");
      out.write("                          <h4>Description</h4>\r\n");
      out.write("                          <p>In Sri Lanka university industry collaboration is only limited to industry talks, workshops and guest lectures. That also only limited to urban universities in the island. Strong collaboration among the society is a way to develop this country. So, in this small island why we canât be getting together and lift the community and country as well.  SL 2 INDUSTRY is the platform for fill this gap. Through this platform the provided collaboration can be vary as follows,</p>\r\n");
      out.write("                          <ul>\r\n");
      out.write("                              <li>I. Research collaboration: </li>\r\n");
      out.write("                          <blockquote>\r\n");
      out.write("                            <p>Research collaboration is one among that and industries can upload problems to be solved and University students can take over these as their final research projects and deliver it with the mentoring of industry and with the academic supervisor. Students also can upload their queries that need support from the industry to be solved.</p>\r\n");
      out.write("                            <p>For example, in industry there are professionals who willing to do research but have no time. In universities there are undergraduates who like to do research but donât have mentorship. We are filling this gap between university and industry using this platform.</p>\r\n");
      out.write("                          </blockquote>\r\n");
      out.write("                              <li>II. Research collaboration: </li>\r\n");
      out.write("                              <blockquote>\r\n");
      out.write("                                  <p>University can share the academic calendar which include some important dates such as when students will be ready for interns and employment. Industry can share internship/job opportunities they have with particular university. When students will get academic breaks. Such information will be useful for students and industry as well.</p>\r\n");
      out.write("                              </blockquote>\r\n");
      out.write("                              <li>III.\tEvent collaboration:</li>\r\n");
      out.write("                              <blockquote>\r\n");
      out.write("                                  <p>Some annual events organized by different industries can be made visible to universities and students can prepare for such events well in advance. This may be meet ups, Competitions or hackathons or any other matter that can be done in a collaborative way. This may be same the annual events organized by universities and expecting other universities to participate, and industries can sponsor for such important events.</p>\r\n");
      out.write("                              </blockquote>\r\n");
      out.write("                          </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- end course content container -->\r\n");
      out.write("                  <!-- start related course item -->\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                      <div class=\"col-md-12\">\r\n");
      out.write("                          <div class=\"mu-related-item\">\r\n");
      out.write("                              <h3>Our Partners</h3>\r\n");
      out.write("                              <div class=\"mu-related-item-area\">\r\n");
      out.write("                                  <div id=\"mu-related-item-slide\">\r\n");
      out.write("                                      <div class=\"col-md-6\">\r\n");
      out.write("                                          <div class=\"mu-latest-course-single\">\r\n");
      out.write("                                              <figure class=\"mu-latest-course-img\">\r\n");
      out.write("                                                  <a href=\"#\"><img alt=\"img\" src=\"assets/img/courses/partner1.jpg\"></a>\r\n");
      out.write("                                                  <figcaption class=\"mu-latest-course-imgcaption\">\r\n");
      out.write("                                                      <a href=\"#\">Gold Partner</a>\r\n");
      out.write("                                                  </figcaption>\r\n");
      out.write("                                              </figure>\r\n");
      out.write("                                              <div class=\"mu-latest-course-single-content\">\r\n");
      out.write("                                                  <p>Software company which is giving smart solutions for social issues.</p>\r\n");
      out.write("                                                  <div class=\"mu-latest-course-single-contbottom\">\r\n");
      out.write("                                                      <a href=\"https://www.facebook.com/MillionNodes\" class=\"mu-course-details\">Details</a>\r\n");
      out.write("                                                  </div>\r\n");
      out.write("                                              </div>\r\n");
      out.write("                                          </div>\r\n");
      out.write("                                      </div>\r\n");
      out.write("                                      <div class=\"col-md-6\">\r\n");
      out.write("                                          <div class=\"mu-latest-course-single\">\r\n");
      out.write("                                              <figure class=\"mu-latest-course-img\">\r\n");
      out.write("                                                  <a href=\"#\"><img alt=\"img\" src=\"assets/img/courses/partner2.jpg\"></a>\r\n");
      out.write("                                                  <figcaption class=\"mu-latest-course-imgcaption\">\r\n");
      out.write("                                                      <a href=\"#\">Silver Partner</a>\r\n");
      out.write("                                                  </figcaption>\r\n");
      out.write("                                              </figure>\r\n");
      out.write("                                              <div class=\"mu-latest-course-single-content\">\r\n");
      out.write("                                                  <p>The âIoT Sri Lankaâ project of Internet Society Sri Lankan Chapter is aiming to provide and promote Internet of Things which are safer,secured,resillent,standered, and innovative within in Sri Lanka expecting a better future for our mother land.</p>\r\n");
      out.write("                                                  <div class=\"mu-latest-course-single-contbottom\">\r\n");
      out.write("                                                      <a href=\"https://www.facebook.com/isoc.lanka/\" class=\"mu-course-details\">Details</a>\r\n");
      out.write("                                                  </div>\r\n");
      out.write("                                              </div>\r\n");
      out.write("                                          </div>\r\n");
      out.write("                                      </div>\r\n");
      out.write("                                      <div class=\"col-md-6\">\r\n");
      out.write("                                          <div class=\"mu-latest-course-single\">\r\n");
      out.write("                                              <figure class=\"mu-latest-course-img\">\r\n");
      out.write("                                                  <a href=\"#\"><img alt=\"img\" src=\"assets/img/courses/partner3.jpg\"></a>\r\n");
      out.write("                                                  <figcaption class=\"mu-latest-course-imgcaption\">\r\n");
      out.write("                                                      <a href=\"#\">Silver Partner</a>\r\n");
      out.write("                                                  </figcaption>\r\n");
      out.write("                                              </figure>\r\n");
      out.write("                                              <div class=\"mu-latest-course-single-content\">\r\n");
      out.write("                                                  <p>IEEE SL Section works towards fostering technological innovation and excellence for the benefit of humanity and advancement of technical professionalism.</p>\r\n");
      out.write("                                                  <div class=\"mu-latest-course-single-contbottom\">\r\n");
      out.write("                                                      <a href=\"https://www.facebook.com/IEEESriLanka/\" class=\"mu-course-details\">Details</a>\r\n");
      out.write("                                                  </div>\r\n");
      out.write("                                              </div>\r\n");
      out.write("                                          </div>\r\n");
      out.write("                                      </div>\r\n");
      out.write("\r\n");
      out.write("                                  </div>\r\n");
      out.write("                              </div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- end start related course item -->\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-3\">\r\n");
      out.write("                <!-- start sidebar -->\r\n");
      out.write("                <aside class=\"mu-sidebar\">\r\n");
      out.write("                  <!-- start single sidebar -->\r\n");
      out.write("                  <div class=\"mu-single-sidebar\">\r\n");
      out.write("                    <h3>Advertisement</h3>\r\n");
      out.write("                      <img src=\"assets/img/add.png\" alt=\"img\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <!-- end single sidebar -->\r\n");
      out.write("                    <!-- start single sidebar -->\r\n");
      out.write("                    <div class=\"mu-single-sidebar\">\r\n");
      out.write("                        <h3>Advertisement</h3>\r\n");
      out.write("                        <img src=\"assets/img/add.png\" alt=\"img\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- end single sidebar -->\r\n");
      out.write("                    <!-- start single sidebar -->\r\n");
      out.write("                    <div class=\"mu-single-sidebar\">\r\n");
      out.write("                        <h3>Advertisement</h3>\r\n");
      out.write("                        <img src=\"assets/img/add.png\" alt=\"img\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- end single sidebar -->\r\n");
      out.write("                    <div class=\"mu-single-sidebar\">\r\n");
      out.write("                        <h3>Advertisement</h3>\r\n");
      out.write("                        <img src=\"assets/img/add.png\" alt=\"img\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- end single sidebar -->\r\n");
      out.write("                    <div class=\"mu-single-sidebar\">\r\n");
      out.write("                        <h3>Advertisement</h3>\r\n");
      out.write("                        <img src=\"assets/img/add.png\" alt=\"img\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- end single sidebar -->\r\n");
      out.write("                    <div class=\"mu-single-sidebar\">\r\n");
      out.write("                        <h3>Advertisement</h3>\r\n");
      out.write("                        <img src=\"assets/img/add.png\" alt=\"img\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- end single sidebar -->\r\n");
      out.write("                    <div class=\"mu-single-sidebar\">\r\n");
      out.write("                        <h3>Advertisement</h3>\r\n");
      out.write("                        <img src=\"assets/img/add.png\" alt=\"img\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- end single sidebar -->\r\n");
      out.write("                </aside>\r\n");
      out.write("                <!-- / end sidebar -->\r\n");
      out.write("             </div>\r\n");
      out.write("           </div>\r\n");
      out.write("         </div>\r\n");
      out.write("       </div>\r\n");
      out.write("     </div>\r\n");
      out.write("   </div>\r\n");
      out.write(" </section>\r\n");
      out.write("\r\n");
      out.write("  <!-- Start footer -->\r\n");
      out.write("  <div id=\"footer\"></div>\r\n");
      out.write("  <!-- End footer -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- jQuery library -->\r\n");
      out.write("  <script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("  <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("  <script src=\"assets/js/bootstrap.js\"></script>\r\n");
      out.write("  <!-- Slick slider -->\r\n");
      out.write("  <script type=\"text/javascript\" src=\"assets/js/slick.js\"></script>\r\n");
      out.write("  <!-- Counter -->\r\n");
      out.write("  <script type=\"text/javascript\" src=\"assets/js/waypoints.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"assets/js/jquery.counterup.js\"></script>\r\n");
      out.write("  <!-- Mixit slider -->\r\n");
      out.write("  <script type=\"text/javascript\" src=\"assets/js/jquery.mixitup.js\"></script>\r\n");
      out.write("  <!-- Add fancyBox -->\r\n");
      out.write("  <script type=\"text/javascript\" src=\"assets/js/jquery.fancybox.pack.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom js -->\r\n");
      out.write("  <script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
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
