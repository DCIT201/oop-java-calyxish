package com.vehicle.rental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("Calyx Ish", "calyxgod@xmail.com");
    }

    @Test
    void testGetName() {
        assertEquals("Calyx Ish", customer.getName(), "Customer name should be 'Calyx Ish'");
    }

    @Test
    void testGetEmail() {
        assertEquals("calyxgod@xmail.com", customer.getEmail(), "Customer email should be 'calyxgod@xmail.com'");
    }

    @Test
    void testRentVehicle() {
        Vehicle car = new Car("Cxxx001", "Tesla Model Y", 5000.0, true, "Electric");
        customer.rentVehicle(car);
        assertTrue(customer.getRentedVehicles().contains(car), "Customer should have rented the vehicle");
    }

    @Test
    void testGetRentedVehicles() {
        assertTrue(customer.getRentedVehicles().isEmpty(), "Customer should have no current rentals initially");
        Vehicle car = new Car("Cxxx001", "Tesla Model Y", 5000.0, true, "Electric");
        customer.rentVehicle(car);
        assertEquals(1, customer.getRentedVehicles().size(), "Customer should have one rented vehicle");
    }

    @Test
    void testToString() {
        String expected = "Customer{name='Calyx Ish', email='calyxgod@xmail.com', rentedVehicles=0}";
        assertEquals(expected, customer.toString(), "Customer toString should match the expected format");
    }
}