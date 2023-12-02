/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.TrapezioModel;

/**
 *
 * @author gabri
 */
@WebServlet("/TrapezioController")
public class TrapezioController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double baseMaior = Double.parseDouble(request.getParameter("baseMaior"));
        double baseMenor = Double.parseDouble(request.getParameter("baseMenor"));
        double altura = Double.parseDouble(request.getParameter("altura"));

        TrapezioModel trapezioModel = new TrapezioModel();
        double area = trapezioModel.calcularArea(baseMaior, baseMenor, altura);

        request.setAttribute("area", area);
        RequestDispatcher dispatcher = request.getRequestDispatcher("trapezioView.jsp");
        dispatcher.forward(request, response);
    }
}

