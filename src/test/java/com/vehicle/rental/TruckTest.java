package com.vehicle.rental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    private Truck truck;

    @BeforeEach
    void setUp() {
        truck = new Truck("Txxx001", "Ford F150", 2000.0, true, 5000.0);
    }

    @Test
    void testCalculateRentalCost() {
        assertEquals(450.0, truck.calculateRentalCost(3), "Rental cost for 3 days should be 0.0");
    }

    @Test
    void testIsAvailableForRental() {
        assertTrue(truck.isAvailableForRental(), "Truck should be available for rental");
        truck.setAvailable(false);
        assertFalse(truck.isAvailableForRental(), "Truck should not be available for rental when set to unavailable");
    }

    @Test
    void testRentVehicle() {
        Customer customer = new Customer("Calyx Ish", "calyxgod@xmail.com");
        truck.rent(customer, 2);
        // In a real scenario, you'd check if the customer's rental list was updated
    }

    @Test
    void testReturnVehicle() {
        truck.returnVehicle();
        // Check if the returned vehicle logic is correct (e.g., updating availability)
    }

    @Test
    void testToString() {
        String expected = "Truck{cargoCapacity=5000.0, vehicleId='Txxx001', model='Ford F150', baseRentalRate=2000.0}";
        assertEquals(expected, truck.toString());
    }
}