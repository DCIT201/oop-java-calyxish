package com.vehicle.rental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoundaryViolationExceptionTest {

    @Test
    void testBoundaryViolationException() {
        BoundaryViolationException exception = new BoundaryViolationException("Boundary violation detected");
        assertEquals("Boundary violation detected", exception.getMessage(), "Exception message should be correct");
    }
}
