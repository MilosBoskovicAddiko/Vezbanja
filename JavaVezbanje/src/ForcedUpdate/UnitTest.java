package ForcedUpdate;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {
    @Test
    public void testUpdate() {
        Update update = new Update();

        // testing for IOS
        assertEquals(true, update.forceUpdate(Update.OperatingSystem.IOS, "1.2.0", "1.22.0"));      // current < min -> true
        assertEquals(false, update.forceUpdate(Update.OperatingSystem.IOS, "0.0.1", "0.0.0"));     // current > min -> false
        assertEquals(false, update.forceUpdate(Update.OperatingSystem.IOS, "0.0.0", "0.0.0"));     // current == min -> false
        assertEquals(true, update.forceUpdate(Update.OperatingSystem.IOS, "1.1.1", "20.0.0"));     // current < min -> true
        assertEquals(false, update.forceUpdate(Update.OperatingSystem.IOS, "30.0.0", "20.0.0"));   //current > min -> false

        // testing for ANDROID
        assertEquals(true, update.forceUpdate(Update.OperatingSystem.ANDROID, "1001010000", "2001010000"));     // current < min -> true
        assertEquals(false, update.forceUpdate(Update.OperatingSystem.ANDROID, "2001010000", "1001010000"));    // current > min -> false
        assertEquals(false, update.forceUpdate(Update.OperatingSystem.ANDROID, "2001010001", "2001010001"));    // current == min -> false
        assertEquals(true, update.forceUpdate(Update.OperatingSystem.ANDROID, "0000000000", "2001010001"));     // current < min -> true
        assertEquals(false, update.forceUpdate(Update.OperatingSystem.ANDROID, "2001010001", "0000000000"));    //current > min -> false
    }
}
