package test;

import main.Address;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressTest {

    @Test
    public void testAddress() {
        Address address = new Address("Olav V gate","8004","Bodø");
        assertEquals("Olav V gate", address.getStreet());
        assertEquals("8004", address.getPostcode());
        assertEquals("Bodø", address.getPostAddress());
    }
}
