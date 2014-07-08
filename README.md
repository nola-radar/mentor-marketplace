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