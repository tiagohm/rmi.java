import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculator extends UnicastRemoteObject implements ICalculator
{
    protected Calculator()
            throws RemoteException
    {
    }

    public double soma(double a, double b)
            throws RemoteException
    {
        System.out.println(a + "," + b);
        return a + b;
    }
}
