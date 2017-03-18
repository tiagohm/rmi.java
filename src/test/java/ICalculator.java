import java.rmi.RemoteException;

import br.tiagohm.rmi.SerializableRemote;

public interface ICalculator extends SerializableRemote
{
    double soma(double a, double b)
            throws RemoteException;
}
