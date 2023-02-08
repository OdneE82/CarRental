package main;

/**
 * The class represents a car.
 */

public class Car {
    private String registrationNumber;
    private String make;
    private String model;
    private String color;
    private String rentalGroup;
    private boolean isAvailable;

    /**
     * Constructor for creating new car object
     * @param registrationNumber The registration number of the car
     * @param make the make of the car
     * @param model the model of the car
     * @param color the color of the car
     * @param rentalGroup the rental group of the car
     */

    public Car(String registrationNumber, String make, String model, String color, String rentalGroup) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.color = color;
        this.rentalGroup = rentalGroup;
        this.isAvailable = true;
    }

    /**
     * Gets the registration number of the car
     * @return the registration number of the car
     */

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the registration number of the car
     * @param registrationNumber the new registration number for the car
     */

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Gets the make of the car
     * @return make of the car
     */

    public String getMake() {
        return make;
    }

    /**
     * Sets the make of the car
     * @param make the new make for the car
     */

    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Get model of the car
     * @return model of the car
     */

    public String getModel() {
        return model;
    }

    /**
     * Sets the model of the car
     * @param model new model of the car
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets color of the car
     * @return color of the car
     */

    public String getColor() {
        return color;
    }

    /**
     * Sets color of the car
     * @param color new color of the car
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get rental group of the car
     * @return rental group of the car
     */

    public String getRentalGroup() {
        return rentalGroup;
    }

    /**
     * Sets the rental group of the car
     * @param rentalGroup new rental group of the car
     */

    public void setRentalGroup(String rentalGroup) {
        this.rentalGroup = rentalGroup;
    }

    /**
     * Gets availability of the car
     * @return availability of the car true or false.
     */

    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Sets the new availability of the car
     * @param available new availability of the car
     */

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
