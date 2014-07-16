<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mentor Profile Page</title>
    </head>
    <body>
        <h1>Mentor ${mentor.id}:</h1>
        
        <div>
            <b>First Name:</b> ${mentor.firstName}
        </div>
        
        <div>
            <b>Last Name:</b> ${mentor.lastName}
        </div>
        
        <div>
            <b>Industry:</b> ${mentor.industry}
        </div>
        
        <div>
            <b>Areas of Expertise:</b> ${mentor.areasOfExpertise}
        </div>
        
        <div>
            <b>LinkedIn ID:</b> ${mentor.linkedInId}
        </div>
        
        <div>
            <b>LinkedIn Picture URL:</b> ${mentor.linkedInPictureURL}
        </div>
        
        <div>
            <b>LinkedIn Current Company:</b> ${mentor.linkedInCurrentCompany}
        </div>
        
        <div>
            <b>LinkedIn Current Job Title:</b> ${mentor.linkedInCurrentJobTitle}
        </div>
        
    </body>
</html>
