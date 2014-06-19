<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Entrepreneur ${entrepreneur.id}:</h1>
        <div>
            <b>Linked In Id:</b> ${entrepreneur.linkedInId}
        </div>
        <div>
            <b>Industry:</b> ${entrepreneur.industry}
        </div>
    </body>
</html>
