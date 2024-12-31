package com.vehicle.rental;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void rentVehicle(Vehicle vehicle, Customer customer, int days) throws BoundaryViolationException {
        if (vehicle.isAvailableForRental()) {
            ((Rentable) vehicle).rent(customer, days); // Cast vehicle to Rentable
            customer.rentVehicle(vehicle);
        } else {
            System.out.println("Vehicle is not available for rent.");
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        ((Rentable) vehicle).returnVehicle(); // Cast vehicle to Rentable
    }

    public void generateReport() {
        System.out.println("Fleet Report:");
        for (Vehicle vehicle : fleet) {
            System.out.println(vehicle);
        }
    }

    @Override
    public String toString() {
        return "RentalAgency{" +
                "fleetSize=" + fleet.size() +
                '}';
    }
}