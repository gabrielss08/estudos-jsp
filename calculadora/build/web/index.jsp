<%-- 
    Document   : index
    Created on : Nov 29, 2023, 10:02:31 AM
    Author     : gabri
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Calculadora</title>
</head>
<body>
    <h2>Calculadora</h2>
    <form action="CalculadoraController" method="post">
        Número 1: <input type="text" name="num1" required>
        Número 2: <input type="text" name="num2" required>
        <br>
        Operação: 
        <select name="operacao" required>
            <option value="soma">Soma</option>
            <option value="subtracao">Subtração</option>
            <option value="multiplicacao">Multiplicação</option>
            <option value="divisao">Divisão</option>
        </select>
        <br>
        <input type="submit" value="Calcular">
    </form>
</body>
</html>