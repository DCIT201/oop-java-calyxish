package com.vehicle.rental;

public class App {
    public static void main(String[] args) {
        try {
            // Initialize Customers
            Customer customer1 = new Customer("Calyx Ish", "calyxgod@xmail.com");
            Customer customer2 = new Customer("pat love", "patlove@xmail.com");

            // Initialize Vehicles
            Vehicle car = new Car("Cxxx001", "Tesla Model Y", 5000, true, "Electric");
            Vehicle motorcycle = new Motorcycle("Mxxx001", "Honda CBR", 250, true, true);
            Vehicle truck = new Truck("Txxx001", "Ford F150", 2000, true, 5000);

            // Initialize Agency
            RentalAgency agency = new RentalAgency();
            agency.addVehicle(car);
            agency.addVehicle(motorcycle);
            agency.addVehicle(truck);

            // Rent Vehicles
            agency.rentVehicle(car, customer1, 3);
            agency.rentVehicle(motorcycle, customer2, 2);

            // Update Location and Check for Boundary Violations
            car.updateLocation(91.0, 180.0); // This should trigger BoundaryViolationException
        } catch (BoundaryViolationException e) {
            System.out.println(e.getMessage());
        }
    }
}
