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
                <img src="<c:url value="/resources/img/Profile_Logo.png" />" id="profileLogoImage"/>
            </div>

            <div class="col-xs-10 profileIndustryContent">
                <h4> The Idea Village </h4>
                <p> ${founder.getIndustry()} </p>
            </div>

            <!-- Header -->
            <div class="col-xs-12 profileHeader">
                <a href="<c:url value="editFounder" />" class="btn btn-success" id="profileEditButton"> EDIT PROFILE </a>
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
                                <label class="col-xs-8 profileTopLabels"> ${founder.getWebsite()} </label>

                                <label class="col-xs-4 control-label profileLabels"> Facebook: </label>
                                <label class="col-xs-8 profileLabels"> ${founder.getFacebook()} </label>

                                <label class="col-xs-4 control-label profileLabels"> Twitter: </label>
                                <label class="col-xs-8 profileLabels"> ${founder.getTwitter()} </label>

                                <label class="col-xs-4 cotrol-label profileTextAreaLabels"> Other Social Media: </label>
                                <label class="col-xs-8 profileTextAreaLabels"> ${founder.getOtherSocialMedia()} </label>

                                <label class="col-xs-4 control-label profileTextAreaLabels"> Company Details: </label>
                                <label class="col-xs-8 profileTextAreaLabels"> ${founder.getCompanyDetails()} </label>

                                <label class="col-xs-4 control-label profileTextAreaLabels"> New Orleans: </label>
                                <label class="col-xs-8 profileTextAreaLabels"> ${founder.getNewOrleans()} </label>
                            </div>
                        </div>

                        <div class="col-md-6 padding-left-10 padding-right-20">

                            <!-- Founder Profile Image Area -->
                            <div class="section-200 sm-margin-top-20" id="profileName">
                                <label class="col-xs-8 control-label profileNameLabels">
                                    ${founder.getFirstName()} ${founder.getLastName()}
                                </label>

                                <div class="col-xs-4 profileImageLabels">
                                    <!-- Proxy Image used for Page Create. Remove once LinkedIn Images are up. -->
                                    <img src="<c:url value="/resources/img/Profile_Logo.png" />" id="profileNameImage"/>
                                    <!-- <img src="${profile.profilePictureUrl}"> -->
                                </div>
                            </div>

                            <!-- Founder Profile Social Area -->
                            <div class="section-200" id="profileSocialInfo">
                                <label class="col-xs-4 control-label profileTopLabels"> Logo: </label>
                                <label class="col-xs-8 profileTopLabels"> ${founder.getLogo()} </label>

                                <label class="col-xs-4 control-label" id="profileBelowImageLabel"> Tags: </label>
                                <label class="col-xs-8" id="profileBelowImageLabel"> tag </label>

                                <label class="col-xs-4 control-label profileTextAreaLabels"> Elevator Pitch: </label>
                                <label class="col-xs-8 profileTextAreaLabels"> ${founder.getElevatorPitch()} </label>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-sm-12 margin-top-20 padding-left-20 padding-right-20">

                    <!-- Bottom Content -->
                    <div id="profileSkills">
                        <label class="col-xs-4 control-label profileTopTextAreaLabels"> Immediate Needs: </label>
                        <label class="col-xs-8 profileTopTextAreaLabels"> ${founder.getImmediateNeeds()} </label>

                        <label class="col-xs-4 control-label profileTextAreaLabels"> Vision: </label>
                        <label class="col-xs-8 profileTextAreaLabels"> ${founder.getVision()} </label>

                        <label class="col-xs-4 control-label profileTextAreaLabels"> Areas of Expertise: </label>
                        <label class="col-xs-8 profileTextAreaLabels"> ${founder.getAreasOfExpertise()} </label>
                    </div>
                </div> 

                <div class="col-sm-12 margin-top-20 padding-left-20 padding-right-20">

                    <!-- Bottom Content -->
                    <div id="profileReports">
                        <label class="col-xs-4 control-label profileTopTextAreaLabels"> Status: </label>
                        <label class="col-xs-8 profileTopTextAreaLabels"> ${founder.getStatus()} </label>

                        <label class="col-xs-4 control-label profileTextAreaLabels"> Program Plan: </label>
                        <label class="col-xs-8 profileTextAreaLabels"> ${founder.getProgramPlan()} </label>

                        <label class="col-xs-4 control-label profileTextAreaLabels"> Weekly Reports: </label>
                        <label class="col-xs-8 profileTextAreaLabels"> ${founder.getWeeklyReports()} </label>
                    </div>
                </div>
            </div> <!-- End of Body Contents -->
        </div> <!-- End of Body Contents Container -->
    </div> <!-- End of Main Profile Container -->
</div>

<!-- Footer -->
<%@include file="../footer.jsp" %>
