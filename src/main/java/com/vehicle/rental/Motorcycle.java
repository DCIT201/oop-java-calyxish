package com.vehicle.rental;

public class Motorcycle extends Vehicle implements Rentable {
    private boolean hasSidecar;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean isAvailable, boolean hasSidecar) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.hasSidecar = hasSidecar;
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
            System.out.println("Motorcycle rented to: " + customer.getName());
        } else {
            System.out.println("Motorcycle is not available.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Motorcycle returned.");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSidecar=" + hasSidecar +
                ", vehicleId='" + getVehicleId() + '\'' +
                ", model='" + getModel() + '\'' +
                ", baseRentalRate=" + getBaseRentalRate() +
                '}';
    }
}