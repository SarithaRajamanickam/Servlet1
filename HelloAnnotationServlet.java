import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
       name = "Hello",
       displayName="Hellodisplay",
        urlPatterns = {"/Sample","/saritha"},
        asyncSupported = false,loadOnStartup=0,
        initParams = {
                @WebInitParam(name = "name", value = "saritha"),
                @WebInitParam(name = "param1", value = "program"),
                @WebInitParam(name = "param2", value = "value2")
        })
public class HelloAnnotationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out= response.getWriter();
        out.write("<html><head><title>WebServlet Annotation</title></head>");
        out.write("<body>");
        out.write("<h1>Servlet Hello Annotation</h1>");
        out.write("<hr/>");
        out.write("Welcome " + getServletConfig().getInitParameter("name"));
        out.write("Basic servlet"+getServletConfig().getInitParameter("param1"));
        out.write("</body></html>");
        out.close();
    }
}