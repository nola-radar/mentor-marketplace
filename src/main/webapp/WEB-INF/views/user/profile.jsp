<%-- 
    Document   : profile
    Created on : Jul 9, 2014, 8:05:44 PM
    Author     : 212395189
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello ${profile.firstName} ${profile.lastName}</h1>
        <img src="${profile.profilePictureUrl}" alt="profile image" />
    </body>
</html>
