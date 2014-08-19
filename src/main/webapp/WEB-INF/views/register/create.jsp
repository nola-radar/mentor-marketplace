        <!-- Header -->
        <%@include file="../header.jsp" %>
        
        <!-- Navigation Bar -->
        <%@include file="../shared/navigationBar.jsp" %>

        <!-- Create Profile Main Container -->
        <div class="container" id="createProfileMainContainer">
 
            <!-- Tab Panes -->
            <ul class="nav nav-tabs" id="myTab">
                <li class="active"><a href="#founder" data-toggle="tab">Founder</a></li>
                <li><a href="#mentor" data-toggle="tab">Mentor</a></li>  
            </ul>
            
            <!-- Tab panes -->
            <div id='content' class="tab-content">
                <div class="tab-pane active" id="founder">
                    <%@include file="createProfileFounder.jsp" %>
                </div>
                <div class="tab-pane" id="mentor">
                    <%@include file="createProfileMentor.jsp" %>
                </div>
            </div> 
        </div>
                
        <!-- Footer -->
        <%@include file="../footer.jsp" %>
