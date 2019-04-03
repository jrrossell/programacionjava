<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Singleton: ${mensajeSingleton.nombre} - ${mensajeSingleton.descripcion}<br/>
Prototype: ${mensajePrototype.nombre} - ${mensajePrototype.descripcion}<br/>
Request: ${mensajeRequest.nombre} - ${mensajeRequest.descripcion}<br/>
Session: ${mensajeSession.nombre} - ${mensajeSession.descripcion}<br/>

</body>
</html>