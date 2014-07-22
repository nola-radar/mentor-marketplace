<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Mentor Marketplace</title>

        <!-- BOOTSTRAP! -->
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css" />"  type="text/css"/>
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-responsive.min.css" />" type="text/css"/>
    </head>
    <body>
        <!-- Navigate Bar -->
        <div class="navbar navbar-fixed-top-idea" style="margin-bottom:0px;"> 
            <div class="navbar-inner-idea"> 
                <div class="container" id="navIndex">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-th-list"></span></a>
                    <img class="brand" src="/mentormarketplace/resources/img/IdeaLogo.png" style="height:21px;padding-left:40px;padding-right:20px;"/>
                    <a href="#" class="brand" id="indexLink">MENTOR MARKETPLACE</a>
                    <div class="nav-collapse collapse pull-right">
                        <form class="navbar-form pull-left" id="indexForm">
                            <a href="<c:url value="/auth/linkedin" />" class="btn btn-info" id="indexButton">LOGIN</a>
                        </form>
                    </div>
                </div>
            </div> 
        </div>

        <!-- Section Contained Two Clouds and Register Buttons -->
        <div class="hero-unit-idea">
            <img src="/mentormarketplace/resources/img/indexBack.png" id="indexHalfmoom">
            <div class="row-fluid" style="z-index:0;">
                <div class="span12"></div>
            </div>
            <div class="row-fluid" style="z-index:0;">
                <div class="span12"></div>
            </div>
            <div class="row-fluid" style="z-index:0;">
                <div class="span12"></div>
            </div>
            <div class="row-fluid" style="z-index:0;">
                <div class="span3"></div>
                <div class="span2" id="cloudText" style="right:25px;top:25px;">
                    <center>
                        <h5>Founder</h5>
                        <div id="pwrap"><p id="cloudParagraph">For Companies Participating in the 2015 IDEAx Program</p></div>
                        <form class="navbar-form pull-left" id="indexForm">
                            <br>
                            <a href="<c:url value="/auth/linkedin" />" class="btn btn-info" id="indexButton">REGISTER</a>
                        </form>
                    </center>
                </div>
                <div class="span2"></div>
                <div class="span2" id="cloudText" style="left:35px;top:25px;">
                    <center>
                        <h5>Mentor</h5>
                        <div id="pwrap"><p id="cloudParagraph">For Leaders Mentoring Companies in the 2015 IDEAx Program</p></div>
                        <form class="navbar-form pull-left" id="indexForm">
                            <br>
                            <a href="<c:url value="/auth/linkedin" />" class="btn btn-info" id="indexButton2">REGISTER</a>
                        </form>
                    </center>
                </div>
                <div class="span3"></div>
            </div>
        </div>

        <!-- Section Containing Connect, Meet, and Innovate -->
        <center>
            <div class="row-fluid" id="firstFluid">
                <div class="span12">
                    <center><h3 class="text-center  pagination-centered">Welcome to the Mentor Marketplace</h3></center>
                </div>  
            </div>

            <div class="row-fluid" style="height:300px;" id="firstFluid">
                <div class="span4">
                    <center><img src="/mentormarketplace/resources/img/indexCircle.png" id="indexCircle"></center>
                    <h4>Connect</h4>
                    <p>Our platform allows participating founders to easily identify the local and national experts who can help them define and scale their businesses.</p>
                </div>
                <div class="span4">
                    <center><img src="/mentormarketplace/resources/img/indexCircle.png" id="indexCircle"></center>
                    <h4>Meet</h4>
                    <p>The ability to turn a connection into a meeting our phone call has been streamlined to emphasize value instead of spending time getting in front of potential mentors.</p>
                </div>
                <div class="span4">
                    <center><img src="/mentormarketplace/resources/img/indexCircle.png" id="indexCircle"></center>
                    <h4>Innovate</h4>
                    <p>Together founders and mentors can shape a business that can change and industry, change New Orleans, and grow nationally.</p>
                </div>
            </div>

        </center>

        <!-- Section Explaining Mission of IdeaVillage -->
        <center>
            <div class="row-fluid" id="secondFluid">
                <center>
                    <div class="span12">
                        <center><h3 class="text-center  pagination-centered">Our Mission</h3></center>
                        <center><p>At The Idea Village our mission is to create change through entrepreneurship. IDEAx is our program for the highest potential founders in New Orleans. These companies have been selected through a rigorous application and interview process by local business leaders and experts. They are embarking on an 11 week journey to grow as much as possible and develop a roadmap for future success. To do so, it takes a village... <br><br> IDEAx focuses on making strategic connections on behalf of founders to experts in the community who can accelerate their rate of growth. The Mentor Program will use a new technology, known as the Mentor Marketplace (which you're looking at right now) to pair founders with the Idea Village mentors who can have an impact on the course of these startups. Whether a connection leads to one phone call and a few nuggets of knowledge or a meeting that grows. </p></center>
                    </div>
                </center>
            </div>
        </center>

        <!-- BOOTSTRAP! -->
        <script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
        <script src="<c:url value="/resources/js/bootstrap.js" />"></script>
    </body>
</html>

