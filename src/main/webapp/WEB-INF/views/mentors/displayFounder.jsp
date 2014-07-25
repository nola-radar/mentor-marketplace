<form:form modelAttribute="founder">
    <div class="container-fluid" style="margin-right:70px;margin-left:70px;padding-right:2px;padding-left:7px;background-color:#ffffff;">
         
            <!-- Top Row -->
            <div class="row"">

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
                    
                    <div  style="background-color:#f6f6f6;; height:400px;">
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
                        
                        <spring:bind path="companyDetails">
                            <h6>
                                Company Description: &nbsp;
                                <form:textarea path="companyDetails" rows="5" cols="30" />
                                <form:errors path="companyDetails" cssClass="help-inline" />
                            </h6>
                        </spring:bind>
                        
                        <spring:bind path="inspiration">
                            <h6>
                                Inspiration: &nbsp; 
                                <form:textarea path="inspiration" rows="5" cols="30" />
                                <form:errors path="inspiration" cssClass="help-inline" />
                            </h6>
                        </spring:bind>
                        
                    </div>
                    
                </div>
                
                <div class="col-xs-12 col-sm-6">
                    
                    <div style="height:200px;background-color:#f6f6f6;;">
                        <spring:bind path="logo">
                            <h6>
                                Logo: &nbsp;
                                <form:input path="logo" class="input-large" />
                                <form:errors path="logo" cssClass="help-inline" />
                            </h6>
                        </spring:bind>

                        <spring:bind path="tagline">
                            <h6>
                                Tagline: &nbsp; 
                                <form:input path="tagline" class="input-large" />
                                <form:errors path="tagline" cssClass="help-inline"/>
                            </h6>
                        </spring:bind>

                        <spring:bind path="elevatorPitch">
                                <h6>
                                    Elevator Pitch: &nbsp; 
                                    <form:textarea path="elevatorPitch" rows="5" cols="30" />
                                    <form:errors path="elevatorPitch" cssClass="help-inline" />
                                </h6>
                        </spring:bind>
                    </div>
                    
                    <div style="background-color:#f6f6f6;; height:200px;">
                        <spring:bind path="immediateNeeds">
                                <h6>
                                    Immediate Needs: &nbsp;
                                    <form:textarea path="immediateNeeds" rows="2" cols="30" />
                                    <form:errors path="immediateNeeds" cssClass="help-inline" />
                                </h6>
                        </spring:bind>

                        <spring:bind path="status">
                                <h6>
                                    Status: &nbsp;
                                    <form:textarea path="status" rows="2" cols="30" />
                                    <form:errors path="status" cssClass="help-inline" />
                                </h6>
                        </spring:bind>

                        <spring:bind path="vision">
                                <h6>
                                    Vision: &nbsp;
                                    <form:textarea path="vision" rows="2" cols="30" />
                                    <form:errors path="vision" cssClass="help-inline" />
                                </h6>
                        </spring:bind>

                        <spring:bind path="newOrleans">
                                <h6>
                                    New Orleans: &nbsp;
                                    <form:textarea path="newOrleans" rows="2" cols="30" />
                                    <form:errors path="newOrleans" cssClass="help-inline" />
                                </h6>
                        </spring:bind>
                    </div>
                    
                </div>
                
            </div>
            
            <!-- Content Bottom -->
            <div class="row">
                <div class="col-xs-12 col-sm-12">
                    
                    <div style="padding:10px;background-color:#f6f6f6;; height:300px;">
                        <spring:bind path="programPlan">
                            <h6>
                                Program Plan: &nbsp; 
                                <form:textarea path="programPlan" rows="5" cols="30" />
                                <form:errors path="programPlan" cssClass="help-inline" />
                            </h6>
                        </spring:bind>
                        
                        <spring:bind path="weeklyReports">
                            <h6>
                                Weekly Reports: &nbsp;
                                <form:textarea path="weeklyReports" rows="5" cols="30" />
                                <form:errors path="weeklyReports" cssClass="help-inline" />
                            </h6>
                        </spring:bind>
                        
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
                    </div>
                    
                </div>
            </div>
            <button class="btn btn-info" type="submit" style="background:#27ae60;border-radius:0%;width:150px;">
                Create Profile
            </button>
    </div>
    
 </form:form>

        <!-- BOOTSTRAP! -->
        <script src="https://code.jquery.com/jquery-1.10.1.min.js"></script>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.7/jquery-ui.min.js"></script>
        <script src="https://netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>

