<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nea
  Date: 23/10/2016
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>Proposer une idée</title>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>

<jsp:include page="header.jsp"/>
<div id ="page">
    <body>
    <h1>Ideanoval</h1>

    <form action="SubmitIdeaServlet" method="POST">
        <fieldset>
            <legend>Proposer une idée</legend>

            <label>Titre de l'idée : </label>
            <input type="text" name="TITLE" placeholder="Titre de l'idée" />
            <br /> <br />

            <label>Description :</label>
            <textarea name="DESCRIPTION" placeholder="Décrivez votre idée" ></textarea>
            <br /> <br />

            <p>Choisissez une catégorie associée :</p>
            <select name = "IDCATEGORY" size="1">
                <c:forEach items="${categories}" var="category" >
                    <option value="${category.id}">${category.label} : ${category.description} </option>
                </c:forEach>
            </select>
            <br /> <br />

            <input type="submit" value="Soumettre l'idée" class="button" />
        </fieldset>
    </form>

    </body>
</div>
</html>
