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
                                <a class="btn btn-info" href="#" id="indexButton">LOGIN</a>
                            </form>
                        </div>
                        </div>
                </div> 
        </div>
        <div class="container-fluid" style="margin-right:20px;margin-left:20px;">
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
            <div class="row-fluid" style="padding:10px;height:200px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%"><h4>Personal Details</h4></div>
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%"><h4>Background</h4></div>
            </div>
            <div class="row-fluid" style="padding:10px;height:200px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%"> <h4>Areas of Expertise</h4> </div>
                <div class="span6" style="margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%"> <h4>Current Connections</h4> </div>
            </div>
            <div class="row-fluid" style="padding:10px;height:200px;margin:0;background-color:lightgray;" id="firstFluid">
                <div class="span12" style="margin-top:0px;margin-bottom:0px;background-color:#f6f6f6;height:100%"></div>
            </div>
        </div>
        
        <!-- BOOTSTRAP! -->
        <script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<script scr="/js/bootstrap.js"></script>
        
        
    </body>
</html>