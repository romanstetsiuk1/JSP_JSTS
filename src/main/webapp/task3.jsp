<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 17.03.19
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:set var="now" value="<%= new java.util.Date()%>"/>

<p>
    Time:
    <fmt:formatDate type="time" value="${now}"/>
</p>

<p>
    Date:
    <fmt:formatDate type="date" value="${now}"/>
</p>

<p>
    Date and Time:
    <fmt:formatDate type="both" value="${now}"/>
</p>

<p>
    Formated date:
    <fmt:formatDate pattern="yyyy-MM-dd" value="${now}"/>
</p>

</body>
</html>
