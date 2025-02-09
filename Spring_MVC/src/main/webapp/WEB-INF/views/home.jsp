<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
     <%@page isELIgnored="false" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Home Page</h1>
<%-- <% 

String name=(String)request.getAttribute("name");
Integer roll=(Integer) request.getAttribute("roll");
List<String> list = (List<String>)request.getAttribute("list");

%> --%>
<h3>Name:${name }</h3>
<h3>Roll:${roll }</h3>
<!--But if we have to perform jstl then first
add dependency in pom.xml and add jstl uri at current page  -->
<h3>List:</h3>
<c:forEach items="${list }" var="n">

<h6>${n }</h6>



</c:forEach>
<a href="login">Click Here</a>
</body>
</html>