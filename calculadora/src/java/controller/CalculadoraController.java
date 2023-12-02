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
import model.CalculadoraModel;

/**
 *
 * @author gabri
 */
@WebServlet("/CalculadoraController")
public class CalculadoraController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operacao = request.getParameter("operacao");

        CalculadoraModel calculadoraModel = new CalculadoraModel();
        double resultado = 0;

        try {
            switch (operacao) {
                case "soma" -> resultado = calculadoraModel.somar(num1, num2);
                case "subtracao" -> resultado = calculadoraModel.subtrair(num1, num2);
                case "multiplicacao" -> resultado = calculadoraModel.multiplicar(num1, num2);
                case "divisao" -> resultado = calculadoraModel.dividir(num1, num2);
            }

            request.setAttribute("resultado", resultado);
            RequestDispatcher dispatcher = request.getRequestDispatcher("calculadoraView.jsp");
            dispatcher.forward(request, response);
        } catch (ArithmeticException e) {
            request.setAttribute("erro", e.getMessage());
            RequestDispatcher dispatcher = request.getRequestDispatcher("calculadoraErroView.jsp");
            dispatcher.forward(request, response);
        }
    }
}
