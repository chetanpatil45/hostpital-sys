# Hospital Management System

**Technology Stack:** Java, Spring Boot, Log4j, Swagger, Lombok

## 📌 Project Overview

The **Hospital Management System** is a RESTful web application developed using **Java Spring Boot** to efficiently manage hospital operations such as Patients, Doctors, Appointments, and Billing.

The system provides secure, scalable, and well-documented APIs that enable smooth interaction between different hospital entities while maintaining clean architecture and maintainable code practices.

---

## 🏗️ Architecture & Design

The application follows a layered architecture:

* **Controller Layer** – Handles REST API requests and responses
* **Service Layer** – Contains business logic
* **Repository Layer** – Manages database interactions using Spring Data JPA
* **Entity Layer** – Represents database models

This separation ensures:

* Better maintainability
* Easier testing
* Clean and modular code

---

## 🚀 Key Features

### 👤 Patient Management

* Add, update, delete, and retrieve patient records
* Maintain patient medical and personal information

### Endpoints - 

| Method | Endpoint              | Description                  |
| ------ | --------------------- | ---------------------------- |
| GET    | `/api/v1/patient`     | Get list of all patients     |
| GET    | `/api/v1/patient/:id` | Get patient details by ID    |
| POST   | `/api/v1/patient`     | Add a new patient            |
| PUT    | `/api/v1/patient/:id` | Update patient details by ID |
| DELETE | `/api/v1/patient/:id` | Delete patient details by ID |

### 👨‍⚕️ Doctor Management

* Manage doctor profiles and specializations
* Track doctor availability

### Endpoints - 

| Method | Endpoint             | Description                 |
| ------ | -------------------- | --------------------------- |
| GET    | `/api/v1/doctor`     | Get list of all doctors     |
| GET    | `/api/v1/doctor/:id` | Get doctor details by ID    |
| POST   | `/api/v1/doctor`     | Add a new doctor            |
| PUT    | `/api/v1/doctor/:id` | Update doctor details by ID |
| DELETE | `/api/v1/doctor/:id` | Delete doctor details by ID |

### 📅 Appointment Management

* Schedule, update, and cancel appointments
* Associate patients with doctors

### Endpoints - 

| Method | Endpoint                  | Description                      |
| ------ | ------------------------- | -------------------------------- |
| GET    | `/api/v1/appointment`     | Get list of all appointments     |
| GET    | `/api/v1/appointment/:id` | Get appointment details by ID    |
| POST   | `/api/v1/appointment`     | Add a new appointment            |
| PUT    | `/api/v1/appointment/:id` | Update appointment details by ID |
| DELETE | `/api/v1/appointment/:id` | Delete appointment details by ID |

### 💰 Billing Management

* Generate and manage patient bills
* Track payment status

### Endpoints - 

| Method | Endpoint           | Description               |
| ------ | ------------------ | ------------------------- |
| GET    | `/api/v1/bill`     | Get list of all bills     |
| GET    | `/api/v1/bill/:id` | Get bill details by ID    |
| POST   | `/api/v1/bill`     | Add a new bill            |
| PUT    | `/api/v1/bill/:id` | Update bill details by ID |
| DELETE | `/api/v1/bill/:id` | Delete bill details by ID |

---

## 🛠️ Technologies & Tools Used

### 🔹 Spring Boot

* Rapid application development
* Embedded server support
* RESTful API development
* Dependency injection and auto-configuration

### 🔹 Log4j

* Implemented for application logging
* Tracks system events, errors, and debugging information
* Supports multiple log levels (INFO, DEBUG, ERROR, etc.)
* Helps in monitoring and troubleshooting production issues

### 🔹 Swagger (OpenAPI)

* Integrated for API documentation
* Provides interactive API testing interface
* Auto-generates API documentation from annotations
* Improves collaboration between frontend and backend teams

### 🔹 Lombok

* Reduces boilerplate code
* Automatically generates:

  * Getters & Setters
  * Constructors
  * toString()
  * equals() & hashCode()
* Keeps entity and model classes clean and readable

---

## 🔐 Additional Capabilities

* Exception handling using `@ControllerAdvice`
* Proper HTTP status code responses
* Input validation using `@Valid`
* Structured logging with Log4j
* API documentation available via Swagger UI

---

## 🎯 Benefits of the System

* Centralized hospital data management
* Improved operational efficiency
* Reduced manual paperwork
* Scalable and production-ready backend design
* Easy API testing and integration
