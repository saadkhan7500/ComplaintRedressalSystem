<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false" %>

<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
 <h1>Hello this is my first spring MVC project</h1>
 <h1>Home Page</h1>

  <%
/*   String name=(String)request.getAttribute("name");
  Integer age=(Integer)request.getAttribute("age");
  String college=(String)request.getAttribute("college"); */
  
  %>
<%--   <h1>Name:- <%=name %></h1>
  <h1>Age:- <%=age %></h1>
  <h1>College:- <%=college %></h1> --%>
  
  <h1>Name:-${name }</h1>
  <h1>Age:- ${age }</h1>
  <h1>College:- ${college }</h1>
  <c:forEach var="mark" items="${marks}"> 
     <h1>${mark}</h1>
  </c:forEach>
</body>
</html>