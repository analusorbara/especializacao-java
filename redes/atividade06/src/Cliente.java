import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Cliente {
    public static void enviarVotosConectarServidor(Map<String, Integer> votos) throws RemoteException, NotBoundException, InterruptedException {
        Registry registry = LocateRegistry.getRegistry();
        UrnaRemota servidor = (UrnaRemota) registry.lookup("MessengerService");

        servidor.enviarVotos(votos);
    }
}
