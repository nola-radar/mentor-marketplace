<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Mentor Profile</title>

        <!-- BOOTSTRAP! -->
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="http://localhost:8080/mentormarketplace/resources/css/bootstrap-responsive.css" type="text/css" />
        <link rel="stylesheet" href="/mentormarketplace/resources/css/navigationBar.css"  type="text/css"/>
        <link rel="stylesheet" href="/mentormarketplace/resources/css/founderSocial.css"  type="text/css"/>

    </head>
    
    <body id="createBody">
        <%@include file="../nav.jsp" %>
        
        <div class="container" id="mfMainContainer">
            
            <br><br><br><br><br><br>
            <div class="container-fluid" id="mfSecondContainer">

                    <!-- Top Row -->
                    <div class="row">
                        <div class="col-sm-12">
                            <div id="mfRowOne"> 
                                <img src="${profile.profilePictureUrl}" id="mfImage"></img>
                                <h4 id="mfHOne"> ${mentor.getFirstName()} ${mentor.getLastName()}</h4>
                                <h5 id="mfHTwo"> ${mentor.getIndustry()} </h5>
                            </div>
                        </div>
                    </div>

                    <!-- Content Body -->
                    <br>
                    <div class="row">

                        <div class="col-xs-12 col-sm-6" id="mfRowThreeDivOne">

                            <div id="mfRowThreeDivTwo">
                                <a href="<c:url value="editMentor" />"><img src="/mentormarketplace/resources/img/edit.png" id="mfLinkOne" /></a>
                                <p> <strong>Website:</strong> &nbsp &nbsp ${mentor.getWebsite()} </p>
                                <p> <strong>Facebook:</strong> &nbsp &nbsp ${mentor.getFacebook()} </p>
                                <p> <strong>Twitter:</strong> &nbsp &nbsp ${mentor.getTwitter()} </p>
                                <p> <strong>Other Social Media:</strong> &nbsp &nbsp ${mentor.getOtherSocialMedia()} </p>
                                <p> <strong>Areas of Expertise:</strong> &nbsp &nbsp ${mentor.getAreasOfExpertise()} </p>
                            </div>

                        </div>

                        <div class="col-xs-12 col-sm-6" id="mfRowThreeDivThree">

                            <div id="mfRowThreeDivFour">
                                <a href="<c:url value="editMentor" />"><img src="/mentormarketplace/resources/img/edit.png" id="mfLinkTwo" /></a>
                                <p> <strong>Industry:</strong> &nbsp &nbsp ${mentor.getIndustry()} </p>
                                <p> <strong>Company:</strong> &nbsp &nbsp ${mentor.getLinkedInCurrentCompany()} </p>
                                <p> <strong>Job Title:</strong> &nbsp &nbsp ${mentor.getLinkedInCurrentJobTitle()} </p>
                            </div>

                            <div id="mfRowThreeDivFive">
                               <p> <strong>Background:</strong> &nbsp &nbsp ${mentor.getBackground()} </p>
                            </div>

                        </div>

                    </div>

                    <!-- Content Bottom -->
                    <br>
                    <div class="row">
                        <div class="col-xs-12 col-sm-12">

                            <div id="mfContentBottom">
                                <a href="<c:url value="editMentor" />"><img src="/mentormarketplace/resources/img/edit.png" style="padding:0;height:30px;width:30px;position:absolute;top:0;right:10px;" /></a>
                                
                            </div>

                        </div>
                    </div>
            </div>

                <!-- BOOTSTRAP! -->
                <script src="https://code.jquery.com/jquery-1.10.1.min.js"></script>
                <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.7/jquery-ui.min.js"></script>
                <script src="https://netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>

    </body>
</html>
