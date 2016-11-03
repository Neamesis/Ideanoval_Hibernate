<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nea
  Date: 23/10/2016
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>


<html>
<head>
    <title>Ideanoval</title>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<jsp:include page="header.jsp"/>

<div id ="page">
    <body>
    <h4>Bonjour ${user.pseudo} !</h4>

    <h1> Idées :  </h1>
    <table>
        <tr>
            <td><h2>Titre</h2></td>
            <td><h2>Description</h2></td>
            <td><h2>Catégorie</h2></td>
            <td><h2>Utilisateur</h2></td>

        </tr>
        <c:forEach items="${ideas}" var="idea" >
            <tr>
                <td>${idea.title}</td>
                <td>${idea.description}</td>
                <td><c:out value="${idea.category.label}"/></td>
                <td>${idea.user.pseudo}</td>
            </tr>
        </c:forEach>

    </table>
    <br>
    <a href="/IdeanovalHibernate/SubmitIdea">Proposer une idée...</a> <br>
    <a href="/SubmitCategory">Proposer une catégorie...</a>

    </body>

</div>
</html>
