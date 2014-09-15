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
                <img src="${mentor.getLinkedInPictureUrl()}">
            </div>

            <!-- Industry -->
            <div class="col-xs-10 profileIndustryContent">
                <h4> The Idea Village </h4>
                <c:forEach items="${mentor.getIndustryList()}" var="industry">
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

                            <!-- Mentor Profile Experience Area -->
                            <div id="profileExperience">
                                <label class="col-xs-4 control-label profileTopLabels"> Website: </label>
                                <label class="col-xs-8 profileTopLabels" id="profileDisplayText"> ${mentor.getWebsite()} </label>

                                <label class="col-xs-4 control-label profileLabels"> Facebook: </label>
                                <label class="col-xs-8 profileLabels" id="profileDisplayText"> ${mentor.getFacebook()} </label>

                                <label class="col-xs-4 control-label profileLabels"> Twitter: </label>
                                <label class="col-xs-8 profileLabels" id="profileDisplayText"> ${mentor.getTwitter()} </label>

                                <label class="col-xs-4 cotrol-label profileTextAreaLabels"> Other Social Media: </label>
                                <label class="col-xs-8 profileTextAreaLabels" id="profileDisplayText"> ${mentor.getOtherSocialMedia()} </label>
                            </div>
                        </div>

                        <div class="col-md-6 padding-left-10 padding-right-20">

                            <!-- Mentor Profile Image Area -->
                            <div class="section-200 sm-margin-top-20" id="profileName">
                                <label class="col-xs-8 control-label profileNameLabels">
                                    ${mentor.getFirstName()} ${mentor.getLastName()}
                                </label>

                                <div class="col-xs-4 profileImageLabels">
                                    <img src="${mentor.getLinkedInPictureUrl()}">
                                </div>
                            </div>

                            <!-- Mentor Profile Social Area -->
                            <div class="section-200" id="profileSocialInfo">
                                <label class="col-xs-4 control-label profileTopTextAreaLabels"> Current Company: </label>
                                <label class="col-xs-8 profileTopTextAreaLabels" id="profileDisplayText"> ${mentor.getLinkedInCurrentCompany()} </label>

                                <label class="col-xs-4 control-label profileTextAreaLabels"> Job Title: </label>
                                <label class="col-xs-8 profileTextAreaLabels" id="profileDisplayText"> ${mentor.getLinkedInCurrentJobTitle()} </label>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-sm-12 margin-top-20 padding-left-20 padding-right-20">

                    <!-- Bottom Content -->
                    <div id="profileReports">
                        <label class="col-xs-4 control-label profileTopTextAreaLabels"> Background: </label>
                        <label class="col-xs-8 profileTopTextAreaLabels" id="profileDisplayText"> ${mentor.getBackground()} </label>

                        <label class="col-xs-4 control-label profileTextAreaLabels"> Areas of Expertise: </label>
                        <c:forEach items="${mentor.getExpertiseList()}" var="expertise">
                            <p>${expertise.expertise}</p>
                        </c:forEach>
                    </div>
                </div>   
            </div> <!-- End of Body Contents -->
        </div> <!-- End of Body Contents Container -->
    </div> <!-- End of Main Profile Container -->
</div>

<!-- Footer -->
<%@include file="../footer.jsp" %>
