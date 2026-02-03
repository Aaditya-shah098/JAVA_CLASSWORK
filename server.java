import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class server extends UnicastRemoteObject
        implements Odd_Even {

    public server() throws RemoteException {
        super();
    }

    @Override
    public int check(int num) throws RemoteException {
       if(num%2==0){
           return 0;
       }
       else{
           return 1;
       }
    }

    public static void main(String args[]) {
        try {
            Registry reg = LocateRegistry.createRegistry(1557);
            reg.rebind("hi server", new server());
            System.out.println("Server is ready");
        } catch (RemoteException e) {
            System.out.println("Exception: " + e);
        }
    }
}

