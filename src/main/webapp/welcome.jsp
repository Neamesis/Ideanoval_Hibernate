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

    <div id="allIdeas">
        <c:forEach items="${ideas}" var="idea" >
            <div class="anIdea">
                <h2>${idea.title}</h2>
                <td>${idea.description}</td>
                <p><c:out value="${idea.category.label}"/></p>
                <p>${idea.user.pseudo}</p>
            </div>
        </c:forEach>
    </div>

    <br>
    <a href="/IdeanovalHibernate/SubmitIdea">Proposer une idée...</a> <br>
    <a href="/IdeanovalHibernate/SubmitCategory">Proposer une catégorie...</a>

    </body>

</div>
</html>
