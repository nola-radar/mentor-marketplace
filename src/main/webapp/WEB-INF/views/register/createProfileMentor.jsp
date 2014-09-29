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
            <div class="col-sm-12">
                <div class="col-md-6 padding-left-20 padding-right-10">
                    <div id="createProfileMentorSocialInfo">

                        <spring:bind path="firstName">
                            <label class="col-sm-3 control-label createProfileTopInputLabels">First Name: </label>
                            <div class="col-sm-9 createProfileTopInputFields">
                                <form:input class="form-control input-sm" path="firstName" rows="2" />
                                <form:errors class="help-block" path="firstName" cssClass="help-inline" />
                            </div>
                        </spring:bind>

                        <spring:bind path="lastName">
                            <label class="col-sm-3 control-label createProfileInputLabels">Last Name: </label>
                            <div class="col-sm-9 createProfileInputFields">
                                <form:input class="form-control input-sm" path="lastName" rows="2" />
                                <form:errors class="help-block" path="lastName" cssClass="help-inline" />
                            </div>
                        </spring:bind>

                        <spring:bind path="website">
                            <label class="col-sm-3 control-label createProfileInputLabels">Website: </label>
                            <div class="col-sm-9 createProfileInputFields">
                                <form:input class="form-control input-sm" path="website" rows="2" />
                                <form:errors class="help-block" path="website" cssClass="help-inline" />
                            </div>
                        </spring:bind>

                        <spring:bind path="facebook">
                            <label class="col-sm-3 control-label createProfileInputLabels">Facebook: </label>
                            <div class="col-sm-9 createProfileInputFields">
                                <form:input class="form-control input-sm" path="facebook" rows="2" />
                                <form:errors class="help-block" path="facebook" cssClass="help-inline" />
                            </div>
                        </spring:bind>

                        <spring:bind path="twitter">
                            <label class="col-sm-3 control-label createProfileInputLabels">Twitter: </label>
                            <div class="col-sm-9 createProfileInputFields">
                                <form:input class="form-control input-sm" path="twitter" rows="2" />
                                <form:errors class="help-block" path="twitter" cssClass="help-inline" />
                            </div>
                        </spring:bind>

                        <spring:bind path="otherSocialMedia">
                            <label class="col-sm-3 control-label createProfileTextAreaLabels">Other Social Media: </label>
                            <div class="col-sm-9 createProfileTextAreaFields">
                                <form:textarea class="form-control input-sm" path="otherSocialMedia" rows="2" />
                                <form:errors class="help-block" path="otherSocialMedia" cssClass="help-inline" />
                            </div>
                        </spring:bind>
                    </div>
                </div>

                <div class="col-md-6 padding-left-10 padding-right-20">
                    <div class="section-200 sm-margin-top-20" id="createProfileMentorCompany">

                        <spring:bind path="linkedInCurrentCompany">
                            <label class="col-sm-3 control-label createProfileTopInputLabels">Current Company: </label>
                            <div class="col-sm-9 createProfileTopInputFields">
                                <form:input class="form-control input-sm" path="linkedInCurrentCompany" rows="2" />
                                <form:errors class="help-block" path="linkedInCurrentCompany" cssClass="help-inline" />
                            </div>
                        </spring:bind>

                        <spring:bind path="linkedInCurrentJobTitle">
                            <label class="col-sm-3 control-label createProfileInputLabels">Current Job Title: </label>
                            <div class="col-sm-9 createProfileInputFields">
                                <form:input class="form-control input-sm" path="linkedInCurrentJobTitle" rows="2" />
                                <form:errors class="help-block" path="linkedInCurrentJobTitle" cssClass="help-inline" />
                            </div>
                        </spring:bind>
                    </div>

                    <div class="section-200">

                        <spring:bind path="experience">
                            <label class="col-sm-3 control-label createProfileTopInputLabels">Experience: </label>
                            <div class="col-sm-9 createProfileTopInputFields">
                                <form:input class="form-control input-sm" path="experience" rows="2" />
                                <form:errors class="help-block" path="experience" cssClass="help-inline" />
                            </div>
                        </spring:bind>

                        <spring:bind path="education">
                            <label class="col-sm-3 control-label createProfileTopInputLabels">Education: </label>
                            <div class="col-sm-9 createProfileTopInputFields">
                                <form:input class="form-control input-sm" path="education" rows="2" />
                                <form:errors class="help-block" path="education" cssClass="help-inline" />
                            </div>
                        </spring:bind>

                    </div>
                </div>
            </div>
        </div>

        <!-- Content Bottom -->
        <div class="row margin-top-20">
            <div class="col-sm-12 padding-left-20 padding-right-20">
                <div class="col-sm-12">
                    <div id="createProfileMentorIndustry">

                        <label class="col-sm-2 control-label createProfileInputLabels">Industry:</label>
                        <div class="col-sm-10 createProfileInputFields">
                            <form:select cssClass="selectpicker" items="${industryList}" itemValue="id"
                                         itemLabel="industry"  multiple="multiple" path="industryList">                                   
                            </form:select>
                            <form:errors class="help-block" path="industryList" cssClass="help-inline" />
                        </div>

                        <label class="col-sm-2 control-label">Expertise: </label>
                        <div class="col-sm-10 createProfileInputFields">
                            <form:select cssClass="selectpicker" items="${expertiseList}" itemValue="id"
                                         itemLabel="expertise"  multiple="multiple" path="expertiseList">                                   
                            </form:select>
                            <form:errors class="help-block" path="expertiseList" cssClass="help-inline" />
                        </div>

                        <form:hidden path="userType" value="mentor"  />

                    </div>
                </div>
            </div>
        </div>

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
    </div>
</form:form>
