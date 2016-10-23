<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calendrier</title>
</head>
<body>
<h1>Les jours de Novembre</h1>
<h3>Bonjour ${utilisateur.prenom}</h3>
<p>Votre solde est de ${utilisateur.solde} euros.</p>

<ul>
	<c:forEach items="${jours}" var="jour">
		<li>
			<c:if test="${jour.isAchete == 0 }">
				<c:out value="${jour.date} : "/> 
				<a href="AchatJourServlet?id=${jour.id}&media=1">Placer un dicton (2 &euro;)</a>
				<a href="AchatJourServlet?id=${jour.id}&media=2">Placer une image (5 &euro;)</a><br><br>
			</c:if>
		
			<c:if test="${jour.isAchete == 1 }">
				<c:out value="${jour.date} : "/> 
				<c:out value ="Ce jour n'est plus disponible"/><br> <br>
			</c:if>
		</li>

	</c:forEach>
</ul>




</body>
</html>