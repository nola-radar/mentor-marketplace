<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Founder Profile</title>

        <!-- BOOTSTRAP! -->
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="http://localhost:8080/mentormarketplace/resources/css/bootstrap-responsive.css" type="text/css" />
        <link rel="stylesheet" href="/mentormarketplace/resources/css/ivmm.css"  type="text/css"/>
    </head>
    
    <body id="createBody">
        <%@include file="../nav.jsp" %>
        <br><br><br>
        
        <div class="container" style="background-color:#f6f6f6;">
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

                            <div  style="background-color:#f6f6f6;; height:500px;">
                                <h4> ${founder.getFirstName()} ${founder.getLastName()}</h4>
                                <p> <strong>Website:</strong> &nbsp &nbsp ${founder.getWebsite()} </p>
                                <p> <strong>Facebook:</strong> &nbsp &nbsp ${founder.getFacebook()} </p>
                                <p> <strong>Twitter:</strong> &nbsp &nbsp ${founder.getTwitter()} </p>
                                <p> </p>
                            </div>

                        </div>

                        <div class="col-xs-12 col-sm-6">

                            <div style="background-color:#f6f6f6;height:250px;">
                                
                            </div>

                            <div style="background-color:#f6f6f6;; height:250px;">
                               
                            </div>

                        </div>

                    </div>

                    <!-- Content Bottom -->
                    <div class="row">
                        <div class="col-xs-12 col-sm-12">

                            <div style="padding:10px;background-color:#f6f6f6;; height:300px;">
                                
                            </div>

                        </div>
                    </div>
            </div>

                <!-- BOOTSTRAP! -->
                <script src="https://code.jquery.com/jquery-1.10.1.min.js"></script>
                <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.7/jquery-ui.min.js"></script>
                <script src="https://netdna.bootstrapcdn.com/bootstrap/3.0.2/js/bootstrap.min.js"></script>

    </body>
</html>


