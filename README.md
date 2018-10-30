# AWS Spring Cloud Microservice Architecture

## TODO - Microservices
- Spring Cloud Config Server.
- Netflix Eureka Server.
- Zuul Api Gateway.
- Auto Scaling with Eureka Naming Server, Ribbon and Feign.
- Microservices (Message-Retireval-Service,Conversion-Service,Exchange-Service,Web-Portal).

## Ports

|     Application       |     Port          |
| ------------- | ------------- |
| Eureka Server | 8761 |
| Api-Gateway Service | 8765 |
| Config Server | 8768 |
| Exchange Service | 9002, 9003, 9004, ..  |
| Message Retrieval Service | 8766 |
| Conversion Service | 7000 |
| Web-Portal | 8767 |

## VM Argument

-Dserver.port=9003 for exchange service  

## How to run?
### Below are the vm arguments like develop (-Drun.profiles=develop),we can also pass the vm arguments for qa,docker and cloud.
- develop for *Development environment*
- qa for *QA environment*
- docker for *Docker image environment*
- cloud is for *cloud environment*

### Below are the commands

|     Application       |     Commands          |
| ------------- | ------------- |
| Config-Server | mvn spring-boot:run |
| Eureka-Server | mvn spring-boot:run -Drun.profiles=develop |
| Api-Gateway-Server | mvn spring-boot:run -Drun.profiles=develop |
| Message-Retireval-Service | mvn spring-boot:run -Drun.profiles=develop |
| Conversion-Service | mvn spring-boot:run -Drun.profiles=develop |
| Exchange-Service | mvn spring-boot:run -Drun.profiles=develop |
| Web-Portal | mvn spring-boot:run |



