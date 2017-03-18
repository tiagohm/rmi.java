import br.tiagohm.rmi.Server;

public class ServerTest
{

    public static void main(String[] args)
    {
        try
        {
            Calculator calc = new Calculator();
            Server server = new Server(calc, "192.168.0.3", "Calc");
            Thread.currentThread().join();
        }
        catch(IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch(InstantiationException e)
        {
            e.printStackTrace();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
