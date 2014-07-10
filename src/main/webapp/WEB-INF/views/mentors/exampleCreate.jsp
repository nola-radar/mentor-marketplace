<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8" name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
        
        <!-- BOOTSTRAP! -->
        <link rel="stylesheet" href="/mentormarketplace/resources/css/bootstrap.css"  type="text/css"/>
        <link rel="stylesheet" href="/mentormarkeplace/resources/css/bootstrap-responsive.css" type="text/css"/>
        
    </head>
    <body style="background-color:lightgray;">
        
        <!-- Navigate Bar -->
        <div class="navbar navbar-fixed-top-idea" style="margin-bottom:0px;"> 
                <div class="navbar-inner-idea"> 
                        <div class="container" id="navIndex" style="background-color:#203747;">
                                <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-th-list"></span></a>
                        <img class="brand" src="/mentormarketplace/resources/img/logo.png" style="height:21px;padding-left:40px;padding-right:20px;"/>
                        <a href="#" class="brand" id="indexLink">MENTOR MARKETPLACE</a>
                        <div class="nav-collapse collapse pull-right">
                            <form class="navbar-form pull-left" id="indexForm">
                                <a class="btn btn-info" href="#" id="indexButton">LOG OUT</a>
                            </form>
                        </div>
                        </div>
                </div> 
        </div>
        
        <div class="container-fluid" style="margin-right:20px;margin-left:20px;">
            <div class="row-fluid"><div class="span12"></div></div>
            <!-- Section Contained Two Clouds and Register Buttons -->
            <!--<div class="hero-unit-idea1">
                    <div class="row-fluid" style="z-index:0;">
                        <div class="span12"></div>
                    </div>
                    <div class="row-fluid" style="z-index:0;">
                        <div class="span12"></div>
                    </div>
                    <div class="row-fluid" style="z-index:0;">
                        <div class="span12"></div>
                    </div>-->
                <!--<center><img src="/mentormarketplace/resources/img/indexBack.png" id="indexHalfmoom"></center>
            </div>-->
            <div class="row-fluid" style="padding:10px;height:20px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:lightgray;height:100%"></div>
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:lightgray;height:100%"></div>
            </div>
                
            <div class="row-fluid" style="padding:10px;height:40px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span12" style="margin-top:0px;margin-bottom:0px;background-color:#203747;height:100%;position:relative;">
                    <center><h3 style="color:white;top:0;padding:0;margin:0;">Marcus Bischof</h3></center>
                </div>
            </div>
            <div class="row-fluid" style="padding:10px;height:200px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%;position:relative;">
                    <a href="#"><img src="/mentormarketplace/resources/img/edit.png" style="padding:0;height:30px;width:30px;position:absolute;top:0;right:0;" /></a>
                    <center><h4><i class="icon-user"></i> Personal Details</h4></center>
                        <ul>
                            <li><img src="/mentormarketplace/resources/img/website.png" style="height:20px;width:20px;"/> Website: </li>
                            <li><img src="/mentormarketplace/resources/img/linkedin.jpg" style="height:17px;width:17px;"/> LinkedIn: </li>
                            <li><img src="/mentormarketplace/resources/img/twitter.png" style="height:20px;width:20px;"/> Twitter: </li>
                            <li><img src="/mentormarketplace/resources/img/facebook.png" style="height:20px;width:20px;"/> Facebook: </li>
                            <li>Other: </li>
                        </ul>
                </div>
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%;position:relative;">
                    <a href="#"><img src="/mentormarketplace/resources/img/edit.png" style="padding:0;height:30px;width:30px;position:absolute;top:0;right:0;" /></a>
                    <center><h4><i class="icon-road"></i> Background</h4></center>
                </div>
            </div>
            <div class="row-fluid" style="padding:10px;height:200px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%;position:relative;">
                    <a href="#"><img src="/mentormarketplace/resources/img/edit.png" style="padding:0;height:30px;width:30px;position:absolute;top:0;right:0;" /></a>
                    <center><h4><i class="icon-bookmark"></i> Areas of Expertise</h4></center>
                    <ul>
                        <li>Industry: </li>
                        <li>Consulting Expertise: </li>
                    </ul>
                </div>
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%;"> 
                    <center><h4><i class="icon-globe"></i> Current Connections</h4></center>
                </div>
            </div>
            <div class="row-fluid" style="padding:10px;height:200px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span12" style="margin-top:0px;margin-bottom:0px;background-color:ligthgray;height:100%;position:relative;">
                    <form class="navbar-form pull-left" id="indexForm">
                        <a class="btn btn-info" href="#" id="indexButton" style="padding:0;position:absolute;top:0;left:0;">REQUEST MENTORSHIP</a>
                    </form>
                </div>
            </div>
                
        </div>
        
        <!-- BOOTSTRAP! -->
        <script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<!-- <script scr="/js/bootstrap.js"></script> -->
        <!--<script scr="/js/bootstrap.js"></script>-->
       <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>
        
        
    </body>
</html>