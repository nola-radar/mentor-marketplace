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
        <h1>New Founder:</h1>
        <form:form modelAttribute="founder" class="form-horizontal">
            <spring:bind path="linkedInId">
                <div class="control-group ${status.error ? 'error' : ''}">
                    <form:label path="linkedInId" class="control-label">
                        Linked In Id
                    </form:label>
                    <div class="controls">
                        <form:input path="linkedInId" class="input-large" />
                        <form:errors path="linkedInId" cssClass="help-inline" />
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
