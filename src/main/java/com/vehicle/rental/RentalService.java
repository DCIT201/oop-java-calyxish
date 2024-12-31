package com.vehicle.rental;

public class RentalService {
    public static void main(String[] args) {
        try {
            // Create a customer and a vehicle
            Customer customer = new Customer("Calyx Ish", "calyxgod@xmail.com");
            Vehicle car = new Car("Cxxx001", "Tesla Model Y", 100, true, "Electric");

            // Attempt to update the vehicle's location
            car.updateLocation(95.0, 180.0); // This is outside the legal boundaries and will throw an exception

            // Rent the vehicle to the customer
            Rentable rentCar = (Rentable) car;
            rentCar.rent(customer, 3); // Rent for 3 days

        } catch (BoundaryViolationException e) {
            System.out.println(e.getMessage()); // Handle boundary violation
        }
    }
}
