<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Mentor Register</title>

        <!-- BOOTSTRAP! -->
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="http://localhost:8080/mentormarketplace/resources/css/bootstrap-responsive.css" type="text/css" />
        <link rel="stylesheet" href="/mentormarketplace/resources/css/ivmm.css"  type="text/css"/>
    </head>
    <body id="createBody">
        <%@include file="../nav.jsp" %>
        <div class="container" style="background-color:#f6f6f6;">
            <center>
            <form id="userTypeB">
                <input type="radio" name="user" value="founder">Founder
                <input type="radio" name="user" value="mentor">Mentor
                <input type="submit" value="Submit">
            </form>
            </center>
            <br>

            <% request.setAttribute("user",request.getParameter("user"));%>
            <c:choose>
                <c:when test="${user == 'founder'}">
                    <%@include file="displayFounder.jsp" %>
                </c:when>
                <c:otherwise>
                    <%@include file="displayMentor.jsp" %>
                </c:otherwise>
            </c:choose>
        </div>
    </body>
</html>
