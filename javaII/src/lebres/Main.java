package lebres;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Corrida corrida = new Corrida();

        List<Lebre> lebres = new ArrayList<>() {{ // Double-Brace Initialization Java 9
            add(new Lebre("Tan", corrida));
            add(new Lebre("Ian", corrida));
            add(new Lebre("Uan", corrida));
            add(new Lebre("Xan", corrida));
            add(new Lebre("Zan", corrida));
        }};

        while (corrida.getGanhou() == null) {
            for (Lebre l : lebres) {
                l.fazUmSalto();
            }
        }

        System.out.println("Ganhou: " + corrida.getGanhou());

        try {
            Thread.sleep(400);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
