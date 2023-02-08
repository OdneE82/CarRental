package test;

import main.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservationTest {

    @Test
    public void testReservation() {
        Customer customer = new Customer("Jan","Martin","123456789", new Address("Fleslandveien 6","5060","Bergen"));
        Car car = new Car("ZZ12345", "Porsche", "911", "Yellow", "Super");
        RentalOffice pickupLocation = new RentalOffice(2, new Address("Bodøveien 4", "8004", "Bodø"), "123456789");
        RentalOffice returnLocation = new RentalOffice(3, new Address("Bodøveien 4", "8004", "Bodø"), "123456789");
        LocalDateTime pickupDateTime = LocalDateTime.of(2023, 2, 8, 9, 0);
        LocalDateTime returnDateTime = LocalDateTime.of(2023, 2, 10, 9, 0);
        int rentalDuration = 2;
        String rentalCategory = "Super";

        Reservation reservation = new Reservation(customer, car, pickupLocation, returnLocation, pickupDateTime, returnDateTime, rentalDuration, rentalCategory);

        assertEquals(customer, reservation.getCustomer());
        assertEquals(car, reservation.getCar());
        assertEquals(pickupLocation, reservation.getPickupLocation());
        assertEquals(returnLocation, reservation.getReturnLocation());
        assertEquals(pickupDateTime, reservation.getPickupDateTime());
        assertEquals(returnDateTime, reservation.getReturnDateTime());
        assertEquals(rentalDuration, reservation.getRentalDuration());
        assertEquals(rentalCategory, reservation.getRentalCategory());
    }
}
