<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Founder Edit</title>

        <!-- BOOTSTRAP! -->
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="/mentormarketplace/resources/css/navigationBar.css"  type="text/css"/>
        <link rel="stylesheet" href="/mentormarketplace/resources/css/founderSocial.css"  type="text/css"/>
    </head>

    <body id="createBody">

        <%@include file="../nav.jsp" %>

        <form:form modelAttribute="registrationForm">

            <div class="container" id="editMainContainer">

                <div id="editProfileMainContainer">

                    <!-- Top Row -->
                    <div class="row">

                        <div class="col-sm-12">

                            <div id="createProfileMenu"> Edit Profile - Founder</div>

                        </div>

                    </div>


                    <!-- Content Body -->

                    <div class="row margin-top-20">

                        <div class="col-sm-12">

                            <div class="col-md-6 padding-left-20 padding-right-10">

                                <div id="editProfileMentorSocialInfo">

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

                            <div class="col-md-6 padding-left-10 padding-right-20">

                                <div class="section-200 sm-margin-top-20" id="rowTwoDivTwoChild">

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

                                <div class="section-200" id="rowTwoDivTwoSecondChild">
                                    <table>
                                        <spring:bind path="immediateNeeds">

                                            <tr>
                                                <td>Immediate Needs: &nbsp;</td>
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


                                        <spring:bind path="userType">
                                            <form:hidden path="userType"></form:hidden>
                                        </spring:bind>

                                    </table>
                                </div>

                            </div>

                        </div>

                    </div>                  
                    <!-- Content Bottom -->

                    <div class="row margin-top-20">

                        <div class="col-sm-12 padding-left-20 padding-right-20">

                            <div class="col-sm-12">

                                <div id="rowThreeDivOne">

                                    <table>
                                        <spring:bind path="industry">
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
                                        </spring:bind>

                                        <spring:bind path="areasOfExpertise">
                                            <tr>
                                                <td>Expertise:</td>
                                                <td><form:input path="areasOfExpertise" class="input-large" />
                                                    <form:errors path="areasOfExpertise" cssClass="help-inline" /></td>
                                            </tr>
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
                                            <form:hidden path="userType"/>
                                        </spring:bind>
                                    </table>

                                </div>

                            </div>

                        </div>

                    </div>

                    <div class="row margin-top-20 margin-bottom-20 padding-bottom-20 ">

                        <div class="col-sm-12 padding-left-20 padding-right-20">  
                            <div class="col-sm-12">
                                <button class="btn btn-info" type="submit" id="editUpdateProfileButton">
                                    Update Profile
                                </button>
                            </div>

                        </div>

                    </div>

                </div>
            </form:form>
            <!-- BOOTSTRAP! -->
            <script src="https://code.jquery.com/jquery-1.10.1.min.js"></script>
            <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.7/jquery-ui.min.js"></script>
            <script src="https://netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>
        </div>
    </body>
</html>
