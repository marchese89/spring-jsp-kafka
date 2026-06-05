# Spring MVC + JSP + Oracle + Apache Kafka

A sample enterprise-style Java web application built using **Spring MVC**, **JSP**, **Spring Data JPA**, **Hibernate**, **Oracle Database**, and **Apache Kafka**.

The project demonstrates how a traditional layered architecture can integrate a relational database with an event-driven messaging system.

---

## Why This Project?

Modern enterprise applications often rely on multiple architectural patterns and technologies working together.

This project was created to explore and demonstrate:

* Traditional Spring MVC development without Spring Boot
* Layered application architecture
* Database persistence with JPA and Hibernate
* Oracle Database integration
* Event-driven communication using Apache Kafka
* Separation of concerns through Controller, Service and Repository layers

---

## Features

* Spring MVC web application
* JSP-based user interface
* Spring Data JPA repositories
* Hibernate ORM
* Oracle Database integration
* Apache Kafka Producer
* Apache Kafka Consumer
* Layered architecture
* Maven-based build process

---

## Architecture

```text
┌─────────────┐
│   Browser   │
└──────┬──────┘
       │
       ▼
┌─────────────┐
│ JSP Views   │
└──────┬──────┘
       │
       ▼
┌─────────────┐
│ Controller  │
└──────┬──────┘
       │
       ▼
┌─────────────┐
│  Service    │
└──────┬──────┘
       │
       ▼
┌─────────────┐
│ Repository  │
└──────┬──────┘
       │
       ▼
┌─────────────┐
│   Oracle    │
│  Database   │
└─────────────┘


Kafka Producer
      │
      ▼
┌─────────────┐
│ Kafka Topic │
└──────┬──────┘
       │
       ▼
Kafka Consumer
```

---

## Technologies

| Technology      | Purpose                       |
| --------------- | ----------------------------- |
| Java 17         | Programming Language          |
| Spring MVC      | Web Framework                 |
| JSP             | View Technology               |
| Spring Data JPA | Persistence Layer             |
| Hibernate       | ORM                           |
| Oracle Database | Relational Database           |
| Apache Kafka    | Messaging Platform            |
| Maven           | Build & Dependency Management |

---

## Project Structure

```text
spring-jsp-kafka/
│
├── README.md
├── pom.xml
│
├── docker/
│   ├── kafka/
│   │   └── docker-compose.yml
│   │
│   └── oracle/
│       └── docker-compose.yml
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   ├── resources/
│   │   └── webapp/
│   │
│   └── test/
│
└── target/
```

---

## Running the Infrastructure

### Start Oracle Database

```bash
docker compose -f docker/oracle/docker-compose.yml up -d
```

### Start Kafka Stack

```bash
docker compose -f docker/kafka/docker-compose.yml up -d
```

The Kafka stack includes:

* Kafka
* Zookeeper
* Kafdrop

### Open Kafdrop

```text
http://localhost:9000
```

---

## Build

```bash
mvn clean package
```

The build generates a WAR file:

```text
target/*.war
```

Deploy the generated WAR to Apache Tomcat.

---

## Kafka Example

When a new entity is created, the application can publish an event to Kafka.

Example message:

```json
{
  "eventType": "ENTITY_CREATED",
  "id": 1,
  "name": "Example"
}
```

Consumers subscribe to the topic and process events asynchronously.

---

## Learning Objectives

This project was developed to gain practical experience with:

* Spring MVC configuration
* JSP web applications
* JPA and Hibernate
* Oracle Database
* Apache Kafka
* Layered architecture
* Repository Pattern
* Service Layer Pattern
* Enterprise Java development

---

## Future Improvements

* Spring Security integration
* REST API endpoints
* Dockerized application deployment
* Integration tests
* Monitoring and observability
* CI/CD pipeline

---

## Author

Antonio Giovanni Marchese

GitHub: https://github.com/marchese89
