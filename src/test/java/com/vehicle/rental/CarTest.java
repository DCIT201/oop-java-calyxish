package com.vehicle.rental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Cxxx001", "Tesla Model Y", 100.0, true, "Electric");
    }

    @Test
    void testCalculateRentalCost() {
        assertEquals(300.0, car.calculateRentalCost(3), "Rental cost for 3 days should be 300.0");
    }

    @Test
    void testIsAvailableForRental() {
        assertTrue(car.isAvailableForRental(), "Car should be available for rental");
        car.setAvailable(false);
        assertFalse(car.isAvailableForRental(), "Car should not be available for rental when set to unavailable");
    }

    @Test
    void testRentVehicle() {
        Customer customer = new Customer("Calx Ish", "calyxgod@xmail.com");
        car.rent(customer, 2);
        assertFalse(car.isAvailableForRental(), "Car should not be available for rental after being rented");
        // In a real scenario, you'd check if the customer's rental list was updated
    }

    @Test
    void testReturnVehicle() {
        car.setAvailable(false); // Ensure the car is rented before returning
        car.returnVehicle();
        assertTrue(car.isAvailableForRental(), "Car should be available for rental after being returned");
    }

    @Test
    void testToString() {
        String expected = "Car{fuelType='Electric', vehicleId='Cxxx001', model='Tesla Model Y', baseRentalRate=100.0}";
        assertEquals(expected, car.toString(), "toString should match the expected format");
    }
}