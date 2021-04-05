package motocicleta;

import java.util.*;
import java.util.concurrent.CountDownLatch;

class Corrida {
    CountDownLatch latch;
    List<Integer> ordemDeChegada = new ArrayList<>();
    HashMap<Integer, Integer> pontos = new HashMap<>();
    int maxCorredores;

    public Corrida(int maxCorredores) {
        this.maxCorredores = maxCorredores;
        latch = new CountDownLatch(1);
    }

    public void aguardarNaLargada() {
        try
        {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void iniciarCorrida() {
        latch.countDown();
    }

    public void novaCorrida() {
        ordemDeChegada = new ArrayList<>();
        latch = new CountDownLatch(1);
    }

    public synchronized void linhaDeChegada(Integer nome) {
        Integer pontucao = pontos.get(nome);

        if (pontucao == null) {
            pontucao = 0;
        }
        pontucao += ponto(nome);
        pontos.put(nome, pontucao);
    }

    private synchronized Integer ponto(Integer nome) {
        if (!ordemDeChegada.contains(nome)) {
            ordemDeChegada.add(nome);
        }

        return maxCorredores - ordemDeChegada.indexOf(nome);
    }

    public void printGanhador() {
        Integer ganhador = Collections.max(pontos.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
        Integer totalPontos = pontos.get(ganhador);

        System.out.println("Ganhador: " + ganhador.toString() + " Pontos: " + totalPontos);
    }
}
