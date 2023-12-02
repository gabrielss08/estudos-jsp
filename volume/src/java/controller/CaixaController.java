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
import model.CaixaModel;

/**
 *
 * @author gabri
 */
@WebServlet("/CaixaController")
public class CaixaController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double comprimento = Double.parseDouble(request.getParameter("comprimento"));
        double largura = Double.parseDouble(request.getParameter("largura"));
        double altura = Double.parseDouble(request.getParameter("altura"));

        CaixaModel caixaModel = new CaixaModel();
        double volume = caixaModel.calcularVolume(comprimento, largura, altura);

        request.setAttribute("volume", volume);
        RequestDispatcher dispatcher = request.getRequestDispatcher("caixaView.jsp");
        dispatcher.forward(request, response);
    }
}

