  function linkedInLogOut() {
               
             IN.User.logout(function() {
             location.href = "http://localhost:8080/mentormarketplace"; 
             //window.location = "/logout";
             });
         }