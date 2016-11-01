<%--
  Created by IntelliJ IDEA.
  User: Nea
  Date: 23/10/2016
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Connexion</title>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>

<jsp:include page="header.jsp"/>
<div id ="page">
    <body>
    <form action="LoginServlet" method="POST">
        <input type="email" name="EMAIL" placeholder="Email" />
        <br /> <br />
        <input type="password" name="PASSWORD" placeholder="Mot de passe" />
        <br /> <br />
        <input type="submit" value="Se connecter" class="button" />
    </form>

    <br /> <br />

    <p>Pas encore inscrit ? <a href="/registration.jsp">S'inscrire</a></p>

    </body>
</div>
</html>
