# Up-Tasks-Graphql-Backend

The Current Project is a implementation of the  Tasks Project Management System, developing using Spring
Boot Framework and GraphQL, GraphQL is protocol agnostic, it means that you can use it 
with any protocol as long as you can send and retrieve a string.

GraphQL has a single endpoint that returns flexible data structures. This will
by default host the GraphQL Api on the /graphiql endpoint, and accept POST request to it unlike 
in Rest Architecture.


## Stack Technology
* Java 8+
* Spring Boot Framework (Spring Security, Spring Data)
* Lombok Project  
* MongoDb (Mongo Atlas Cloud Service)
* GraphQL
* JWT
* Docker  
* Maven

## Maven Configuration
Add the dependency for GraphQL support  to your maven pom.xml

```xml
<dependency>
    <groupId>com.graphql-java-kickstart</groupId>
    <artifactId>graphql-spring-boot-starter</artifactId>
    <version>7.0.1</version>
</dependency>
```

```xml
<dependency>
    <groupId>com.graphql-java-kickstart</groupId>
    <artifactId>graphiql-spring-boot-starter</artifactId>
    <version>7.0.1</version>
</dependency>
```


Add the dependency for spring-security-jwt to your maven pom.xml
```xml
<dependency>
     <groupId>org.springframework.security</groupId>
     <artifactId>spring-security-jwt</artifactId>
</dependency>
```

```xml
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt</artifactId>
</dependency>
```


## Features
* User Management
* Project Management
* Tasks Management


# Spring Security
* **Authentication**: refers to the process of verifying the identity of a user, based on 
provided credentials.
* **Authorization**: refers to the process of determining if a user has proper permission to
perform a particular action or read particular data, assuming that the user is successfully.
* **Principle**: refers to the currently authenticated user.
* **Granted Authority**: refers to permission of the authenticated user.
* **Role**: refers to the group of permissions of the authenticated user.