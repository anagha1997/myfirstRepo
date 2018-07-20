/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mainfun;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sonum_000
 */
@WebServlet(name = "Dash", urlPatterns = {"/Dash"})
public class Dash extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<html lang=\"en\">\n" +
"<head>\n" +
"  <link href=\"https://fonts.googleapis.com/css?family=Indie+Flower\" rel=\"stylesheet\">\n" +
"  <title>Bootstrap Example</title>\n" +
"  <meta charset=\"utf-8\">\n" +
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n" +
"  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n" +
"  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n" +
"  <style>\n" +
"    /* Remove the navbar's default margin-bottom and rounded borders */ \n" +
"    /* Full-width input fields */\n" +
"    .dropbtn {\n" +
"   \n" +
"    color: white;\n" +
"    padding: 16px;\n" +
"    font-size: 16px;\n" +
"    border: none;\n" +
"    cursor: pointer;\n" +
"}\n" +
"\n" +
".dropbtn:hover, .dropbtn:focus {\n" +
"   \n" +
"}\n" +
"\n" +
".dropdown {\n" +
"    position: relative;\n" +
"    display: inline-block;\n" +
"}\n" +
"\n" +
".dropdown-content {\n" +
"    display: none;\n" +
"    position: absolute;\n" +
"    background-color: #f1f1f1;\n" +
"    min-width: 160px;\n" +
"    overflow: auto;\n" +
"    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n" +
"    z-index: 1;\n" +
"}\n" +
"\n" +
".dropdown-content a {\n" +
"    color: black;\n" +
"    padding: 12px 16px;\n" +
"    text-decoration: none;\n" +
"    display: block;\n" +
"}\n" +
"\n" +
".dropdown a:hover {}\n" +
"\n" +
".show {}\n" +
"input[type=text], input[type=password] {\n" +
"    width: 50%;\n" +
"    padding: 14px 20px;\n" +
"    margin: 8px 0;\n" +
"    display: flex;\n" +
"    border: 1px solid #ccc;\n" +
"    box-sizing: border-box;\n" +
"    font-family: 'Indie Flower', cursive;\n" +
"    \n" +
"  \n" +
"}\n" +
"div{font-family: 'Indie Flower', cursive;}\n" +
"/* Set a style for all buttons */\n" +
"button {\n" +
"    background-color: #0277BD;\n" +
"    color: white;\n" +
"    padding: 14px 20px;\n" +
"    margin: 8px 0;\n" +
"    border: none;\n" +
"    cursor: pointer;\n" +
"    width: 50%;\n" +
"    border: 1px solid #ccc;\n" +
"    font-family: 'Indie Flower', cursive;\n" +
"    display:flex;\n" +
"    font-size: 16px;\n" +
"   // margin-top:22%;\n" +
"   // margin-bottom:0%;\n" +
"}\n" +
"\n" +
"button:hover {\n" +
"    opacity: 0.8;\n" +
"}\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
".container {\n" +
"    padding: 10px;\n" +
"}\n" +
"\n" +
"    .navbar {\n" +
"      margin-bottom: 0;\n" +
"      border-radius: 0;\n" +
"      background-color: #1A237E;\n" +
"      font-family: 'Indie Flower', cursive;\n" +
"    }\n" +
"    td{ font-family: 'Indie Flower', cursive; font-size: 25px;}\n" +
"    h1{\n" +
"        color:white;\n" +
"        padding-left: 350px;\n" +
"        font-family: 'Indie Flower', cursive;\n" +
"    }\n" +
"    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */\n" +
"    .row.content {height: 450px}\n" +
"    \n" +
"    /* Set gray background color and 100% height */\n" +
"    .sidenav {\n" +
"      padding-top: 20px;\n" +
"      background-image: url(\"http://wallpapercraze.com/images/wallpapers/Bubble_Blue-517945.jpeg\");\n" +
"      height: 100%;\n" +
"    }\n" +
"    \n" +
"    /* Set black background color, white text and some padding */\n" +
"    footer {\n" +
"      background-color: #1A237E;\n" +
"      font-size: 20px;\n" +
"      color: white;\n" +
"      padding: 15px;\n" +
"      font-family: 'Indie Flower', cursive;\n" +
"    }\n" +
"    \n" +
"    /* On small screens, set height to 'auto' for sidenav and grid */\n" +
"    @media screen and (max-width: 767px) {\n" +
"      .sidenav {\n" +
"        height: auto;\n" +
"        padding: 15px;\n" +
"        \n" +
"      }\n" +
"      .row.content {height:auto;} \n" +
"    \n" +
"      .check{\n" +
"         font-size: 20px; \n" +
"         font-family: 'Indie Flower', cursive;\n" +
"    }\n" +
"  </style>\n" +
"</head>");
           out.println("<body>");
           out.println("<form method=\"POST\" action=\"Res_exe\">\n" +
"\n" +
"<nav class=\"navbar navbar-inverse\">\n" +
"  <div class=\"container-fluid\">\n" +
"    <div class=\"navbar-header\">\n" +
"      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n" +
"        <span class=\"icon-bar\"></span>\n" +
"        <span class=\"icon-bar\"></span>\n" +
"        <span class=\"icon-bar\"></span>                        \n" +
"      </button>\n" +
"       \n" +
"      \n" +
"    </div>\n" +
"    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n" +
"      <ul class=\"nav navbar-nav\">\n" +
"          \n" +
"        <li><a href=\"#\" style=\"font-size: 30px;\">Home</a></li>\n" +
"        <li><a href=\"#\" style=\"font-size: 30px;\">About</a></li>\n" +
"        <li><h1>Cloud App Discovery</h1></li>\n" +
"      </ul>\n" +
"      <ul class=\"nav navbar-nav navbar-right\">\n" +
"          <li>\n" +
"          \n" +
"<button onclick=\"myFunction()\" class=\"dropbtn\">MyAccount</button>\n" +
"  <div id=\"myDropdown\" class=\"dropdown-content\">\n" +
"    <a href=\"#settings\">Settings</a>\n" +
"    <a href=\"#logout\" action=\"index.html\">Logout</a>\n" +
"</div>\n" +
"\n" +
"<script>\n" +
"/* When the user clicks on the button, \n" +
"toggle between hiding and showing the dropdown content */\n" +
"function myFunction() {\n" +
"    document.getElementById(\"myDropdown\").classList.toggle(\"show\");\n" +
"}\n" +
"\n" +
"// Close the dropdown if the user clicks outside of it\n" +
"window.onclick = function(event) {\n" +
"  if (!event.target.matches('.dropbtn')) {\n" +
"\n" +
"    var dropdowns = document.getElementsByClassName(\"dropdown-content\");\n" +
"    var i;\n" +
"    for (i = 0; i < dropdowns.length; i++) {\n" +
"      var openDropdown = dropdowns[i];\n" +
"      if (openDropdown.classList.contains('show')) {\n" +
"        openDropdown.classList.remove('show');\n" +
"      }\n" +
"    }\n" +
"  }\n" +
"  };\n" +
"</script>\n" +
"      </ul>\n" +
"    </div>\n" +
"  </div>\n" +
"</nav>\n" +
"  \n" +
"<div class=\"container-fluid text-center\">    \n" +
"  <div class=\"row content\">\n" +
"    <div class=\"col-sm-2 sidenav\">\n" +
"      \n" +
"    </div>\n" +
"    <div class=\"col-sm-8 text-left\"> \n" +
"        <h1 style=\"color:#1A237E; \">Welcome</h1>\n" +
"   \n" +
"     <div class=\"container\">\n" +
"        \n" +
"              <label for=\"uname\"><b>URL</b></label>\n" +
"            <b><input type=\"text\" placeholder=\"Enter URL\" name=\"url\" required></b>\n" +
"             \n" +
"             \n" +
"            <b> <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Traceroute</b>\n" +
"      \n" +
"            <b><input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Geolocation</b>\n" +
"     \n" +
"            <b><input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Cloud Service</b>\n" +
"             \n" +
" \n" +
"             \n" +
"             <b><button type=\"submit\">submit</button></b>\n" +
"            \n" +
"        \n" +
"    </div>\n" +
"    </div>\n" +
"    <div class=\"col-sm-2 sidenav\">\n" +
"      \n" +
"      \n" +
"    </div>\n" +
"  </div>\n" +
"</div>");
            /*out.println("");
            out.println("");
            out.println("");*/
          
            out.println("<footer class=\"container-fluid text-center\">");
              out.println("<p>|Team APJ Kalam|</p>");
            out.println("</footer>");
            out.println("</form>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
