<form:form modelAttribute="founder">
        <div class="container-fluid" style="margin-right:70px;margin-left:70px;">
            <div class="row-fluid"><div class="span12"></div></div>

            <div class="row-fluid" style="padding:10px;height:20px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:lightgray;height:100%"></div>
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:lightgray;height:100%"></div>
            </div>

            <div class="row-fluid" style="padding:10px;height:2000px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%;position:relative;">
                    <center><h4><i class="icon-user"></i> Company Details</h4></center>
                    
                    <ul>
                        <li>THIS IS FOUNDER PAGE</li>
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
                        
                        <spring:bind path="companyDetails">
                            <h6 style="margin:10px 0px;">
                                &nbsp; &nbsp; &nbsp; &nbsp; Company Description: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                                <form:textarea path="companyDetails" rows="10" cols="30" style="left:0px;" />
                                <form:errors path="companyDetails" cssClass="help-inline" style="text-align:left;"/>
                            </h6>
                        </spring:bind>
                        
                        <spring:bind path="inspiration">
                            <h6 style="margin:10px 0px;">
                                &nbsp; &nbsp; &nbsp; &nbsp; Inspiration: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                                <form:textarea path="inspiration" rows="10" cols="30" style="left:0px;" />
                                <form:errors path="inspiration" cssClass="help-inline" style="text-align:left;"/>
                            </h6>
                        </spring:bind>
                        
                        <spring:bind path="programPlan">
                            <h6 style="margin:10px 0px;">
                                &nbsp; &nbsp; &nbsp; &nbsp; Program Plan: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                                <form:textarea path="programPlan" rows="10" cols="30" style="left:0px;" />
                                <form:errors path="programPlan" cssClass="help-inline" style="text-align:left;"/>
                            </h6>
                        </spring:bind>
                        
                        <spring:bind path="weeklyReports">
                            <h6 style="margin:10px 0px;">
                                &nbsp; &nbsp; &nbsp; &nbsp; Weekly Reports: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                                <form:textarea path="weeklyReports" rows="10" cols="30" style="left:0px;" />
                                <form:errors path="weeklyReports" cssClass="help-inline" style="text-align:left;"/>
                            </h6>
                        </spring:bind>
                    </ul>
                </div>
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%;position:relative;">
                    <center><h4><i class="icon-road"></i> Background</h4></center>

                    
                    <spring:bind path="logo">
                        <h6 style="margin:10px 0px;">
                            &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; Logo: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                            <form:input path="logo" class="input-large" style="left:0px;" />
                            <form:errors path="logo" cssClass="help-inline" style="text-align:left;"/>
                        </h6>
                    </spring:bind>
                    
                    <spring:bind path="tagline">
                        <h6 style="margin:10px 0px;">
                            &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; Tagline: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                            <form:input path="tagline" class="input-large" style="left:0px;" />
                            <form:errors path="tagline" cssClass="help-inline" style="text-align:left;"/>
                        </h6>
                    </spring:bind>
                    
                    <spring:bind path="elevatorPitch">
                            <h6 style="margin:10px 0px;">
                                &nbsp; &nbsp; &nbsp; &nbsp; Elevator Pitch: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                                <form:textarea path="elevatorPitch" rows="10" cols="30" style="left:0px;" />
                                <form:errors path="elevatorPitch" cssClass="help-inline" style="text-align:left;"/>
                            </h6>
                    </spring:bind>
                    
                    <spring:bind path="immediateNeeds">
                            <h6 style="margin:10px 0px;">
                                &nbsp; &nbsp; &nbsp; &nbsp; Immediate Needs: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                                <form:textarea path="immediateNeeds" rows="10" cols="30" style="left:0px;" />
                                <form:errors path="immediateNeeds" cssClass="help-inline" style="text-align:left;"/>
                            </h6>
                    </spring:bind>
                    
                    <spring:bind path="status">
                            <h6 style="margin:10px 0px;">
                                &nbsp; &nbsp; &nbsp; &nbsp; Status: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                                <form:textarea path="status" rows="10" cols="30" style="left:0px;" />
                                <form:errors path="status" cssClass="help-inline" style="text-align:left;"/>
                            </h6>
                    </spring:bind>
                    
                    <spring:bind path="vision">
                            <h6 style="margin:10px 0px;">
                                &nbsp; &nbsp; &nbsp; &nbsp; Vision: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                                <form:textarea path="vision" rows="10" cols="30" style="left:0px;" />
                                <form:errors path="vision" cssClass="help-inline" style="text-align:left;"/>
                            </h6>
                    </spring:bind>
                    
                    <spring:bind path="newOrleans">
                            <h6 style="margin:10px 0px;">
                                &nbsp; &nbsp; &nbsp; &nbsp; New Orleans: &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                                <form:textarea path="newOrleans" rows="10" cols="30" style="left:0px;" />
                                <form:errors path="newOrleans" cssClass="help-inline" style="text-align:left;"/>
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

