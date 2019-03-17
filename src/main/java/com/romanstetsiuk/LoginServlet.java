package com.romanstetsiuk;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private final String userValid = "username";
    private final String passwordValid = "usernamepass";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            Optional<Cookie> cookie = Arrays.stream(cookies)
                    .filter(e -> "isLogged".equals(e.getName()))
                    .findFirst();

            if (cookie.isPresent()) {
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("loginView.jsp");
                requestDispatcher.forward(req, resp);
            } else {
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
                requestDispatcher.forward(req, resp);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("username");
        String password = req.getParameter("pwd");

        if (user.equals(userValid) && password.equals(passwordValid)) {
            Cookie cookie = new Cookie("isLogged", user);
            cookie.setMaxAge(30 * 60);
            resp.addCookie(cookie);
            resp.sendRedirect("/loginView.jsp");
        } else {
            resp.sendRedirect("/loginView.jsp");

        }
    }
}
