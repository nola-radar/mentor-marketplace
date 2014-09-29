<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form modelAttribute="registrationForm">

    <div id="createProfileContainer">

        <!-- Top Row -->
        <div class="row">
            <div class="col-sm-12">
                <div id="createProfileMenu"> Register Profile - Mentor </div>
            </div>
        </div>

        <!-- Content Body -->
        <div class="row margin-top-20">        

            <div class="col-md-6 padding-right-10">
                <div class="section-content section-content-left match-height-registration-mentor">
                    <h3 class="section-content-header">Mentor Information</h3>
                    <div class="section-content-body form-horizontal">

                        <div class="form-group">
                            <label class="col-sm-4 control-label">First Name:</label>
                            <div class="col-sm-8">
                                <form:input class="form-control input-sm" path="firstName" />
                                <form:errors class="help-block" path="firstName" cssClass="help-inline" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label">Last Name:</label>
                            <div class="col-sm-8">
                                <form:input class="form-control input-sm" path="lastName" />
                                <form:errors class="help-block" path="lastName" cssClass="help-inline" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label">Area(s) of Expertise: </label>
                            <div class="col-sm-8">
                                <form:select cssClass="selectpicker" items="${expertiseList}" itemValue="id"
                                             itemLabel="expertise"  multiple="multiple" path="expertiseList" />
                                <form:errors class="help-block" path="expertiseList" cssClass="help-inline" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label">Website:</label>
                            <div class="col-sm-8">
                                <form:input class="form-control input-sm" path="website" />
                                <form:errors class="help-block" path="website" cssClass="help-inline" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label">Facebook:</label>
                            <div class="col-sm-8">
                                <form:input class="form-control input-sm" path="facebook" />
                                <form:errors class="help-block" path="facebook" cssClass="help-inline" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label">Twitter:</label>
                            <div class="col-sm-8">
                                <form:input class="form-control input-sm" path="twitter" />
                                <form:errors class="help-block" path="twitter" cssClass="help-inline" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label">Other Social Media:</label>
                            <div class="col-sm-8">
                                <form:input class="form-control input-sm" path="otherSocialMedia" />
                                <form:errors class="help-block" path="otherSocialMedia" cssClass="help-inline" />
                            </div>
                        </div>

                    </div>                        
                </div>
            </div>
            <div class="col-md-6 padding-left-10">
                <div class="section-content section-content-right">
                    <h3 class="section-content-header">Background</h3>    
                    <div class="section-content-body form-horizontal">

                        <div class="form-group">
                            <label class="col-sm-4 control-label">Current Company Name:</label>
                            <div class="col-sm-8">
                                <form:input class="form-control input-sm" path="linkedInCurrentCompany" />
                                <form:errors class="help-block" path="linkedInCurrentCompany" cssClass="help-inline" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label">Industry: </label>
                            <div class="col-sm-8">
                                <form:select cssClass="selectpicker" items="${industryList}" itemValue="id"
                                             itemLabel="industry" multiple="multiple" path="industryList" />
                                <form:errors class="help-block" path="industryList" cssClass="help-inline" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label">Title at company: </label>
                            <div class="col-sm-8">
                                <form:input class="form-control input-sm" path="linkedInCurrentCompany" />
                                <form:errors class="help-block" path="lastName" cssClass="help-inline" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label">Experience: </label>
                            <div class="col-sm-8">
                                <form:textarea class="form-control input-sm textarea-resize-none" path="experience" rows="5" />
                                <form:errors class="help-block" path="experience" cssClass="help-inline" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label">Education: </label>
                            <div class="col-sm-8 ">
                                <form:textarea class="form-control input-sm textarea-resize-none" path="education" rows="5" />
                                <form:errors class="help-block" path="education" cssClass="help-inline" />
                            </div>
                        </div>

                    </div>                 
                </div>
            </div>
        </div>
    </div>

    <form:hidden path="userType" value="mentor"  />

    <!-- Create Profile Button -->
    <div class="row margin-top-20 margin-bottom-20 padding-bottom-20 ">
        <div class="col-sm-12 padding-left-20 padding-right-20">  
            <div class="col-sm-12">
                <button class="btn btn-info" type="submit" id="createProfileButton">
                    Create Profile
                </button>
            </div>
        </div>
    </div>
</form:form>
