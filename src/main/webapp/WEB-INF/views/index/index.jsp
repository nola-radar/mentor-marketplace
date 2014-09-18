        <!-- Header -->
        <%@include file="../header.jsp" %>
        
        <!-- Navigation Bar -->
        <nav class="navbar navbar-default navbar-static-top navbar-bg-blue" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <img class="brand" src="<c:url value="/resources/img/Nav_Bar_Logo.png" />" id="navBarLogo" />
                </div>
                
                <div class="navbar-header">
                    <a class="navbar-brand" href="#"> Mentor Marketplace </a>
                </div>

                <div class="navbar-right">
                    <a href="<c:url value="/auth/linkedin" />" class="btn btn-success"> LOG IN </a>
                </div>
            </div>
        </nav>
        
        <!-- Registration Area -->
        <div id="indexRegistrationPage"> 
            <div class="indexContainer">
                <div class="indexGraphic">
                    <div class="indexGraphicTextLeft">
                        <h2> Founder </h2>
                    </div>

                    <div class="indexGrpahicTextRight">
                        <h2> Mentor </h2>
                    </div>     
                </div>

                <div class="indexRegistationButton">
                    <a href="<c:url value="/auth/linkedin" />" class="btn btn-success" id="registrationButton"> REGISTER </a>
                </div>
            </div>
        </div>
                
        <!-- Index Topic Area -->
        <div class="indexRegistrationInfo">
            <div class="container">
                <h2 class="text-center"> Mentor Marketplace </h2>
                <div class="row">
                    <div class="col-md-4 text-center indexTopic">
                        <h4> Connect </h4>
                        <p> Our platform allows participating founders to easily identify the local and national experts who can help them define and scale their businesses.</p>
                    </div>
                    
                    <div class="col-md-4 text-center indexTopic">
                        <h4> Meet </h4>
                        <p> The ability to turn a connection into a meeting our phone call has been streamlined to emphasize value instead of spending time getting in front of potential mentors.</p>
                    </div>
                    
                    <div class="col-md-4 text-center indexTopic">
                        <h4> Innovate </h4>
                        <p> Together founders and mentors can shape a business that can change and industry, change New Orleans, and grow nationally.</p>
                    </div>
                </div>
            </div>
        </div>
                
        <!-- Mission Statement -->
        <div class="indexMissionStatement">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 text-center">
                        <h2> Our Mission</h2>
                    </div>
                    
                    <div class="col-md-8">
                        <p> At The Idea Village our mission is to create change through entrepreneurship. IDEAx is our program for the highest potential founders in New Orleans. These companies have been selected through a rigorous application and interview process by local business leaders and experts. They are embarking on an 11 week journey to grow as much as possible and develop a roadmap for future success. To do so, it takes a village... IDEAx focuses on making strategic connections on behalf of founders to experts in the community who can accelerate their rate of growth. The Mentor Program will use a new technology, known as the Mentor Marketplace (which you're looking at right now) to pair founders with the Idea Village mentors who can have an impact on the course of these startups. Whether a connection leads to one phone call and a few nuggets of knowledge or a meeting that grows.</p>
                    </div>
                </div>
            </div>
        </div>
        
        <!-- Footer -->
        <%@include file="../footer.jsp" %>