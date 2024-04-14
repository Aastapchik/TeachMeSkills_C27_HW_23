package com.timeTask;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
@WebServlet("/beijing")
public class TimeBeijing extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Instant now = Instant.now();
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime dateAndTimeInBeijing = ZonedDateTime.ofInstant(now, zoneId);
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Time in Beijing: " + dateAndTimeInBeijing);
        printWriter.close();
        resp.setContentType("text/html");
    }
}
