package com.vehicle.rental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Vehicle vehicle;

    @BeforeEach
    void setUp() {
        vehicle = new TestVehicle("V001", "Test Model", 100.0, true);
    }

    @Test
    void testGetVehicleId() {
        assertEquals("V001", vehicle.getVehicleId(), "Vehicle ID should be 'V001'");
    }

    @Test
    void testGetModel() {
        assertEquals("Test Model", vehicle.getModel(), "Vehicle model should be 'Test Model'");
    }

    @Test
    void testGetBaseRentalRate() {
        assertEquals(100.0, vehicle.getBaseRentalRate(), "Base rental rate should be 100.0");
    }

    @Test
    void testIsAvailable() {
        assertTrue(vehicle.isAvailable(), "Vehicle should be available initially");
        vehicle.setAvailable(false);
        assertFalse(vehicle.isAvailable(), "Vehicle should not be available after setting to unavailable");
    }

    @Test
    void testSetAvailable() {
        vehicle.setAvailable(false);
        assertFalse(vehicle.isAvailable(), "Vehicle should not be available after setting to unavailable");
        vehicle.setAvailable(true);
        assertTrue(vehicle.isAvailable(), "Vehicle should be available after setting to available");
    }

    @Test
    void testUpdateLocationWithinBounds() {
        assertDoesNotThrow(() -> vehicle.updateLocation(45.0, 90.0),
                "Updating location within bounds should not throw an exception");
    }

    @Test
    void testUpdateLocationOutOfBounds() {
        Exception exception = assertThrows(BoundaryViolationException.class, () -> vehicle.updateLocation(95.0, 180.0));
        assertEquals("Vehicle has crossed the boundary!", exception.getMessage(),
                "Updating location out of bounds should throw BoundaryViolationException");
    }
}