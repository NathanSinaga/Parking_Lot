/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking_lot.main;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.InOrder;
import parking_lot.main.Car;
import parking_lot.main.Car;
import parking_lot.main.ParkingTicket;
import parking_lot.main.ParkingTicket;
import static org.mockito.Mockito.*;

/**
 *
 * @author joann
 */
public class ParkingTicketIntegrationTest {

    @Test
    public void testSetAndGetCar() {
        // Create a mock Car object
        Car carMock = mock(Car.class);

        // Set behavior for the mock Car object
        when(carMock.getNumberPlate()).thenReturn("GHI7890");
        when(carMock.getCarColor()).thenReturn("Red");
        when(carMock.getCarType()).thenReturn("SUV");

        // Create a parking ticket object
        ParkingTicket parkingTicket = new ParkingTicket();

        // Set the mock Car to the parking ticket
        parkingTicket.setCar(carMock);

        // Get the assigned car from the parking ticket
        Car assignedCar = parkingTicket.getAssignedCar();

        // Verify interactions
//        verify(carMock).getNumberPlate();
//        verify(carMock).getCarColor();
//        verify(carMock).getCarType();
// Verify the assigned Car's details (indirectly verifying getNumberPlate)
        assertEquals("GHI7890", assignedCar.getNumberPlate());
        assertEquals("Red", assignedCar.getCarColor());
        assertEquals("SUV", assignedCar.getCarType());
    }
}
