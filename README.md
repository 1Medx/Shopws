# Shopws - Product Management REST API

This repository contains the source code for Shopws, a RESTful API designed for managing products in an online shop. Built with Spring Boot, this application provides endpoints for performing CRUD operations on product data, handling exceptions, and ensuring data persistence.

## Features

- **Product Management**: Create, read, update, and delete product information.
- **RESTful API**: Adheres to REST principles for clear and consistent communication.
- **Exception Handling**: Robust error handling for common scenarios like product not found.
- **Data Persistence**: Integration with a database for storing product data.

## Technologies Used

- **Java**: Programming language.
- **Spring Boot**: Framework for building stand-alone, production-grade Spring applications.
- **Maven**: Dependency management and build automation tool.
- **Spring Data JPA**: For data access and persistence.
- **MySQL**: database for development and testing 

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or later
- Maven 3.x

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/1Medx/Shopws.git
   cd Shopws
   ```

2. Build the project using Maven:

   ```bash
   mvn clean install
   ```

### Running the Application

You can run the Spring Boot application using Maven:

```bash
mvn spring-boot:run
```

The application will start on port 8080 by default. You can access the API at `http://localhost:8080`.

## API Endpoints

The following are the main API endpoints provided by the `ProductController`:

- `GET /products`: Retrieve a list of all products.
- `GET /products/{id}`: Retrieve a specific product by its ID.
- `POST /products`: Create a new product.
- `PUT /products/{id}`: Update an existing product.
- `DELETE /products/{id}`: Delete a product by its ID.

## Error Handling

The API provides custom error handling for cases where a product is not found. If a request is made for a product that does not exist, a `ProductNotFoundException` will be thrown, resulting in an appropriate HTTP status code (e.g., 404 Not Found).



