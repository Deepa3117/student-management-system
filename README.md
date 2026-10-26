# Student Management System

A REST API for managing student records, built using Java 21, Spring Boot 4.1.2, Spring Data JPA, Hibernate, and MySQL 8.

## Features

- Create, retrieve, update, and delete student records
- Search students by name or email
- Validate student information
- Prevent duplicate email addresses
- Handle exceptions with structured JSON responses
- Persist student records in MySQL

## Technology Stack

- Java 21
- Spring Boot 4.1.2
- Maven
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL 8
- Jakarta Bean Validation
- Postman
- Eclipse IDE

## Database Setup

Create the database in MySQL:

```sql
CREATE DATABASE student_db;
```

Configure the environment variables `DB_USERNAME` and `DB_PASSWORD` in your local environment or Eclipse Run Configuration.

The database password is intentionally not stored in this README.

## Run the Application

1. Import the Maven project into Eclipse.
2. Configure the database connection.
3. Ensure MySQL is running.
4. Run `StudentManagementSystemApplication` as a Spring Boot App.
5. Access the API at:

`http://localhost:8080/api/students`

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/students` | Create a student |
| GET | `/api/students` | Retrieve all students |
| GET | `/api/students/{id}` | Retrieve a student by ID |
| PUT | `/api/students/{id}` | Update a student |
| DELETE | `/api/students/{id}` | Delete a student |
| GET | `/api/students/search?name=Test` | Search by name |
| GET | `/api/students/search?email=test` | Search by email |

## Validation and Error Handling

The application validates required fields, email format, age, and phone number. It also handles duplicate email addresses and requests for nonexistent students.

Common HTTP responses include:

- `200 OK` — successful retrieval or update
- `201 Created` — student created
- `204 No Content` — student deleted
- `400 Bad Request` — invalid input
- `404 Not Found` — student does not exist
- `409 Conflict` — duplicate email or database integrity conflict

## Testing

The REST endpoints have been tested using Postman, including CRUD operations, searching, validation, duplicate-email handling, and error scenarios.