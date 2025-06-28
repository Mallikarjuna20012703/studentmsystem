#  Student Database Management System (Spring Boot MVC)

A complete full-stack web application to manage student records using Java Spring Boot, MySQL , Thymeleaf, and Bootstrap. This system allows users to add, view, update, and delete student information through a responsive and modern interface.

---

##  Project Overview

This project demonstrates:
- Spring MVC architecture with service, controller, and repository layers.
- CRUD operations for managing student data.
- MySQL database integration.
- Clean and responsive frontend with Thymeleaf and Bootstrap.
- Real-world application of MVC with a user-friendly UI.

---

##  Features

-  Add Student  
-  View All Students  
-  Edit Student Info  
-  Delete Student  
-  Dynamic student list display  
-  UI styled with Bootstrap 4

---

##  Technologies Used

### Backend:
- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate ORM
- MySQL

### Frontend:
- Thymeleaf
- HTML5, CSS3
- Bootstrap 4

---

##  Project Structure

src/
├── controller/ # Web layer: handles requests
│ └── StudentController.java
├── entity/ # Model classes
│ └── Student.java
├── repository/ # Data access layer
│ └── StudentRepository.java
├── service/ # Business logic
│ └── StudentService.java
├── templates/ # Thymeleaf HTML templates
│ ├── students.html
│ ├── create_student.html
│ └── edit_student.html
└── static/ # Static assets (CSS, JS, images)
## Database connection
spring.datasource.url=jdbc:mysql://localhost:3306/MallikarjunaDatabase
spring.datasource.username=root
spring.datasource.password=Mallikarjuna@27
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
server.port=8080

## run
mvn spring-boot:run
## Browser
http://localhost:8080/students
