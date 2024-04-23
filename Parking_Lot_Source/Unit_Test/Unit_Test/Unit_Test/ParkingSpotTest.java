import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class ParkingSpotTest {
    //Allocate Empty Spot Function
    
    @Test
    public void testAllocateEmptySpots() {
        ParkingSpot parkingSpot = new ParkingSpot();
        int[] arr = {0,0,0,0,0,0,0,0,0,0}; 
        parkingSpot.arr = arr;

        assertEquals(1, parkingSpot.AllocateSpot());
    }

    @Test
    public void testAllocateSomeFilledSpots() {
        ParkingSpot parkingSpot = new ParkingSpot();
        int[] arr = {0,1,1,0,1,0,1,1,0,1}; 
        parkingSpot.arr = arr;

        assertEquals(1, parkingSpot.AllocateSpot());
    }
    
    @Test
    public void testAllocateCompletelyFilledSpots() {
        ParkingSpot parkingSpot = new ParkingSpot();
        int[] arr = {1,1,1,1,1,1,1,1,1,1}; 
        parkingSpot.arr = arr;

        assertEquals(0, parkingSpot.AllocateSpot());
    }

    @Test
    public void testAllocateLastEmpty() {
        ParkingSpot parkingSpot = new ParkingSpot();
        int[] arr = {1,1,1,1,1,1,1,1,1,0}; 
        parkingSpot.arr = arr;

        assertEquals(1, parkingSpot.AllocateSpot());
    }

    @Test
    public void testAllocateFirstEmpty() {
        ParkingSpot parkingSpot = new ParkingSpot();
        int[] arr = {0,1,1,1,1,1,1,1,1,1};  
        parkingSpot.arr = arr;

        assertEquals(1, parkingSpot.AllocateSpot());
    }

    @Test
    public void testAllocateMiddleEmpty() {
        ParkingSpot parkingSpot = new ParkingSpot();
        int[] arr = {1,1,1,1,1,0,1,1,1,1}; 
        parkingSpot.arr = arr;

        assertEquals(1, parkingSpot.AllocateSpot());
    }

    //Count Empty Spots Function

    @Test
    public void testCountEmptySpots() {
        ParkingSpot parkingSpot = new ParkingSpot();
        int[] arr = {0,0,0,0,0,0,0,0,0,0}; 
        parkingSpot.arr = arr;

        assertEquals(10, parkingSpot.CountEmptySpots());
    }

    @Test
    public void testCountSomeFilledSpots() {
        ParkingSpot parkingSpot = new ParkingSpot();
        int[] arr = {0,1,1,0,1,0,1,1,0,1}; 
        parkingSpot.arr = arr;

        assertEquals(4, parkingSpot.CountEmptySpots());
    }
    
    @Test
    public void testCountCompletelyFilledSpots() {
        ParkingSpot parkingSpot = new ParkingSpot();
        int[] arr = {1,1,1,1,1,1,1,1,1,1}; 
        parkingSpot.arr = arr;

        assertEquals(0, parkingSpot.CountEmptySpots());
    }

    @Test
    public void testCountLastEmpty() {
        ParkingSpot parkingSpot = new ParkingSpot();
        int[] arr = {1,1,1,1,1,1,1,1,1,0}; 
        parkingSpot.arr = arr;

        assertEquals(1, parkingSpot.CountEmptySpots());
    }

    @Test
    public void testCountFirstEmpty() {
        ParkingSpot parkingSpot = new ParkingSpot();
        int[] arr = {0,1,1,1,1,1,1,1,1,1};  
        parkingSpot.arr = arr;

        assertEquals(1, parkingSpot.CountEmptySpots());
    }

    @Test
    public void testCountMiddleEmpty() {
        ParkingSpot parkingSpot = new ParkingSpot();
        int[] arr = {1,1,1,1,1,0,1,1,1,1}; 
        parkingSpot.arr = arr;

        assertEquals(1, parkingSpot.CountEmptySpots());
    }

    //try freeing spots
    @Test
    public void testEmptyFilledSpot() {
        ParkingSpot parkingSpot = new ParkingSpot();
        int[] arr = {1,1,1,1,1,0,1,1,1,1}; 
        parkingSpot.arr = arr;
        parkingSpot.FreeSpot(3);

        assertEquals(0, parkingSpot.arr[3]);
    }

    @Test
    public void testAlreadyEmptySpot() {
        ParkingSpot parkingSpot = new ParkingSpot();
        int[] arr = {1,1,1,1,1,0,1,1,1,1}; 
        parkingSpot.arr = arr;
        parkingSpot.FreeSpot(5);

        assertEquals(0, parkingSpot.arr[5]);
    }
}
