package com.timeTask;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeMinsk extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        SimpleDateFormat newDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss:SSS");
        String data = newDate.format(new Date());
        printWriter.write("Time in Minsk: " + data);
        printWriter.close();
        resp.setContentType("text/html");
    }
}
