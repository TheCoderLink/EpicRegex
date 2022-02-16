public class MainMethod
{
    public static void main(String[] args)
    {
        regex ip = new regex();

        ip.setIpAddress("");
        ip.setPortNumber("");
        System.out.println(ip.getIpAddress());
        System.out.println(ip.getPortNumber());
    }
}
