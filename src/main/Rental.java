package main;

import java.util.Date;

/**
 * Class represents rental part of a car rental.
 */

public class Rental {
    private Customer customer;
    private Car car;
    private RentalOffice rentalOffice;
    private Date rentalDate;
    private int rentalDuration;
    private boolean isReturned;

    /**
     * Constructor for creating a new rental
     * @param customer a customer for the rental
     * @param car a car for the rental
     * @param rentalOffice which office its rented from
     * @param rentalDate date of the rental
     * @param rentalDuration duration of the rental
     */

    public Rental(Customer customer, Car car, RentalOffice rentalOffice, Date rentalDate, int rentalDuration) {
        this.customer = customer;
        this.car = car;
        this.rentalOffice = rentalOffice;
        this.rentalDate = rentalDate;
        this.rentalDuration = rentalDuration;
        this.isReturned = false;
    }

    /**
     * Gets customers information
     * @return customers information
     */

    public Customer getCustomer() {
        return customer;
    }

    /**
     * Car information
     * @return car information
     */

    public Car getCar() {
        return car;
    }

    /**
     * Sets car information
     * @param car the new car information
     */

    public void setCar(Car car) {
        this.car = car;
    }

    /**
     * Gets the rental office
     * @return rental office
     */

    public RentalOffice getRentalOffice() {
        return rentalOffice;
    }

    /**
     * Gets rental duration
     * @return rental duration
     */

    public int getRentalDuration() {
        return rentalDuration;
    }

    /**
     * If rental is returned
     * @return rental returned
     */

    public boolean isReturned() {
        return isReturned;
    }

    /**
     * Sets if rental is returned
     * @param returned the new returned state of the rental
     */

    public void setReturned(boolean returned) {
        isReturned = returned;
    }
}
