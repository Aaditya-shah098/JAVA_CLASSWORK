import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server_factorial extends UnicastRemoteObject
        implements Factorial {

    public Server_factorial() throws RemoteException {
        super();
    }

    @Override
    public long getFactorial(int num) throws RemoteException {
        long f = 1;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String args[]) {
        try {
            Registry reg = LocateRegistry.createRegistry(1555);
            reg.rebind("hi server", new Server_factorial());
            System.out.println("Server is ready");
        } catch (RemoteException e) {
            System.out.println("Exception: " + e);
        }
    }
}
