<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form modelAttribute="registrationForm">

    <div id="createProfileContainer">

        <!-- Top Row -->
        <div class="row">
            <div class="col-sm-12">
                <div id="createProfileMenu"> Register Profile - Founder </div>
            </div>
        </div>

        <!-- Content Body -->
        <div class="row margin-top-20">

            <div class="col-md-6 padding-right-10">
                <div class="section-content section-content-left">
                    <h3 class="section-content-header">Founder Information</h3>

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
                            <label class="col-sm-4 control-label">Title at company: </label>
                            <div class="col-sm-8">
                                <form:input class="form-control input-sm" path="linkedInCurrentJobTitle" />
                                <form:errors class="help-block" path="linkedInCurrentJobTitle" cssClass="help-inline" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label">Education: </label>
                            <div class="col-sm-8 ">
                                <form:textarea class="form-control input-sm textarea-resize-none" path="education" rows="5" />
                                <form:errors class="help-block" path="education" cssClass="help-inline" />
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
                            <label class="col-sm-4 control-label">Expertise: </label>
                            <div class="col-sm-8">
                                <form:select cssClass="selectpicker" items="${expertiseList}" itemValue="id"
                                             itemLabel="expertise"  multiple="multiple" path="expertiseList" />
                                <form:errors class="help-block" path="expertiseList" cssClass="help-inline" />
                            </div>
                        </div>
                    </div>
                </div> 
            </div>
            <div class="col-md-6 padding-left-10">
                <div class="section-content section-content-right match-height-registration">
                    <h3 class="section-content-header">Company Information</h3>

                    <div class="section-content-body form-horizontal">
                        <div class="form-group">
                            <label class="col-sm-4 control-label">Company Name:</label>
                            <div class="col-sm-8">
                                <form:input class="form-control input-sm" path="linkedInCurrentCompany" />
                                <form:errors class="help-block" path="linkedInCurrentCompany" cssClass="help-inline" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label">Logo URL:</label>
                            <div class="col-sm-8">
                                <form:input class="form-control input-sm" path="logo" />
                                <form:errors class="help-block" path="logo" cssClass="help-inline" />
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

            <div class="col-xs-12">
                <div class="section-content section-content-left" id="section-content-center">
                    <h3 class="section-content-header">Story</h3>

                    <div class="row section-content-body">
                        <div class="col-xs-6 form-horizontal">
                            <div class="form-group">
                                <label class="col-sm-4 control-label">Tagline:</label>
                                <div class="col-sm-8">
                                    <form:input class="form-control input-sm" path="tagline" />
                                    <form:errors class="help-block" path="tagline" cssClass="help-inline" />
                                </div>
                            </div>

                            <div class="form-group">   
                                <label class="col-sm-4 control-label">Inspiration:</label>
                                <div class="col-sm-8">
                                    <form:textarea class="form-control input-sm textarea-resize-none" path="inspiration" />
                                    <form:errors class="help-block" path="inspiration" cssClass="help-inline" />
                                </div>
                            </div>

                            <div class="form-group">   
                                <label class="col-sm-4 control-label">Elevator Pitch:</label>
                                <div class="col-sm-8">
                                    <form:textarea class="form-control input-sm textarea-resize-none" path="elevatorPitch" rows="4" />
                                    <form:errors class="help-block" path="elevatorPitch" cssClass="help-inline" />
                                </div>
                            </div>

                            <div class="form-group">   
                                <label class="col-sm-4 control-label">Immediate Needs:</label>
                                <div class="col-sm-8">
                                    <form:textarea class="form-control input-sm textarea-resize-none" path="immediateNeeds" rows="2" />
                                    <form:errors class="help-block" path="immediateNeeds" cssClass="help-inline" />
                                </div>
                            </div>
                        </div>

                        <div class="col-xs-6 form-horizontal">
                            <div class="form-group">
                                <label class="col-sm-4 control-label">Status:</label>
                                <div class="col-sm-8">
                                    <form:textarea class="form-control input-sm textarea-resize-none" path="status" rows="1" />
                                    <form:errors class="help-block" path="status" cssClass="help-inline" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-4 control-label">Vision:</label>
                                <div class="col-sm-8">
                                    <form:textarea class="form-control input-sm textarea-resize-none" path="vision" rows="2" />
                                    <form:errors class="help-block" path="vision" cssClass="help-inline" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-4 control-label">What New Orleans means to you:</label>
                                <div class="col-sm-8">
                                    <form:textarea class="form-control input-sm textarea-resize-none" path="newOrleans" rows="4" />
                                    <form:errors class="help-block" path="newOrleans" cssClass="help-inline" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-4 control-label">Program Plan:</label>
                                <div class="col-sm-8">
                                    <form:textarea class="form-control input-sm textarea-resize-none" path="programPlan" rows="2" />
                                    <form:errors class="help-block" path="programPlan" cssClass="help-inline" />
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <spring:bind path="email">
        <form:hidden path="email" />
    </spring:bind>

    <spring:bind path="linkedInId">
        <form:hidden path="linkedInId" />
    </spring:bind>

    <spring:bind path="isAdmin">
        <form:hidden path="isAdmin" />
    </spring:bind>

    <spring:bind path="userType">
        <form:hidden path="userType" value="founder"  />
    </spring:bind>

    <form:hidden path="linkedInPictureURL" />

    <!-- Create Profile Button -->
    <div class="row margin-top-20 margin-bottom-20 padding-bottom-20 ">
        <div class="col-sm-12 padding-left-20 padding-right-20">
            <button class="btn btn-info" type="submit" id="createProfileButton">Create Profile</button>
        </div>
    </div>

</form:form>

<script type="text/javascript">
    require(['dropdown']);
</script>