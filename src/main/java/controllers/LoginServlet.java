package controllers;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.LoginServlet" , urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null){
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

//        DaoFactory.getUsersDao().findByUsername(username);
//        where is getUSerDao method going to be placed?

//        Password.hasPassword(password);

//        User user = DaoFactory.getUserDao().findByUsername(username);

        if (username == null) {
            request.setAttribute("Error", "Incorrect username or password");
            request.getRequestDispatcher("/WEB-INF/login.jsp");
            return;
        }

//        limit login attempts ?
//        boolean validAttempt = Password.attempt(password, user.getPassword());

//        Can they login?
//        boolean login = false;
//        String username1 = "";
//
//        if(username1.equals(username)){
//            System.out.print("Login Successful!");
//            login = true;
//        }

        boolean validAttempt = username.equals("admin") && password.equals("password");


        if (validAttempt){
            request.getSession().setAttribute("user", username);
            response.sendRedirect("/profile");
        } else {
            request.setAttribute("Error", "Incorrect username or password");
            response.sendRedirect("/login");
        }

    }

}
