# Spring-Boot spike project

This is a placeholder for trying out different features or provide samples for interesting problems with Spring-Boot domain.

# Compile/Run/Test
To Compile/Run/Test the examples use either of the following maven commands:
 
##Compile
``` sh
mvn clean compile
``` 

## Run

- run as server
``` sh
mvn spring-boot:run
```
- run the application with --spring.application.admin.enabled=true
``` sh
mvn spring-boot:start
``` 
- rebuild and run without tests
``` bash
mvn clean package spring-boot:start -Dmaven.test.skip=true
```
## Test
``` sh
mvn clean verify
``` 

### Disable tests by default
``` xml
<project>
  [...]
	<properties>
		...
		<maven.test.skip>true</maven.test.skip>
		...
	</properties>
  [...]
```

In this case you run the tests again with:
``` bash
mvn verify -Dmaven.test.skip=false
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

