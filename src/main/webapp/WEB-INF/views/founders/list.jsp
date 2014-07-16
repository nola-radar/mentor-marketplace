<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Founders Page</title>
    </head>
    <body>
        <h1>All Founders:</h1>
        <a href="<c:url value="create" />">New</a>
        <ul>
            <c:forEach var="founder" items="${founders}">
                <li><a href="<c:url value="${founder.id}" />">${founder.id}</a>
                    | ${founder.linkedInId} | ${founder.industry}</li>
            </c:forEach>
        </ul>
    </body>
</html>
