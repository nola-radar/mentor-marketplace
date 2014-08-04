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
        <link rel="stylesheet" href="/mentormarketplace/resources/css/navigationBar.css"  type="text/css"/>
        <link rel="stylesheet" href="/mentormarketplace/resources/css/founderSocial.css"  type="text/css"/>

    </head>

    <body id="createBody">

        <%@include file="../nav.jsp" %>

        <div class="container" id="editMainContainer">

            <div id="profileMainContainer">

                <!-- Top Row -->
                <div class="row">

                    <div class="col-sm-12">

                        <div id="mfRowOne"> 
                             <img src="${profile.profilePictureUrl}" id="mfImage"></img>
                            ${mentor.getFirstName()} ${mentor.getLastName()}
                            ${mentor.getIndustry()}
                            
                            <a href="<c:url value="editMentor" />"><img src="/mentormarketplace/resources/img/edit.png" id="mfLinkOne" /></a>
                        </div>
                    </div>
                </div>

                <!-- Content Body -->

                <div class="row margin-top-20">

                    <div class="col-sm-12">

                        <div class="col-md-6 padding-left-20 padding-right-10">

                            <div id="profileSocialInfo">
                                <p> <strong>Website:</strong> &nbsp &nbsp ${mentor.getWebsite()} </p>
                                <p> <strong>Facebook:</strong> &nbsp &nbsp ${mentor.getFacebook()} </p>
                                <p> <strong>Twitter:</strong> &nbsp &nbsp ${mentor.getTwitter()} </p>
                                <p> <strong>Other Social Media:</strong> &nbsp &nbsp ${mentor.getOtherSocialMedia()} </p>
                                <p> <strong>Areas of Expertise:</strong> &nbsp &nbsp ${mentor.getAreasOfExpertise()} </p>
                            </div>

                        </div>

                        <div class="col-md-6 padding-left-10 padding-right-20">

                            <div class="section-200 sm-margin-top-20" id="mfRowThreeDivFour">
                                <p> <strong>Industry:</strong> &nbsp &nbsp ${mentor.getIndustry()} </p>
                                <p> <strong>Company:</strong> &nbsp &nbsp ${mentor.getLinkedInCurrentCompany()} </p>
                                <p> <strong>Job Title:</strong> &nbsp &nbsp ${mentor.getLinkedInCurrentJobTitle()} </p>
                            </div>

                            <div class="section-200" id="mfRowThreeDivFive">
                                <p> <strong>Background:</strong> &nbsp &nbsp ${mentor.getBackground()} </p>
                            </div>

                        </div>
                    </div>
                </div>

                <!-- Content Bottom -->
                <div class="row margin-top-20">

                    <div class="col-sm-12 padding-left-20 padding-right-20">

                        <div class="col-sm-12">

                            <div id="mfContentBottom">
                            
                            </div>

                        </div>
                                
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
