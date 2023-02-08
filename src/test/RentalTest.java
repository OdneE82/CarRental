package test;

import main.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class RentalTest {

    @Test
    void testRentalOffice() {
        Address address = new Address("Bodøveien","8004","Bodø");
        RentalOffice office = new RentalOffice(2, address,"987654321");

        assertEquals(2, office.getOfficeNumber());
        assertEquals(address, office.getOfficeAddress());
        assertEquals("987654321", office.getOfficePhoneNumber());
        assertNotNull(office.getCars());
    }

    @Test
    void testAddCar() {
        RentalOffice office = new RentalOffice(2, new Address("Bodøveien","8004","Bodø"),"987654321");
        Car car = new Car("ZZ12345","Porsche","911","Yellow","S");
        office.addCar(car);

        assertEquals(1, office.getCars().size());
        assertTrue(office.getCars().contains(car));
    }

    @Test
    void testRentCar() {
        RentalOffice office = new RentalOffice(2, new Address("Bodøveien","8004","Bodø"),"987654321");
        Car car = new Car("ZZ12345","Porsche","911","Yellow","S");
        office.addCar(car);

        Customer customer = new Customer("Nikolai","Langeland","123456789", new Address("Askvoll vegen", "6940", "Askvoll"));
        Rental rental = new Rental(customer, null, office, new Date(), 3);

        office.rentCar(car, rental);
        assertFalse(car.isAvailable());
        assertEquals(car, rental.getCar());
    }

    @Test
    void testReturnCar() {
        RentalOffice office = new RentalOffice(2, new Address("Bodøveien","8004","Bodø"),"987654321");
        Car car = new Car("ZZ12345","Porsche","911","Yellow","S");
        office.addCar(car);

        Customer customer = new Customer("Nikolai","Langeland","123456789", new Address("Askvoll vegen", "6940", "Askvoll"));
        Rental rental = new Rental(customer, car, office, new Date(), 3);

        office.returnCar(car, rental);
        assertTrue(car.isAvailable());
        assertTrue(rental.isReturned());
    }
}
