<%--
  Created by IntelliJ IDEA.
  User: Nea
  Date: 23/10/2016
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Proposer une idée</title>
</head>
<body>
<h1>Ideanoval</h1>

<form action="WelcomeServlet" method="POST">
    <fieldset>
        <legend>Proposer une idée</legend>

        <label>Titre de l'idée : </label>
        <input type="text" name="TITLE" placeholder="Titre de l'idée" />
        <br /> <br />

        <label>Description :</label>
        <textarea name="DESCRIPTION" placeholder="Décrivez votre idée" ></textarea>
        <br /> <br />

        <input type="submit" value="Soumettre l'idée" class="button" />
    </fieldset>
</form>

</body>
</html>
