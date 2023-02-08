package test;

import main.Address;
import main.RentalOffice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentalOfficeTest {

    @Test
    public void testRentalOffice() {
        Address address = new Address("Olav V gate", "8004", "Bodø");
        RentalOffice office = new RentalOffice(1, address, "67 03 35 00");
        assertEquals(1, office.getOfficeNumber());
        assertEquals(address, office.getOfficeAddress());
        assertEquals("67 03 35 00", office.getOfficePhoneNumber());
    }
}
