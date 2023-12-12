package com.example.tomcat29_3_1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class DataBase extends HttpServlet {
    DatabaseInt database;
    PrintWriter messageWriter;
    public void init() throws ServletException {

    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        messageWriter = response.getWriter();
        messageWriter.println("<h1>" + "База данных" + "</h1>");

        database = new H2Database();
        database.connect();
        database.createSample();
        database.querry(messageWriter);
    }
    public void destroy(){
        database.close();
    }
}
