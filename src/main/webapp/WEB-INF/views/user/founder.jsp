<!-- Header -->
<%@include file="../header.jsp" %>

<!-- Navigation Bar -->
<%@include file="../shared/navigationBar.jsp" %>

<div class="container">

    <!-- Main Profile Container -->
    <div class="profileMainContainer">

        <!-- Logo Area -->
        <div class="profileLogoAndIndustryContent padding-top-20">
            <div class="col-xs-2 profileLogoContent" style="background-image: url(${founder.getLogo()})">

            </div>

            <div class="col-xs-10 profileIndustryContent">
                <!-- This needs to be captured in registration process and pulled from db -->
                <h4>${founder.getLinkedInCurrentCompany()}</h4>
                <c:forEach items="${founder.getIndustryList()}" var="industry">
                    <div class="displayIndustry">${industry.industry}</div>
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
                <div class="row padding-top-20">

                    <div class="col-xs-6 padding-right-10">
                        <div class="section-content section-content-left">
                            <h3 class="section-content-header">
                                Company Information
                            </h3>

                            <div class="section-content-body">
                                <div class="form-horizontal">
                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Elevator Pitch</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <p class="form-control-static">${founder.getElevatorPitch()}</p>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Immediate Needs</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <p class="form-control-static">${founder.getImmediateNeeds()}</p>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Tagline</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <p class="form-control-static">Input</p>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Website</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <p class="form-control-static">${founder.getWebsite()}</p>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Twitter</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <p class="form-control-static">${founder.getTwitter()}</p>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Facebook</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <p class="form-control-static">${founder.getFacebook()}</p>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Other Social Media</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <p class="form-control-static">${founder.getOtherSocialMedia()}</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-xs-6 padding-left-10">
                        <div class="section-content section-content-right">
                            <h3 class="section-content-header">
                                Founder Information 
                            </h3>
                            <div class="section-content-body">
                                <div class="form-horizontal">

                                    <div class="row ">
                                        <div class="col-xs-12 founder-name">
                                            <img class="pull-left"  id="profileNameImage" src="${founder.getLinkedInPictureUrl()}">
                                            <h4>
                                                ${founder.getFirstName()} ${founder.getLastName()}
                                            </h4>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Area(s) of Expertise</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <c:forEach items="${founder.getExpertiseList()}" var="expertise">
                                                <p class="form-control-static">${expertise.expertise}</p>
                                            </c:forEach>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Previous Experience</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <p class="form-control-static">${founder.getExperience()}</p>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-xs-4 control-label">Education</label>
                                        <div class="col-xs-8 padding-left-0">
                                            <p class="form-control-static">${founder.getEducation()}</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>


                </div>

                <div class="row">

                    <div class="col-xs-12 ">
                        <div class="section-content section-content-left" id="section-content-center">

                            <h3 class="section-content-header">
                                Story
                            </h3>

                            <div class="section-content-body">
                                <div class="form-horizontal">

                                    <div class="form-group">
                                        <label class="col-xs-3 control-label">Inspiration</label>
                                        <div class="col-xs-9 padding-left-0">
                                            <p class="form-control-static">${founder.getElevatorPitch()}</p>
                                        </div>

                                    </div>
                                    <div class="form-group">
                                        <label class="col-xs-3 control-label">Status</label>
                                        <div class="col-xs-9 padding-left-0">
                                            <p class="form-control-static">${founder.getStatus()}</p>
                                        </div>

                                    </div>
                                    <div class="form-group">
                                        <label class="col-xs-3 control-label">Vision</label>
                                        <div class="col-xs-9 padding-left-0">
                                            <p class="form-control-static">${founder.getVision()}</p>
                                        </div>

                                    </div>
                                    <div class="form-group">
                                        <label class="col-xs-3 control-label">What New Orleans mean to you</label>
                                        <div class="col-xs-9 padding-left-0">
                                            <p class="form-control-static">${founder.getNewOrleans()}</p>
                                        </div>

                                    </div>
                                    <div class="form-group">
                                        <label class="col-xs-3 control-label">Program Plan</label>
                                        <div class="col-xs-9 padding-left-0">
                                            <p class="form-control-static">${founder.getProgramPlan()}</p>
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
