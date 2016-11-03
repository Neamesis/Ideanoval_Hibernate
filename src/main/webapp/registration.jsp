<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Inscription à Ideanoval</title>
	<link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>

<jsp:include page="header.jsp"/>
<div id ="page">
	<body>
	<h1>Inscription</h1>
	<h2>Des idées en vrac</h2>

	<form action="Registration" method="POST">
		<input type="text" name="PSEUDO" placeholder="Pseudo" />
		<br /> <br />
		<input type="email" name="EMAIL" placeholder="Email" />
		<br /> <br />
		<input type="password" name="PASSWORD" placeholder="Mot de passe" />
		<br /> <br />
		<input type="submit" value="S'inscrire" class="button" />
	</form>

	</body>
</div>
</html>