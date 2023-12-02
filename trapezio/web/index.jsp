<%-- 
    Document   : index
    Created on : Nov 29, 2023, 10:06:29 AM
    Author     : gabri
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Calculadora de Área de Trapézio</title>
</head>
<body>
    <h2>Calculadora de Área de Trapézio</h2>
    <form action="TrapezioController" method="post">
        Base Maior: <input type="text" name="baseMaior" required>
        Base Menor: <input type="text" name="baseMenor" required>
        Altura: <input type="text" name="altura" required>
        <input type="submit" value="Calcular">
    </form>
</body>
</html>
