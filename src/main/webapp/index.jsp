<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="IndexServlet" method="POST">
		<input type="email" name="EMAIL" placeholder="Email" /> 
		<br /> <br /> 
		<input type="password" name="PASSWORD" placeholder="Mot de passe" /> 
		<br /> <br /> 
		<input type="submit" value="Se connecter" class="button" />
	</form>
	
	<br /> <br /> 

	<a href="/Calendrier/inscription.jsp">S'inscrire</a>
	
	

</body>
</html>