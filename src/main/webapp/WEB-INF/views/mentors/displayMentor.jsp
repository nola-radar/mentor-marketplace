<form:form modelAttribute="mentor">
        <div class="container-fluid" style="margin-right:70px;margin-left:70px;">
            <div class="row-fluid"><div class="span12"></div></div>

            <div class="row-fluid" style="padding:10px;height:20px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:lightgray;height:100%"></div>
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:lightgray;height:100%"></div>
            </div>

            <div class="row-fluid" style="padding:10px;height:550px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%;position:relative;">
                    <center><h4><i class="icon-user"></i> Personal Details</h4></center>
                    <ul>
                        <spring:bind path="website">
                            <h6 style="margin:10px 0px;">
                                &nbsp; &nbsp; &nbsp; &nbsp; Website: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
                                <form:input path="website" class="input-large" style="left:0px;" />
                                <form:errors path="website" cssClass="help-inline" style="text-align:left;"/>
                            </h6>
                        </spring:bind>

                        <spring:bind path="facebook">
                            <h6 style="margin:10px 0px;">
                                &nbsp; &nbsp; &nbsp; &nbsp; Facebook: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
                                <form:input path="facebook" class="input-large" style="left:0px;" />
                                <form:errors path="facebook" cssClass="help-inline" style="text-align:left;"/>
                            </h6>
                        </spring:bind>

                        <spring:bind path="twitter">
                            <h6 style="margin:10px 0px;">
                                &nbsp; &nbsp; &nbsp; &nbsp; Twitter: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp;
                                <form:input path="twitter" class="input-large" style="left:0px;" />
                                <form:errors path="twitter" cssClass="help-inline" style="text-align:left;"/>
                            </h6>
                        </spring:bind>

                        <spring:bind path="otherSocialMedia">
                            <h6 style="margin:10px 0px;">
                                &nbsp; &nbsp; &nbsp; &nbsp; Other Social Media: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                                <form:textarea path="otherSocialMedia" rows="10" cols="30" style="left:0px;" />
                                <form:errors path="otherSocialMedia" cssClass="help-inline" style="text-align:left;"/>
                            </h6>
                        </spring:bind>
                        
                    </ul>
                </div>
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%;position:relative;">
                    <center><h4><i class="icon-road"></i> Background</h4></center>

                    <p>THIS IS MENTOR PAGE</p>
                    <spring:bind path="firstName">
                        <h6 style="margin:10px 0px;">
                            &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; First Name: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                            <form:input path="firstName" class="input-large" style="left:0px;" />
                            <form:errors path="firstName" cssClass="help-inline" style="text-align:left;"/>
                        </h6>
                    </spring:bind>

                    <spring:bind path="lastName">
                        <h6 style="margin:10px 0px;">
                            &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; Last Name: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                            <form:input path="lastName" class="input-large" style="left:0px;" />
                            <form:errors path="lastName" cssClass="help-inline" style="text-align:left;"/>
                        </h6>
                    </spring:bind>

                    <spring:bind path="linkedInCurrentCompany">
                        <h6 style="margin:10px 0px;">
                            &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; Current Company: &nbsp; &nbsp; 
                            <form:input path="linkedInCurrentCompany" class="input-large" style="left:0px;" />
                            <form:errors path="linkedInCurrentCompany" cssClass="help-inline" style="text-align:left;"/>
                        </h6>
                    </spring:bind>

                    <spring:bind path="linkedInCurrentJobTitle">
                        <h6 style="margin:10px 0px;">
                            &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; Current Job Title: &nbsp; &nbsp; &nbsp;
                            <form:input path="linkedInCurrentJobTitle" class="input-large" style="left:0px;" />
                            <form:errors path="linkedInCurrentJobTitle" cssClass="help-inline" style="text-align:left;"/>
                        </h6>
                    </spring:bind>

                    <spring:bind path="linkedInPictureURL">
                        <h6 style="margin:10px 0px;">
                            &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; LinkedIn Picture: &nbsp; &nbsp; &nbsp;
                            <form:input path="linkedInPictureURL" class="input-large" style="left:0px;" />
                            <form:errors path="linkedInPictureURL" cssClass="help-inline" style="text-align:left;"/>
                        </h6>
                    </spring:bind>

                    <spring:bind path="background">
                        <h6 style="margin:10px 0px;">
                            &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; Background: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                            <form:textarea path="background" rows="10" cols="30" style="left:0px;" />
                            <form:errors path="linkedInPictureURL" cssClass="help-inline" style="text-align:left;"/>
                        </h6>
                    </spring:bind>


                </div>
            </div>
            <div class="row-fluid" style="padding:10px;height:200px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%;position:relative;">
                    <center><h4><i class="icon-bookmark"></i> Areas of Expertise</h4></center>
                    <div style="position:absolute;margin-left:0px;margin:0;left:0;padding:0;">
                        <spring:bind path="industry">
                            <h6 style="margin:10px 0px;">
                                &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; Industry: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                                <!--<form:input path="industry" class="input-large" style="left:0px;" />
                                <form:errors path="industry" cssClass="help-inline" style="text-align:left;"/>-->
                                <form:select path="industry" class="input-large" style="left:0px;">
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
                                <form:errors path="industry" cssClass="help-inline" style="text-align:left;"/>
                            </h6>
                        </spring:bind>

                        <spring:bind path="areasOfExpertise">
                            <h6 style="margin:10px 0px;">
                                &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; Expertise: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                                <form:input path="areasOfExpertise" class="input-large" style="left:0px;" />
                                <form:errors path="areasOfExpertise" cssClass="help-inline" style="text-align:left;"/>
                            </h6>
                        </spring:bind>

                    </div>
                </div>
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%;"> 
                    <center><h4><i class="icon-globe"></i> Current Connections</h4></center>
                </div>
            </div>
            <div class="row-fluid" style="padding:10px;height:200px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span12" style="margin-top:0px;margin-bottom:0px;background-color:ligthgray;height:100%;position:relative;">
                    <div style="position:absolute;margin-left:0px;margin:0;left:0;padding:0;">
                        <button class="btn btn-info" type="submit" style="background:#27ae60;border-radius:0%;width:150px;">
                            Create Profile
                        </button>
                    </div>

                </div>
            </div>

        </div>
    </form:form>

    <!-- BOOTSTRAP! -->
    <script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>

