import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    private int hitCount;

    public void init() {
        // Reset hit counter.
        hitCount = 0;
    }

//    added a counter to this

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setContentType("text/html");

            PrintWriter out = response.getWriter();

            String name = request.getParameter("hello");

            if(name == null){
                name = "Knoah";
            }
            hitCount++;

            out.println("<h1> Hello " + name + "! You've visited " + hitCount + " times! </h1>");
    }

}