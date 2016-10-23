package com.humanbooster.ideanoval.servlet;

import com.humanbooster.ideanoval.service.UserService;
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
@WebServlet(name = "WelcomeServlet")
public class WelcomeServlet extends HttpServlet {

    private UserService us = new UserServiceImpl();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
