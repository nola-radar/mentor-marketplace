<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html">

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        
        <title>User Register</title>
    </head>

    <body id="createBody">


        <!-- Navigation Bar -->

        <%@include file="../nav.jsp" %>


        <!-- Create Profile Main Container -->

        <div class="container" id="registerMainContainer">


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

        </div>

    </body>

</html>
