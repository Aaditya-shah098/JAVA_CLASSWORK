import java.rmi.*;

public interface Factorial extends Remote
{
    long getFactorial(int number) throws RemoteException;
}