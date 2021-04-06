//Analu Sorbara
package lista2;
// @author analu

public class Teste {

    public static Veiculo criaVeiculo(String placa,String marca, String modelo, float velocMax) {
        
        Veiculo v = new Veiculo();

        v.setPlaca(placa);
        v.setMarca(marca);
        v.setModelo(modelo);
        v.setVelocMax(velocMax);
        
        v.getMotor().setQtdPist(4);
        v.getMotor().setPotencia(100);
        
        System.out.println("\n Placa do Veiculo ......: " + v.getPlaca());
        System.out.println("\n Marca do Veiculo ......: " + v.getMarca());
        System.out.println("\n Modelo do Veiculo ......: " + v.getModelo());
        System.out.println("\n Velocidade maxima do Veiculo ......: " + v.getVelocMax());


        System.out.println("\n Quantidade de Pistão do motor .......: " + v.getMotor().getQtdPist());
        System.out.println("\n Potencia do motor ..: " + v.getMotor().getPotencia());
        
        return v;
    }

    public static void main(String arg[]) {

       criaVeiculo("LSN4I49","Fiat", "Argo", 200);
       criaVeiculo("SOR3R52","Fiat", "Uno", 180);
       criaVeiculo("ADR8G45","Chevrolet", "Onix", 200);
       criaVeiculo("TYU9A95","Chevrolet", "Spin", 200);
       criaVeiculo("WQD1R36","Fiat", "Doblo", 220);
       criaVeiculo("IOP3T12","Fiat", "Mobi", 220);
       criaVeiculo("RFT5R67","Fiat", "Grand Siena", 220);
       criaVeiculo("WTR1W33","Renault", "Kwid", 150);
       criaVeiculo("TYU1R23","Renault", "Zoe", 220);
       criaVeiculo("FTR6S57","Renault", "Duster", 220);

    }
}
