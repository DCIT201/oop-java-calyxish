package com.vehicle.rental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<Vehicle> rentedVehicles = new ArrayList<>();

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void rentVehicle(Vehicle vehicle) {
        rentedVehicles.add(vehicle);
    }

    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rentedVehicles=" + rentedVehicles.size() +
                '}';
    }
}
