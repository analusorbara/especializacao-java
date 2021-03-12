import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

public interface UrnaRemota extends Remote {
    void enviarVotos(Map<String, Integer> votos) throws RemoteException;
    String obterResultados() throws RemoteException;
}
