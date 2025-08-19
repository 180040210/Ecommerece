# Spring Boot Full-Stack App (Tasks)

A complete Spring Boot 3 application with:
- Backend REST API (`/api/tasks`) and MVC controllers (`/tasks`)
- Thymeleaf frontend page
- H2 in-memory database with seed data

## Requirements
- JDK 17+
- Maven 3.9+

## Run
```bash
mvn spring-boot:run
```

App will start at `http://localhost:8080` and redirect to `/tasks` UI.

- Web UI: `http://localhost:8080/tasks`
- REST API: `GET http://localhost:8080/api/tasks`
- H2 Console: `http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:tasksdb`)

## Build & Test
```bash
mvn clean verify
```

## Package Jar
```bash
mvn -DskipTests package
java -jar target/springboot-fullstack-0.0.1-SNAPSHOT.jar
```

## API Examples
```bash
curl -s http://localhost:8080/api/tasks | jq
curl -s -X POST http://localhost:8080/api/tasks -H 'Content-Type: application/json' -d '{"title":"New Task"}' | jq
```

