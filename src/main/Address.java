package main;

/**
 * The 'Address' class represents addresses
 */

public class Address {
    private String street;
    private String postcode;
    private String postAddress;

    /**
     * Constructor for creating new address object.
     * @param street street
     * @param postcode postcode
     * @param postAddress post address
     */

    public Address(String street, String postcode, String postAddress) {
        this.street = street;
        this.postcode = postcode;
        this.postAddress = postAddress;
    }

    /**
     * Gets the street name of the address
     * @return the street name
     */
    public String getStreet() {
        return street;
    }

    /**
     * Gets the post code of the address
     * @return the post code
     */

    public String getPostcode() {
        return postcode;
    }

    /**
     * Gets the post address of the location
     * @return the post address
     */

    public String getPostAddress() {
        return postAddress;
    }
}
