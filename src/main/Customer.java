package main;

/**
 * Class represents customer
 */

public class Customer {
    private String firstName;
    private String lastName;
    private String number;
    private Address address;

    /**
     * Constructor for creating new customer
     * @param firstName firstname of customer
     * @param lastName last name of customer
     * @param number number of the customer
     * @param address address of the customer
     */

    public Customer(String firstName, String lastName, String number, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.address = address;
    }

    /**
     * Gets first name of customer
     * @return first name of customer
     */

    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets last name of customer
     * @return last name of customer
     */

    public String getLastName() {
        return lastName;
    }

    /**
     * Gets number of customer
     * @return number of customer
     */

    public String getNumber() {
        return number;
    }

    /**
     * Gets address of customer
     * @return address of customer
     */

    public Address getAddress() {
        return address;
    }
}
