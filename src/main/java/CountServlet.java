//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
//public class CountServlet extends HttpServlet {
//
//    private int hitCount;
//
//    public void init() {
//        // Reset hit counter.
//        hitCount = 0;
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("reset");
//
//        PrintWriter out = response.getWriter();
//
//        String name = request.getParameter("number");
//        //.../hello?name=Knoah -- it changes to Hello Knoah!
//        if(name == null){
//            name = "World";
//        }
//        hitCount++;
//
//        out.println("<h1> Hello " + name + "! You've visited " + hitCount + " times! </h1>");
//    }
//
//}