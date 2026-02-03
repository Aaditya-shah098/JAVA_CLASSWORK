import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client_Factorial {
    public static void main(String args[]) throws RemoteException {
        Client_Factorial rc = new Client_Factorial();
        
        rc.connectRemote();
    }

    private void connectRemote() throws RemoteException {
        try {
            Scanner sc = new Scanner(System.in);

            Registry reg = LocateRegistry.getRegistry("localhost", 1555);

            // ✅ SAME NAME AS SERVER
            Factorial fct = (Factorial) reg.lookup("hi server");

            System.out.println("Enter the number:");
            int num = sc.nextInt();

            System.out.println("Factorial is " + fct.getFactorial(num));
            sc.close();
        } catch (RemoteException | NotBoundException e) {
            System.out.println("Exception: " + e);
        }
    }
}
