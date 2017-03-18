import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculator extends Remote
{
    double soma(double a, double b)
            throws RemoteException;
}
