<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Utenti</title>
</head>
<body>
<table>
  <tr>
    <th>Nome</th>
    <th>Cognome</th>    
    <th>Numero</th>
  </tr>
  
  <c:forEach items="${listaUtenti}" var="u">
         
  <tr>             
	<td>
            <c:out value = "${u.getNome()}"/>  
	</td> 
	<td>
            <c:out value = "${u.getCognome()}"/>  
	</td>  
	<td>
            <c:out value = "${u.getNumero()}"/>  
	</td>  
  </tr>
	
  </c:forEach>	
</table>
<form action="paginaIniziale.jap">
      <input style="width: 150px; height: 50px; margin: auto" type="submit" value="Torna Indietro">
	</form>
</body>
</html>