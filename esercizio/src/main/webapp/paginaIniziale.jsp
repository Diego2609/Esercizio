<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina Iniziale</title>
</head>
<body>
<form action="controlloAzione">
<button	style="width: 150px; height: 50px; margin: auto" type="submit" name="azione" value="1">Aggiungi Utente</button>
</form>
<form action="controlloAzione">
<button	style="width: 150px; height: 50px; margin: auto" type="submit" name="azione" value="2">Vedi Utenti</button>
</form>
<br><br>
<%
String messaggio = (String) request.getAttribute("messaggio");

	if (messaggio != null ){
		%>
	<main role="main" class="inner cover">
    <h1 class="cover-heading">Risultato</h1>
    <p class="lead"><c:out value = "${messaggio}"/></p>
    
    </main>
  <%}%> 
</body>
</html>