# companyschema
Company Schema using OAuth 2.0

### Description 

1. Configure Spring Security + database.
2. Created an Authorization Server, Resource Server, Web Security Configurations.
3. Authorization Server is used to obtain an access token and a refresh token
4. Secured Application Resources are accessed from the Resource Server using the access token obtained from the Authorizaion Server


### Technologies used
Spring Boot, Java, Maven, OAuth 2.0, Spring Security (UserDetailsService), H2 In Memory Database, Flyway for migration of data, Spring JPA, Hibernate, Postman, GitHub

### How to execute the project
1. Run the Spring Boot Application
2. Execute test requests using Postman

##### How to perform migrations using Flyway?
```
mvn flyway:repair
mvn compile flyway:migrate
mvn flyway:clean
mvn compile flyway:migrate
```




