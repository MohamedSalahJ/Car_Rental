# Car Rental System

## Project Overview

This project is a basic **Car Rental Management System** that allows users to rent cars. The system manages user accounts, cars available for rent, and rental orders. This initial version of the project contains three main classes: `User`, `Car`, and `Order`.

## Project Structure

### Classes

#### 1. **User Class**
The `User` class represents the user who will rent a car. It contains the following fields:
- `id`: A unique identifier for each user.
- `userName`: The name of the user.
- `userEmail`: The user's email address.
- `userPassword`: The user's password for authentication.
- `userAddress`: The user's home address.
- `userBlocked`: A boolean indicating whether the user is blocked from renting cars.
- `userRole`: Specifies the role of the user (e.g., customer, admin).

#### 2. **Car Class**
The `Car` class represents a car that can be rented. It contains the following fields:
- `id`: A unique identifier for each car.
- `carModel`: The model of the car.
- `carReleaseYear`: The year the car was released.
- `carColorString`: The color of the car.
- `carCompany`: The car manufacturer (company name).

##### Constructor:
- Default constructor: `Car()`
- Parameterized constructor: `Car(long id, String carModel, String carReleaseYear, String carColorString, String carCompany)`

#### 3. **Order Class**
The `Order` class represents a car rental order made by a user. It contains the following fields:
- `id`: A unique identifier for each order.
- `userId`: The ID of the user who made the order.
- `carId`: The ID of the car being rented.
- `orderDate`: The date the order was placed.
- `returnDate`: The date the car is expected to be returned.
- `carReturned`: A boolean indicating whether the car has been returned.
- `rentalCost`: The total cost of renting the car.

##### Constructor:
- Default constructor: `Order()`

## Future Enhancements
- **User authentication**: Implement user login and registration.
- **Car availability**: Add features to track the availability of cars for rent.
- **Order management**: Create methods for managing rental orders, including payment processing and rental history.

## How to Run the Project
# Clone the repository

