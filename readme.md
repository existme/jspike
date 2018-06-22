# Spring boot spike project

This is a placeholder for trying out different features or provide samples for interesting problems.

# Compile/Run/Test
To Compile/Run/Test the examples use either of the following maven commands:
 
##Compile
``` sh
mvn clean compile
``` 

## Run
``` sh
mvn clean spring-boot:run
``` 

## Test
``` sh
mvn clean verify
``` 

# Dependencies:
## IDE: 
    IntelliJ 2018.1.5 (Ultimate Edition)
## Libraries:
- Log4J2: For logging since the default logger was too chattery for command line 
    `org.springframework.boot`/`spring-boot-starter-log4j2`
- Feign: For making REST requests
    `org.springframework.cloud`/`spring-cloud-starter-feign`
- Jackson: For parsing json objects
    `com.fasterxml.jackson.core`/`jackson-core`

