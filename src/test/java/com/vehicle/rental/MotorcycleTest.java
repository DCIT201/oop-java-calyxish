package com.vehicle.rental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    private Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        motorcycle = new Motorcycle("Mxxx001", "Honda CBR", 250.0, true, true);
    }

    @Test
    void testCalculateRentalCost() {
        assertEquals(750.0, motorcycle.calculateRentalCost(3), "Rental cost for 3 days should be 750.0");
    }

    @Test
    void testIsAvailableForRental() {
        assertTrue(motorcycle.isAvailableForRental(), "Motorcycle should be available for rental");
        motorcycle.setAvailable(false);
        assertFalse(motorcycle.isAvailableForRental(),
                "Motorcycle should not be available for rental when set to unavailable");
    }

    @Test
    void testRentVehicle() {
        Customer customer = new Customer("John Doe", "john@example.com");
        motorcycle.rent(customer, 2);
        assertFalse(motorcycle.isAvailableForRental(),
                "Motorcycle should not be available for rental after being rented");
        // In a real scenario, you'd check if the customer's rental list was updated
    }

    @Test
    void testReturnVehicle() {
        motorcycle.setAvailable(false); // Ensure the motorcycle is rented before returning
        motorcycle.returnVehicle();
        assertTrue(motorcycle.isAvailableForRental(), "Motorcycle should be available for rental after being returned");
    }

    @Test
    void testToString() {
        String expected = "Motorcycle{hasSidecar=true, vehicleId='Mxxx001', model='Honda CBR', baseRentalRate=250.0}";
        assertEquals(expected, motorcycle.toString(), "toString should match the expected format");
    }
}