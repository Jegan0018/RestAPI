# RestAPI
# Blog Management System

A simple Blog Management System that allows users to register, login, and perform CRUD operations on blog posts using JSON Web Tokens (JWT) for authentication.

## Features

- User Registration: Users can create an account by providing a unique username and password.
- User Login: Registered users can securely log into their accounts using their credentials.
- JSON Web Tokens (JWT) Authentication: JWT is used to authenticate and authorize users for protected routes.

## Technologies Used

- Java
- Spring Boot
- Spring Security
- JSON Web Tokens (JWT)
- Hibernate
- RESTful API
- MySQL (or any other database of your choice)

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed
- MySQL (or any other database) installed and running
- Git (optional)

API Endpoints
User Registration
URL: POST /api/register

Description: Register a new user.

User Login
URL: POST /api/login

Description: Login with existing user credentials to obtain a JWT token.
