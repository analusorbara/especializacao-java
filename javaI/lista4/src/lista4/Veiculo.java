//Analu Sorbara
package lista4;


public abstract class Veiculo {
    
    private String placa;
    private String marca;
    private String modelo;
    private int velocMax;
    private Motor motor;

    public Veiculo() {
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.velocMax = 0;
        this.motor = new Motor();
    }

    public final String getPlaca() {

        return placa;
    }

    public final void setPlaca(String placa) {

        this.placa = placa;
    }

    public final String getMarca() {

        return marca;
    }

    public final void setMarca(String marca) {

        this.marca = marca;
    }

    public final String getModelo() {

        return modelo;
    }

    public final void setModelo(String modelo) {

        this.modelo = modelo;
    }

    public final int getVelocMax() {

        return velocMax;
    }

    public final void setVelocMax(int velocMax) {

        this.velocMax = velocMax;
    }

    public final Motor getMotor() {

        return motor;
    }

    public final void setMotor(Motor motor) {

        this.motor = motor;
    }

    abstract int calcVel(int velocMax);
        
}
