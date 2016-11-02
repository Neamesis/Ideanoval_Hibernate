package com.humanbooster.ideanoval.servlet;

import com.humanbooster.ideanoval.models.CategoryIdea;
import com.humanbooster.ideanoval.models.Idea;
import com.humanbooster.ideanoval.models.User;
import com.humanbooster.ideanoval.service.CategoryService;
import com.humanbooster.ideanoval.service.IdeaService;
import com.humanbooster.ideanoval.service.UserService;
import com.humanbooster.ideanoval.service.impl.CategoryServiceImpl;
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
@WebServlet(name = "SubmitIdeaServlet")
public class SubmitIdeaServlet extends HttpServlet {

    private UserService us = new UserServiceImpl();
    private IdeaService is = new IdeaServiceImpl();
    private CategoryService cs = new CategoryServiceImpl();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String ideaTitle = request.getParameter("TITLE");
        String ideaDescription = request.getParameter("DESCRIPTION");
        String idCategory = request.getParameter("IDCATEGORY");

        try {
            User user = us.getUserById(request.getSession().getAttribute("ID").toString());
            CategoryIdea categoryIdea = cs.findCategoryById(idCategory);
            is.addIdea(ideaTitle, ideaDescription, categoryIdea, user);
            request.getRequestDispatcher("WelcomeServlet").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Redirection vers la page submit_idea.jsp
        List<CategoryIdea> categories = cs.getAllCategories();
        request.setAttribute("categories", categories);
        request.getRequestDispatcher("submit_idea.jsp").forward(request, response);
    }
}
