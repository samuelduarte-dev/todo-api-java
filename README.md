# Todo API Java

A RESTful API for task management developed with Java, Spring Boot, PostgreSQL, Maven, Bean Validation, and Flyway, with endpoint testing performed using Insomnia.

This project was developed as part of my backend learning journey and served as a practical way to strengthen important concepts related to API development. Through its implementation, it was possible to apply essential backend concepts such as layered architecture, HTTP request handling, database integration, input validation, and exception handling in a real development scenario. Some implementation guidance, refactoring ideas, and improvement suggestions were supported by AI as a learning assistant during the development process.

## Overview

The application follows the CRUD model and allows basic task management operations through a REST API, including task creation, retrieval, update, and deletion. The project is structured using controller, service, repository, entity, and exception handling layers, making the code more organized and easier to maintain.

## Technologies Used

- Java 21
- Spring Boot
- Maven
- PostgreSQL
- Spring Data JPA
- Bean Validation
- Flyway
- Insomnia
- IntelliJ IDEA

## Technical Concepts Applied

During the development of this project, the following backend concepts were applied and reinforced:

- RESTful API development
- CRUD operation implementation
- HTTP methods and request handling
- Integration with PostgreSQL
- Data persistence with Spring Data JPA
- Dependency management with Maven
- Input validation with Bean Validation
- Global exception handling
- Layered backend architecture
- Endpoint testing with Insomnia

## Features Implemented

The project currently includes the following features:

- Create tasks
- List all tasks
- Get task by ID
- Update existing tasks
- Delete tasks
- Validate request data
- Handle validation and not found errors with custom exception handling
- Persist task data in PostgreSQL

## Learning Experience

This project provided valuable hands-on experience in backend development with Java and Spring Boot. It contributed to a better understanding of how a REST API is structured, how a Java application interacts with a relational database, how validation improves data consistency, and how exception handling can improve API responses and code organization.

## Project Structure

The project follows a standard backend structure, including layers for controller, service, repository, entity, and exception handling, in addition to Maven configuration and database settings.

## Execution

To run the project, clone the repository, open it in IntelliJ IDEA, configure the database connection in the application settings, create the required PostgreSQL database, and start the application. After that, the endpoints can be tested using Insomnia.

## Future Improvements

Some future improvements planned for the project include filtering tasks by completion status, searching tasks by title, Swagger/OpenAPI documentation, DTO implementation, unit and integration tests, pagination, and timestamp fields such as `createdAt` and `updatedAt`.

## Final Considerations

This project helped strengthen practical skills in Spring Boot application structuring, PostgreSQL integration, CRUD-based backend logic, request validation, exception handling, API testing workflows, and layered backend design. It represents an important step in my learning process in backend development with Java.

## Author

Samuel Duarte
