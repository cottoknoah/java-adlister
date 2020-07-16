<%--
  Created by IntelliJ IDEA.
  User: knoahcotto
  Date: 7/14/20
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% request.setAttribute("isAdmin", true); %>
<% request.setAttribute("myTasks", new String[] {"Todo 1", "Todo 2", "Todo 3"}); %>

<html>
<head>
    <title>To Do List</title>
</head>
<body>
    <h1>Welcome to your to do list!</h1>

<%--    <c:choose>--%>
<%--        <c:when test="${boolean_expression_1}">--%>
<%--            <p>boolean_expression_1 was true</p>--%>
<%--        </c:when>--%>
<%--        <c:when test="${boolean_expression_2}">--%>
<%--            <p>boolean_expression_1 was false, and boolean_expression_2 was true</p>--%>
<%--        </c:when>--%>
<%--        <c:otherwise>--%>
<%--            <p>none of the above tests were true</p>--%>
<%--        </c:otherwise>--%>
<%--    </c:choose>--%>


    <h1>Here are your To Do's:</h1>
    <p><%= request.getParameter("item")%></p>
    <p><% request.getMethod();%></p>

    <c:if test="${isAdmin}">
        <p>Super Secret Admin Dashboard!</p>
    </c:if>


</body>
</html>
