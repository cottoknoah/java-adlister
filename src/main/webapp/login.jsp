<%--
  Created by IntelliJ IDEA.
  User: knoahcotto
  Date: 7/15/20
  Time: 10:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
String username = request.getParameter("username");
String password = request.getParameter("password");
    System.out.println(username + password);

    if (request.getMethod().equalsIgnoreCase("post")) {
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile");
        }
    }
%>
<html>
<head>
    <title>Login to your profile</title>
</head>
<body>

<form action="/login.jsp" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username">
    <label for="password">Password:</label>
    <input type="password" id="password" name="password">
    <button type="submit">Submit</button>
</form>



</body>
</html>
