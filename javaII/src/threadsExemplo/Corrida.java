package threadsExemplo;

import java.util.HashMap;
import java.util.Map;

class Corrida {
    Map<String, Integer> corrida = new HashMap<>();

    synchronized void salta(String lebre, int salto) {
        Integer distanciaPercorrida = corrida.get(lebre);

        if (distanciaPercorrida == null) {
            distanciaPercorrida = 0;
        }

        if (distanciaPercorrida < 20) {
            distanciaPercorrida += salto;
            corrida.put(lebre, distanciaPercorrida);
            System.out.println("A lebre: " + lebre + " Pulou: " + salto);
        } else {

        }
    }
}
