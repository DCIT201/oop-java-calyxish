package com.vehicle.rental;

public class RatingSystem {
    private double rating;

    public RatingSystem() {
        this.rating = 0.0;
    }

    public void rate(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "RatingSystem{" +
                "rating=" + rating +
                '}';
    }
}
