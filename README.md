Idea Village Mentor Marketplace
===============================
The Mentor Marketplace is a tool to match entrepreneurs with mentors as part of Idea Village's IDEAxcelerator program.

Technical project dependencies
------------------------------
####Building:  
- Java 7  
- Maven 3  
- Git  

####Running:  
- Java 7  
- Tomcat 7  
- PostgreSQL 9.3  

Building the project
--------------------
Download the code from GitLab:  
`git clone git@nola.capital.ge.com:sweap/ideavillage.git`

Build the project:  
`mvn clean package`

Run the project with the Maven embedded Tomcat:  
`mvn tomcat7:run`  
Go to http://localhost:8080/mentormarketplace to see the app.