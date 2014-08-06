<form:form modelAttribute="registrationForm">

    <div id="createProfileMainContainer">

        <!-- Top Row -->
        <div class="row">
            <div class="col-sm-12">
                <div id="createProfileMenu"> Register Profile - Founder</div>
            </div>
        </div>

        <!-- Content Body -->
        <div class="row margin-top-20">
            <div class="col-sm-12">
                <div class="col-md-6 padding-left-20 padding-right-10">
                    <div id="createProfileFounderInfo">
                        <table>
                            <spring:bind path="firstName">
                                <tr>
                                    <td>First Name:</td>
                                    <td><form:input path="firstName" class="input-large" />
                                <form:errors path="firstName" cssClass="help-inline" /></td>
                                </tr>
                            </spring:bind>

                            <spring:bind path="lastName">
                                <tr>
                                    <td>Last Name:</td>
                                    <td><form:input path="lastName" class="input-large" />
                                <form:errors path="lastName" cssClass="help-inline" /></td>
                                </tr>
                            </spring:bind>

                            <spring:bind path="website">
                                <tr>
                                    <td>Website:</td>
                                    <td><form:input path="website" class="input-large" />
                                <form:errors path="website" cssClass="help-inline" /></td>
                                </tr>
                            </spring:bind>

                            <spring:bind path="facebook">
                                <tr>
                                    <td>Facebook:</td>
                                    <td><form:input path="facebook" class="input-large" />
                                <form:errors path="facebook" cssClass="help-inline" /></td>
                                </tr>
                            </spring:bind>

                            <spring:bind path="twitter">
                                <tr>
                                    <td>Twitter:</td>
                                    <td><form:input path="twitter" class="input-large" />
                                <form:errors path="twitter" cssClass="help-inline" /></td>
                                </tr>
                            </spring:bind>

                            <spring:bind path="otherSocialMedia">
                                <tr>
                                    <td>Other Social Media:</td>
                                    <td><form:textarea path="otherSocialMedia" rows="2" cols="30" />
                                <form:errors path="otherSocialMedia" cssClass="help-inline" /></td>
                                </tr>
                            </spring:bind>

                            <spring:bind path="companyDetails">
                                <tr>
                                    <td>Company Description:</td>
                                    <td><form:textarea path="companyDetails" rows="2" cols="30" />
                                <form:errors path="companyDetails" cssClass="help-inline" /></td>
                                </tr>
                            </spring:bind>

                            <spring:bind path="inspiration">
                                <tr>
                                    <td>Inspiration:</td> 
                                    <td><form:textarea path="inspiration" rows="2" cols="30" />
                                <form:errors path="inspiration" cssClass="help-inline" /></td>
                                </tr>
                            </spring:bind>
                        </table>
                    </div>
                </div>


                <!-- Content Body - Row 1 - Col 2 - Top Div -->

                <div class="col-md-6 padding-left-10 padding-right-20">
                    <div class="section-200 sm-margin-top-20" id="createProfileFounderLogo">
                        <table>
                            <spring:bind path="logo">
                                <tr>
                                    <td>Logo:</td>
                                    <td><form:input path="logo" class="input-large" />
                                <form:errors path="logo" cssClass="help-inline" /></td>
                                </tr>
                            </spring:bind>

                            <spring:bind path="tagline">
                                <tr>
                                    <td>Tagline:</td> 
                                    <td><form:input path="tagline" class="input-large" />
                                <form:errors path="tagline" cssClass="help-inline"/></td>
                                </tr>

                            </spring:bind>

                            <spring:bind path="elevatorPitch">

                                <tr>
                                    <td>Elevator Pitch:</td> 
                                    <td><form:textarea path="elevatorPitch" rows="2" cols="30" />
                                <form:errors path="elevatorPitch" cssClass="help-inline" /></td>
                                </tr>

                            </spring:bind>
                        </table>
                    </div>


                    <!-- Content Body - Row 1 - Col 2 - Bottom Div -->
                    <div class="section-200" id="createProfileFounderStatus">
                        <table>
                            <spring:bind path="immediateNeeds">
                                <tr>
                                    <td>Immediate Needs:</td>
                                    <td><form:textarea path="immediateNeeds" rows="2" cols="30" />
                                <form:errors path="immediateNeeds" cssClass="help-inline" /></td>
                                </tr>
                            </spring:bind>

                            <spring:bind path="status">
                                <tr>
                                    <td>Status:</td>
                                    <td><form:textarea path="status" rows="2" cols="30" />
                                <form:errors path="status" cssClass="help-inline" /></td>
                                </tr>
                            </spring:bind>

                            <spring:bind path="vision">
                                <tr>    
                                    <td>Vision:</td>
                                    <td><form:textarea path="vision" rows="2" cols="30" />
                                <form:errors path="vision" cssClass="help-inline" /></td>
                                </tr>
                            </spring:bind>

                            <spring:bind path="newOrleans">
                                <tr>    
                                    <td>New Orleans:</td>
                                    <td><form:textarea path="newOrleans" rows="2" cols="30" />
                                <form:errors path="newOrleans" cssClass="help-inline" /></td>
                                </tr>
                            </spring:bind>
                        </table>
                    </div>
                </div>
            </div>
        </div>

        <!-- Bottom Content -->

        <div class="row margin-top-20">
            <div class="col-sm-12 padding-left-20 padding-right-20">
                <div class="col-sm-12">
                    
                    <!-- Bottom Content - Row 1 - Col 1 -->
                    <div id="createProfileFounderProgramPlan">
                        
                            <spring:bind path="programPlan">
                                <div class="form-group padding-top-10">
                                    <label class="col-sm-2 control-label">Program Plan: </label>
                                    <div class="col-sm-10">
                                    <form:textarea class="form-control" path="programPlan" rows="2" />
                                    <form:errors class="help-block" path="programPlan" cssClass="help-inline" />
                                    </div>
                                </div>
                            </spring:bind>
                        
                            <spring:bind path="weeklyReports">
                                <div class="form-group padding-top-10">
                                    <label class="col-sm-2 control-label">Weekly Reports: </label>
                                    <div class="col-sm-10">
                                    <form:textarea class="form-control" path="weeklyReports" rows="2" />
                                    <form:errors class="help-block" path="weeklyReports" cssClass="help-inline" />
                                    </div>
                                </div>
                            </spring:bind>
                        
                            <spring:bind path="industry">
                                    Industry:
                                    
                                    <!-- Build your select: -->
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
                                <div class="form-group padding-top-10">
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
    $(document).ready(function() {
        $('.selectpicker').selectpicker();
    });
</script>