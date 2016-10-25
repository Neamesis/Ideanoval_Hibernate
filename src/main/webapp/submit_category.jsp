<%--
  Created by IntelliJ IDEA.
  User: Nea
  Date: 25/10/2016
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Création de catégorie</title>
</head>
<body>
<form action="SubmitCategoryServlet" method="POST">

    <fieldset>
        <legend>Proposer une catégorie</legend>

        <label>Titre de la catégorie : </label>
        <input type="text" name="TITLE" placeholder="Titre de la catégorie" />
        <br /> <br />

        <label>Description :</label>
        <textarea name="DESCRIPTION" placeholder="Décrivez votre catégorie" ></textarea>
        <br /> <br />

        <input type="submit" value="Soumettre la catégorie" class="button" />
    </fieldset>
</form>

</body>
</html>
