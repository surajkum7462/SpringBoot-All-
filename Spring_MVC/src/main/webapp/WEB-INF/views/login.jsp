<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Log in Page</h1>

<!-- Here is the details when we use JSP Tag for Model or ModelAndView -->
<%-- <%

String cl = (String)request.getAttribute("Class");

Integer in = (Integer)request.getAttribute("reg");

%>

<h4>Class:<%=cl %></h4>
<h4>Registration:<%=in %></h4> --%>


<!-- using JSP Expression Language but for this we have to first set isELIgnored="false" -->

<h4>Class:${Class }</h4>
<h4>Registration:${reg }Suraj</h4>


</body>
</html>