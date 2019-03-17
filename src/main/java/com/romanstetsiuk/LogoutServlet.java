package com.romanstetsiuk;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie removeIsLogged = new Cookie("isLogged", "");
        removeIsLogged.setMaxAge(0);
        resp.addCookie(removeIsLogged);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("logout.jsp");
        requestDispatcher.forward(req, resp);
    }
}
