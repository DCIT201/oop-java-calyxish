package com.vehicle.rental;

import java.util.Date;

public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int days;
    private Date rentalDate;

    public RentalTransaction(Customer customer, Vehicle vehicle, int days) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
        this.rentalDate = new Date();
    }

    public double calculateTotalCost() {
        return vehicle.calculateRentalCost(days);
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    @Override
    public String toString() {
        return "RentalTransaction{" +
                "customer=" + customer +
                ", vehicle=" + vehicle +
                ", days=" + days +
                ", rentalDate=" + rentalDate +
                '}';
    }
}