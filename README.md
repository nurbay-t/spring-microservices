# Spring Boot Microservices
This repository hosts a project designed for learning and exploring the architecture and technology stack commonly used in the backend development of the current industry. 
It includes various microservices, a centralized API gateway, authentication via Keycloak, 
communication between services using both synchronous (via REST) and asynchronous (via Kafka) methods, 
and a monitoring solution using Grafana.

The technology stack:
- Angular 18
- Spring Boot 3.3 (Java 21)
- Test Containers with Wiremock
- MongoDB
- MySQL
- Kafka
- Resilience4J
- Keycloak
- Grafana Stack (Prometheus, Grafana, Loki and Tempo)
- Spring Cloud Gateway MVC for API Gateway
- Docker

## Overall Architecture
```

+---------------------+             +-------------------------+              +------------------------+ 
|      Frontend       |------------>|       API Gateway       |------------->|     Product Service    | 
|                     |             |   (with Resilience4J)   |              |        (MongoDB)       | 
+---------------------+             +-------------------------+              +------------------------+ 
           |                                    |                                                       
           |                                    | Synchronous                                           
           |                                    | (via RestClient)                                      
           v                                    v                                                       
+---------------------+             +-------------------------+              +-------------------------+
|    Keycloak Server  |             |      Order Service      |------------->|    Inventory Service    |
|   (Authentication)  |             |  (MySQL, Resilience4J)  |              |         (MySQL)         |
+---------------------+             +-------------------------+              +-------------------------+
                                                |                                                       
                                                | Asynchronous                                          
                                                | (via Kafka)                                           
                                                v                                                       
                                    +-------------------------+                                         
                                    |  Notification Service   |                                         
                                    |         (Kafka)         |                                         
                                    +-------------------------+                                         

+------------------------------------------------------------------------------------------------------+
|                                            Grafana                                                   |
|                                (Logs Monitoring from All Services)                                   |
+------------------------------------------------------------------------------------------------------+

```

