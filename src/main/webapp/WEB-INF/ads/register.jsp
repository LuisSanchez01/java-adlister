<%--
  Created by IntelliJ IDEA.
  User: luissanchez
  Date: 5/5/22
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>

<form action="/register" method="post">
    <label for="username">Username</label>
    <input type="text" name="username" placeholder="Enter username">
    <br>
    <label for="email">Email</label>
    <input id="email" type="email" name="email" placeholder="email">
    <br>
    <label for="password">Password</label>
    <input id="password" type="password" name="password" placeholder="password">
    <button>Submit</button>
</form>

</body>
</html>
