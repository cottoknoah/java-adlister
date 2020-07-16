<%--
  Created by IntelliJ IDEA.
  User: knoahcotto
  Date: 7/14/20
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! String firstName = "Knoah";%>
<%! String lastName = "Cotto";%>
<%--<%! int myNumber = 1; %>--%>

<%--<%--%>
<%--    if(firstName.equals("Knoah")){--%>
<%--        response.sendRedirect("index.jsp");--%>
<%--    }--%>
<%--%>--%>

<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <h1>Welcome!</h1>
<%--    Navbar Below    --%>
    <%@ include file="partials/navbar.jsp"%>
    <h1>Hello, <%= firstName + " " + lastName %></h1>

    <h3>What would you like to do?</h3>

    <h3>View Your Profile</h3>
    <form action="profile.jsp" method="get">
        <input type="hidden" id="username" name="username" value="Knoah">
        <button type="submit">Go Here</button>
    </form>

    <h3>Add a To Do</h3>

    <form action="todo.jsp" method="post">
        <input type="text" id="item" name="item">
        <button type="submit">Add to List</button>
    </form>

    <%@ include file="partials/aboutme.jsp"%>

<%--    Footer Below    --%>
    <%@ include file="partials/footer.jsp"%>

</body>
</html>
