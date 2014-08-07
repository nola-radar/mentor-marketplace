<nav class="navbar navbar-default" role="navigation" id="navDefault">

    <!-- BOOTSTRAP! -->
    <link rel="stylesheet" href="/mentormarketplace/resources/components/bootstrap-3.2.0/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/mentormarketplace/resources/css/navigationBar.css"  type="text/css"/>
    <link rel="stylesheet" href="/mentormarketplace/resources/css/founderSocial.css"  type="text/css"/>
    
    <!-- CSS and JS Plug-Ins -->
    <script src="/mentormarketplace/resources/components/requirejs/require.js"></script>
    <script src="/mentormarketplace/resources/js/require.config.js"></script>

    <!-- 
    < %@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    < %@page contentType="text/html" pageEncoding="UTF-8"%>
    
    <script type="text/javascript" src="<c:url value="/resources/js/jquery/jquery.min.js" />"></script>
    -->
    
    
    <div class="container-fluid">

        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">

            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>

            <img class="brand" src="/mentormarketplace/resources/img/logo.png" id="mentorLogo"/>

        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <h4 id="navHeader" class="nav navbar-nav">Mentor Marketplace</h4>

            <form class="navbar-form navbar-right" role="search">
                <button type="submit" class="btn btn-default" id="mentorNavButton">LOG OUT</button>
            </form>
        </div>
    </div>
</nav>