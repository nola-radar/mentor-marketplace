<form:form modelAttribute="registrationForm">
    <div class="container-fluid" id="displayMentorMainContainer">

        <!-- Top Row -->
        <div class="row">

            <div class="col-sm-12">
                <div id="displayMentorRowOne"> Test Row 1</div>
            </div>

        </div>

        <!-- Menu Row -->
        <div class="row">

            <div class="col-sm-4 col-xs-4">
                <div id="displayMentorRowTwoDivOne"> <font color="white"> Test Row 2 - Col 1  </font></div>
            </div>

            <div class="col-sm-4 col-xs-4">
                <div id="displayMentorRowTwoDivTwo"> <font color="white"> Test Row 2 - Col 2  </font></div>
            </div>

            <div class="col-sm-4 col-xs-4">
                <div id="displayMentorRowTwoDivThree"> <font color="white"> Test Row 2 - Col 3 </font></div>
            </div>

        </div>

        <!-- Content Body -->

        <div class="row">

            <div class="col-xs-12 col-sm-6">

                <div Id="displayMentorFirstNameDiv">
                    <table>
                    <spring:bind path="firstName">
                        <h6>
                            <tr>
                                <td>First Name:</td>
                                <td><form:input path="firstName" class="input-large" />
                                <form:errors path="firstName" cssClass="help-inline" /></td>
                            </tr>
                        </h6>
                    </spring:bind>

                    <spring:bind path="lastName">
                        <h6>
                            <tr>
                                <td>Last Name:</td>
                                <td><form:input path="lastName" class="input-large" />
                                <form:errors path="lastName" cssClass="help-inline" /></td>
                            </tr>
                        </h6>
                    </spring:bind>

                    <spring:bind path="website">
                        <h6>
                            <tr>
                                <td>Website:</td>
                                <td><form:input path="website" class="input-large" />
                                <form:errors path="website" cssClass="help-inline" /></td>
                            </tr>
                        </h6>
                    </spring:bind>

                    <spring:bind path="facebook">
                        <h6>
                            <tr>
                                <td>Facebook:</td>
                                <td><form:input path="facebook" class="input-large" />
                                <form:errors path="facebook" cssClass="help-inline" /></td>
                            </tr>
                        </h6>
                    </spring:bind>

                    <spring:bind path="twitter">
                        <h6>
                            <tr>
                                <td>Twitter:</td>
                                <td><form:input path="twitter" class="input-large" />
                                <form:errors path="twitter" cssClass="help-inline" /></td>
                            </tr>
                        </h6>
                    </spring:bind>

                    <spring:bind path="otherSocialMedia">
                        <h6>
                            <tr>
                                <td>Other Social Media:</td>
                                <td><form:textarea path="otherSocialMedia" rows="5" cols="30" />
                                <form:errors path="otherSocialMedia" cssClass="help-inline" /></td>
                            </tr>
                        </h6>
                    </spring:bind>
                    </table>
                </div>

            </div>

            <div class="col-xs-12 col-sm-6">

                <div id="displayMentorCompanyDiv">
                    <table>
                    <spring:bind path="linkedInCurrentCompany">
                        <h6>
                            <tr>
                                <td>Current Company:</td>
                                <td><form:input path="linkedInCurrentCompany" class="input-large" />
                                <form:errors path="linkedInCurrentCompany" cssClass="help-inline" /></td>
                            </tr>
                        </h6>
                    </spring:bind>

                    <spring:bind path="linkedInCurrentJobTitle">
                        <h6>
                            <tr>
                                <td>Current Job Title:</td>
                                <td><form:input path="linkedInCurrentJobTitle" class="input-large" />
                                <form:errors path="linkedInCurrentJobTitle" cssClass="help-inline" /></td>
                            </tr>
                        </h6>
                    </spring:bind>

                    <spring:bind path="linkedInPictureURL">
                        <h6>
                            <tr>
                                <td>LinkedIn Picture:</td> 
                                <td><form:input path="linkedInPictureURL" class="input-large"/>
                                <form:errors path="linkedInPictureURL" cssClass="help-inline" /></td>
                            </tr>
                        </h6>
                    </spring:bind>
                    </table>
                </div>

                <div style="background-color:#f6f6f6;; height:200px;">
                    <table>
                    <spring:bind path="background">
                        <h6>
                            <tr>
                                <td>Background:</td>
                                <td><form:textarea path="background" rows="10" cols="30" />
                                <form:errors path="linkedInPictureURL" cssClass="help-inline" /></td>
                            </tr>
                        </h6>
                    </spring:bind>
                    </table>
                </div>

            </div>

        </div>

        <!-- Content Bottom -->
        <div class="row">
            <div class="col-xs-12 col-sm-12">

                <div id="displayMentorIndustryDiv">
                    <table>
                    <spring:bind path="industry">
                        <h6>
                            <tr>
                                <td>Industry:</td> 

                                <td><form:select path="industry" class="input-large" >
                                <form:option value="Accounting" label="Accounting"/>
                                <form:option value="Advertising/Publication" label="Advertising/Publication"/>
                                <form:option value="Agriculture" label="Agriculture"/>
                                <form:option value="Angel Funding" label="Angel Funding"/>
                                <form:option value="Apparel/Accessories" label="Apparel/Accessories"/>
                                <form:option value="Architecture/Design" label="Architecture/Design"/>
                                <form:option value="Arts, Entertainment/Recreation" label="Arts, Entertainment/Recreation"/>
                                <form:option value="Automotive" label="Automotive"/>
                                <form:option value="Biotechnology/Health/Medical" label="Biotechnology/Health/Medical"/>
                                <form:option value="Communication Services" label="Communication Services"/>
                                <form:option value="Computer/Software" label="Computer/Software"/>
                                <form:option value="E-commerce" label="E-commerce"/>
                                <form:option value="Energy" label="Energy"/>
                                <form:option value="Education/Training" label="Education/Training"/>
                                <form:option value="Environmental" label="Environmental"/>
                                <form:option value="Financial Services" label="Financial Services"/>
                                <form:option value="Food/Beverage" label="Food/Beverage"/>
                                <form:option value="Health Care/Biotech" label="Health Care/Biotech"/>
                                <form:option value="Manufacturing" label="Manufacturing"/>
                                <form:option value="Marketing/PR" label="Marketing/PR"/>
                                <form:option value="Media Services" label="Media Services"/>
                                <form:option value="Mining Industry" label="Mining Industry"/>
                                <form:option value="Multimedia/Internet/Online services" label="Multimedia/Internet/Online services"/>
                                <form:option value="Office Equipment" label="Office Equipment"/>
                                <form:option value="Oil/Gas" label="Oil/Gas"/>
                                <form:option value="Plumbing" label="Plumbing"/>
                                <form:option value="Printing/Graphics" label="Printing/Graphics"/>
                                <form:option value="Product Licensing" label="Product Licensing"/>
                                <form:option value="Real Estate" label="Real Estate"/>
                                <form:option value="Retail or eCommerce" label="Retail or eCommerce"/>
                                <form:option value="SaaS" label="SaaS"/>
                                <form:option value="Social Entrepreneurship" label="Social Entrepreneurship"/>
                                <form:option value="Sports/Fitness Services" label="Sports/Fitness Services"/>
                                <form:option value="Television/Film" label="Television/Film"/>
                                <form:option value="Travel/Transportation" label="Travel/Transportation"/>
                                <form:option value="Venture Capital or Private Equity" label="Venture Capital or Private Equity"/>
                                <form:option value="Other" label="Other"/>
                            </form:select>
                            <form:errors path="industry" cssClass="help-inline" /></td>
                            </tr>
                        </h6>
                    </spring:bind>

                    <spring:bind path="areasOfExpertise">
                        <h6>
                            <tr>
                                <td>Expertise:</td>
                                <td><form:input path="areasOfExpertise" class="input-large" />
                                <form:errors path="areasOfExpertise" cssClass="help-inline" /></td>
                            </tr>
                        </h6>
                    </spring:bind>

                    <spring:bind path="email">
                        <div class="control-group ${status.error ? 'error' : ''}">
                            <form:hidden path="email" />
                        </div>
                    </spring:bind>
                            
                    <spring:bind path="linkedInId">
                        <form:hidden path="linkedInId" />
                    </spring:bind>
                            
                    <spring:bind path="isAdmin">
                        <form:hidden path="isAdmin" />
                    </spring:bind>
                        
                    <spring:bind path="userType">
                        <h6>
                            <tr>
                                <td>User Type:</td>
                                <td><form:select path="userType" class="input-large" >
                                <form:option value="founder" label="founder"/>
                                <form:option value="mentor" label="mentor"/>
                            </form:select>
                            <form:errors path="userType" cssClass="userType" /></td>
                            </tr>
                        </h6>
                    </spring:bind>
                </table>
            </div>

            </div>
        </div>
        <button class="btn btn-info" type="submit" id="displayMentorCreateProfileButton">
            Create Profile
        </button>
    </div>

</form:form>

<!-- BOOTSTRAP! -->
<script src="https://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.7/jquery-ui.min.js"></script>
<script src="https://netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>
