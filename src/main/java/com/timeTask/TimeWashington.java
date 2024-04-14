package com.timeTask;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeWashington extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Instant now = Instant.now();
        ZoneId zoneId = ZoneId.of("America/Indiana/Indianapolis");
        ZonedDateTime dateAndTimeInWashington = ZonedDateTime.ofInstant(now, zoneId);
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Time in Washington: " + dateAndTimeInWashington);
        printWriter.close();
        resp.setContentType("text/html");
    }
}
