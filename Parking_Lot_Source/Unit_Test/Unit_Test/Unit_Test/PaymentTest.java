import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class PaymentTest {

    @Test
    public void testInvalidHour() {
        Payment payment = new Payment();

        // Test case 1: Hour = -3, Minute = 30
        assertEquals("error hour invalid", payment.TotalAmount(-3, 30));
    }

    @Test
    public void testInvalidHourAndMinute() {
        Payment payment = new Payment();

        // Test case 2: Hour = -3, Minute = -15
        assertEquals("error hour and minute invalid", payment.TotalAmount(-3, -15));
    }

    @Test
    public void testInvalidMinute() {
        Payment payment = new Payment();

        // Test case 3: Hour = 3, Minute = -15
        assertEquals("error minute invalid", payment.TotalAmount(3, -15));
    }

    @Test
    public void testMinuteOver60() {
        Payment payment = new Payment();

        // Test case 4: Hour = 3, Minute = 63
        assertEquals("error minute over 60", payment.TotalAmount(3, 63));
    }

    @Test
    public void testValidHourAndMinute1() {
        Payment payment = new Payment();

        // Test case 5: Hour = 2, Minute = 30
        assertEquals(80, payment.TotalAmount(2, 30));
    }

    @Test
    public void testValidHourAndMinute2() {
        Payment payment = new Payment();

        // Test case 6: Hour = 25, Minute = 30
        assertEquals(770, payment.TotalAmount(25, 30));
    }

    @Test
    public void testValidHourAndMinute3() {
        Payment payment = new Payment();

        // Test case 7: Hour = 2, Minute = 10
        assertEquals(70, payment.TotalAmount(2, 10));
    }
}
