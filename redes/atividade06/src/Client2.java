import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

public class Client2 {
    public static void main(String[] args) throws InterruptedException, RemoteException, NotBoundException {
        Cliente.enviarVotosConectarServidor(votos());
    }

    static private Map<String, Integer> votos() {
        return new HashMap<>(){{
            put("ze do posto", 1);
            put("tiao da jo", 7);
            put("cida camionheira", 2);
        }};
    }
}
