<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <h1>Register User</h1>
        <form:form modelAttribute="registrationForm" class="form-horizontal">
            <spring:bind path="email">
                <div class="control-group ${status.error ? 'error' : ''}">
                    <form:label path="email" class="control-label">
                        Email
                    </form:label>
                    <div class="controls">
                        <form:input path="email" class="input-large" />
                        <form:errors path="email" cssClass="help-inline" />
                    </div>
                </div>
            </spring:bind>
            <spring:bind path="linkedInId">
                <form:hidden path="linkedInId" />
            </spring:bind>
            
            <div class="control-group">
                <div class="controls">
                    <button class="btn btn-info" type="submit">
                        Submit
                    </button>
                </div>
            </div>
        </form:form>
    </body>
</html>-->
