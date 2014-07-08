<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>All Entrepreneurs:</h1>
        <a href="<c:url value="create" />">New</a>
        <ul>
            <c:forEach var="entrepreneur" items="${entrepreneurs}">
                <li><a href="<c:url value="${entrepreneur.id}" />">${entrepreneur.id}</a>
                    | ${entrepreneur.linkedInId} | ${entrepreneur.industry}</li>
            </c:forEach>
        </ul>
    </body>
</html>
