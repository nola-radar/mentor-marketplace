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
        <link rel="stylesheet" href="http://localhost:8080/mentormarketplace/resources/css/bootstrap-responsive.css" type="text/css" />
        <link rel="stylesheet" href="/mentormarketplace/resources/css/ivmm.css"  type="text/css"/>
    </head>
    
    <body id="createBody">
        <%@include file="../nav.jsp" %>
        
        <div class="container" style="background-color:#f6f6f6;">
            
            <br><br><br><br><br><br>
            <div class="container-fluid" style="margin-right:70px;margin-left:70px;padding-right:2px;padding-left:7px;background-color:#ffffff;">

                    <!-- Top Row -->
                    <div class="row">

                        <div class="col-sm-12">
                            <div style="background-color:#203747;height:50px;"> 
                                <img src="${profile.profilePictureUrl}" style="bottom:20px;left:40px;position:absolute;height:120px;width:120px;"></img>
                                <h4 style="bottom:80px;left:170px;position:absolute;"> ${founder.getFirstName()} ${founder.getLastName()}</h4>
                                <h5 style="bottom:60px;left:170px;position:absolute;"> ${founder.getIndustry()} </h5>
                            </div>
                        </div>

                    </div>

                    <!-- Content Body -->
                    <br>
                    <div class="row">

                        <div class="col-xs-12 col-sm-6" style="padding-right:5px;">

                            <div  style="background-color:#f6f6f6;; height:500px;">
                                <p> <strong>Website:</strong> &nbsp &nbsp ${founder.getWebsite()} </p>
                                <p> <strong>Facebook:</strong> &nbsp &nbsp ${founder.getFacebook()} </p>
                                <p> <strong>Twitter:</strong> &nbsp &nbsp ${founder.getTwitter()} </p>
                                <p> <strong>Areas of Expertise:</strong> &nbsp &nbsp ${founder.getAreasOfExpertise()} </p>
                                <p> <strong>Logo:</strong> &nbsp &nbsp ${founder.getLogo()} </p>
                            </div>

                        </div>

                        <div class="col-xs-12 col-sm-6" style="padding-left:5px;">

                            <div style="background-color:white;height:250px;">
                                <p> <strong>Elevator Pitch:</strong> &nbsp &nbsp ${founder.getElevatorPitch()} </p>
                                <p> <strong>Immediate Needs:</strong> &nbsp &nbsp ${founder.getImmediateNeeds()} </p>
                                <p> <strong>Company Details:</strong> &nbsp &nbsp ${founder.getCompanyDetails()} </p>
                            </div>

                            <div style="background-color:#f6f6f6;; height:250px;">
                               <p> <strong>Inspiration:</strong> &nbsp &nbsp ${founder.getInspiration()} </p>
                               <p> <strong>Status:</strong> &nbsp &nbsp ${founder.getStatus()} </p>
                               <p> <strong>Vision:</strong> &nbsp &nbsp ${founder.getVision()} </p>
                               <p> <strong>New Orleans:</strong> &nbsp &nbsp ${founder.getNewOrleans()} </p>
                            </div>

                        </div>

                    </div>

                    <!-- Content Bottom -->
                    <br>
                    <div class="row">
                        <div class="col-xs-12 col-sm-12">

                            <div style="padding:10px;background-color:#f6f6f6;; height:300px;">
                                <p> <strong>Program Plan:</strong> &nbsp &nbsp ${founder.getProgramPlan()} </p>
                                <p> <strong>Weekly Reports:</strong> &nbsp &nbsp ${founder.getWeeklyReports()} </p>
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


