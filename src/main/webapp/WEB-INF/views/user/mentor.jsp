<!-- Header -->
<%@include file="../header.jsp" %>

<!-- Navigation Bar -->
<%@include file="../shared/navigationBar.jsp" %>

<div class="container">

    <!-- Main Profile Container -->
    <div class="profileMainContainer">

        <!-- Profile Picture and Name Area -->
        <div class="profileLogoAndIndustryContent padding-top-20">
            <div class="col-xs-2 profileLogoContent" style="background-image: url(${mentor.getLinkedInPictureUrl()})">
            </div>

            <div class="col-xs-10 profileIndustryContent">
                <h4 id="displayMentorName">${mentor.getFirstName()} ${mentor.getLastName()}</h4>
                <div class="displayIndustry">${mentor.getLinkedInCurrentJobTitle()} at ${mentor.getLinkedInCurrentCompany()}
                </div>
            </div>

            <!-- Header -->
            <div class="col-xs-12 profileHeader">
                <c:if test="${canEditProfile == true}">
                    <a href="<c:url value="edit" />" class="btn btn-success" id="profileEditButton"> EDIT PROFILE </a>
                </c:if>
            </div>
        </div>

        <!-- Body Contents -->
        <div class="profileBodyContentContainer">
            <div id="profileBodyContent">
                <div class="row padding-top-20">
                    <div class="col-xs-6 padding-right-10">
                        <div class="section-content section-content-left">

                            <h3 class="section-content-header">
                                Contact Information
                            </h3>

                            <div class="section-content-body">
                                <div class="form-horizontal">
                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Website</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <p class="form-control-static">${mentor.getWebsite()}</p>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Facebook</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <p class="form-control-static">${mentor.getFacebook()}</p>
                                        </div>
                                    </div>  
                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Twitter</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <p class="form-control-static">${mentor.getTwitter()}</p>
                                        </div>
                                    </div>  
                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Other Social Media</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <p class="form-control-static">${mentor.getOtherSocialMedia()}</p>
                                        </div>
                                    </div>  
                                </div>
                            </div>                        
                        </div>          
                    </div>


                    <div class="col-xs-6 padding-left-10">
                        <div class="section-content section-content-right">
                            <h3 class="section-content-header">
                                Background
                            </h3>

                            <div class="section-content-body">
                                <div class="form-horizontal">

                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Previous Experience</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <p class="form-control-static">${mentor.getExperience()}</p>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Education</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <p class="form-control-static">${mentor.getEducation()}</p>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Area(s) of Expertise</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <c:forEach items="${mentor.getExpertiseList()}" var="expertise">
                                                <p class="form-control-static">${expertise.expertise}</p>
                                            </c:forEach>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Industry</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <c:forEach items="${mentor.getIndustryList()}" var="industry">
                                                <div class="displayIndustry">${industry.industry}</div>
                                            </c:forEach>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div> <!-- End of Body Contents -->
        </div> <!-- End of Body Contents Container -->
    </div> <!-- End of Main Profile Container -->
</div>

<!-- Footer -->
<%@include file="../footer.jsp" %>
