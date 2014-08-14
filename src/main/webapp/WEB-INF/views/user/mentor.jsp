        <!-- Header -->
        <%@include file="../header.jsp" %>
        
        <!-- Navigation Bar -->
        <%@include file="../index/nav.jsp" %>

        <div class="container" id="editMainContainer">
            <div id="profileMainContainer">

                <!-- Top Row -->
                <div class="row">
                    <div class="col-sm-12">
                        <div id="mfRowOne"> 
                            <img src="${profile.profilePictureUrl}" id="mfImage"></img>
                            ${mentor.getFirstName()} ${mentor.getLastName()}
                            ${mentor.getIndustry()}

                            <a href="<c:url value="editMentor" />"><img src="/mentormarketplace/resources/img/edit.png" id="mfLinkOne" /></a>
                        </div>
                    </div>
                </div>

                <!-- Content Body -->
                <div class="row margin-top-20">
                    <div class="col-sm-12">
                        <div class="col-md-6 padding-left-20 padding-right-10">
                            <div id="profileSocialInfo">
                                <p> <strong>Website:</strong> &nbsp &nbsp ${mentor.getWebsite()} </p>
                                <p> <strong>Facebook:</strong> &nbsp &nbsp ${mentor.getFacebook()} </p>
                                <p> <strong>Twitter:</strong> &nbsp &nbsp ${mentor.getTwitter()} </p>
                                <p> <strong>Other Social Media:</strong> &nbsp &nbsp ${mentor.getOtherSocialMedia()} </p>
                                <p> <strong>Areas of Expertise:</strong> &nbsp &nbsp ${mentor.getAreasOfExpertise()} </p>
                            </div>
                        </div>

                        <div class="col-md-6 padding-left-10 padding-right-20">
                            <div class="section-200 sm-margin-top-20" id="mfRowThreeDivFour">
                                <p> <strong>Industry:</strong> &nbsp &nbsp ${mentor.getIndustry()} </p>
                                <p> <strong>Company:</strong> &nbsp &nbsp ${mentor.getLinkedInCurrentCompany()} </p>
                                <p> <strong>Job Title:</strong> &nbsp &nbsp ${mentor.getLinkedInCurrentJobTitle()} </p>
                            </div>

                            <div class="section-200" id="mfRowThreeDivFive">
                                <p> <strong>Background:</strong> &nbsp &nbsp ${mentor.getBackground()} </p>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Content Bottom -->
                <div class="row margin-top-20">
                    <div class="col-sm-12 padding-left-20 padding-right-20">
                        <div class="col-sm-12">
                            <div id="mfContentBottom">

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
                                    
        <!-- Footer -->
        <%@include file="../footer.jsp" %>

