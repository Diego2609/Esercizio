<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aggiungi Utente</title>
</head>
<body>
	<form action="aggiungiUtente" method="post">

		<input type="text" id="nome" name="nome"  placeholder="nome" required="required"> <br>
		<input type="text" id="cognome" name="cognome" 	placeholder="cognome" required="required"> <br>
		<input type="number" id="numero" name="numero" placeholder="1, 2, 3..." required="required"><br>

		<button style="width: 150px; height: 50px; margin: auto" type="submit">Inserisci Utente</button>
		
	</form>

	<form action="paginaIniziale.jsp">
		<input style="width: 150px; height: 50px; margin: auto" type="submit" value="Torna Indietro">
	</form>
</body>
</html>