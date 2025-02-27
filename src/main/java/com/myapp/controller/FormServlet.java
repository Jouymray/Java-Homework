package com.myapp.controller;

import com.myapp.dao.UserDao;
import com.myapp.dao.UserDaoImpl;
import com.myapp.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/register")
public class FormServlet extends HttpServlet {
    private UserDao userDao;

    @Override
    public void init() {
        userDao = new UserDaoImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("form.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form data from request
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String birthday = request.getParameter("birthday");
        String newStudent = request.getParameter("newStudent"); // "yes" or "no"
        String college = request.getParameter("college");
        String major = request.getParameter("major");
        String color = request.getParameter("color");
        String terms = request.getParameter("terms"); // non-null if checked

        // Create a User object and set the fields
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setBirthday(birthday);
        user.setNewStudent(newStudent);
        user.setCollege(college);
        user.setMajor(major);
        user.setColor(color);
        user.setTerms(terms != null ? "yes" : "no");


        userDao.saveUser(user);


        request.setAttribute("user", user);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
