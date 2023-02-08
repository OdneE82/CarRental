package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Class represents a rental office
 */

public class RentalOffice {
    private int officeNumber;
    private Address officeAddress;
    private String officePhoneNumber;
    private List<Car> cars;

    /**
     * Consturctor for creating a new rental office
     * @param officeNumber the office number
     * @param officeAddress the office address
     * @param officePhoneNumber the office phonenumber
     */

    public RentalOffice(int officeNumber, Address officeAddress, String officePhoneNumber) {
        this.officeNumber = officeNumber;
        this.officeAddress = officeAddress;
        this.officePhoneNumber = officePhoneNumber;
        this.cars = new ArrayList<>();
    }

    /**
     * Gets the office number
     * @return office number
     */

    public int getOfficeNumber() {
        return officeNumber;
    }

    /**
     * Gets the office address
     * @return the office address
     */

    public Address getOfficeAddress() {
        return officeAddress;
    }

    /**
     * gets office phone number
     * @return office phone number
     */

    public String getOfficePhoneNumber() {
        return officePhoneNumber;
    }

    /**
     * get available office cars
     * @return available office cars
     */

    public List<Car> getCars() {
        return cars;
    }

    /**
     * Adds a car to the office
     * @param car car to be added to office
     */

    public void addCar(Car car) {
        this.cars.add(car);
    }

    /**
     * Rent car from office
     * @param car car to be rented
     * @param rental sets status of rental
     */

    public void rentCar(Car car, Rental rental) {
        car.setAvailable(false);
        rental.setCar(car);
    }

    /**
     * Returned car to office
     * @param car car to be returned
     * @param rental sets rental returned status
     */

    public void returnCar(Car car, Rental rental) {
        car.setAvailable(true);
        rental.setReturned(true);
    }
}
