<%-- 
    Document   : priceincrease
    Created on : Jun 25, 2013, 9:06:50 AM
    Author     : wjirawong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include.jsp" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><fmt:message key="title" /></title>
    </head>
    <body>
        <h1><fmt:message key="priceincrease.heading" /></h1>
        <form:form method="POST" commandName="priceIncrease">
            <table width="95%" bgcolor="#f8f8ff" border="0">
                <tr>
                    <td width="20%">
                        <form:input path="percentage" />
                    </td>
                    <td width="60%">
                        <form:errors path="percentage" />
                    </td>
                </tr>
            </table>
            <br>
            <input type="submit" align="center" value="Execute" />
        </form:form>
            <c:url value="hello.htm" />
            <a href="" >Home</a>
    </body>
</html>
