package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/users/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        // TODO: ensure the submitted information is valid
        User user = new User(1,
                request.getParameter("username"),
                request.getParameter("email"),
                request.getParameter("password")
        );
        // TODO: create a new user based off of the submitted information
        DaoFactory.getUsersDao().insert(user);
        // TODO: if a user was successfully created, send them to their profile
        try {
            response.sendRedirect("/users");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
