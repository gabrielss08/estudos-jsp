<%-- 
    Document   : pesoIdealView
    Created on : Nov 29, 2023, 9:41:59 AM
    Author     : gabri
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado - Peso Ideal</title>
</head>
<body>
    <h2>Resultado - Peso Ideal</h2>
    <c:if test="${pesoIdeal > 0}">
        <p>O seu peso ideal é: ${pesoIdeal}</p>
    </c:if>
</body>
</html>

