<%--
  Created by IntelliJ IDEA.
  User: luissanchez
  Date: 5/3/22
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authors</title>
</head>
<body>
<c:forEach var="author" items="${authors}">
    <p>${author.author.name}</p>
</c:forEach>
</body>
</html>
