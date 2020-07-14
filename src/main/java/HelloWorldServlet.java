import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


// Bonus: Allow the user to pass a parameter in the query string to reset the counter.


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    private int hitCount;

    public void init() {
        // Resetting hit counter.
        hitCount = 0;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("hello");

        if(name == null){
            name = "World";
        }
        hitCount++;

        out.println("<h1> Hello " + name + "! You've visited " + hitCount + " times! </h1>");
    }

}