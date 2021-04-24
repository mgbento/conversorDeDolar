<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Converter</title>
</head>
<body>

	<form:form method="POST" modelAttribute="moeda">
		<h2 style="color: #22c74db8; border: solid; background-color: #fff8dd; width: fit-content; padding: 15px;">Aplicação de Conversão de Dólar para Real</h2>
		<br />
		<h2 style="color: #22c74db8; text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;">Quantos Dólares você deseja converter?</h2>
		<p>Digite aqui o valor em dólares $: <form:input path="valor" style="width: 50px; border-radius: 5px; border-color: aquamarine;"/> </p>
		<p><span style="background-color: #0dc575; color: #fff;	display: inline-block; padding: 3px 10px; font-weight: bold; border-radius: 5px; border: solid; border-color: black; border-width: 2px; cursor: pointer;"> 
		<form:button style="background-color: #0dc575; appearance: none; border: none; color: white; font-size: 18px; cursor: pointer;">Converter</form:button></span></p>
		<p style=" color: #22c74d; border: solid; background-color: #d4ea6f87; width: fit-content; padding: 10px;">${mensagem}</p>
	</form:form>	
	
</body>
</html>