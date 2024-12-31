package com.vehicle.rental;

public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void updateLocation(double latitude, double longitude) throws BoundaryViolationException {
        // Implement boundary check logic here
        if (latitude > 90 || latitude < -90 || longitude > 180 || longitude < -180) {
            throw new BoundaryViolationException("Vehicle has crossed the boundary!");
        }
    }

    public abstract double calculateRentalCost(int days);

    public abstract boolean isAvailableForRental();
}
