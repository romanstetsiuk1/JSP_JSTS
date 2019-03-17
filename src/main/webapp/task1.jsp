<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 17.03.19
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--Show all even number from 0 to 300--%>
<c:forEach var="i" begin="0" end="300">
    <c:if test="${i % 2 == 0}">
        <p>${i}</p><br>
    </c:if>
</c:forEach>

</body>
</html>
