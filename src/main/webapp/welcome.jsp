<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
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
<p> idées :  </p>
<ul>
    <c:forEach items="${ideas}" var="idea" >
        <li>
                ${idea.title}
        </li>
    </c:forEach>
</ul>

<a href="/SubmitIdea">Proposer une idée...</a>
<a href="/SubmitCategory">Proposer une catégorie...</a>

</body>
</html>
