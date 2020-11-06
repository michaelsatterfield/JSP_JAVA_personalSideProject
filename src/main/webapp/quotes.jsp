
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Quotes MVC Example</title>
</head>
<body>
<h1>Quotes</h1>
<ul>
    <c:forEach var="quote" items="${quotes}">
        <p>${quote.id}</p>
        <q>${quote.content}</q>
        -${quote.authorFirstName} ${quote.authorLastName}
        <hr>
    </c:forEach>
</ul>
</body>
</html>
