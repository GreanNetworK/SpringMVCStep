<%-- 
    Document   : hello
    Created on : Jun 21, 2013, 12:54:35 PM
    Author     : wjirawong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include.jsp" %>
<!DOCTYPE html>
<html>
    <head><title><fmt:message key="title" /></title></head>
    <body>
        <h1><fmt:message key="heading" /></h1>
        <p><fmt:message key="greeting" /><c:out value="${model.now}"/></p>
<h3>Products</h3>
<c:forEach items="${model.products}" var="prod">
    <c:out value="${prod.description}" /> <i>$<c:out value="${prod.price}"/></i><br><br>
</c:forEach>
</body>
</html>
