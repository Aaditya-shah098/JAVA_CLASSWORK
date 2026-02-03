import java.rmi.*;

public interface Product extends Remote
{
    int getPro(int n1, int n2) throws RemoteException;
}