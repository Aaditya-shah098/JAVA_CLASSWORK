import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server_product extends UnicastRemoteObject
        implements Product {

    public Server_product() throws RemoteException {
        super();
    }

  
    public int getPro(int n1,int n2) throws RemoteException {
        int prod = n1*n2;
        return prod;
    }

    public static void main(String args[]) {
        try {
            Registry reg = LocateRegistry.createRegistry(1005);
            reg.rebind("hi server", new Server_product());
            System.out.println("Server is ready");
        } catch (RemoteException e) {
            System.out.println("Exception: " + e);
        }
    }
}
