# java
Clone or download repo
Import Project into IDE as Maven Project
Then Right click project and Maven -> Update project
Either create mysql db Vector_db or import mysql db src/main/resources/database/vector_db.sql
Test GET in postman to list all users localhost:8081/user
Test POST in postman to Creat new user localhost:8081/user
Sample JSON 
{
        "id": 2,
        "firstname": "test2",
        "lastname": "Test",
        "email": "test2@test.com",
        "password": "test"
    }
    
Test UPDATE by email in postman localhost:8081/user/{email} , replace email with actual email
Test DELETE by email in postman localhost:8081/user/{email} , replace email with actual email
