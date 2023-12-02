/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.PesoIdealModel;

/**
 *
 * @author gabri
 */
@WebServlet(name = "PesoIdealControl", urlPatterns = {"/PesoIdealControl"})
public class PesoIdealControl extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double altura = Double.parseDouble(request.getParameter("altura"));
        String genero = request.getParameter("genero");

        PesoIdealModel pesoIdealModel = new PesoIdealModel();
        double pesoIdeal = pesoIdealModel.calcularPesoIdeal(altura, genero);

        request.setAttribute("pesoIdeal", pesoIdeal);
        RequestDispatcher dispatcher = request.getRequestDispatcher("pesoIdealView.jsp");
        dispatcher.forward(request, response);
    }
}
