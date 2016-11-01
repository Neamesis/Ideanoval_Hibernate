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
</head>
<body>
<h4>Bonjour ${user.pseudo} !</h4>

<h1> Idées :  </h1>
<table>
    <tr>
        <td>Titre</td>
        <td>Description</td>
    </tr>
    <c:forEach items="${ideas}" var="idea" >
        <tr>
            <td>${idea.title}</td>
            <td>${idea.description}</td>

            <!-- TODO Afficher les catégories correspondant aux idées -->
                <%--<td><c:out value="${idea.category}"/></td>--%>
        </tr>
    </c:forEach>

</table>
<br>
<a href="/SubmitIdea">Proposer une idée...</a> <br>
<a href="/SubmitCategory">Proposer une catégorie...</a>

</body>
</html>
