package com.humanbooster.ideanoval.servlet;

import com.humanbooster.ideanoval.service.CategoryService;
import com.humanbooster.ideanoval.service.impl.CategoryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Nea on 25/10/2016.
 */
@WebServlet(name = "SubmitCategoryServlet")
public class SubmitCategoryServlet extends HttpServlet {

    private CategoryService cs = new CategoryServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String categoryTitle = request.getParameter("TITLE");
        String categoryDescription = request.getParameter("DESCRIPTION");

        cs.addCategory(categoryTitle, categoryDescription);
        request.getRequestDispatcher("WelcomeServlet").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("submit_category.jsp").forward(request, response);

    }
}
