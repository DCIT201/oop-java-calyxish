# Vehicle Rental Management System

**Course:** DCIT 201 -  PROGRAMMING I
**Project Title:** OOP JAVA

## Project Overview
The Vehicle Rental Management System is designed to demonstrate all Object-Oriented Programming (OOP) principles, including Encapsulation, Inheritance, Polymorphism, Abstraction, and Composition. The system allows customers to rent various types of vehicles, including cars, motorcycles, and trucks, each with unique rental characteristics and rules.

### Key Features
- Abstract base class `Vehicle` with abstract methods for rental cost calculation and availability checks.
- Concrete vehicle classes (`Car`, `Motorcycle`, `Truck`) inheriting from `Vehicle`.
- Encapsulation of critical information with private fields and public getter/setter methods.
- Implementation of the `Rentable` interface for renting and returning vehicles.
- Supporting classes for managing customers, rental transactions, and the rental agency.
- Custom exceptions for boundary violations.
- Comprehensive unit tests for all classes.

## Class Descriptions

### Vehicle (Abstract Class)
The `Vehicle` class serves as the base class for all vehicle types. It includes private fields for vehicle ID, model, base rental rate, and availability status. It also defines abstract methods for calculating rental costs and checking availability.

### Car (Concrete Class)
The `Car` class extends `Vehicle` and implements the `Rentable` interface. It includes additional attributes such as fuel type and overrides methods for rental cost calculation and availability checks.

### Motorcycle (Concrete Class)
The `Motorcycle` class extends `Vehicle` and implements the `Rentable` interface. It includes additional attributes such as whether it has a sidecar and overrides methods for rental cost calculation and availability checks.

### Truck (Concrete Class)
The `Truck` class extends `Vehicle` and implements the `Rentable` interface. It includes additional attributes such as cargo capacity and overrides methods for rental cost calculation and availability checks.

### Customer
The `Customer` class manages customer information, rental history, and current rentals. It includes methods for renting vehicles and tracking rented vehicles.

### RentalAgency
The `RentalAgency` class manages the vehicle fleet, processes rentals, and generates reports. It includes methods for adding vehicles, renting vehicles, and returning vehicles.

### RentalTransaction
The `RentalTransaction` class represents a rental transaction, including customer information, vehicle information, rental duration, and rental date. It includes methods for calculating the total rental cost.

### BoundaryViolationException
The `BoundaryViolationException` class is a custom exception for handling boundary violations when updating vehicle locations. This exception is thrown if a vehicle's location is set beyond the legal boundaries (latitude must be between -90 and 90, and longitude must be between -180 and 180).

## Design Principles

### Encapsulation
- All fields in the classes are private.
- Public getter and setter methods provide controlled access to the fields.
- Input validation is implemented in setter methods to protect sensitive data from direct modification.

### Inheritance
- The `Vehicle` class serves as the base class for `Car`, `Motorcycle`, and `Truck`.
- Each vehicle class inherits common attributes and methods from the `Vehicle` class.

### Polymorphism
- The `Rentable` interface defines methods for renting and returning vehicles.
- Each vehicle class implements the `Rentable` interface and overrides its methods.
- Method overloading and overriding are demonstrated in the vehicle classes.

### Abstraction
- The `Vehicle` class is abstract and defines abstract methods for rental cost calculation and availability checks.
- Concrete vehicle classes provide specific implementations for the abstract methods.

### Composition
- The `Customer` class includes a list of rented vehicles.
- The `RentalAgency` class includes a list of vehicles in the fleet.
- The `RentalTransaction` class includes references to `Customer` and `Vehicle` objects.

## Custom Exceptions

### BoundaryViolationException
The `BoundaryViolationException` class is a custom exception used to handle scenarios where a vehicle's location is set beyond the legal boundaries. This ensures that the system maintains valid geographical data for all vehicles.

Example usage:
```java
public void updateLocation(double latitude, double longitude) throws BoundaryViolationException {
    if (latitude > 90 || latitude < -90 || longitude > 180 || longitude < -180) {
        throw new BoundaryViolationException("Vehicle has crossed the boundary!");
    }
}
```
## Usage Instructions

### Prerequisites
- JDK 11 or higher
- Maven
- JUnit 5

### Setup
1. Clone the repository:
   ```sh
   git clone https://github.com/DCIT201/oop-java-calyxish.git
2. Navigate to the project directory:
   ```sh
   cd oop-java-calyxish
3. Build the project using Maven:
   ```sh
   mvn clean install
### Running the Application

1. Navigate to the target directory:
   ```sh
    cd target
### Running the Tests

1. Run the tests using Maven:
   ```sh
    mvn test
### Testing Instructions

**Unit Tests**
- The project includes comprehensive unit tests for all classes. The tests validate encapsulation, inheritance, polymorphic behavior, and abstraction implementations.
1. Run the tests using Maven:
   ```sh
    mvn test
**Test Coverage**
- I wrote unit test for each Class that I created for in the project.
- Rental cost calculations for different vehicle types.
- Availability checks for vehicles.
- Renting and returning vehicles.
- Managing customer rental history.
- Handling boundary violations when updating vehicle locations.
