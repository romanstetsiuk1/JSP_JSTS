package com.romanstetsiuk;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

@WebServlet("/sumInt")
public class CountIntegerInRequest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> mapa = req.getParameterMap();

        if (mapa != null) {
            int result = mapa
                    .values()
                    .stream()
                    .flatMap(Arrays::stream)
                    .filter(e -> Pattern.matches("[0-9]+", e))
                    .mapToInt(Integer::valueOf)
                    .sum();
            resp.getWriter().println("Result = " + result);
        }
    }
}
