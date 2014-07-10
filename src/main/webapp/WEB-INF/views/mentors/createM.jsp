<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
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
            <div class="control-group">
                <div class="controls">
                    <button class="btn btn-info" type="submit">
                        Submit
                    </button>
                </div>
            </div>
        </form:form>
    </body>
</html>
