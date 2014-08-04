<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>User Register</title>

        <!-- BOOTSTRAP! -->
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="/mentormarketplace/resources/css/navigationBar.css"  type="text/css"/>
        <link rel="stylesheet" href="/mentormarketplace/resources/css/founderSocial.css"  type="text/css"/>
    </head>

    <body id="createBody">


        <!-- Navigation Bar -->

        <%@include file="../nav.jsp" %>


        <!-- Create Profile Main Container -->

        <div class="container" id="registerMainContainer">
<<<<<<< HEAD


            <!-- Tab panes -->

            <ul class="nav nav-tabs" id="myTab">
                
                <li class="active"><a href="#founder" data-toggle="tab">Founder</a></li>
                <li><a href="#mentor" data-toggle="tab">Mentor</a></li>
                
            </ul>

            <div id='content' class="tab-content">

                <div class="tab-pane active" id="founder">

                    <%@include file="createProfileFounder.jsp" %>

                </div>

                <div class="tab-pane" id="mentor">

                        <%@include file="createProfileMentor.jsp" %>

                </div>

            </div>   

=======
            <center>
                <form id="userTypeB">
                    <input type="radio" name="user" value="founder"
                           onclick="document.forms['userTypeB'].submit();">
                    Founder
                    <input type="radio" name="user" value="mentor"
                           onclick="document.forms['userTypeB'].submit();">
                    Mentor                 
                </form>
            </center>
            <br>

            <% request.setAttribute("user", request.getParameter("user"));%>
            <c:choose>
                <c:when test="${user == 'founder'}">
                    <%@include file="displayFounder.jsp" %>
                </c:when>
                <c:when test="${user == 'mentor'}">
                    <%@include file="displayMentor.jsp" %>
                </c:when>
            </c:choose>
>>>>>>> 9908185e734f9b09a919eb2d3ed388366d9a43d0
        </div>

    </body>

</html>
