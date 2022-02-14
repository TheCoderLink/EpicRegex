import org.junit.Test;

import static org.junit.Assert.*;

public class regexTest {

    @Test
    public void ipTest()
    {
        regex test1 = new regex();
        test1.setIpAddress("138.225.203.122");
        assertTrue(test1.getIpAddress().matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$"));
    }
}