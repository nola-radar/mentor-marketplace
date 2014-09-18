<!-- Header -->
<%@include file="../header.jsp" %>

<!-- Navigation Bar -->
<%@include file="../shared/navigationBar.jsp" %>

<form:form modelAttribute="founderUpdateForm" action="editFounder">

    <div class="container" id="editMainContainer">
        <div id="editProfileMainContainer">

            <!-- Top Row -->
            <div class="row">
                <div class="col-sm-12">
                    <div id="createProfileMenu"> Edit Profile - Founder</div>
                </div>
            </div>

            <!-- Content Body -->
            <div class="row margin-top-20">
                <div class="col-sm-12">
                    <div class="col-md-6 padding-left-20 padding-right-10">
                        <div id="profileExperience">
                            <spring:bind path="website">
                                <label class="col-sm-3 control-label createProfileTopInputLabels">Website: </label>
                                <div class="col-sm-9 createProfileTopInputFields">
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

                            <spring:bind path="companyDetails">
                                <label class="col-sm-3 control-label createProfileTextAreaLabels">Company Description: </label>
                                <div class="col-sm-9 createProfileTextAreaFields">
                                    <form:textarea class="form-control input-sm" path="companyDetails" rows="2" />
                                    <form:errors class="help-block" path="companyDetails" cssClass="help-inline" />
                                </div>
                            </spring:bind>

                            <spring:bind path="newOrleans">
                                <label class="col-sm-3 control-label createProfileTextAreaLabels">New Orleans: </label>
                                <div class="col-sm-9 createProfileTextAreaFields">
                                    <form:textarea class="form-control input-sm" path="newOrleans" rows="2" />
                                    <form:errors class="help-block" path="newOrleans" cssClass="help-inline" />
                                </div>
                            </spring:bind>
                        </div>
                    </div>

                    <div class="col-md-6 padding-left-10 padding-right-20">
                        <div class="section-200 sm-margin-top-20" id="editProfileName">
                            <spring:bind path="firstName">
                                <label class="col-sm-3 control-label createProfileTopInputLabels">First Name: </label>
                                <div class="col-sm-9 createProfileTopInputFields">
                                    <form:input class="form-control input-sm" id="firstNameEdit" value='<%=request.getParameter("firstName")%>' path="firstName" rows="2" />
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
                        </div>

                        <div class="section-200" id="profileSocialInfo">
                            <spring:bind path="logo">
                                <label class="col-sm-3 control-label createProfileTopInputLabels">Logo: </label>
                                <div class="col-sm-9 createProfileTopInputFields">
                                    <form:input class="form-control input-sm" path="logo" rows="2" />
                                    <form:errors class="help-block" path="logo" cssClass="help-inline" />
                                </div>
                            </spring:bind>

                            <spring:bind path="tagline">
                                <label class="col-sm-3 control-label createProfileInputLabels">Tagline: </label>
                                <div class="col-sm-9 createProfileInputFields">
                                    <form:input class="form-control input-sm" path="tagline" rows="2" />
                                    <form:errors class="help-block" path="tagline" cssClass="help-inline" />
                                </div>
                            </spring:bind>

                            <spring:bind path="elevatorPitch">
                                <label class="col-sm-3 control-label createProfileTextAreaLabels">Elevator Pitch: </label>
                                <div class="col-sm-9 createProfileTextAreaFields">
                                    <form:textarea class="form-control input-sm" path="elevatorPitch" rows="2" />
                                    <form:errors class="help-block" path="elevatorPitch" cssClass="help-inline" />
                                </div>
                            </spring:bind>
                        </div>
                    </div>
                </div>
            </div>                 

            <!-- Bottom Content -->
            <div class="row margin-top-20">
                <div class="col-sm-12 padding-left-20 padding-right-20">
                    <div class="col-sm-12">

                        <!-- Bottom Content - Row 1 - Col 1 -->
                        <div id="profileSkills">

                            <spring:bind path="immediateNeeds">
                                <label class="col-sm-2 control-label createProfileTopTextAreaLabels">Immediate Needs: </label>
                                <div class="col-sm-10 createProfileTopTextAreaFields">
                                    <form:textarea class="form-control input-sm" path="immediateNeeds" rows="2" />
                                    <form:errors class="help-block" path="immediateNeeds" cssClass="help-inline" />
                                </div>
                            </spring:bind>

                            <spring:bind path="vision">
                                <label class="col-sm-2 control-label createProfileTextAreaLabels">Vision: </label>
                                <div class="col-sm-10 createProfileTextAreaFields">
                                    <form:textarea class="form-control input-sm" path="vision" rows="2" />
                                    <form:errors class="help-block" path="vision" cssClass="help-inline" />
                                </div>
                            </spring:bind>

                            <spring:bind path="status">
                                <label class="col-sm-2 control-label createProfileTextAreaLabels">Status: </label>
                                <div class="col-sm-10 createProfileTextAreaFields">
                                    <form:textarea class="form-control input-sm" path="status" rows="2" />
                                    <form:errors class="help-block" path="status" cssClass="help-inline" />
                                </div>
                            </spring:bind>

                        </div>
                    </div>
                </div>
            </div>

            <!-- Bottom Content -->
            <div class="row margin-top-20">
                <div class="col-sm-12 padding-left-20 padding-right-20">
                    <div class="col-sm-12">

                        <!-- Bottom Content - Row 1 - Col 1 -->
                        <div id="editProfileReports">

                            <spring:bind path="programPlan">
                                <label class="col-sm-2 control-label createProfileTopTextAreaLabels">Program Plan: </label>
                                <div class="col-sm-10 createProfileTopTextAreaFields">
                                    <form:textarea class="form-control" path="programPlan" rows="2" />
                                    <form:errors class="help-block" path="programPlan" cssClass="help-inline" />
                                </div>
                            </spring:bind>

                            <spring:bind path="weeklyReports">
                                <label class="col-sm-2 control-label createProfileTextAreaLabels">Weekly Reports: </label>
                                <div class="col-sm-10 createProfileTextAreaFields">
                                    <form:textarea class="form-control" path="weeklyReports" rows="2" />
                                    <form:errors class="help-block" path="weeklyReports" cssClass="help-inline" />
                                </div>
                            </spring:bind>

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

                        </div>
                    </div>
                </div>
            </div>

            <!-- Update Profile Button -->
            <div class="row margin-top-20 margin-bottom-20 padding-bottom-20 ">
                <div class="col-sm-12 padding-left-20 padding-right-20">  
                    <div class="col-sm-12">
                        <button class="btn btn-info" type="submit" id="editUpdateProfileButton">
                            Update Profile
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </div>

</form:form>

<script type="text/javascript">
    require(['dropdown']);
</script>

<!-- Footer -->
<%@include file="../footer.jsp" %>
