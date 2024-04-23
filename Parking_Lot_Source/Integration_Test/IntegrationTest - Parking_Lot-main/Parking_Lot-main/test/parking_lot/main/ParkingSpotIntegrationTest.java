/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking_lot.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

/**
 *
 * @author joann
 */
public class ParkingSpotIntegrationTest {

    @InjectMocks
    private ParkingSpot parkingSpot;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSpotNum() {
        int spot = parkingSpot.SpotNum();
        // Assert that the returned spot number is within the range [1, 10]
        assertTrue(spot >= 1 && spot <= 10);
        // Assert that the spot is marked as occupied
        assertEquals(spot, parkingSpot.arr[spot - 1]);
    }

    @Test
    public void testSi() {
        // Initially, all spots are empty
        assertEquals(10, parkingSpot.si());

        // Occupy a few spotstest
        parkingSpot.SpotNum();
        parkingSpot.SpotNum();
        parkingSpot.SpotNum();

        // Assert that there are 7 empty spots left
        assertEquals(7, parkingSpot.si());
    }

    @Test
    public void testFreeSpot() {
        // Occupy a spot
        int spot = parkingSpot.SpotNum();

        // Free the spot
        parkingSpot.FreeSpot(spot);

        // Assert that the spot is now empty
        assertEquals(0, parkingSpot.arr[spot - 1]);
    }
}
