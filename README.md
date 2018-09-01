# DB_Migration_Example
## To run the application you must have the following set up
1. A MySql server instance with the database media_library created.
2. A user with the username springuser and the password SpringUserPassword. <br />
 *Please note you can change this to be whatever you but you will need to update the application.yml file* 

## Changing from using flyway to using liquibase
In the application.yml file there are two properties<br /> 
 
 flyway:<br />
    enabled: true <br />
  liquibase:<br />
    enabled: false   

 
 Change the property to true and the other to false depending on which you would like to run.
    
