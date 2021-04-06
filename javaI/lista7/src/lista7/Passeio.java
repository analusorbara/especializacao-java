//Analu Sorbara
package lista7;

public class Passeio extends Veiculo implements Calc{

    private int qtdePassageiros;

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    public Passeio() {
        this.qtdePassageiros = 0;
    }

    //=================================================

    public void calcVel(){
        int x = (getVelocMax()*1000);
        System.out.println("\nVelocidade - Passeio:"+x+"M/H");
    }

    //=================================================

    public int calcular(){

        int somaLetras=0;

        somaLetras+=getPlaca().length();
        somaLetras+=getMarca().length();
        somaLetras+=getModelo().length();
        somaLetras+=getCor().length();

        return somaLetras;
    }

}
