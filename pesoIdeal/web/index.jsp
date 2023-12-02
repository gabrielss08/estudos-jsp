<%-- 
    Document   : index
    Created on : Nov 29, 2023, 9:40:59 AM
    Author     : gabri
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Calculadora de Peso Ideal</title>
</head>
<body>
    <h2>Calculadora de Peso Ideal</h2>
    <form action="PesoIdealControl" method="post">
        Altura: <input type="text" name="altura" required>
        Gênero: 
        <select name="genero" required>
            <option value="homem">Homem</option>
            <option value="mulher">Mulher</option>
        </select>
        <input type="submit" value="Calcular">
    </form>
</body>
</html>