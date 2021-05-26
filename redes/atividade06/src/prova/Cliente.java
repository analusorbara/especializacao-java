package prova;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Map;

public class Cliente {

    public static void chamarCalculadora() throws RemoteException, NotBoundException, InterruptedException {
        Registry registry = LocateRegistry.getRegistry();
        Calculadora servidor = (Calculadora) registry.lookup("MessengerService");

        System.out.println(servidor.add(10,10));
        System.out.println(servidor.sub(10,10));
        System.out.println(servidor.mul(10,10));
        System.out.println(servidor.div(10,10));
    }
}
