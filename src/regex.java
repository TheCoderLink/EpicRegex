import java.util.Scanner;

public class regex {
    Scanner scan = new Scanner(System.in);
    private String ipAddress;
    private String portNumber;

    public regex() {
        ipAddress = "";
        portNumber = "";
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = validateIpAddress(ipAddress);
    }

    private String validateIpAddress(String ipAddress) {
        while (!ipAddress.matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$")) {
            System.out.println("Not a valid IP Address >:(");
            ipAddress = scan.nextLine();
        }
        return ipAddress;
    }

    public String getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(String portNumber) {
        this.portNumber = validatePortNumber(portNumber);
    }

    private String validatePortNumber(String portNumber) {
        while (!portNumber.matches("^([1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])$")) {
            System.out.println("Not a valid port number.");
            portNumber = scan.nextLine();
        }
        return portNumber;
    }
}
