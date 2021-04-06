//Analu Sorbara
package lista4;

public final class Carga extends Veiculo {

    private int tara;
    private int cargaMax;

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public Carga(int tara, int cargaMax) {
        this.tara = tara;
        this.cargaMax = cargaMax;
    }

    @Override
    int calcVel(int velocMax) {
        return velocMax * 100000;
    }
}
