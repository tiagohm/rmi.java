import java.rmi.RemoteException;

import br.tiagohm.rmi.Server;

public class ServerTest
{

    public static void main(String[] args)
    {
        try
        {
            Calculator calc = new Calculator();
            Server server = new Server(calc, "25.30.22.6", "Calc");
        }
        catch(IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch(InstantiationException e)
        {
            e.printStackTrace();
        }
        catch(RemoteException e)
        {
            e.printStackTrace();
        }
    }
}
