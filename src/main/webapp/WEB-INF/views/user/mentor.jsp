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
<<<<<<< HEAD

        <div class="container" id="editMainContainer">

            <div id="profileMainContainer">
=======
        <div class="container" id="registerMainContainer">
            <br><br><br><br><br>
            <div id="displayMentorMainContainer">
>>>>>>> 9908185e734f9b09a919eb2d3ed388366d9a43d0

                <!-- Top Row -->
                <div class="row">

                    <div class="col-sm-12">
<<<<<<< HEAD

                        <div id="mfRowOne"> 
                             <img src="${profile.profilePictureUrl}" id="mfImage"></img>
                            ${mentor.getFirstName()} ${mentor.getLastName()}
                            ${mentor.getIndustry()}
                            
                            <a href="<c:url value="editMentor" />"><img src="/mentormarketplace/resources/img/edit.png" id="mfLinkOne" /></a>
=======
                        <div id="displayMentorRowOne">
                            <img src="${profile.profilePictureUrl}" id="mfImage"></img>
                            <h4 id="mfHOne"> ${mentor.getFirstName()} ${mentor.getLastName()}</h4>
                            <h5 id="mfHTwo"> ${mentor.getIndustry()} </h5>
>>>>>>> 9908185e734f9b09a919eb2d3ed388366d9a43d0
                        </div>
                    </div>
                </div>

                <!-- Content Body -->

<<<<<<< HEAD
                <div class="row margin-top-20">

                    <div class="col-sm-12">

                        <div class="col-md-6 padding-left-20 padding-right-10">

                            <div id="profileSocialInfo">
                                <p> <strong>Website:</strong> &nbsp &nbsp ${mentor.getWebsite()} </p>
                                <p> <strong>Facebook:</strong> &nbsp &nbsp ${mentor.getFacebook()} </p>
                                <p> <strong>Twitter:</strong> &nbsp &nbsp ${mentor.getTwitter()} </p>
                                <p> <strong>Other Social Media:</strong> &nbsp &nbsp ${mentor.getOtherSocialMedia()} </p>
                                <p> <strong>Areas of Expertise:</strong> &nbsp &nbsp ${mentor.getAreasOfExpertise()} </p>
=======
                </div>


                <!-- Content Body -->

                <div class="row margin-top-20">

                    <div class="col-sm-12">

                        <div class="col-md-6 padding-left-20 padding-right-10">

                            <div Id="displayMentorFirstNameDiv">
                                <a href="<c:url value="editMentor" />"><img src="/mentormarketplace/resources/img/edit.png" id="mfLinkOne" /></a>
                                <table>
                                    <tr>
                                        <td><strong>Website:</strong></td>
                                        <td>${mentor.getWebsite()}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Facebook:</strong></td>
                                        <td>${mentor.getFacebook()}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Twitter:</strong></td>
                                        <td>${mentor.getTwitter()}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Other Social Media:</strong></td>
                                        <td>${mentor.getOtherSocialMedia()}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Areas of Expertise:</strong></td>
                                        <td>${mentor.getAreasOfExpertise()}</td>
                                    </tr>
                                </table>
>>>>>>> 9908185e734f9b09a919eb2d3ed388366d9a43d0
                            </div>

                        </div>

                        <div class="col-md-6 padding-left-10 padding-right-20">

<<<<<<< HEAD
                            <div class="section-200 sm-margin-top-20" id="mfRowThreeDivFour">
                                <p> <strong>Industry:</strong> &nbsp &nbsp ${mentor.getIndustry()} </p>
                                <p> <strong>Company:</strong> &nbsp &nbsp ${mentor.getLinkedInCurrentCompany()} </p>
                                <p> <strong>Job Title:</strong> &nbsp &nbsp ${mentor.getLinkedInCurrentJobTitle()} </p>
                            </div>

                            <div class="section-200" id="mfRowThreeDivFive">
                                <p> <strong>Background:</strong> &nbsp &nbsp ${mentor.getBackground()} </p>
=======
                            <div class="section-200 sm-margin-top-20" id="displayMentorCompanyDiv">
                                <table>
                                    <tr>
                                        <td><strong>Industry:</strong></td>
                                        <td>${mentor.getIndustry()}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Company:</strong></td>
                                        <td>${mentor.getLinkedInCurrentCompany()}</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Job Title:</strong></td>
                                        <td>${mentor.getLinkedInCurrentJobTitle()}</td>
                                    </tr>
                                </table>
                            </div>

                            <div class="section-200">
                                <table>
                                    <tr>
                                        <td><strong>Background:</strong></td>
                                        <td>${mentor.getBackground()}</td>
                                    </tr>
                                </table>
>>>>>>> 9908185e734f9b09a919eb2d3ed388366d9a43d0
                            </div>

                        </div>
                    </div>
                </div>

                <!-- Content Bottom -->
                <div class="row margin-top-20">

<<<<<<< HEAD
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
=======
                </div>

                <div class="row margin-top-20 margin-bottom-20 padding-bottom-20 ">

                </div>

            </div>

>>>>>>> 9908185e734f9b09a919eb2d3ed388366d9a43d0

        <!-- BOOTSTRAP! -->
        <script src="https://code.jquery.com/jquery-1.10.1.min.js"></script>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.7/jquery-ui.min.js"></script>
        <script src="https://netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>
        </div>
    </body>
</html>
