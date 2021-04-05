import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

public class UrnaRemotaImpl implements UrnaRemota {
    private final Map<String, Integer> totalVotos = new HashMap<>();

    @Override
    public void enviarVotos(Map<String, Integer> votosRemoto) throws RemoteException {
        for(String candidatoRemoto: votosRemoto.keySet()){
            Integer votosLocal = totalVotos.get(candidatoRemoto);

            if (votosLocal == null) {
                votosLocal = 0;
            }

            votosLocal += votosRemoto.get(candidatoRemoto);
            totalVotos.put(candidatoRemoto, votosLocal);
        }
    }

    @Override
    public String obterResultados() {
        StringBuilder resultado = new StringBuilder();
        String ganhador = "";
        int totalVotosGanhador = 0;

        for(String c: totalVotos.keySet()) {
            int totalVotosLocal = totalVotos.get(c);
            resultado.append("candidato: ").append(c).append(" votos: ").append(totalVotosLocal).append("\n");
            if (totalVotosLocal > totalVotosGanhador) {
                ganhador = c;
                totalVotosGanhador = totalVotosLocal;
            }
        }
        resultado.append("\nganhador: ").append(ganhador).append(" votos: ").append(totalVotosGanhador).append("\n");

        return resultado.toString();
    }
}
