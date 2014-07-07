<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="http://platform.linkedin.com/in.js">
            api_key: 756f7ogbvydmk2
            authorize: true
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link media="all" type="text/css" href="../css/streamin.css" rel="stylesheet"/>
        <link media="all" type="text/css" href="../css/jqueryui.css" rel="stylesheet"/>
        <script type="text/javascript" src="http://code.jquery.com/jquery-1.5b1.js"></script>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.7/jquery-ui.min.js"></script>  
        <script type="text/javascript">
            function loadData() {
                IN.API.Profile("url=http://www.linkedin.com/in/jeffreyserpas")
                .fields(["id", "firstName", "lastName", "pictureUrl","headline","publicProfileUrl"])
                .result(function(result) {
                  profile = result.values[0];
                  profHTML = "<p><a href=\"" + profile.publicProfileUrl + "\">";
                  profHTML += "<img class=img_border align=\"left\" src=\"" + profile.pictureUrl + "\"></a>";      
                  profHTML += "<a href=\"" + profile.publicProfileUrl + "\">";
                  profHTML += "<h2 class=myname>" + profile.firstName + " " + profile.lastName + "</a> </h2>";
                  profHTML += "<span class=myheadline>" + profile.headline + "</span>";
                  $("#profile").html(profHTML);
                });
            }
        </script>
    </head>
    <body class="yui3-skin-sam	yui-skin-sam">
        <h1>Hello World!</h1>
        <a href="<c:url value="/entrepreneurs" />">Entrepreneurs</a>
        <div id="profile"></div>
        <script type="IN/Login" data-onAuth="loadData"></script>
        <button class="btn btn-info" type="submit">
                        Submit
                    </button>
    </body>
</html>
