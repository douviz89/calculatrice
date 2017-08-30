<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculatrice</title>
</head>
<body>
	<!--${ calcul.result != 0 ? calcul.result : ""}-->
	<p style="color:red">${ empty errorMsg ? "" : errorMsg }</p>
	
	<c:if test="${ calcul.result != 0 }">
		Le resultat est : ${ calcul.result }
	</c:if>
	<form action="calculatrice" method="post">
		First :<input type="number" name="first" /> <select name="type">
			<option value="1">+</option>
			<option value="2">-</option>
			<option value="3">*</option>
			<option value="4">/</option>
		</select> Second : <input type="number" name="second" />
		<button type="submit">Envoyer</button>
	</form>
</body>
</html>