package com.vehicle.rental;

public class TestVehicle extends Vehicle implements Rentable {
    public TestVehicle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getBaseRentalRate();
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailable(false);
            System.out.println("Vehicle rented to: " + customer.getName());
        } else {
            System.out.println("Vehicle is not available.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Vehicle returned.");
    }
}