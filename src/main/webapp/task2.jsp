<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 17.03.19
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach var="stringFromList" items="${task2List}">
    <c:if test="${fn:length(stringFromList) > 4}">
        ${stringFromList}<br>
    </c:if>
</c:forEach>

</body>
</html>
