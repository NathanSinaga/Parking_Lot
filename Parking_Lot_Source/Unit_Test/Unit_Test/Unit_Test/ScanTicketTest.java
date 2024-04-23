import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class ScanTicketTest {
    @Test
    public void testCheckNumber_T1() {
        ScanTicket scanTicket = new ScanTicket();
        assertEquals(0, scanTicket.checkNumber("D", "D243XZ"));
    }

    @Test
    public void testCheckNumber_T2() {
        ScanTicket scanTicket = new ScanTicket();
        assertEquals(1, scanTicket.checkNumber("D1A", "D1A"));
    }

    @Test
    public void testCheckNumber_T3() {
        ScanTicket scanTicket = new ScanTicket();
        assertEquals(0, scanTicket.checkNumber("D1234XZZA", "D123X"));
    }

    @Test
    public void testCheckNumber_T4() {
        ScanTicket scanTicket = new ScanTicket();
        assertEquals(0, scanTicket.checkNumber("D12X", "D1X"));
    }

    @Test
    public void testCheckNumber_T5() {
        ScanTicket scanTicket = new ScanTicket();
        assertEquals(1, scanTicket.checkNumber("D23A", "D23A"));
    }

    @Test
    public void testCheckNumber_T6() {
        ScanTicket scanTicket = new ScanTicket();
        assertEquals(0, scanTicket.checkNumber("D2A", "D34X"));
    }

    @Test
    public void testCheckNumber_T7() {
        ScanTicket scanTicket = new ScanTicket();
        assertEquals(0, scanTicket.checkNumber("D1X", "D2X"));
    }
}
