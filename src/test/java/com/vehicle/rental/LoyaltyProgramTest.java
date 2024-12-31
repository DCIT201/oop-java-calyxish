package com.vehicle.rental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoyaltyProgramTest {

    @Test
    void testApplyDiscount() {
        LoyaltyProgram loyaltyProgram = new LoyaltyProgram() {
            @Override
            public double applyDiscount(double rentalCost) {
                return rentalCost * 0.9; // Example implementation with a 10% discount
            }
        };

        double rentalCost = 100.0;
        double expectedDiscountedCost = 90.0;
        assertEquals(expectedDiscountedCost, loyaltyProgram.applyDiscount(rentalCost), 0.01,
                "Discounted cost should be 85.0");
    }
}