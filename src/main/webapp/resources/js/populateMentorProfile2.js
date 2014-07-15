function loadData() {
                IN.API.Profile("me")
                .fields(["id", "firstName", "lastName", "pictureUrl","headline","publicProfileUrl",

                         "industry","three-current-positions"])
                .result(function(result) {
                 profile = result.values[0];
                 
                 //bring in picture from linkedin, but only if the user has one
                 if(profile.pictureUrl !== null){
                     document.getElementById('mentor-picture').innerHTML = '<img src="'+pictureUrl+'">';        
                 }
                 
                 document.getElementById('profile-info').innerHTML = "<ul><li><h4>"+firstName+" "+lastName+"</h4></li><li>"+headline+"</li>";
                 threeCurrentPositions.count 
                });
            }