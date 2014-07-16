<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Founder Page</title>
    </head>
    <body>
        <h1>Founder ${founder.id}:</h1>
        
        <div>
            <b>First Name:</b> ${founder.firstName}
        </div>
        
        <div>
            <b>Last Name:</b> ${founder.lastName}
        </div>
        
        <div>
            <b>Industry:</b> ${founder.industry}
        </div>
        
        <div>
            <b>Areas of Expertise:</b> ${founder.areasOfExpertise}
        </div>
        
        <div>
            <b>Background:</b> ${founder.background}
        </div>
        
        <div>
            <b>Website:</b> ${founder.website}
        </div>
        
        <div>
            <b>Facebook:</b> ${founder.facebook}
        </div>
        
        <div>
            <b>Twitter:</b> ${founder.twitter}
        </div>
        
        <div>
            <b>Other Social Media:</b> ${founder.otherSocialMedia}
        </div>
        
        <div>
            <b>LinkedIn ID:</b> ${founder.linkedInId}
        </div>
        
        <div>
            <b>LinkedIn Picture URL:</b> ${founder.linkedInPictureURL}
        </div>
        
        <div>
            <b>LinkedIn Current Company:</b> ${founder.linkedInCurrentCompany}
        </div>
        
        <div>
            <b>LinkedIn Current Job Title:</b> ${founder.linkedInCurrentJobTitle}
        </div>
        
    </body>
</html>