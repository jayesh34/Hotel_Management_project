Overview :
This project is a Hotel Management System API designed to manage and retrieve data about customers, food items, and billing details. The project is developed using Spring Boot with MVC architecture to ensure a clear separation of concerns and easy maintainability.
The Hotel Management API provides backend services for managing the core operations of a hotel.\
#It allows staff to:

1.Manage customer information

2.Retrieve food item details

3.Generate and manage billing information for customers

4.This system follows a Model-View-Controller (MVC) design pattern, separating the business logic from the presentation and data layers, improving scalability and maintainability.

Features

#Customer Management:

1.Add new customers.

2.Retrieve customer details by ID.

3.Update customer details.

4.Delete customer records.

#Food Item Management:


1.Retrieve the list of food items available.

2.Get food item details by ID (including price and description).

#Billing Management:

1.Generate bills for a customer.

2.Retrieve billing history.

3.Calculate total cost for an order (including food items and taxes).

#Technologies Used

Spring Boot: Framework for building Java-based enterprise applications.

MVC Architecture: Provides separation of concerns for cleaner code and ease of maintenance.
MySQL (or any other RDBMS): Database for storing customer, food, and billing data.

RESTful API: To expose the services for external usage (GET, POST, PUT, DELETE).
Architecture

The project is built using the Model-View-Controller (MVC) architecture:

Model: Represents the data and business logic. It includes entities like Customer, Food, and Bill, as well as service and repository classes.

View: Not implemented in this API, but if extended, a front-end application can consume this API.

Controller: Handles incoming HTTP requests and calls the appropriate services. The controllers manage endpoints like /customers, /food, and /billing.

API Endpoints
Customer Endpoints

GET /customers: Get a list of all customers.

GET /customers/{id}: Get details of a customer by ID.

POST /customers: Add a new customer.

PUT /customers/{id}: Update an existing customer.

DELETE /customers/{id}: Delete a customer.

Food Endpoints

GET /food: Get a list of all food items.

GET /food/{id}: Get details of a specific food item by ID.

Billing Endpoints

POST /billing: Generate a new bill for a customer.

GET /billing/{id}: Get billing details by bill ID.

GET /billing/customer/{customerId}: Get billing history for a specific customer.

Installation

Prerequisites


Maven or Gradle (for dependency management)

MySQL or another database management system

Git (for version control)
