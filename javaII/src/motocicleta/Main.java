package motocicleta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Motocicleta> motocicletas = new ArrayList<>();
        int maxCorredores = 10;
        int numeroCorridas = 11;

        Corrida corrida = new Corrida(maxCorredores);

        for (int i = 1; i <= maxCorredores; i++) {
            motocicletas.add(new Motocicleta(i, corrida));
        }

        for (int i = 0; i < numeroCorridas; i++) {
            List<Thread> threads = new ArrayList<>();
            corrida.novaCorrida();
            for (Motocicleta l : motocicletas) {
                Thread t = new Thread(l);
                t.start();
                threads.add(t);
            }
            Thread.sleep(100);
            corrida.iniciarCorrida();
            for (Thread t : threads) {
                t.join();
            }
            Thread.sleep(100);
        }

        corrida.printGanhador();
    }
}
