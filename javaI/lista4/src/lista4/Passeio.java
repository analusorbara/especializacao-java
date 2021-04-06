//Analu Sorbara
package lista4;

public final class Passeio extends Veiculo{

    private int qtdePassageiros;

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    public Passeio(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    @Override
    int calcVel(int velocMax) {
        return velocMax * 1000;
    }
}
