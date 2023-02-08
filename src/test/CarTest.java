package test;

import main.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {

    @Test
    public void testCar() {
        Car car = new Car("ZZ12345", "Volkswagen", "Golf", "Red", "B");
        assertEquals("ZZ12345", car.getRegistrationNumber());
        assertEquals("Volkswagen", car.getMake());
        assertEquals("Golf", car.getModel());
        assertEquals("Red", car.getColor());
        assertEquals("B", car.getRentalGroup());
        assertTrue(car.isAvailable());
    }
}
