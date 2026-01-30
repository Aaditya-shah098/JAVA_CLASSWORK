import java.net.*;

public class URL_Class
{
    public static void main(String args[])
    {
        try
        {
            URL url =new URL("https://www.ncit.edu.np:80/index.html");
            
            System.out.println("URL is"+url.toString());
            System.out.println("Protocol is"+url.getProtocol());
            System.out.println("Authority is"+url.getAuthority());
            System.out.println("file name is"+url.getFile());
            System.out.println("host is"+url.getHost());
            System.out.println("Path is"+url.getPath());
            System.out.println("Port is"+url.getPort());
                    
        }
        catch(MalformedURLException e)
        {
            System.out.println(e);
        }
    }
}