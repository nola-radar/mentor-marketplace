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
        <link rel="stylesheet" href="<c:url value="/resources/css/navigationBar.css" />"  type="text/css"/>
    </head>

    <body>

        <!-- Navigate Bar -->
        <div class="navbar navbar-fixed-top-idea" id="indexNav"> 

            <div class="navbar-inner-idea"> 

                <div class="container" id="navIndex">

                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"><span class="icon-th-list"></span></a>
                    <img class="brand" src="/mentormarketplace/resources/img/IdeaLogo.png" style="height:21px;padding-left:40px;padding-right:20px;"/>
                    <a href="#" class="brand" id="indexLink">MENTOR MARKETPLACE</a>

                    <div class="nav-collapse collapse pull-right">

                        <form class="navbar-form pull-left" id="indexForm">
                            <a class="btn btn-info" href="<c:url value="/auth/linkedin" />" id="indexButton">LOGIN</a>
                        </form>

                    </div>
                </div>
            </div>
        </div>

        <!-- Section Contained Two Clouds and Register Buttons -->
        <div class="hero-unit-idea">
            <img src="/mentormarketplace/resources/img/indexBack.png" id="indexHalfmoom">
            <div class="row-fluid">
                <div class="span12"></div>
            </div>
            <div class="row-fluid">
                <div class="span12"></div>
            </div>
            <div class="row-fluid">
                <div class="span12"></div>
            </div>
            <div class="row-fluid">
                <div class="span3"></div>
                <div class="span2" id="cloudText1">
                    <center>
                        <h5>Founder</h5>
                        <div id="pwrap"><p id="cloudParagraph">For Companies Participating in the 2015 IDEAx Program</p></div>
                        <form class="navbar-form pull-left" id="indexForm">
                        </form>
                    </center>
                </div>
                <div class="span2">
                    <br><br><br><br><br>
                    <a href="<c:url value="/auth/linkedin" />"  class="btn btn-info" id="registerButtonMiddle">REGISTER</a>
                </div>
                <div class="span2" id="cloudText2">
                    <center>
                        <h5>Mentor</h5>
                        <div id="pwrap"><p id="cloudParagraph">For Leaders Mentoring Companies in the 2015 IDEAx Program</p></div>
                        <form class="navbar-form pull-left" id="indexForm">
                        </form>
                    </center>
                </div>
                <div class="span3"></div>
            </div>
        </div>

        <!-- Section Containing Connect, Meet, and Innovate -->
        <div class="row" id="titleBanner">
            <div class="row">
                <center class="h3" style="text-align: center">Welcome to the Mentor Marketplace</center>
            </div>  
        </div>

        <div class="row" id="firstFluid">
            <div class="span10 center">
                <div class="span3" style="margin-left: 20px !important;">
                    <center><img src="/mentormarketplace/resources/img/indexCircle.png" id="indexCircle"></center>
                    <h4>Connect</h4>
                    <p>Our platform allows participating founders to easily identify the local and national experts who can help them define and scale their businesses.</p>
                </div>
                <div class="span3">
                    <center><img src="/mentormarketplace/resources/img/indexCircle.png" id="indexCircle"></center>
                    <h4>Meet</h4>
                    <p>The ability to turn a connection into a meeting our phone call has been streamlined to emphasize value instead of spending time getting in front of potential mentors.</p>
                </div>
                <div class="span3">
                    <center><img src="/mentormarketplace/resources/img/indexCircle.png" id="indexCircle"></center>
                    <h4>Innovate</h4>
                    <p>Together founders and mentors can shape a business that can change and industry, change New Orleans, and grow nationally.</p>
                </div>
                </div>
            </div>
        </div>

        <!-- Section Explaining Mission of IdeaVillage -->
        <div class="row-fluid" id="secondFluid">
            <center>
                <div class="span9 center">
                    <center><h3 class="text-center  pagination-centered">Our Mission</h3></center>
                    <center><p>At The Idea Village our mission is to create change through entrepreneurship. IDEAx is our program for the highest potential founders in New Orleans. These companies have been selected through a rigorous application and interview process by local business leaders and experts. They are embarking on an 11 week journey to grow as much as possible and develop a roadmap for future success. To do so, it takes a village... <br><br> IDEAx focuses on making strategic connections on behalf of founders to experts in the community who can accelerate their rate of growth. The Mentor Program will use a new technology, known as the Mentor Marketplace (which you're looking at right now) to pair founders with the Idea Village mentors who can have an impact on the course of these startups. Whether a connection leads to one phone call and a few nuggets of knowledge or a meeting that grows. </p></center>
                </div>
            </center>
        </div>
    </body>
</html>
