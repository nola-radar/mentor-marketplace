<!-- Header -->
<%@include file="../header.jsp" %>

<!-- Navigation Bar -->
<%@include file="../index/nav.jsp" %>

<div class="container">

    <!-- Main Profile Container -->
    <div class="profileMainContainer">

        <!-- Logo Area -->
        <div class="profileLogoContent padding-top-20">
            <div class="col-xs-2 profileLogoImage">
                <h4> Logo </h4>
            </div>

            <div class="col-xs-10 profileFounderName">
                <h4> The Idea Village </h4>
                <p> Industry </p>
            </div>
            
            <!-- Header -->
            <div class="col-xs-12 profileHeaderContents">

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
<!--
                                <label class="col-xs-4 control-label profileLabels"> Website: </label>
                                <label class="col-xs-8 profileLabels"> ${founder.getWebsite()} </label>

                                <label class="col-xs-4 control-label profileLabels"> Facebook: </label>
                                <label class="col-xs-8 profileLabels"> ${founder.getFacebook()} </label>

                                <label class="col-xs-4 control-label profileLabels"> Twitter: </label>
                                <label class="col-xs-8 profileLabels"> ${founder.getTwitter()} </label>

                                <label class="col-xs-4 cotrol-label profileTextAreaLabels"> Other Social Media: </label>
                                <label class="col-xs-8 profileTextAreaLabels"> ${founder.getOtherSocialMedia()} </label>

                                <label class="col-xs-4 control-label profileTextAreaLabels"> Company Details: </label>
                                <label class="col-xs-8 profileTextAreaLabels"> ${founder.getCompanyDetails()} </label>
                                -->
                            </div>
                        </div>

                        <div class="col-md-6 padding-left-10 padding-right-20">

                            <!-- Founder Profile Logo Area -->
                            <div class="section-200 sm-margin-top-20" id="profileFounderLogo">
<!--                                
                                <label class="col-xs-4 control-label profileTopLabels"> Logo: </label>
                                <label class="col-xs-8 profileTopLabels"> ${founder.getLogo()} </label>

                                <label class="col-xs-4 control-label profileLabels"> Tags: </label>
                                <label class="col-xs-8 profileLabels"> tag </label>

                                <label class="col-xs-4 control-label profileTextAreaLabels"> Elevator Pitch: </label>
                                <label class="col-xs-8 profileTextAreaLabels"> ${founder.getElevatorPitch()} </label>
                                -->
                            </div>
                            
                            <!-- Founder Profile Social Area -->
                            <div class="section-200" id="profileSocialInfo">
<!--                                
                                <label class="col-xs-4 control-label profileTopTextAreaLabels"> Immediate Needs: </label>
                                <label class="col-xs-8 profileTopTextAreaLabels"> ${founder.getImmediateNeeds()} </label>

                                <label class="col-xs-4 control-label profileTextAreaLabels"> Status: </label>
                                <label class="col-xs-8 profileTextAreaLabels"> ${founder.getStatus()} </label>

                                <label class="col-xs-4 control-label profileTextAreaLabels"> Vision: </label>
                                <label class="col-xs-8 profileTextAreaLabels"> ${founder.getVision()} </label>

                                <label class="col-xs-4 control-label profileTextAreaLabels"> New Orleans: </label>
                                <label class="col-xs-8 profileTextAreaLabels"> ${founder.getNewOrleans()} </label>
                                -->
                            </div>
                        </div>
                    </div>
                </div>
                
                <div class="col-sm-12 margin-top-20 padding-left-20 padding-right-20">

                        <!-- Bottom Content -->
                        <div id="profileSkills">

                        </div>
                        
                </div>
                            
            </div>
        </div> <!-- Body Contents -->
    </div> <!-- Main Profile Container -->
</div>



<!--
<div class="container" id="editMainContainer">
    <div id="profileMainContainer">

                 Top Row 
                <div class="row">
                    <div class="col-sm-12">
                        <div class="profileHeaderBar"> 
                            <img src="${profile.profilePictureUrl}" id="profileImage"></img>
${founder.getFirstName()} ${founder.getLastName()}
${founder.getIndustry()}

<a href="<c:url value="editFounder" />" class="btn btn-success"> REGISTER </a>
</div>
</div>
</div>

Content Body 
<div class="row margin-top-20">
<div class="col-sm-12">
<div class="col-md-6 padding-left-20 padding-right-10">
<div id="profileSocialInfo">

<div class="col-sm-12 profileTitle">
 Social Media
</div>

<label class="col-xs-4 control-label profileLabels"> Website: </label>
<label class="col-xs-8 profileLabels"> ${founder.getWebsite()} </label>

<label class="col-xs-4 control-label profileLabels"> Facebook: </label>
<label class="col-xs-8 profileLabels"> ${founder.getFacebook()} </label>

<label class="col-xs-4 control-label profileLabels"> Twitter: </label>
<label class="col-xs-8 profileLabels"> ${founder.getTwitter()} </label>

<label class="col-xs-4 cotrol-label profileTextAreaLabels"> Other Social Media: </label>
<label class="col-xs-8 profileTextAreaLabels"> ${founder.getOtherSocialMedia()} </label>

<label class="col-xs-4 control-label profileTextAreaLabels"> Company Details: </label>
<label class="col-xs-8 profileTextAreaLabels"> ${founder.getCompanyDetails()} </label>

</div>
</div>

<div class="col-md-6 padding-left-10 padding-right-20">
<div class="section-200 sm-margin-top-20" id="createProfileFounderLogo">

<label class="col-xs-4 control-label profileTopLabels"> Logo: </label>
<label class="col-xs-8 profileTopLabels"> ${founder.getLogo()} </label>

<label class="col-xs-4 control-label profileLabels"> Tags: </label>
<label class="col-xs-8 profileLabels"> tag </label>

<label class="col-xs-4 control-label profileTextAreaLabels"> Elevator Pitch: </label>
<label class="col-xs-8 profileTextAreaLabels"> ${founder.getElevatorPitch()} </label>

</div>

<div class="section-200" id="createProfileFounderLogo">

<label class="col-xs-4 control-label profileTopTextAreaLabels"> Immediate Needs: </label>
<label class="col-xs-8 profileTopTextAreaLabels"> ${founder.getImmediateNeeds()} </label>
        
<label class="col-xs-4 control-label profileTextAreaLabels"> Status: </label>
<label class="col-xs-8 profileTextAreaLabels"> ${founder.getStatus()} </label>

<label class="col-xs-4 control-label profileTextAreaLabels"> Vision: </label>
<label class="col-xs-8 profileTextAreaLabels"> ${founder.getVision()} </label>
    
<label class="col-xs-4 control-label profileTextAreaLabels"> New Orleans: </label>
<label class="col-xs-8 profileTextAreaLabels"> ${founder.getNewOrleans()} </label>
<table>
<tr>
    <td><strong>Program Plan:</strong></td>
    <td>${founder.getProgramPlan()}</td>
</tr>
<tr>
    <td><strong>Weekly Reports:</strong></td>
    <td>${founder.getWeeklyReports()}</td>
</tr>
</table>
</div>
</div>
</div>
</div>

Content Bottom 
<div class="row">
<div class="col-sm-12 padding-left-20 padding-right-20">
<div class="col-sm-12">
<div id="mfContentBottom">

<label class="col-xs-4 control-label profileTopTextAreaLabelsTextAreaLabels"> Areas of Expertise: </label>
<label class="col-xs-8 profileTopTextAreaLabelsTextAreaLabels"> ${founder.getAreasOfExpertise()} </label>

</div>
</div>
</div>
</div>
</div>
</div>-->

<!-- Footer -->
<%@include file="../footer.jsp" %>
