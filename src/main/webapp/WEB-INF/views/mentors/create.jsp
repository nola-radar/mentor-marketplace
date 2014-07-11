<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
    </head>
    <body>
        
        <script type="IN/Login" data-onAuth="loadData"></script>
        
        <h1>New Mentor:</h1>
        <form:form modelAttribute="mentor" class="form-horizontal">
            
            <spring:bind path="firstName">
                <div class="control-group ${status.error ? 'error' : ''}">
                    <form:label path="firstName" class="control-label">
                        First Name
                    </form:label>
                    <div class="controls">
                        <form:input path="firstName" class="input-large" />
                        <form:errors path="firstName" cssClass="help-inline" />
                    </div>
                </div>
            </spring:bind>
            
            <spring:bind path="lastName">
                <div class="control-group ${status.error ? 'error' : ''}">
                    <form:label path="lastName" class="control-label">
                        Last Name
                    </form:label>
                    <div class="controls">
                        <form:input path="lastName" class="input-large" />
                        <form:errors path="lastName" cssClass="help-inline" />
                    </div>
                </div>
            </spring:bind>
            
            <spring:bind path="industry">
                <div class="control-group ${status.error ? 'error' : ''}">
                    <form:label path="industry" class="control-label">
                        Industry
                    </form:label>
                    <div class="controls">
                        <form:input path="industry" class="input-large" />
                        <form:errors path="industry" cssClass="help-inline" />
                    </div>
                </div>
            </spring:bind>
            
            <spring:bind path="areasOfExpertise">
                <div class="control-group ${status.error ? 'error' : ''}">
                    <form:label path="areasOfExpertise" class="control-label">
                        Areas of Expertise
                    </form:label>
                    <div class="controls">
                        <form:input path="areasOfExpertise" class="input-large" />
                        <form:errors path="areasOfExpertise" cssClass="help-inline" />
                    </div>
                </div>
            </spring:bind>
            
            <spring:bind path="linkedInId">
                <div class="control-group ${status.error ? 'error' : ''}">
                    <form:label path="linkedInId" class="control-label">
                        LinkedIn ID
                    </form:label>
                    <div class="controls">
                        <form:input path="linkedInId" class="input-large" />
                        <form:errors path="linkedInId" cssClass="help-inline" />
                    </div>
                </div>
            </spring:bind>
            
            <spring:bind path="linkedInPictureURL">
                <div class="control-group ${status.error ? 'error' : ''}">
                    <form:label path="linkedInPictureURL" class="control-label">
                        LinkedIn Picture URL
                    </form:label>
                    <div class="controls">
                        <form:input path="linkedInPictureURL" class="input-large" />
                        <form:errors path="linkedInPictureURL" cssClass="help-inline" />
                    </div>
                </div>
            </spring:bind>
            
            <spring:bind path="linkedInCurrentCompany">
                <div class="control-group ${status.error ? 'error' : ''}">
                    <form:label path="linkedInCurrentCompany" class="control-label">
                        LinkedIn Current Company
                    </form:label>
                    <div class="controls">
                        <form:input path="linkedInCurrentCompany" class="input-large" />
                        <form:errors path="linkedInCurrentCompany" cssClass="help-inline" />
                    </div>
                </div>
            </spring:bind>
            
            <spring:bind path="linkedInCurrentJobTitle">
                <div class="control-group ${status.error ? 'error' : ''}">
                    <form:label path="linkedInCurrentJobTitle" class="control-label">
                        LinkedIn Current Job Title
                    </form:label>
                    <div class="controls">
                        <form:input path="linkedInCurrentJobTitle" class="input-large" />
                        <form:errors path="linkedInCurrentJobTitle" cssClass="help-inline" />
                    </div>
                </div>
            </spring:bind>
            
            <div class="control-group">
                <div class="controls">
                    <button class="btn btn-info" type="submit">
                        Submit
                    </button>
                </div>
            </div>
        </form:form>
        
        <!-- This is the script for populating the fields with linkedin data
             It is placed at the bottom of the form to allow fields to load 
             before being populated -->
        
        <script type="text/javascript">
            function loadData() {
                IN.API.Profile("me")
                .fields(["id", "firstName", "lastName", "pictureUrl","headline","publicProfileUrl",
                         "industry"])
                .result(function(result) {
                  profile = result.values[0];
                 
                 document.getElementById("firstName").value = profile.firstName.toString();
                 document.getElementById("lastName").value = profile.lastName.toString();
                 document.getElementById("industry").value = profile.industry.toString();
                 document.getElementById("linkedInId").value = profile.id.toString();
                 if(profile.pictureUrl === null){
                 document.getElementById("linkedInPictureURL").value = profile.pictureURL.toString();
             }
                 document.getElementById("linkedInCurrentJobTitle").value = profile.headline.toString();
                 

                });
            }
        </script>
        
        
    </body>
</html>
