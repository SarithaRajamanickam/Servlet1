import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
@WebServlet("/World")
     public class World extends HttpServlet 
     { 
         protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
         { // reading the user input 
             String color= request.getParameter("color");
              PrintWriter out = response.getWriter();
               out.println ( "<html> \n" 
                + "<head> \n" 
                 + "<title> My first jsp </title> \n"
                  + "</head> \n" 
                  + "<body> \n" 
                  + "<font size=\"12px\" color=\"" 
                  + color 
                  + "\">" 
                  + "Welcome to Servlet Annotation" 
                  + "</font> \n" 
                  + "</body> \n" 
                  + "</html>" );
                 } 
            }