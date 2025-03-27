# Book API - Java + Spring Boot

This project is a RESTful API built with Java and Spring Boot that connects to a MySQL database and serves data about books.

## 📚 Features

- Built with Spring Boot
- Connects to a remote MySQL database
- Exposes RESTful endpoints to fetch book data
- Organized with the typical model/controller/repository structure
- Ready to be connected to a frontend (e.g. React)

## 🔧 Technologies

- Java 21
- Spring Boot 3.1.8
- Spring Data JPA
- Hibernate
- MySQL
- Maven

## 🚀 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/book-api-java.git
   cd book-api-java
   ```

2. Create a .env file or configure your application.yml:
```spring:
  datasource:
    url: jdbc:mysql://your-database-url:3306/your-db-name
    username: your-username
    password: your-password
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        dialect: org.hibernate.dialect.MySQL8Dialect
```

3. Run with Maven:
   ```
   mvn spring-boot:run
  
The API will be available at http://localhost:8080.

🔒 Security
Sensitive data like database credentials should never be committed. This project uses a .gitignore to ensure .env and config files are not uploaded.

