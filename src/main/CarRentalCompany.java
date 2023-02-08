package main;

import java.util.List;

/**
 * Class for Car Rental Company
 */

public class CarRentalCompany {
    private String name;
    private String number;
    private Address address;

    /**
     * Constructor for creating new CarRentalCompany
     * @param name name of the company
     * @param number number of the company
     * @param address address of the company
     */

    public CarRentalCompany(String name, String number, Address address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    /**
     * Gets name of the commpany
     * @return name of the company
     */

    public String getName() {
        return name;
    }

    /**
     * Gets number of the company
     * @return number of the company
     */

    public String getNumber() {
        return number;
    }

    /**
     * Gets address of company
     * @return address of the company
     */

    public Address getAddress() {
        return address;
    }
}
