<html>

    <head>
        <meta charset="utf-8" name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
        
        <!--LinkedIn-->
        <script type="text/javascript" src="http://platform.linkedin.com/in.js">
            api_key: 756f7ogbvydmk2
            authorize: true
        </script>
        
        <!-- BOOTSTRAP! -->
        <link rel="stylesheet" href="/mentormarketplace/resources/css/bootstrap.css"  type="text/css"/>
      <!--<link rel="stylesheet" href="/mentormarkeplace/resources/css/bootstrap-responsive.css" type="text/css"/> -->
        
        <!-- Our custom css -->
        <link rel="stylesheet" href="/mentormarketplace/resources/css/additional.css" type="text/css"/>
        
        <!--LinkedIn-->
        <link media="all" type="text/css" href="../css/streamin.css" rel="stylesheet"/>
        <link media="all" type="text/css" href="../css/jqueryui.css" rel="styleshpt" src="http://code.jquery.com/jquery-1.5b1.js"></script>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.7/jquery-ui.min.js"></script>
        
    </head>
    
    <body>
        
        <!-- Navigation Bar -->
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
        
        <!-- Div that holds everything -->
        <div class="content" style="background-color:lightgray; padding:0 5% 0 5%;">
            <!-- div for center container -->
            <div class="container-fluid" style="background-color:#fff; width:90%; margin-left:3%;">
                <br />
                <br />
                <div class="row-fluid" style="margin-top:8px;">
                    <div class="span1"></div>
                    <div class="span1" id ="mentor-picture" style="margin:0 0 0 -1%;">PICTURE</div>
                    <div class="span4" id="profile-info">
                        <ul>
                            <li><h4>COMPANY</h4></li>
                            <li>First Last</li>
                            <li>Tagline</li>
                        </ul>
                    </div>
                    <div class="span1"></div>
                    <div class="span4" id="mentor-websites" style="text-align: right;">
                        <ul>
                            <li>WEBSITE</li>
                            <li>FACEBOOK</li>
                            <li>TWITTER</li>
                        </ul>
                    </div>
                </div>
                <br />
                <div class="row-fluid">
                    <div class="span1"></div>
                    <div class="span8" id="mentor-background" style="background-color:#f9f9f9; height: 40%; width:90%; margin-left:-1.5%;">
                        <h5>Background</h5>
                    </div>
                    <div class="span1"></div>
                </div>
                <br />
                   <div class="row-fluid">
                    <div class="span1"></div>
                    <div class="span8" id="mentor-expertise" style="background-color:#f9f9f9; height:40%; width:90%; margin-left:-1.5%;">
                        <h5>Areas of Expertise</h5>
                    </div>
                    <div class="span2"></div>
                </div>
                <br />
                
                
            </div>           
        </div>
        
        <script type="text/javascript">
           function loadData() {
               IN.API.Profile("me")
               .fields(["id", "firstName", "lastName", "pictureUrl","headline","publicProfileUrl",
                "three-current-positions", "three-past-positions"])
               .result(function(result) {
                 profile = result.values[0];
                
                 picHTML = "<img class=img_border align=\"left\" src=\"" + profile.pictureUrl + "\"></a>";      
                 $("#mentor-picture").html(picHTML);
                 
                 pastCompanies = profile.threePastPositions.values;
                 currentCompanies = profile.threeCurrentPositions.values;
                 var listItems = "";      
        
                 for(i=0; i<currentCompanies.length; i++){
                     listItems+= 
                             "<li>" +
                               currentCompanies[i].company.name + "<br />" +
                               currentCompanies[i].startDate.month + "/" + currentCompanies[i].startDate.year + " - " + "Current" +
                             "</li>" + "<br />";                            
                     } 
                                                             
                for(i=0; i<currentCompanies.length; i++){
                     listItems+= 
                             "<li>" +
                               pastCompanies[i].company.name + "<br />" +
                               pastCompanies[i].startDate.month + "/" + currentCompanies[i].startDate.year + " - " +
                               pastCompanies[i].endDate.month + "/" + pastCompanies[i].endDate.year +
                             "</li>" + "<br />";
                     }
                      
                 bkgrndHTML = "<h5>Background</h5>" + "<br />" +
                              "<ul>" + listItems + "</ul>";
                 $("#mentor-background").html(bkgrndHTML);
               });
           }
       </script>

        
        <footer style="background-color:lightgray;">
            <p>Footer text</p>
        </footer>
       
       <div style="display:none;">
            <script type="IN/Login" data-onAuth="loadData"></script>
        </div>
        
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    </body>
    
    
</html>