import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

public class Client1 {
    public static void main(String[] args) throws InterruptedException, RemoteException, NotBoundException {
        Cliente.enviarVotosConectarServidor(votos());
    }

    static private Map<String, Integer> votos() {
        return new HashMap<>(){{
            put("ze do posto", 5);
            put("tiao da jo", 2);
            put("cida camionheira", 6);
        }};
    }
}
