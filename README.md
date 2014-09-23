Idea Village Mentor Marketplace
===============================
The Mentor Marketplace is a tool to match entrepreneurs with mentors as part of Idea Village's IDEAxcelerator program.

Technical project dependencies
------------------------------
#### Building:
- Java 7
- Maven 3
- Git

#### Running:
- Java 7
- Tomcat 7
- PostgreSQL 9.3

Get the source
--------------
Download the code from GitLab:
`git clone git@nola.capital.ge.com:sweap/ideavillage.git`

Setting up the Database
-----------------------
Run the following commands from the `src/main/scripts` directory in either pgAdmin or psql:
1. create_users.sql
2. create_db.sql
3. create_tables.sql

Building the project
--------------------
Build the project:
`mvn clean package`

Run the project with the Maven embedded Tomcat:
`mvn tomcat7:run`
Go to http://localhost:8080/mentormarketplace to see the app.

Running Flyway Migration
------------------------
To run flyway migrations there are two ways to do this right now.

From The Command Line
`mvn compile flyway:migrate`

Inside Netbeans

1.Right Click the project and access proporties inside netbeans
2.Select the actions tab
3.Click Add Custom Button on the Left
4.Name the action "Flyway Migrate"
5.In the Execute goals section type "compile flyway:migrate"
6.Click Okay

Now when you right click ideavillage in netbeans, under "Custom" you will see the Flyway Migrate action.  Using this will run Flyway and migrate your database to the latest version.

Making Flyway Migration Scripts
--------------------------------
All Flway migration scripts need to be stored in the /src/main/resources directory under db.migration
The naming scheme for each script is
` V#__some_name`

Acceptance Tests
---------------------------
Linkedin Testing Account Info:

LoginFounder: acceptancetestuser@gmail.com
Pass: qualityassurance

LoginMentor: acceptancetestmentor@gmail.com
Pass: qualityassurance

LoginFounder: foundertestidea@gmail.com
Pass: testthefounder1

LoginMentor: ivmmdeveloper@gmail.com
Pass: ideavillage
