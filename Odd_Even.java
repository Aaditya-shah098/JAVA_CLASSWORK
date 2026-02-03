 import java.rmi.*;

public interface Odd_Even extends Remote
{
    int check(int number) throws RemoteException;
}