<form:form modelAttribute="registrationForm">

    <div id="createProfileMainContainer">

        <!-- Top Row -->
        <div class="row">
            <div class="col-sm-12">
                <div id="createProfileMenu"> Register Profile - Founder</div>
            </div>
        </div>

        <!-- Content Body -->
        <div class="row margin-top-10">
            <div class="col-sm-12">
                <div class="col-md-6 padding-left-20 padding-right-10">
                    <div id="createProfileFounderInfo">
                        <div class="form-group">
                            
                        <spring:bind path="firstName">
                            
                                
                                <label class="col-sm-2 control-label createProfileInputLabels padding-top-10">First Name: </label>
                                <div class="col-sm-10 createProfileInputFields padding-top-10">
                                    <form:input class="form-control" path="firstName" rows="2" />
                                    <form:errors class="help-block" path="firstName" cssClass="help-inline" />
                                </div>
                            
                        </spring:bind>

                        <spring:bind path="lastName">
                            
                                <label class="col-sm-2 control-label createProfileInputLabels">Last Name: </label>
                                <div class="col-sm-10 createProfileInputFields">
                                    <form:input class="form-control" path="lastName" rows="2" />
                                    <form:errors class="help-block" path="lastName" cssClass="help-inline" />
                                </div>
                            
                        </spring:bind>

                        <spring:bind path="website">
                            
                                <label class="col-sm-2 control-label createProfileInputLabels">Website: </label>
                                <div class="col-sm-10 createProfileInputFields">
                                    <form:input class="form-control" path="website" rows="2" />
                                    <form:errors class="help-block" path="website" cssClass="help-inline" />
                                </div>
                            
                        </spring:bind>

                        <spring:bind path="facebook">
                            
                                <label class="col-sm-2 control-label createProfileInputLabels">Facebook: </label>
                                <div class="col-sm-10 createProfileInputFields">
                                    <form:input class="form-control" path="facebook" rows="2" />
                                    <form:errors class="help-block" path="facebook" cssClass="help-inline" />
                                </div>
                           
                        </spring:bind>

                        <spring:bind path="twitter">
                           
                                <label class="col-sm-2 control-label createProfileInputLabels">Twitter: </label>
                                <div class="col-sm-10 createProfileInputFields">
                                    <form:input class="form-control" path="twitter" rows="2" />
                                    <form:errors class="help-block" path="twitter" cssClass="help-inline" />
                                </div>
                           
                        </spring:bind>

                        <spring:bind path="otherSocialMedia">
                           
                                <label class="col-sm-2 control-label createProfileTextAreaLabels">Other Social Media: </label>
                                <div class="col-sm-10 createProfileTextAreaFields">
                                    <form:textarea class="form-control" path="otherSocialMedia" rows="2" />
                                    <form:errors class="help-block" path="otherSocialMedia" cssClass="help-inline" />
                                </div>
                           
                        </spring:bind>

                        <spring:bind path="companyDetails">
                            
                                <label class="col-sm-2 control-label createProfileTextAreaLabels">Company Description: </label>
                                <div class="col-sm-10 createProfileTextAreaFields">
                                    <form:textarea class="form-control" path="companyDetails" rows="2" />
                                    <form:errors class="help-block" path="companyDetails" cssClass="help-inline" />
                                </div>
                           
                        </spring:bind>


                        <spring:bind path="inspiration">
                           
                                <label class="col-sm-2 control-label createProfileTextAreaLabels">Inspiration: </label>
                                <div class="col-sm-10 createProfileTextAreaFields">
                                    <form:textarea class="form-control" path="inspiration" rows="2" />
                                    <form:errors class="help-block" path="inspiration" cssClass="help-inline" />
                                </div>
                           
                        </spring:bind>
                        </div>
                    </div>
                </div>

                <!-- Content Body - Row 1 - Col 2 - Top Div -->
                <div class="col-md-6 padding-left-10 padding-right-20">
                    <div class="section-200 sm-margin-top-20" id="createProfileFounderLogo">

                        <spring:bind path="logo">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Logo: </label>
                                <div class="col-sm-10">
                                    <form:input class="form-control" path="logo" rows="2" />
                                    <form:errors class="help-block" path="logo" cssClass="help-inline" />
                                </div>
                            </div>
                        </spring:bind>

                        <spring:bind path="tagline">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Tagline: </label>
                                <div class="col-sm-10">
                                    <form:input class="form-control" path="tagline" rows="2" />
                                    <form:errors class="help-block" path="tagline" cssClass="help-inline" />
                                </div>
                            </div>
                        </spring:bind>

                        <spring:bind path="elevatorPitch">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Elevator Pitch: </label>
                                <div class="col-sm-10">
                                    <form:textarea class="form-control" path="elevatorPitch" rows="2" />
                                    <form:errors class="help-block" path="elevatorPitch" cssClass="help-inline" />
                                </div>
                            </div>
                        </spring:bind>

                    </div>

                    <!-- Content Body - Row 1 - Col 2 - Bottom Div -->
                    <div class="section-200" id="createProfileFounderStatus">

                        <spring:bind path="immediateNeeds">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Immediate Needs: </label>
                                <div class="col-sm-10">
                                    <form:textarea class="form-control" path="immediateNeeds" rows="2" />
                                    <form:errors class="help-block" path="immediateNeeds" cssClass="help-inline" />
                                </div>
                            </div>
                        </spring:bind>

                        <spring:bind path="status">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Status: </label>
                                <div class="col-sm-10">
                                    <form:textarea class="form-control" path="status" rows="2" />
                                    <form:errors class="help-block" path="status" cssClass="help-inline" />
                                </div>
                            </div>
                        </spring:bind>

                        <spring:bind path="vision">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Vision: </label>
                                <div class="col-sm-10">
                                    <form:textarea class="form-control" path="vision" rows="2" />
                                    <form:errors class="help-block" path="vision" cssClass="help-inline" />
                                </div>
                            </div>
                        </spring:bind>

                        <spring:bind path="newOrleans">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">New Orleans: </label>
                                <div class="col-sm-10">
                                    <form:textarea class="form-control" path="newOrleans" rows="2" />
                                    <form:errors class="help-block" path="newOrleans" cssClass="help-inline" />
                                </div>
                            </div>
                        </spring:bind>

                    </div>
                </div>
            </div>
        </div>

        <!-- Bottom Content -->
        <div class="row margin-top-10">
            <div class="col-sm-12 padding-left-20 padding-right-20">
                <div class="col-sm-12">

                    <!-- Bottom Content - Row 1 - Col 1 -->
                    <div id="createProfileFounderProgramPlan">

                        <spring:bind path="programPlan">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Program Plan: </label>
                                <div class="col-sm-10">
                                    <form:textarea class="form-control" path="programPlan" rows="2" />
                                    <form:errors class="help-block" path="programPlan" cssClass="help-inline" />
                                </div>
                            </div>
                        </spring:bind>

                        <spring:bind path="weeklyReports">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Weekly Reports: </label>
                                <div class="col-sm-10">
                                    <form:textarea class="form-control" path="weeklyReports" rows="2" />
                                    <form:errors class="help-block" path="weeklyReports" cssClass="help-inline" />
                                </div>
                            </div>
                        </spring:bind>

                        <spring:bind path="industry">
                            Industry:

                            <!-- Multi-Select: -->
                            <select class="selectpicker" multiple="multiple" path="industry">
                                <option value="Accounting">Accounting</option>
                                <option value="Advertising/Publication">Advertising/Publication</option>
                                <option value="Agriculture">Agriculture</option>
                                <option value="Angel Funding">Angel Funding</option>
                                <option value="Apparel/Accessories">Apparel/Accessories</option>
                                <option value="Architecture/Design">Architecture/Design</option>
                                <option value="Arts, Entertainment/Recreation">Arts, Entertainment/Recreation</option>
                                <option value="Automotive">Automotive</option>
                                <option value="Biotechnology/Health/Medical">Biotechnology/Health/Medical</option>
                                <option value="Communication Services">Communication Services</option>
                                <option value="Computer/Software">Computer/Software</option>
                                <option value="E-commerce">E-commerce</option>
                                <option value="Energy">Energy</option>
                                <option value="Education/Training">Education/Training</option>
                                <option value="Environmental">Environmental</option>
                                <option value="Financial Services">Financial Services</option>
                                <option value="Food/Beverage">Food/Beverage</option>
                                <option value="Health Care/Biotech">Health Care/Biotech</option>
                                <option value="Manufacturing">Manufacturing</option>
                                <option value="Marketing/PR">Marketing/PR</option>
                                <option value="Media Services">Media Services</option>
                                <option value="Mining Industry">Mining Industry</option>
                                <option value="Multimedia/Internet/Online services">Multimedia/Internet/Online services</option>
                                <option value="Office Equipment">Office Equipment</option>
                                <option value="Oil/Gas">Oil/Gas</option>
                                <option value="Plumbing">Plumbing</option>
                                <option value="Printing/Graphics">Printing/Graphics</option>
                                <option value="Product Licensing">Product Licensing</option>
                                <option value="Real Estate">Real Estate</option>
                                <option value="Retail or eCommerce">Retail or eCommerce</option>
                                <option value="SaaS">SaaS</option>
                                <option value="Social Entrepreneurship">Social Entrepreneurship</option>
                                <option value="Sports/Fitness Services">Sports/Fitness Services</option>
                                <option value="Television/Film">Television/Film</option>
                                <option value="Travel/Transportation">Travel/Transportation</option>
                                <option value="Venture Capital or Private Equity">Venture Capital or Private Equity</option>
                                <option value="Other">Other</option>
                            </select>
                        </spring:bind>

                        <spring:bind path="areasOfExpertise">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Expertise: </label>
                                <div class="col-sm-10">
                                    <form:textarea class="form-control" path="areasOfExpertise" rows="2" />
                                    <form:errors class="help-block" path="areasOfExpertise" cssClass="help-inline" />
                                </div>
                            </div>
                        </spring:bind>

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


<script type="text/javascript">
    require(['dropdown']);
</script>