<%--
  Created by IntelliJ IDEA.
  User: knoahcotto
  Date: 7/14/20
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>To Do List</title>
</head>
<body>

    <h1>Here are your To Do's:</h1>
    <p><%= request.getParameter("item")%></p>
    <p><% request.getMethod();%></p>

</body>
</html>
