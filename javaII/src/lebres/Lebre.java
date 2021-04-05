package lebres;

import java.util.Random;

class Lebre extends Thread {
    private final String nome;
    private final Corrida t;

    Lebre(String nome, Corrida t) {
        this.t=t;
        this.nome = nome;
    }

    public void fazUmSalto() {
        t.salta(nome, salto());
    }

    private int salto() {
        int minimum = 1;
        int maximum = 3;

        Random r = new Random();
        int range = maximum - minimum + 1;
        return r.nextInt(range) + minimum;
    }
}