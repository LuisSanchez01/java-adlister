<%--
  Created by IntelliJ IDEA.
  User: luissanchez
  Date: 4/28/22
  Time: 11:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess Result</title>
</head>
<body>
<c:if test = "${result}">
    <h2>You guessed correctly!</h2>
</c:if>
<c:if test = "${!result}">
    <h2>You guessed Incorrectly!</h2>
</c:if>

</body>
</html>
