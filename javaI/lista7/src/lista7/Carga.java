//Analu Sorbara
package lista7;

public class Carga extends Veiculo implements Calc{

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

    public Carga() {
        this.tara = 0;
        this.cargaMax = 0;
    }

    //==================================================

    public void calcVel(){
        int x = (getVelocMax()*10000);
        System.out.println("\nVelocidade - Carga:"+x+"CM/H");
    }

    //=================================================

    public int calcular(){

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
