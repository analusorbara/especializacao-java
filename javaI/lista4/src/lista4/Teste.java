//Analu Sorbara
package lista4;


public class Teste {

    public static Passeio criaPasseio(String placa,String marca, String modelo, int velocMax) {
        
        Passeio p = new Passeio(4);

        p.setPlaca(placa);
        p.setMarca(marca);
        p.setModelo(modelo);
        p.setVelocMax(velocMax);
        
        p.getMotor().setQtdPist(4);
        p.getMotor().setPotencia(100);
        
        System.out.println("\n Placa do Veiculo ......: " + p.getPlaca());
        System.out.println("\n Marca do Veiculo ......: " + p.getMarca());
        System.out.println("\n Modelo do Veiculo ......: " + p.getModelo());
        System.out.println("\n Velocidade maxima do Veiculo ......: " + p.getVelocMax());


        System.out.println("\n Quantidade de Pistão do motor .......: " + p.getMotor().getQtdPist());
        System.out.println("\n Potencia do motor ..: " + p.getMotor().getPotencia());
        System.out.println("\n Velocidade do carro m/h ..: " + p.calcVel(velocMax));

        return p;
    }

    public static Carga criaCarga(String placa,String marca, String modelo, int velocMax) {

        Carga c = new Carga(20000000, 3000000);

        c.setPlaca(placa);
        c.setMarca(marca);
        c.setModelo(modelo);
        c.setVelocMax(velocMax);

        c.getMotor().setQtdPist(4);
        c.getMotor().setPotencia(100);

        System.out.println("\n Placa do Veiculo ......: " + c.getPlaca());
        System.out.println("\n Marca do Veiculo ......: " + c.getMarca());
        System.out.println("\n Modelo do Veiculo ......: " + c.getModelo());
        System.out.println("\n Velocidade maxima do Veiculo ......: " + c.getVelocMax());


        System.out.println("\n Quantidade de Pistão do motor .......: " + c.getMotor().getQtdPist());
        System.out.println("\n Potencia do motor ..: " + c.getMotor().getPotencia());
        System.out.println("\n Velocidade do caminhão m/h ..: " + c.calcVel(velocMax));

        return c;
    }

    public static void main(String arg[]) {

     for (Integer i=0; i<10; i++)
       {
           criaPasseio("LSN4I49","Fiat", "Argo" +i.toString() , 150);
           criaCarga("WTR1W33","Mercedes" +i.toString(), "Atego", 200);
       }

    }
}
