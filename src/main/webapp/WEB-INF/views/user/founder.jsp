<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Founder Profile</title>

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
                            ${founder.getFirstName()} ${founder.getLastName()}
                            ${founder.getIndustry()}
                            
                            <a href="<c:url value="editMentor" />"><img src="/mentormarketplace/resources/img/edit.png" id="mfLinkOne" /></a>

                        </div>
                    </div>
                </div>

                <!-- Content Body -->

                <div class="row margin-top-20">

                    <div class="col-sm-12">

                        <div class="col-md-6 padding-left-20 padding-right-10">

                            <div id="profileSocialInfo">
                                <a href="<c:url value="editFounder" />"><img src="/mentormarketplace/resources/img/edit.png" id="mfLinkOne" /></a>
                                <table>
                                    <tr>
                                        <td><strong>Website:</strong></td>
                                        <td>${founder.getWebsite()}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Facebook:</strong></td>
                                        <td>${founder.getFacebook()}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Twitter:</strong></td>
                                        <td>${founder.getTwitter()}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Other Social Media:</strong></td>
                                        <td>${founder.getOtherSocialMedia()}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Areas of Expertise:</strong></td>
                                        <td>${founder.getAreasOfExpertise()}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Logo:</strong></td>
                                        <td>${founder.getLogo()}</td>
                                    </tr>
                                </table>
                            </div>

                        </div>

                        <div class="col-md-6 padding-left-10 padding-right-20">

                            <div class="section-200 sm-margin-top-20" id="createProfileFounderLogo">
                                <table>
                                    <tr>
                                        <td><strong>Elevator Pitch:</strong></td>
                                        <td>${founder.getElevatorPitch()}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Immediate Needs:</strong></td>
                                        <td>${founder.getImmediateNeeds()}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Company Details:</strong></td>
                                        <td>${founder.getCompanyDetails()}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Status:</strong></td>
                                        <td>${founder.getStatus()}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Vision:</strong></td>
                                        <td>${founder.getVision()}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>New Orleans:</strong></td>
                                        <td>${founder.getNewOrleans()}</td>
                                    </tr>
                                </table>
                            </div>

                            <div class="section-200" id="createProfileFounderLogo">
                                <table>
                                    <tr>
                                        <td><strong>Program Plan:</strong></td>
                                        <td>${founder.getProgramPlan()}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Weekly Reports:</strong></td>
                                        <td>${founder.getWeeklyReports()}</td>
                                    </tr>
                                </table>
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
        </div>
    </body>
</html>
