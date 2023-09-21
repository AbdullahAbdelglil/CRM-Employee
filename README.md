# CRM-Employee-Version-1
The Simple Spring CRM Web Application is a straightforward Customer Relationship Management (CRM) system built using the Spring Framework. It offers basic functionality for managing customer interactions and maintaining essential customer data (CRUD). 



![Java Badge](https://img.shields.io/badge/Java-17-blue)
![Spring Boot Badge](https://img.shields.io/badge/Spring%20Boot-3.1.3-brightgreen)
![MySQL Badge](https://img.shields.io/badge/MySQL-8.0-orange)
![IntelliJ Badge](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-red)
![Postman Badge](https://img.shields.io/badge/Testing%20Tool-Postman-orange)

## Table of Contents

- [Technologies Used](#technologies-used)
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Clone the Repository](#clone-the-repository)
  - [Build and Run](#build-and-run)
- [API Endpoints](#api-endpoints)
- [Testing with Postman (Demo)](#testing-with-postman)
- [Contributing](#contributing)

## Technologies Used

- **Backend**: Spring Boot, Spring Data, JPA/Hibernate 
- **Database**: MySQL 8.0
- **IDE**: IntelliJ IDEA
- **Testing Tool**: Postman

## Features

- List All Employees.
- Get a specific Employee by ID.
- Save a new Employee.
- Update an existing employee.
- Delete an Employee by ID.
- Delete all employees.

  
## Getting Started

### 1- Prerequisites
Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 17 or higher installed.
- MySQL 8.0 installed and running.
- IntelliJ IDEA or your preferred Java IDE.
- Postman or similar tools for API testing.

### 2- Clone the Repository

To get started, clone this GitHub repository to your local machine:

`git clone https://github.com/AbdullahAbdelglil/CRM-Employee.git`

### 3- Build and Run

- Open the project in IntelliJ IDEA or your preferred IDE.
- Build and run the application. The main class is SimpleSpringCrmApplication.
- The application should start on http://localhost:8080.



## API Endpoints

The application provides RESTful API endpoints for managing customers and interactions

- To GET all employees: GET `http://localhost:8080/api/employees`
- To GET a specific employee by id: `http://localhost:8080/api/employees/employeeId`
- To POST a new employee: `http://localhost:8080/api/employees`
- To PUT an existing employee `http://localhost:8080/api/employees`
- To DELETE an employee `http://localhost:8080/api/employees/employeeId`
- To DELETE all employees `http://localhost:8080/api/employees`


## Testing with Postman (Demo)

### GET Request : 

[get-request.webm](https://github.com/AbdullahAbdelglil/CRM-Employee/assets/118194521/8611491f-c230-4f99-8a41-5b9d12e53c26)


### POST Request :

[post-employee.webm](https://github.com/AbdullahAbdelglil/CRM-Employee/assets/118194521/85ca9cbd-ccf9-4a5b-aa84-85077a51f8a9)


### PUT Request : 

[put-employee.webm](https://github.com/AbdullahAbdelglil/CRM-Employee/assets/118194521/71ed866d-f0c2-4d95-ab39-3b0657e53eb3)


### DELETE Request 

[delete.webm](https://github.com/AbdullahAbdelglil/CRM-Employee/assets/118194521/62e3c54c-5a32-4a8a-9c61-9455e8777e1b)


## Contributing

We welcome contributions from the community. If you have ideas for improvements, bug fixes, or additional features, please follow these steps:

- Fork the repository.
- Create a branch for your feature or bug fix: git checkout -b feature-name.
- Make your changes and commit them with clear and concise commit messages.
- Push your changes to your forked repository.
- Create a pull request with a detailed description of your changes.


#### Happy CRM-ing! 🚀
