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

/**
 * Created by Nea on 23/10/2016.
 */
@WebServlet(name = "SubmitIdeaServlet")
public class SubmitIdeaServlet extends HttpServlet {

    private UserService us = new UserServiceImpl();
    private IdeaService is = new IdeaServiceImpl();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String ideaTitle = request.getParameter("TITLE");
        String ideaDescription = request.getParameter("DESCRIPTION");

        try {
            User user = us.getUserById(request.getSession().getAttribute("ID").toString());
            System.out.println(user);
            Idea idea = new Idea(ideaTitle, ideaDescription, user);
            System.out.println(idea);

            is.addIdea(ideaTitle, ideaDescription, user);

            request.getRequestDispatcher("welcome.jsp").include(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }






    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Redirection vers la page submit_idea.jsp
        request.getRequestDispatcher("submit_idea.jsp").forward(request, response);
    }
}
