<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mentor Page</title>
    </head>
    <body>
        <h1>All Mentors:</h1>
        <a href="<c:url value="create" />">New</a>
        <ul>
            <c:forEach var="mentor" items="${mentors}">
                <li><a href="<c:url value="${mentor.id}" />">${mentor.id}</a> 
                    | ${mentor.firstName}  | ${mentor.lastName}
                    | ${mentor.industry}   | ${mentor.areasOfExpertise}  
                    | ${mentor.linkedInId} | ${mentor.linkedInPictureURL}
                    | ${mentor.linkedInCurrentCompany}
                    | ${mentor.linkedInCurrentJobTitle}</li>
            </c:forEach>
        </ul>
    </body>
</html>
