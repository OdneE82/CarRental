package test;

import main.Address;
import main.CarRentalCompany;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarRentalCompanyTest {

    @Test
    public void testCarRentalCompany() {
        CarRentalCompany company = new CarRentalCompany("Bodø Bilutleige", "67 03 35 00",
                new Address("Olav V gate","8004","Bodø"));

        assertEquals("Bodø Bilutleige", company.getName());
        assertEquals("67 03 35 00", company.getNumber());
        assertEquals("Olav V gate",company.getAddress().getStreet());
        assertEquals("8004",company.getAddress().getPostcode());
        assertEquals("Bodø",company.getAddress().getPostAddress());
    }
}
