# Web Service API

REST API developed with Java and Spring Boot for managing users, products, categories, orders, and payments.

## Technologies Used

* Java 17+
* Spring Boot
* Spring Data JPA
* Hibernate
* Maven
* H2 Database
* Insomnia
* Git & GitHub

---

## Features

* User CRUD operations
* Product CRUD operations
* Category CRUD operations
* Order management
* Product and category association
* Order and product association
* Payment system
* Custom exception handling
* In-memory H2 database
* Test profile with automatic database seeding

---

## Project Structure

```bash id="nn09dx"
src/main/java/com/example/webservice
├── config
├── entities
├── entities/enums
├── entities/pk
├── repositories
├── resources
├── resources/exceptions
├── services
└── services/exceptions
```

---

## Domain Model

The project contains the following entities:

* User
* Order
* OrderItem
* Product
* Category
* Payment

Implemented JPA/Hibernate relationships:

* OneToMany
* ManyToOne
* ManyToMany
* OneToOne
* EmbeddedId

---

## Running the Project

### Prerequisites

* Java 17+
* Maven
* Java IDE (STS, IntelliJ, or Eclipse)

---

### Clone the repository

```bash id="1yy4n0"
git clone https://github.com/menzo280-dotcom/web-service.git
```

---

### Navigate to the project folder

```bash id="3j1rd6"
cd web-service
```

---

### Run the application

Using your IDE:

Run the class:

```bash id="m7m7j0"
WebserviceApplication
```

Or using the terminal:

```bash id="y7jlwm"
./mvnw spring-boot:run
```

---

## H2 Database

The application uses an in-memory H2 database.

### H2 Console

```bash id="z6g4s9"
http://localhost:8080/h2-console
```

### Connection Settings

```bash id="1zmxn5"
JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password:
```

---

## Active Profile

```properties id="h4qj9v"
spring.profiles.active=test
```

The `test` profile automatically loads sample data into the database through the `TestConfig` class.

---

## Example Endpoints

### Get all users

```http id="n1bd2h"
GET /users
```

### Get user by ID

```http id="j0a95y"
GET /users/{id}
```

### Insert a new user

```http id="lvjlwm"
POST /users
```

### Update a user

```http id="v6gyzz"
PUT /users/{id}
```

### Delete a user

```http id="z5kp13"
DELETE /users/{id}
```

---

## Exception Handling

The API includes custom exception handling for:

* ResourceNotFoundException
* DatabaseException

Implemented using:

```java id="5vvcy5"
@ControllerAdvice
```

---

## Concepts Practiced

During the development of this project, the following concepts were practiced:

* REST API development
* Layered architecture
* JPA/Hibernate
* Entity relationships
* Enum persistence
* Composite keys with EmbeddedId
* Exception handling
* JSON serialization
* Spring Profiles
* Data persistence

---

## Author

Enzo Martins

GitHub:
https://github.com/menzo280-dotcom
