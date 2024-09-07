<<<<<<< HEAD
# Car Rental System

## Project Overview

This project is a **Car Rental Management System** designed to manage users, cars, and rental orders. The project follows the DAO (Data Access Object) pattern to abstract the interaction with the data source. It includes implementations for managing the `User`, `Car`, and `Order` entities, making it easy to perform CRUD operations (Create, Read, Update, Delete) on these entities.

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

#### 3. **Order Class**
The `Order` class represents a car rental order made by a user. It contains the following fields:
- `id`: A unique identifier for each order.
- `userId`: The ID of the user who made the order.
- `carId`: The ID of the car being rented.
- `orderDate`: The date the order was placed.
- `returnDate`: The date the car is expected to be returned.
- `carReturned`: A boolean indicating whether the car has been returned.
- `rentalCost`: The total cost of renting the car.

### DAO Pattern

The project follows the DAO (Data Access Object) pattern to handle database operations for each entity. The `GenericDAO` interface defines the methods to be implemented by each entity-specific DAO class (`UserDAO`, `CarDAO`, `OrderDAO`).

#### GenericDAO Interface
This interface provides basic CRUD operations:
- `insertItem(T item)`: Inserts a new item into the database.
- `getAllItems()`: Retrieves all items from the database.
- `getItem(long id)`: Retrieves a single item by its ID.
- `updateItem(T item)`: Updates an existing item in the database.
- `deleteItem(long id)`: Deletes an item from the database by its ID.

#### DAO Implementations

##### **UserDAO**
The `UserDAO` class implements `GenericDAO<User>` to perform CRUD operations for the `User` entity.

##### **CarDAO**
The `CarDAO` class implements `GenericDAO<Car>` to perform CRUD operations for the `Car` entity.

##### **OrderDAO**
The `OrderDAO` class implements `GenericDAO<Order>` to perform CRUD operations for the `Order` entity.

### PropertiesFile to setup your postgresql database
jdbc.url=jdbc:mysql://localhost:5432/car_rental_db.
jdbc.username=your_username.
jdbc.password=your_password.
jdbc.driver-class-name=com.mysql.cj.jdbc.Driver.



### How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/YourUsername/Car_Rental.git
=======
# Car Rental System

## Project Overview

This project is a **Car Rental Management System** designed to manage users, cars, and rental orders. The project follows the DAO (Data Access Object) pattern to abstract the interaction with the data source. It includes implementations for managing the `User`, `Car`, and `Order` entities, making it easy to perform CRUD operations (Create, Read, Update, Delete) on these entities.

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

#### 3. **Order Class**
The `Order` class represents a car rental order made by a user. It contains the following fields:
- `id`: A unique identifier for each order.
- `userId`: The ID of the user who made the order.
- `carId`: The ID of the car being rented.
- `orderDate`: The date the order was placed.
- `returnDate`: The date the car is expected to be returned.
- `carReturned`: A boolean indicating whether the car has been returned.
- `rentalCost`: The total cost of renting the car.

### DAO Pattern

The project follows the DAO (Data Access Object) pattern to handle database operations for each entity. The `GenericDAO` interface defines the methods to be implemented by each entity-specific DAO class (`UserDAO`, `CarDAO`, `OrderDAO`).

#### GenericDAO Interface
This interface provides basic CRUD operations:
- `insertItem(T item)`: Inserts a new item into the database.
- `getAllItems()`: Retrieves all items from the database.
- `getItem(long id)`: Retrieves a single item by its ID.
- `updateItem(T item)`: Updates an existing item in the database.
- `deleteItem(long id)`: Deletes an item from the database by its ID.

#### DAO Implementations

##### **UserDAO**
The `UserDAO` class implements `GenericDAO<User>` to perform CRUD operations for the `User` entity.

##### **CarDAO**
The `CarDAO` class implements `GenericDAO<Car>` to perform CRUD operations for the `Car` entity.

##### **OrderDAO**
The `OrderDAO` class implements `GenericDAO<Order>` to perform CRUD operations for the `Order` entity.

### PropertiesFile to setup your postgresql database
jdbc.url=jdbc:mysql://localhost:5432/car_rental_db.
jdbc.username=your_username.
jdbc.password=your_password.
jdbc.driver-class-name=com.mysql.cj.jdbc.Driver.



### How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/YourUsername/Car_Rental.git
>>>>>>> 97e1aa01ed5a79ab7b921766b174b03666b83690
