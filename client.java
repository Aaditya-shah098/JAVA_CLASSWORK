import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class client {
    public static void main(String args[]) throws RemoteException {
        client rc = new client();
        rc.connectRemote();
    }

    private void connectRemote() throws RemoteException {
        try {
            Scanner sc = new Scanner(System.in);

            Registry reg = LocateRegistry.getRegistry("localhost", 1557);

            // ✅ SAME NAME AS SERVER
           Odd_Even check1 = (Odd_Even) reg.lookup("hi server");

            System.out.println("Enter the number:");
            int num = sc.nextInt();
            

            System.out.println("num is " + check1.check(num));
            sc.close();
        } catch (RemoteException | NotBoundException e) {
            System.out.println("Exception: " + e);
        }
    }
}

