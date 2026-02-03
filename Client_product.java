import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client_product {
    public static void main(String args[]) throws RemoteException {
        Client_product rc = new Client_product();
        rc.connectRemote();
    }

    private void connectRemote() throws RemoteException {
        try {
            Scanner sc = new Scanner(System.in);

            Registry reg = LocateRegistry.getRegistry("localhost", 1005);

            // ✅ SAME NAME AS SERVER
            Product p = (Product) reg.lookup("hi server");

            System.out.println("Enter two number:");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            System.out.println("Product is " + p.getPro(n1,n2));
            sc.close();
        } catch (RemoteException | NotBoundException e) {
            System.out.println("Exception: " + e);
        }
    }
}
