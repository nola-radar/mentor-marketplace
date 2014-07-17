<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8" name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
        <!--LinkedIn-->
        <script type="text/javascript" src="http://platform.linkedin.com/in.js">
            api_key: 756f7ogbvydmk2
            authorize: true
        </script>
         <script type="text/javascript">
           function linkedInLogOut() {
               
             IN.User.logout(function() {
            location.href = "http://localhost:8080/mentormarketplace"; 
             //window.location = "/logout";
             });
         }
        </script>
       
        <!-- BOOTSTRAP! -->
        <link rel="stylesheet" href="/mentormarketplace/resources/css/bootstrap.css"  type="text/css"/>
        <link rel="stylesheet" href="/mentormarkeplace/resources/css/bootstrap-responsive.css" type="text/css"/>
        
        <!--LinkedIn-->
        <link media="all" type="text/css" href="../css/streamin.css" rel="stylesheet"/>
        <link media="all" type="text/css" href="../css/jqueryui.css" rel="styleshpt" src="http://code.jquery.com/jquery-1.5b1.js"></script>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.7/jquery-ui.min.js"></script>
        
    </head>
    
    <body>
        <%@include file="../nav.jsp" %>
                    
        <form:form modelAttribute="mentor">    
        
        <div class="container-fluid" style="margin-right:70px;margin-left:70px;">
            <div class="row-fluid"><div class="span12"></div></div>
            <div class="row-fluid" style="padding:10px;height:20px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:lightgray;height:100%"></div>
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:lightgray;height:100%"></div>
            </div>
                
            <div class="row-fluid" style="padding:10px;height:100px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span2" style="margin-top:0px;margin-bottom:0px;background-color:lightgray;height:100%;position:relative;" id="mentor-picutre"></div>
                <div class="span8" style="margin-top:0px;margin-bottom:0px;background-color:lightgray;height:100%;position:relative;">
                    <h3 id="firstNameMentor" style="top:0;padding:0;margin:0;"></h3>
                    <p id="currentCompanyMentor" style="margin:0;"></p>
                    <p id="currentJobTitleMentor" style="margin:0;"></p>
                </div>
                <div class="span2" style="background-color:lightgray;height:100px;">
                    <p></p>
                    <p style="margin:0;padding:0;"><a href="#">Website</a></p> 
                    <p style="margin:0;padding:0;"><a href="#">Twitter</a></p>
                    <p style="margin:0;padding:0;"><a href="#">Facebook</a></p>
                </div>
            </div>
            
            <div class="row-fluid" style="padding:10px;height:200px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span6" style="margin-left:10px;margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%;position:relative;">
                    <a href="<c:url value="create" />"><img src="/mentormarketplace/resources/img/edit.png" style="padding:0;height:30px;width:30px;position:absolute;top:0;right:0;" /></a>
                    <center><h4><i class="icon-user"></i> Personal Details</h4></center>
                </div>
                <div class="span6" style="margin-left:10px;margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%;position:relative;">
                    <a href="<c:url value="create" />"><img src="/mentormarketplace/resources/img/edit.png" style="padding:0;height:30px;width:30px;position:absolute;top:0;right:0;" /></a>
                    <center><h4><i class="icon-road"></i> Background</h4></center>
                    <ul>
                        <li id="currentBackground"></li>
                    </ul>
                </div>
            </div>
            <div class="row-fluid" style="padding:10px;height:200px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span6" style="margin-left:10px;margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%;position:relative;">
                    <a href="<c:url value="create" />"><img src="/mentormarketplace/resources/img/edit.png" style="padding:0;height:30px;width:30px;position:absolute;top:0;right:0;" /></a>
                    <center><h4><i class="icon-bookmark"></i> Areas of Expertise</h4></center>
                    <ul>
                        <li id="industryMentor"></li>
                        <li>Consulting Expertise: </li>
                    </ul>
                </div>
                <div class="span6" style="margin-left:10px;margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%;"> 
                    <center><h4><i class="icon-globe"></i> Current Connections</h4></center>
                </div>
            </div>
            <div class="row-fluid" style="padding:10px;height:200px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span12" style="margin-top:0px;margin-bottom:0px;background-color:lightgray;height:100%;position:relative;">
                    <button class="btn btn-info" type="submit" style="background:#339900;width:150px;">
                        Create Profile
                    </button>
                </div>
            </div>
        </div>
                    
        <!-- hidden form fields that will be submitted if user approves linkedin auto-populate -->            
        <div style="display:none;">
            <spring:bind path="firstName">
                    <h6 style="margin:10px 0px;">
                        &nbsp; &nbsp; &nbsp; &nbsp; First Name: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                        <form:input path="firstName" class="input-large" style="left:0px;" />
                        <form:errors path="firstName" cssClass="help-inline" style="text-align:left;"/>
                    </h6>
            </spring:bind>

            <spring:bind path="lastName">
                    <h6 style="margin:10px 0px;">
                        &nbsp; &nbsp; &nbsp; &nbsp; Last Name: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                        <form:input path="lastName" class="input-large" style="left:0px;" />
                        <form:errors path="lastName" cssClass="help-inline" style="text-align:left;"/>
                    </h6>
            </spring:bind>

            <spring:bind path="linkedInCurrentCompany">
                    <h6 style="margin:10px 0px;">
                        &nbsp; &nbsp; &nbsp; &nbsp; Current Company: &nbsp; &nbsp; 
                        <form:input path="linkedInCurrentCompany" class="input-large" style="left:0px;" />
                        <form:errors path="linkedInCurrentCompany" cssClass="help-inline" style="text-align:left;"/>
                    </h6>
            </spring:bind>

            <spring:bind path="linkedInCurrentJobTitle">
                    <h6 style="margin:10px 0px;">
                        &nbsp; &nbsp; &nbsp; &nbsp; Current Job Title: &nbsp; &nbsp; &nbsp;
                        <form:input path="linkedInCurrentJobTitle" class="input-large" style="left:0px;" />
                        <form:errors path="linkedInCurrentJobTitle" cssClass="help-inline" style="text-align:left;"/>
                    </h6>
            </spring:bind>

            <spring:bind path="linkedInPictureURL">
                    <h6 style="margin:10px 0px;">
                        &nbsp; &nbsp; &nbsp; &nbsp; LinkedIn Picture: &nbsp; &nbsp; &nbsp;
                        <form:input path="linkedInPictureURL" class="input-large" style="left:0px;" />
                        <form:errors path="linkedInPictureURL" cssClass="help-inline" style="text-align:left;"/>
                    </h6>
            </spring:bind>
            <spring:bind path="industry">
                    <h6 style="margin:10px 0px;">
                        &nbsp; &nbsp; &nbsp; &nbsp; Industry: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                        <form:input path="industry" class="input-large" style="left:0px;" />
                        <form:errors path="industry" cssClass="help-inline" style="text-align:left;"/>
                    </h6>
            </spring:bind>

            <spring:bind path="areasOfExpertise">
                    <h6 style="margin:10px 0px;">
                        &nbsp; &nbsp; &nbsp; &nbsp; Expertise: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                        <form:input path="areasOfExpertise" class="input-large" style="left:0px;" />
                        <form:errors path="areasOfExpertise" cssClass="help-inline" style="text-align:left;"/>
                    </h6>
            </spring:bind>
        </div>
        
        </form:form>            
                
        <!--LinkedIn-->
        <div style="display:none;">
            <script type="IN/Login" data-onAuth="loadData"></script>
        </div>
        
        <script type="text/javascript" >
            function loadData() {
                IN.API.Profile("me")
                .fields(["id", "firstName", "lastName", "pictureUrl","headline","publicProfileUrl",
                         "industry","three-current-positions","summary"])
                .result(function(result) {
                 profile = result.values[0];
                 document.getElementById("firstNameMentor").textContent = profile.firstName.toString() + " " + profile.lastName.toString();
                 document.getElementById("currentBackground").textContent = profile.summary;
                 document.getElementById("currentCompanyMentor").textContent = profile.threeCurrentPositions.values[0].company.name;
                 document.getElementById("currentJobTitleMentor").textContent = profile.threeCurrentPositions.values[0].title;
                 document.getElementById("industryMentor").textContent = "Industry: " + profile.industry.toString();
                 document.getElementById("firstName").value = profile.firstName.toString();
                 document.getElementById("lastName").value = profile.lastName.toString();
                 document.getElementById("industry").value = profile.industry.toString();
                 document.getElementById("linkedInCurrentCompany").value = profile.threeCurrentPositions.values[0].company.name;
                 document.getElementById("linkedInCurrentJobTitle").value = profile.threeCurrentPositions.values[0].title;
                 
                 picHTML = "<img style=\"height:100px;width:120px;right:0;float:right;border-radius:10%;\" class=img_border align=\"left\" src=\"" + profile.pictureUrl + "\"></a>";      
                 $("#mentor-picutre").html(picHTML);
                });
            }
        </script>
        
        <!-- BOOTSTRAP! -->
        <script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>
        
    </body>
</html>