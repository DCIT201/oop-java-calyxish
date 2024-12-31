package com.vehicle.rental;

public class Truck extends Vehicle implements Rentable {
    private double cargoCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate, boolean isAvailable, double cargoCapacity) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.cargoCapacity = cargoCapacity;
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
            System.out.println("Truck rented to: " + customer.getName());
        } else {
            System.out.println("Truck is not available.");
        }
    }

    @Override
    public void returnVehicle() {
        System.out.println("Truck returned.");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "cargoCapacity=" + cargoCapacity +
                ", vehicleId='" + getVehicleId() + '\'' +
                ", model='" + getModel() + '\'' +
                ", baseRentalRate=" + getBaseRentalRate() +
                '}';
    }
}
