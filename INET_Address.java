import java.net.*;

class Inetadd
{
    public static void main(String[] args)
    {
        try
        {
            InetAddress IP = InetAddress.getByName("www.ncit.edu.np");
            System.out.println("Host address"+IP.getHostAddress());
            System.out.println("Host Name"+IP.getHostName());
        }
        catch(Exception e)
        {
            System.out.println("unknown address"+e.getMessage());
        }
    }
}