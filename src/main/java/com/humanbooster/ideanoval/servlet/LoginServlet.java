package com.humanbooster.ideanoval.servlet;

import com.humanbooster.ideanoval.models.Idea;
import com.humanbooster.ideanoval.models.User;
import com.humanbooster.ideanoval.service.IdeaService;
import com.humanbooster.ideanoval.service.UserService;
import com.humanbooster.ideanoval.service.impl.IdeaServiceImpl;
import com.humanbooster.ideanoval.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Nea on 23/10/2016.
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {

    private UserService us = new UserServiceImpl();
    private IdeaService is = new IdeaServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        User user = us.login(request.getParameter("EMAIL"),
                request.getParameter("PASSWORD"));

        if (user != null) {
            // Si l'utilisateur est reconnu et non nul, mise de son id en session
            request.getSession().setAttribute("ID", user.getId());

            // Envoi de l'utilisateur via l'objet request
            request.setAttribute("user", user);

            // Redirection vers la WelcomeServlet
            request.getRequestDispatcher("Welcome").include(request, response);
        } else {
            // Si utilisateur null, redirection sur la page de login
            // TODO développer message d'erreur
            response.sendRedirect("login.jsp?codeErreur=1");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
