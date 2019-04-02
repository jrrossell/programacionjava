<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="com.curso.java.oo.ejercicio01oo.model.Alumno" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Lista de Alumnos en sala ${nombreAula}</h3>
<%-- Singleton: ${mensajeSingleton.nombre}<br/> --%>
<%-- Prototype: ${mensajePrototype.nombre} - ${mensajePrototype.descripcion}<br/> --%>
<%-- Request: ${mensajeRequest.nombre} - ${mensajeRequest.descripcion}<br/> --%>
<%-- Session: ${mensajeSession.nombre} - ${mensajeSession.descripcion}<br/> --%>

Cantidad de Alumnos: ${cantidadAlumos} <br/><br/>

<%-- <%  --%>
<%-- List<Alumno> lista = (List<Alumno>) request.getAttribute("listaDeAlumnos"); --%>
<%-- for(Alumno alumno: lista){ %> --%>
<%-- 	<%= alumno %> --%>
<%-- <% } %> --%>

1. ${alumno1} <br/> 
2. ${alumno2} <br/>
3. ${alumno3} <br/>
4. ${alumno4} <br/>
5. ${alumno5} <br/>
</body>
</html>