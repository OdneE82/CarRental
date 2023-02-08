package test;

import main.Address;
import main.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    public void testCustomer() {
        Address address = new Address("Strandgaten", "5060", "Bergen");
        Customer customer = new Customer("Tobias", "Tobiasen", "123456789", address);

        assertEquals("Tobias", customer.getFirstName());
        assertEquals("Tobiasen", customer.getLastName());
        assertEquals("123456789", customer.getNumber());
        assertEquals(address, customer.getAddress());
    }
}
