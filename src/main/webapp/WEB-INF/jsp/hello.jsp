<%-- 
    Document   : hello
    Created on : Jun 21, 2013, 12:54:35 PM
    Author     : wjirawong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include.jsp" %>
<!DOCTYPE html>
<html>
  <head><title>Hello :: Spring Application</title></head>
  <body>
    <h1>Hello - Spring Application</h1>
    <p>Greetings, it is now <c:out value="${now}"/></p>
  </body>
</html>
