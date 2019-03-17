package com.romanstetsiuk;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/task2")
public class Task2Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<String> myStringList = new ArrayList<>();
        myStringList.add("Hello");
        myStringList.add("my");
        myStringList.add("best");
        myStringList.add("friend.");
        myStringList.add("How");
        myStringList.add("are");
        myStringList.add("you?");

        req.setAttribute("task2List", myStringList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("task2.jsp");
        requestDispatcher.forward(req, resp);

    }
}
