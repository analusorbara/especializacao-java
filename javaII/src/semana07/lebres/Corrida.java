package semana07.lebres;

import java.util.HashMap;
import java.util.Map;

class Corrida {
    Map<String, Integer> corrida = new HashMap<>();
    String ganhou = null;

    synchronized void salta(String lebre, int salto) {
        Integer distanciaPercorrida = corrida.get(lebre);

        if (distanciaPercorrida == null) {
            distanciaPercorrida = 0;
        }

        if (distanciaPercorrida < 20 && ganhou == null) {
            distanciaPercorrida += salto;
            corrida.put(lebre, distanciaPercorrida);
            System.out.println("A lebre: " + lebre + " Pulou: " + salto + " Total: " + distanciaPercorrida);
        } else if (ganhou == null) {
            ganhou = lebre;
        }
    }

    public String getGanhou() {
        return ganhou;
    }
}
