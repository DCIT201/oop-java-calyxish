package com.vehicle.rental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RentalAgencyTest {

    private RentalAgency rentalAgency;
    private Car car;
    private Customer customer;

    @BeforeEach
    void setUp() {
        rentalAgency = new RentalAgency();
        car = new Car("Cxxx001", "Tesla Model Y", 100.0, true, "Petrol");
        customer = new Customer("Calyx Ish", "calyxgod@xmail.com");
    }

    @Test
    void testAddVehicle() {
        rentalAgency.addVehicle(car);
        assertTrue(rentalAgency.toString().contains("fleetSize=1"),
                "Fleet size should be 1 after adding a vehicle");
    }

    @Test
    void testRentVehicle() throws BoundaryViolationException {
        rentalAgency.addVehicle(car);
        System.out.println("Before rent: " + car.isAvailableForRental());
        rentalAgency.rentVehicle(car, customer, 3);
        System.out.println("After rent: " + car.isAvailableForRental());
        assertFalse(car.isAvailableForRental(), "Car should not be available for rental after being rented");
    }

    @Test
    void testReturnVehicle() {
        rentalAgency.addVehicle(car);
        try {
            rentalAgency.rentVehicle(car, customer, 3);
        } catch (BoundaryViolationException e) {
            e.printStackTrace();
        }
        System.out.println("Before return: " + car.isAvailableForRental());
        rentalAgency.returnVehicle(car);
        System.out.println("After return: " + car.isAvailableForRental());
        assertTrue(car.isAvailableForRental(), "Car should be available for rental after being returned");
    }
}