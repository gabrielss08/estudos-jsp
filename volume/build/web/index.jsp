<%-- 
    Document   : index
    Created on : Nov 29, 2023, 10:09:21 AM
    Author     : gabri
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Calculadora de Volume de Caixa Retangular</title>
</head>
<body>
    <h2>Calculadora de Volume de Caixa Retangular</h2>
    <form action="CaixaController" method="post">
        Comprimento: <input type="text" name="comprimento" required>
        Largura: <input type="text" name="largura" required>
        Altura: <input type="text" name="altura" required>
        <input type="submit" value="Calcular">
    </form>
</body>
</html>
