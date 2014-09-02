<!-- Header -->
<%@include file="../header.jsp" %>

<!-- Navigation Bar -->
<%@include file="../shared/navigationBar.jsp" %>

<div class="container">

    <!-- Main Profile Container -->
    <div class="profileMainContainer">

        <!-- Logo Area -->
        <div class="profileLogoAndIndustryContent padding-top-20">
            <div class="col-xs-2 profileLogoContent">
                <img src="${founder.getLinkedInPictureUrl()}">
            </div>

            <div class="col-xs-10 profileIndustryContent">
                <h4> The Idea Village </h4>
                <c:forEach items="${founder.getIndustryList()}" var="industry">
                    <div>${industry.industry}</div>
                </c:forEach>
            </div>

            <!-- Header -->
            <div class="col-xs-12 profileHeader">
                <a href="<c:url value="edit" />" class="btn btn-success" id="profileEditButton"> EDIT PROFILE </a>
            </div>
        </div>

        <!-- Body Contents -->
        <div class="profileBodyContentContainer">
            <div id="profileBodyContent">
                <div class="row">
                    <div class="col-sm-12 margin-top-20">
                        <div class="col-md-6 padding-left-20 padding-right-10">

                            <!-- Founder Profile Experience Area -->
                            <div id="profileExperience">
                                <label class="col-xs-4 control-label profileTopLabels"> Website: </label>
                                <label class="col-xs-8 profileTopLabels" id= "profileDisplayText"> ${founder.getWebsite()} </label>

                                <label class="col-xs-4 control-label profileLabels"> Facebook: </label>
                                <label class="col-xs-8 profileLabels" id= "profileDisplayText"> ${founder.getFacebook()} </label>

                                <label class="col-xs-4 control-label profileLabels"> Twitter: </label>
                                <label class="col-xs-8 profileLabels" id= "profileDisplayText"> ${founder.getTwitter()} </label>

                                <label class="col-xs-4 cotrol-label profileTextAreaLabels"> Other Social Media: </label>
                                <label class="col-xs-8 profileTextAreaLabels" id= "profileDisplayText"> ${founder.getOtherSocialMedia()} </label>

                                <label class="col-xs-4 control-label profileTextAreaLabels"> Company Details: </label>
                                <label class="col-xs-8 profileTextAreaLabels" id= "profileDisplayText"> ${founder.getCompanyDetails()} </label>

                                <label class="col-xs-4 control-label profileTextAreaLabels"> New Orleans: </label>
                                <label class="col-xs-8 profileTextAreaLabels" id= "profileDisplayText"> ${founder.getNewOrleans()} </label>
                            </div>
                        </div>

                        <div class="col-md-6 padding-left-10 padding-right-20">

                            <!-- Founder Profile Image Area -->
                            <div class="section-200 sm-margin-top-20" id="profileName">
                                <label class="col-xs-8 control-label profileNameLabels">
                                    ${founder.getFirstName()} ${founder.getLastName()}
                                </label>

                                <div class="col-xs-4 profileImageLabels">
                                    <img id="profileNameImage" src="${founder.getLinkedInPictureUrl()}">
                                </div>
                            </div>

                            <!-- Founder Profile Social Area -->
                            <div class="section-200" id="profileSocialInfo">
                                <label class="col-xs-4 control-label profileTopLabels"> Logo: </label>
                                <label class="col-xs-8 profileTopLabels" id= "profileDisplayText" id= "profileDisplayText"> ${founder.getLogo()} </label>

                                <label class="col-xs-4 control-label profileTextAreaLabels"> Elevator Pitch: </label>
                                <label class="col-xs-8 profileTextAreaLabels" id= "profileDisplayText"> ${founder.getElevatorPitch()} </label>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-sm-12 margin-top-20 padding-left-20 padding-right-20">

                    <!-- Bottom Content -->
                    <div id="profileSkills">
                        <label class="col-xs-4 control-label profileTopTextAreaLabels"> Immediate Needs: </label>
                        <label class="col-xs-8 profileTopTextAreaLabels" id= "profileDisplayText"> ${founder.getImmediateNeeds()} </label>

                        <label class="col-xs-4 control-label profileTextAreaLabels"> Vision: </label>
                        <label class="col-xs-8 profileTextAreaLabels" id= "profileDisplayText"> ${founder.getVision()} </label>

                        <label class="col-xs-4 control-label profileTextAreaLabels"> Areas of Expertise: </label>
                        <label class="col-xs-8 profileTextAreaLabels" id= "profileDisplayText">
                            <c:forEach items="${founder.getExpertiseList()}" var="expertise">
                                <p>${expertise.expertise}</p>
                            </c:forEach>
                        </label>
                    </div>
                </div> 

                <div class="col-sm-12 margin-top-20 padding-left-20 padding-right-20">

                    <!-- Bottom Content -->
                    <div id="profileReports">
                        <label class="col-xs-4 control-label profileTopTextAreaLabels"> Status: </label>
                        <label class="col-xs-8 profileTopTextAreaLabels" id= "profileDisplayText"> ${founder.getStatus()} </label>

                        <label class="col-xs-4 control-label profileTextAreaLabels"> Program Plan: </label>
                        <label class="col-xs-8 profileTextAreaLabels" id= "profileDisplayText"> ${founder.getProgramPlan()} </label>

                        <label class="col-xs-4 control-label profileTextAreaLabels"> Weekly Reports: </label>
                        <label class="col-xs-8 profileTextAreaLabels" id= "profileDisplayText"> ${founder.getWeeklyReports()} </label>
                    </div>
                </div>
            </div> <!-- End of Body Contents -->
        </div> <!-- End of Body Contents Container -->
    </div> <!-- End of Main Profile Container -->
</div>

<!-- Footer -->
<%@include file="../footer.jsp" %>
