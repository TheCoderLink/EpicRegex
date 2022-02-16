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

    @Test
    public void ipTest2()
    {
        regex test1 = new regex();
        test1.setIpAddress("40.0.148.20");
        assertTrue(test1.getIpAddress().matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$"));
    }

    @Test
    public void ipTest3()
    {
        regex test1 = new regex();
        test1.setIpAddress("35.237.186.81");
        assertTrue(test1.getIpAddress().matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$"));
    }

    @Test
    public void ipTest4()
    {
        regex test1 = new regex();
        test1.setIpAddress("33.60.75.232");
        assertTrue(test1.getIpAddress().matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$"));
    }

    @Test
    public void ipTest5()
    {
        regex test1 = new regex();
        test1.setIpAddress("254.9.174.68");
        assertTrue(test1.getIpAddress().matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$"));
    }

    @Test
    public void ipTest6()
    {
        regex test1 = new regex();
        test1.setIpAddress("164.124.82.31");
        assertTrue(test1.getIpAddress().matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$"));
    }

    @Test
    public void ipTest7()
    {
        regex test1 = new regex();
        test1.setIpAddress("102.206.114.172");
        assertTrue(test1.getIpAddress().matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$"));
    }

    @Test
    public void ipTest8()
    {
        regex test1 = new regex();
        test1.setIpAddress("161.251.111.29");
        assertTrue(test1.getIpAddress().matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$"));
    }

    @Test
    public void ipTest9()
    {
        regex test1 = new regex();
        test1.setIpAddress("86.217.185.85");
        assertTrue(test1.getIpAddress().matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$"));
    }

    @Test
    public void ipTest10()
    {
        regex test1 = new regex();
        test1.setIpAddress("22.43.48.158");
        assertTrue(test1.getIpAddress().matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$"));
    }

    @Test
    public void portTest()
    {
        regex test1 = new regex();
        test1.setPortNumber("49813");
        assertTrue(test1.getPortNumber().matches("^([1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])$"));
    }

    @Test
    public void portTest2()
    {
        regex test1 = new regex();
        test1.setPortNumber("65535");
        assertTrue(test1.getPortNumber().matches("^([1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])$"));
    }

    @Test
    public void portTest3()
    {
        regex test1 = new regex();
        test1.setPortNumber("38671");
        assertTrue(test1.getPortNumber().matches("^([1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])$"));
    }
}

