//Analu Sorbara
package lista9;

public final class Passeio extends Veiculo implements Calc{

    private int qtdePassageiros;

    public final int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public final void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    public Passeio() {
        this.qtdePassageiros = 0;
    }

    //=================================================

    public final void calcVel(){
        int x = (getVelocMax()*1000);
        System.out.println("\nVelocidade - Passeio:"+x+"M/H");
    }

    //=================================================

    public final int calcular(){

        int somaLetras=0;

        somaLetras+=getPlaca().length();
        somaLetras+=getMarca().length();
        somaLetras+=getModelo().length();
        somaLetras+=getCor().length();

        return somaLetras;
    }

}
