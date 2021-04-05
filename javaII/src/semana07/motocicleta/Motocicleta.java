package semana07.motocicleta;

class Motocicleta implements Runnable {
    private final int nome;
    private final Corrida corrida;

    Motocicleta(Integer nome, Corrida corrida) {
        this.corrida = corrida;
        this.nome = nome;
    }

    @Override
    public void run() {
        corrida.aguardarNaLargada();

        corrida.linhaDeChegada(nome);
    }
}