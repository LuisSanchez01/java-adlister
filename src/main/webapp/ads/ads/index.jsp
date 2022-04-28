<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: luissanchez
  Date: 4/28/22
  Time: 3:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads/Index</title>
</head>
<body>
<form method="post" action="ads">
    <input type="radio" id="1" userId="1" name="ads" title="playstation for
     sale" description="This is a slightly used playstation">
    <label for="1">1</label><br>
    <input type="radio" id="2" userId="1" name="ads" title="Super Nintendo"
     description="Get your game on with this old-school classic!">
    <label for="2">2</label><br>
    <input type="radio" id="3" userId="2" name="ads" title="Junior
    Java Developer Position" description="Minimum 7 years of
    experience required. You will be working in the scripting
    language for Java, JavaScript">
    <label for="3">3</label><br>
    <input type="radio" id="4" userId="2" name="ads"
           title="Javascript developer needed" description="Must
            have strong Java skills">
    <label for="4">4</label><br>
    <button type="submit">Submit</button>
</form>
<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h2>${ad.title}</h2>
        <p>Description: ${ad.description}</p>
    </div>
</c:forEach>


</body>
</html>
