package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name= "RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.getRequestDispatcher("WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String username = request.getParameter("username");
       String email = request.getParameter("email");
       String password = request.getParameter("password");

       boolean emailDoesntExist = false;
       boolean fieldsNotNull = false;
       boolean fieldsNotEmpty = false;

//       if (username.equals(/))

       if (username != null & email != null && password != null) {
           fieldsNotNull = true;
       }
       if (!username.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
           fieldsNotEmpty = true;
       }

       if (fieldsNotNull && fieldsNotEmpty) {
//           create user record with users dao
           User userToCreate = new User(username, email, password);
           DaoFactory.getUsersDao().insert(userToCreate);
       }

       response.sendRedirect("/profile");
    }
}
