package com.vehicle.rental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class RentalServiceTest {

    @Test
    void testMain() {
        // Set up a stream to capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run the main method
        RentalService.main(new String[] {});

        // Capture the actual output
        String actualOutput = outContent.toString();

        // Print the actual output for debugging
        System.out.println("Actual Output: " + actualOutput);

        // Verify the output
        String expectedOutput = "Vehicle has crossed the boundary!";
        assertTrue(actualOutput.contains(expectedOutput),
                "Output should contain the boundary violation message");

        // Reset the standard output
        System.setOut(System.out);
    }
}