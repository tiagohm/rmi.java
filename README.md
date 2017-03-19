# RMI e Java

Dividido em duas classes: Server e Client.

Server: hospeda o objeto que será acessado remotamente.

Client: acessa o objeto hospedado pelo Server e invoca algum de seus métodos.
O Server executa o método localmente e retorna para o Cliente um resultado caso seja necessário.

#### Criando o Objeto para acesso remoto

1. Criar a interface para que ambos, Server e Client possam se entender.

```java
public interface ICalculator extends java.rmi.Remote {

  double soma(double a, double b);

  //...outros métodos.
}
```

2. No lado do Server, implementar a interface.

```java
public class Calculator extends java.rmi.server.UnicastRemoteObject implements ICalculator {

  public void soma(double a, double b) {
    return a + b;
  }
}
```

#### Criando o Server

1. Criar o objeto.
2. Instanciar o Server passando o objeto, o ip local e um nome para o objeto.

```java
try
{
    Calculator calc = new Calculator();
    Server server = new Server(calc, "0.0.0.0", "Calc");
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
```

#### Criando o Client

1. Instanciar o Client passando a interface, o ip do Server e o nome do objeto.
2. Obter o objeto remoto usando a função getRemoteObj();

```java
try
{
    Client<ICalculator> client = new Client<>("0.0.0.0", "Calc");
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
```
