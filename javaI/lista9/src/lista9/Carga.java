//Analu Sorbara
package lista9;

public final class Carga extends Veiculo implements Calc{

    private int tara;
    private int cargaMax;

    public final int getTara() {
        return tara;
    }

    public final void setTara(int tara) {
        this.tara = tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public final void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public Carga() {
        this.tara = 0;
        this.cargaMax = 0;
    }

    //==================================================

    public final void calcVel(){
        int x = (getVelocMax()*10000);
        System.out.println("\nVelocidade - Carga:"+x+"CM/H");
    }

    //=================================================

    public final int calcular(){

        int somaNum=0;

        somaNum+=getMotor().getQtdPist();
        somaNum+=getMotor().getPotencia();
        somaNum+=getQtdRodas();
        somaNum+=getVelocMax();
        somaNum+=getTara();
        somaNum+=getCargaMax();

        return somaNum;
    }

}
