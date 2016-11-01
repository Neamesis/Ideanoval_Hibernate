package com.humanbooster.ideanoval.servlet;

import com.humanbooster.ideanoval.models.CategoryIdea;
import com.humanbooster.ideanoval.models.Idea;
import com.humanbooster.ideanoval.service.CategoryService;
import com.humanbooster.ideanoval.service.IdeaService;
import com.humanbooster.ideanoval.service.impl.CategoryServiceImpl;
import com.humanbooster.ideanoval.service.impl.IdeaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Nea on 25/10/2016.
 */
@WebServlet(name = "WelcomeServlet")
public class WelcomeServlet extends HttpServlet {

    private IdeaService is = new IdeaServiceImpl();
    private CategoryService cs = new CategoryServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Idea> ideas = is.getAllIdeas();
        List<CategoryIdea> categories = cs.getAllCategories();
        request.setAttribute("ideas", ideas);
        request.setAttribute("categories", categories);
        request.getRequestDispatcher("welcome.jsp").forward(request, response);
    }
}
