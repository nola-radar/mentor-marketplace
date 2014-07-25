<form:form modelAttribute="registrationForm">
<div class="container-fluid" style="margin-right:70px;margin-left:70px;padding-right:2px;padding-left:7px;background-color:#ffffff;">

    <!-- Top Row -->
    <div class="row">

        <div class="col-sm-12">
            <div style="background-color:#203747;"> Test Row 1</div>
        </div>

    </div>

    <!-- Menu Row -->
    <div class="row">

        <div class="col-sm-4 col-xs-4">
            <div style="background-color:#f6f6f6;"> <font color="white"> Test Row 2 - Col 1  </font></div>
        </div>

        <div class="col-sm-4 col-xs-4">
            <div style="background-color:#f6f6f6;"> <font color="white"> Test Row 2 - Col 2  </font></div>
        </div>

        <div class="col-sm-4 col-xs-4">
            <div style="background-color:#f6f6f6;"> <font color="white"> Test Row 2 - Col 3 </font></div>
        </div>

    </div>

    <!-- Content Body -->

    <div class="row">

        <div class="col-xs-12 col-sm-6">

            <div  style="background-color:#f6f6f6; height:400px;">
                
                <spring:bind path="firstName">
                    <h6>
                        First Name: &nbsp
                        <form:input path="firstName" class="input-large" />
                        <form:errors path="firstName" cssClass="help-inline" />
                    </h6>
                </spring:bind>

                <spring:bind path="lastName">
                    <h6>
                        Last Name: &nbsp;
                        <form:input path="lastName" class="input-large" />
                        <form:errors path="lastName" cssClass="help-inline" />
                    </h6>
                </spring:bind>
                
                <spring:bind path="website">
                    <h6>
                        Website: &nbsp;
                        <form:input path="website" class="input-large" />
                        <form:errors path="website" cssClass="help-inline" />
                    </h6>
                </spring:bind>

                <spring:bind path="facebook">
                    <h6>
                        Facebook: &nbsp;
                        <form:input path="facebook" class="input-large" />
                        <form:errors path="facebook" cssClass="help-inline" />
                    </h6>
                </spring:bind>

                <spring:bind path="twitter">
                    <h6>
                        Twitter: &nbsp;
                        <form:input path="twitter" class="input-large" />
                        <form:errors path="twitter" cssClass="help-inline" />
                    </h6>
                </spring:bind>

                <spring:bind path="otherSocialMedia">
                    <h6>
                        Other Social Media: &nbsp;
                        <form:textarea path="otherSocialMedia" rows="5" cols="30" />
                        <form:errors path="otherSocialMedia" cssClass="help-inline" />
                    </h6>
                </spring:bind>
            </div>

        </div>

        <div class="col-xs-12 col-sm-6">

            <div style="height:200px;background-color:#f6f6f6;;">
                <spring:bind path="linkedInCurrentCompany">
                    <h6>
                        Current Company: &nbsp;
                        <form:input path="linkedInCurrentCompany" class="input-large" />
                        <form:errors path="linkedInCurrentCompany" cssClass="help-inline" />
                    </h6>
                </spring:bind>

                <spring:bind path="linkedInCurrentJobTitle">
                    <h6>
                        Current Job Title: &nbsp
                        <form:input path="linkedInCurrentJobTitle" class="input-large" />
                        <form:errors path="linkedInCurrentJobTitle" cssClass="help-inline" />
                    </h6>
                </spring:bind>

                <spring:bind path="linkedInPictureURL">
                    <h6>
                        LinkedIn Picture: &nbsp; 
                        <form:input path="linkedInPictureURL" class="input-large"/>
                        <form:errors path="linkedInPictureURL" cssClass="help-inline" />
                    </h6>
                </spring:bind>
            </div>

            <div style="background-color:#f6f6f6;; height:200px;">
                <spring:bind path="background">
                    <h6>
                        Background: &nbsp;
                        <form:textarea path="background" rows="10" cols="30" />
                        <form:errors path="linkedInPictureURL" cssClass="help-inline" />
                    </h6>
                </spring:bind>
            </div>

        </div>

    </div>

    <!-- Content Bottom -->
    <div class="row">
        <div class="col-xs-12 col-sm-12">

            <div style="padding:10px;background-color:#f6f6f6;; height:300px;">
                
                <spring:bind path="industry">
                    <h6>
                        Industry: &nbsp; 

                        <form:select path="industry" class="input-large" >
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
                        <form:errors path="industry" cssClass="help-inline" />
                    </h6>
                </spring:bind>

                <spring:bind path="areasOfExpertise">
                    <h6>
                        Expertise: &nbsp;
                        <form:input path="areasOfExpertise" class="input-large" />
                        <form:errors path="areasOfExpertise" cssClass="help-inline" />
                    </h6>
                </spring:bind>
                
                <spring:bind path="email">
                    <div class="control-group ${status.error ? 'error' : ''}">
                        <form:label path="email" class="control-label">
                            Email
                        </form:label>
                        <div class="controls">
                            <form:input path="email" class="input-large" />
                            <form:errors path="email" cssClass="help-inline" />
                        </div>
                    </div>
                </spring:bind>
                <spring:bind path="linkedInId">
                    <form:hidden path="linkedInId" />
                </spring:bind>
                        
                <spring:bind path="userType">
                    <h6>
                        User Type: &nbsp;
                        <form:input path="userType" class="input-large" />
                        <form:errors path="userType" cssClass="help-inline" />
                    </h6>
                </spring:bind>
            </div>

        </div>
    </div>
    <button class="btn btn-info" type="submit" style="background:#27ae60;border-radius:0%;width:150px;">
        Create Profile
    </button>
</div>

</form:form>

<!--<script type="text/javascript">
    function loadData() {
        document.getElementById("userType").value = document.getElementById("userTypeB").value();
    }
</script>-->
                        
<!-- BOOTSTRAP! -->
<script src="https://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.7/jquery-ui.min.js"></script>
<script src="https://netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>
