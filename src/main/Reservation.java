package main;

import java.time.LocalDateTime;

/**
 * Class represents reservation.
 */

public class Reservation {
    private Customer customer;
    private Car car;
    private RentalOffice pickupLocation;
    private RentalOffice returnLocation;
    private LocalDateTime pickupDateTime;
    private LocalDateTime returnDateTime;
    private int rentalDuration;
    private double totalCost;
    private String rentalCategory;

    /**
     * Constructor for creating a new reservation
     * @param customer customer information
     * @param car car information
     * @param pickupLocation pickup office
     * @param returnLocation return office
     * @param pickupDateTime time of pickup
     * @param returnDateTime time of return
     * @param rentalDuration days of rental
     * @param rentalCategory category of car
     */

    public Reservation(Customer customer, Car car, RentalOffice pickupLocation, RentalOffice returnLocation,
                       LocalDateTime pickupDateTime, LocalDateTime returnDateTime, int rentalDuration, String rentalCategory) {
        this.customer = customer;
        this.car = car;
        this.pickupLocation = pickupLocation;
        this.returnLocation = returnLocation;
        this.pickupDateTime = pickupDateTime;
        this.returnDateTime = returnDateTime;
        this.rentalDuration = rentalDuration;
        this.totalCost = calculateTotalCost();
        this.rentalCategory = rentalCategory;
    }

    /**
     * Gets customer information
     * @return customer information
     */

    public Customer getCustomer() {
        return customer;
    }

    /**
     * Gets car information
     * @return car information
     */

    public Car getCar() {
        return car;
    }

    /**
     * Gets pickup location
     * @return pickup location
     */

    public RentalOffice getPickupLocation() {
        return pickupLocation;
    }

    /**
     * Gets return location
     * @return return location
     */

    public RentalOffice getReturnLocation() {
        return returnLocation;
    }

    /**
     * Gets pickup time
     * @return pickup time
     */

    public LocalDateTime getPickupDateTime() {
        return pickupDateTime;
    }

    /**
     * Gets return time
     * @return return time
     */

    public LocalDateTime getReturnDateTime() {
        return returnDateTime;
    }

    /**
     * Gets rental category of car
     * @return rental category of car
     */

    public String getRentalCategory() {
        return rentalCategory;
    }

    /**
     * Gets rental duration
     * @return rental duration
     */

    public int getRentalDuration() {
        return rentalDuration;
    }

    /**
     * Gets total cost of rent
     * @return total cost
     */

    public double getTotalCost() {
        return totalCost;
    }

    /**
     * Calculates the total cost
     * @return calculate cost
     */

    private double calculateTotalCost() {
        // Calculate the total cost based on the rental group daily price and the return fee
        // Note: The implementation of this method is left out for simplicity
        return 0.0;
    }
}
