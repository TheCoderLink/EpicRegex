import java.util.Scanner;

public class regex
{
    Scanner scan = new Scanner(System.in);
    private String ipAddress;
    public regex()
    {
        ipAddress = "";
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress)
    {
        this.ipAddress = validateIpAddress(ipAddress);
    }

    private String validateIpAddress(String ipAddress)
    {
        while (!ipAddress.matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$"))
        {
            System.out.println("Not a valid IP Address >:(");
            ipAddress = scan.nextLine();
        }
        return ipAddress;
    }
}
