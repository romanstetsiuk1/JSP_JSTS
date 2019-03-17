<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<body>
<h2>Hello World!</h2>

<%
    List<Integer> list = new ArrayList<>();
    list.add(1_500);
    list.add(3_000);
    list.add(10_100);
    list.add(50);
    list.add(400);
    request.setAttribute("myList", list);
%>

Size of List: ${fn:length(myList)}<br>

<c:forEach var="number" items="${myList}">
    <%--${number} <br>--%>
    <c:if test="${number > 1000}">
        ${number} <br>
    </c:if>

    <c:choose>
        <c:when test="${number > 100 and number < 500}">Little salary</c:when>
        <c:when test="${number > 2000 and number < 1000}">Normal salary</c:when>
        <c:when test="${number > 10000}">Big salary</c:when>
        <c:otherwise>Unsupported</c:otherwise>
    </c:choose>
</c:forEach>



<c:forEach var="i" begin="1" end="10">
    <p>Liczba ${i}</p><br>
</c:forEach>


</body>
</html>
