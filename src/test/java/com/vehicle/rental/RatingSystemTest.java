package com.vehicle.rental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RatingSystemTest {

    private RatingSystem ratingSystem;

    @BeforeEach
    void setUp() {
        ratingSystem = new RatingSystem();
    }

    @Test
    void testInitialRating() {
        assertEquals(0.0, ratingSystem.getRating(), "Initial rating should be 0.0");
    }

    @Test
    void testRate() {
        ratingSystem.rate(4.5);
        assertEquals(4.5, ratingSystem.getRating(), "Rating should be updated to 4.5");
    }

    @Test
    void testToString() {
        ratingSystem.rate(3.0);
        String expected = "RatingSystem{rating=3.0}";
        assertEquals(expected, ratingSystem.toString(), "toString should match the expected format");
    }
}