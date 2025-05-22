# Spring Boot User Management System

A RESTful API for managing users built with Spring Boot, Spring Data JPA, and PostgreSQL.

## Features

- Create, read, update, and delete users
- Email uniqueness validation
- Automatic age calculation based on birth date
- PostgreSQL database integration

## Prerequisites

- Java 17 or higher
- Maven
- PostgreSQL database

## Database Configuration

The application uses PostgreSQL. Configure your database connection in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://your-host:5432/your-database
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
```

## Project Structure

```
src/main/java/com/example/demo/
├── controller/     # REST controllers
├── model/         # Entity classes
├── repository/    # Data access layer
└── service/       # Business logic
```

## API Endpoints

### Users

- `GET /api/users` - Get all users
- `POST /api/users` - Create a new user
- `PUT /api/users/{id}` - Update a user
- `DELETE /api/users/{id}` - Delete a user

### User Object Structure

```json
{
    "id": "Long",
    "name": "String",
    "email": "String",
    "birth": "LocalDate",
    "age": "Integer"
}
```

## Running the Application

1. Clone the repository
2. Configure your database connection in `application.properties`
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## Building the Application

```bash
mvn clean install
```

## Technologies Used

- Spring Boot 3.4.1
- Spring Data JPA
- PostgreSQL
- Maven
- Java 17

## License

This project is licensed under the MIT License.

