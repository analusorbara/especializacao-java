import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.concurrent.TimeUnit;

public class Servidor {
    public static void main(String[] args) throws RemoteException, InterruptedException {
        UrnaRemota server = new UrnaRemotaImpl();
        UrnaRemota stub = (UrnaRemota) UnicastRemoteObject.exportObject(server, 0);

        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("MessengerService", stub);

        while (true) {
            TimeUnit.SECONDS.sleep(5);
            System.out.println(stub.obterResultados());
        }
    }
}
