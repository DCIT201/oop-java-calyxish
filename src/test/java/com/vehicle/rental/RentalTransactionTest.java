package com.vehicle.rental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

class RentalTransactionTest {

    private Customer customer;
    private Vehicle car;
    private RentalTransaction rentalTransaction;

    @BeforeEach
    void setUp() {
        customer = new Customer("Calyx Ish", "calyxgod@xmail.com");
        car = new Car("Cxxx001", "Tesla Model Y", 100.0, true, "Electric");
        rentalTransaction = new RentalTransaction(customer, car, 3);
    }

    @Test
    void testCalculateTotalCost() {
        assertEquals(300.0, rentalTransaction.calculateTotalCost(), "Total cost for 3 days should be 300.0");
    }

    @Test
    void testGetRentalDate() {
        Date rentalDate = rentalTransaction.getRentalDate();
        assertNotNull(rentalDate, "Rental date should not be null");
        assertTrue(rentalDate.before(new Date()) || rentalDate.equals(new Date()),
                "Rental date should be before or equal to the current date");
    }

    @Test
    void testToString() {
        String expected = "RentalTransaction{customer=Customer{name='Calyx Ish', email='calyxgod@xmail.com', rentedVehicles=0}, vehicle=Car{fuelType='Electric', vehicleId='Cxxx001', model='Tesla Model Y', baseRentalRate=100.0}, days=3, rentalDate="
                + rentalTransaction.getRentalDate() + "}";
        assertEquals(expected, rentalTransaction.toString(), "toString should match the expected format");
    }
}