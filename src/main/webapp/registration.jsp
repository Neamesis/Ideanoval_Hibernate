<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inscription à Ideanoval</title>
</head>
<body>
	<h1>Inscription</h1>
	<h2>Des idées en vrac</h2>
	
	<form action="RegistrationServlet" method="POST">
		<input type="text" name="PSEUDO" placeholder="Pseudo" />
		<br /> <br />
		<input type="email" name="EMAIL" placeholder="Email" /> 
		<br /> <br /> 
		<input type="password" name="PASSWORD" placeholder="Mot de passe" /> 
		<br /> <br /> 
		<input type="submit" value="S'inscrire" class="button" />
	</form>

</body>
</html>