import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.tiagohm.rmi.Client;

public class ClientTest
{
    public static void main(String[] args)
    {
        try
        {
            Client<ICalculator> client = new Client<>("192.168.0.3", "Calc");
            System.out.println(client.getRemoteObj().soma(1, 4));
        }
        catch(RemoteException e)
        {
            e.printStackTrace();
        }
        catch(NotBoundException e)
        {
            e.printStackTrace();
        }
        catch(MalformedURLException e)
        {
            e.printStackTrace();
        }
    }
}
