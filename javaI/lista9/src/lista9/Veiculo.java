//Analu Sorbara
package lista9;


public abstract class Veiculo {
    
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int qtdRodas;
    private int velocMax;
    private Motor motor;

    public Veiculo() {
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        this.qtdRodas = 0;
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

    public final String getCor() {
        return cor;
    }

    public final void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public final int getVelocMax() {

        return velocMax;
    }

    public final void setVelocMax(int velocMax) throws VelocException {

        if(velocMax<80 || velocMax>110){
            throw new VelocException("Velocidade maxima esta fora dos limites brasileiros");
        }

        this.velocMax = velocMax;

    }

    public final Motor getMotor() {

        return motor;
    }

    public final void setMotor(Motor motor) {

        this.motor = motor;
    }

    abstract void calcVel();
        
}
