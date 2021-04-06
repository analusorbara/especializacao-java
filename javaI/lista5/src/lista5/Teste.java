//Analu Sorbara
package lista5;
import java.lang.NumberFormatException;


public class Teste {

    private static Passeio passeio = new Passeio();
    private static Carga carga = new Carga();

    private static Passeio vetPasseio[] = new Passeio[5];
    private static Carga vetCarga[] = new Carga[5];

    private static Leitura l = new Leitura();

    public static void main(String arg[]){

        boolean continua = true;
        int opcao=0;

        while(continua){
            System.out.println("\n\t\t\tMenu Inicial");
            System.out.println("\t(1) Cadrastar veiculo Passeio");
            System.out.println("\t(2) Cadrastar veiculo Carga");
            System.out.println("\t(3) Imprimir todos os veiculos Passeio");
            System.out.println("\t(4) Imprimir todos os veiculos Carga");
            System.out.println("\t(5) Imprimir veiculo de Passeio pela placa");
            System.out.println("\t(6) Imprimir veiculo de Carga pela placa");
            System.out.println("\t(7) Sair do sistema");

            try{
                opcao = Integer.parseInt(l.entDados("\n\tEscolha uma opção"));
            }
            catch(NumberFormatException nfe){
                System.out.println("Deve ser um inteiro - press <ENTER>");
                l.entDados("");

                continue;
            }

            switch (opcao){
                case 1:

                    for(int i=achaVagoPasseio(); i<vetPasseio.length; i++){

                        if(i==-1){
                            l.entDados("\nVetor de Passeio esta cheio! - press <ENTER>");
                            break;
                        }

                        passeio = new Passeio();
                        passeio = cadPasseio(passeio);
                        boolean existPlacaPass = false;

                        for(int j = 0; j < vetPasseio.length; j++){
                            if(vetPasseio[j] != null && vetPasseio[j].getPlaca().equalsIgnoreCase(passeio.getPlaca())){
                                existPlacaPass = true;
                                break;
                            }
                        }
                        if(existPlacaPass){
                            System.out.println("\nPlaca já existe! Cadastrar outra!");
                            break;
                        }

                        vetPasseio[i] = passeio;

                        l.entDados("\nPasseio armazenado na posicao "+i+" do vetor - press <Enter");

                        String respPass = l.entDados("\nDeseja cadastrar outro Passeio? <s/n>");

                        if(respPass.equalsIgnoreCase("n")){
                            break;
                        }

                        if(achaVagoPasseio()==-1){
                            l.entDados("\n Vetor de Passeio esta cheio! - press <ENTER>");
                            break;
                        }

                    }
                    break;

                case 2:
                    for(int i = achaVagoCarga(); i< vetCarga.length;i++){

                        if(i==-1){
                            l.entDados("\nVetor de Carga esta cheio! - press <ENTER>");
                            break;
                        }

                        carga = new Carga();
                        carga=cadCarga(carga);
                        boolean existPlacaCarg = false;

                        for(int j = 0; j < vetCarga.length; j++){
                            if(vetCarga[j] != null && vetCarga[j].getPlaca().equalsIgnoreCase(carga.getPlaca())){
                                existPlacaCarg = true;
                                break;
                            }
                        }
                        if(existPlacaCarg){
                            System.out.println("\nPlaca já existe! Cadastrar outra!");
                            break;
                        }

                        vetCarga[i] = carga;

                        l.entDados("\nCarga armazenado na posição "+i+" do vetor - press <ENTER>");

                        String respCarg = l.entDados("\nDeseja cadastrar outro Carga? <s/n>");

                        if(respCarg.equalsIgnoreCase("n")){
                            break;
                        }

                        if(achaVagoCarga()==-1){
                            l.entDados("\nVetor de Carga esta cheio! - press <ENTER>");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nPasseio - Impressao de todos os veiculos");
                    System.out.println("===========================================================");

                    for(int i = 0; i < vetPasseio.length; i++){
                        if(vetPasseio[i] != null){
                            impPasseio(vetPasseio[i],i);
                        }
                        else{
                            l.entDados("\nSem mais Veiculos Passeio para imprimir - press <ENTER>");
                            break;
                        }

                    }

                    System.out.println("========================================================");
                    break;
                case 4:
                    System.out.println("\nCarga - Impressao de todos os veiculos");
                    System.out.println("===========================================================");

                    for(int i = 0; i < vetCarga.length; i++){
                        if(vetCarga[i] != null){
                            impCarga(vetCarga[i],i);
                        }
                        else{
                            l.entDados("\nSem mais Veiculos Carga para imprimir - press <ENTER>");
                            break;
                        }

                    }

                    System.out.println("========================================================");
                    break;
                case 5:
                    System.out.println("\nConsulta pela PLACA - veiculos de Passeio");
                    System.out.println("===========================================================");

                    passeio = new Passeio();

                    boolean existPlacaPass = false;

                    String placaPass = l.entDados("\nInforme a placa ser pesquisada");

                    passeio.setPlaca(placaPass);

                    for(int i = 0; i < vetPasseio.length; i++){
                        if(vetPasseio[i] != null && vetPasseio[i].getPlaca().equalsIgnoreCase(passeio.getPlaca())){
                            impPasseio(vetPasseio[i],i);
                            existPlacaPass = true;
                            break;
                        }
                    }

                    if(!existPlacaPass){
                        l.entDados("\n\n\t\t\t======= Nao existe veiculo de passeio com esta placa - press <ENTER>");

                    }
                    break;
                case 6:
                    System.out.println("\nConsulta pela PLACA - veiculos de Carga");
                    System.out.println("===========================================================");

                    carga = new Carga();

                    boolean existPlacaCarg = false;

                    String placaCarg = l.entDados("\nInforme a placa ser pesquisada");

                    carga.setPlaca(placaCarg);

                    for(int i = 0; i < vetCarga.length; i++){
                        if(vetCarga[i] != null && vetCarga[i].getPlaca().equalsIgnoreCase(carga.getPlaca())){
                            impCarga(vetCarga[i],i);
                            existPlacaCarg = true;
                            break;
                        }
                    }

                    if(!existPlacaCarg){
                        l.entDados("\n\n\t\t\t======= Nao existe veiculo de carga com esta placa - press <ENTER>");

                    }
                    break;
                case 7 :
                    continua = false;
                    break;
                default:
                    l.entDados("O valor de ser >= que 1 e <= que 7 - press <ENTER>");
                    break;
            }//case

        }//while
    }//main

    public static int achaVagoPasseio(){

        for(int i = 0; i<vetPasseio.length; i++){
            if(vetPasseio[i]==null){
                return i;
            }
        }
        return -1;
    }

    public static int achaVagoCarga(){

        for(int i = 0; i<vetCarga.length; i++){
            if(vetCarga[i]==null){
                return i;
            }
        }
        return -1;
    }

    public static Passeio cadPasseio(Passeio passeio){
        System.out.println("\n\n==============================");
        System.out.println("Cadastro de Veiculos de Passeio");
        System.out.println("\n\n==============================");

        passeio.setQtdePassageiros(Integer.parseInt(l.entDados("Qtd de Passageiros.:")));
        passeio.setPlaca(l.entDados("Placa"));
        passeio.setMarca(l.entDados("Marca:"));
        passeio.setModelo(l.entDados("Modelo:"));
        passeio.setCor(l.entDados("Cor:"));
        passeio.setQtdRodas(Integer.parseInt(l.entDados("Qtd de Rodas:")));
        passeio.setVelocMax(Integer.parseInt(l.entDados("Velocidade Maxima:")));
        passeio.getMotor().setQtdPist(Integer.parseInt(l.entDados("Qtd de pistoes:")));
        passeio.getMotor().setPotencia(Integer.parseInt(l.entDados("Potencia do motor:")));

        return passeio;
    }//cadpasseio

    public static void impPasseio(Passeio passeio, int i){

        System.out.println("\nPasseio armazenado no endereco:"+i+"(do vetor veiculo vetPasseio)");
        System.out.println("Qtd de passageiro:"+passeio.getQtdePassageiros());
        System.out.println("Placa:"+passeio.getPlaca());
        System.out.println("Marca:"+passeio.getMarca());
        System.out.println("Modelo:"+passeio.getModelo());
        System.out.println("Cor:"+passeio.getCor());
        System.out.println("Qtd de rodas:"+passeio.getQtdRodas());
        System.out.println("Velocidade Maxima:"+passeio.getVelocMax());
        System.out.println("Qtd Pistoes de motor:"+passeio.getMotor().getQtdPist());
        System.out.println("Potencia do motor:"+passeio.getMotor().getPotencia());
        System.out.println("Qtd total de letras:"+passeio.calcular());
        passeio.calcVel();
    }//impPasseio

    public static Carga cadCarga(Carga carga){
        System.out.println("\n\n==============================");
        System.out.println("Cadastro de Veiculos de Carga");
        System.out.println("\n\n==============================");

        carga.setTara(Integer.parseInt(l.entDados("Tara.:")));
        carga.setCargaMax(Integer.parseInt(l.entDados("Carga Maxima:")));
        carga.setPlaca(l.entDados("Placa:"));
        carga.setMarca(l.entDados("Marca:"));
        carga.setModelo(l.entDados("Modelo:"));
        carga.setCor(l.entDados("Cor:"));
        carga.setQtdRodas(Integer.parseInt(l.entDados("Qtd de Rodas:")));
        carga.setVelocMax(Integer.parseInt(l.entDados("Velocidade Maxima:")));
        carga.getMotor().setQtdPist(Integer.parseInt(l.entDados("Qtd de pistoes:")));
        carga.getMotor().setPotencia(Integer.parseInt(l.entDados("Potencia do motor:")));

        return carga;
    }//cadcarga

    public static void impCarga(Carga carga, int i){

        System.out.println("\nCarga armazenado no endereco:"+i+"(do vetor veiculo vetCarga)");
        System.out.println("Tara:"+carga.getTara());
        System.out.println("Carga Maxima:"+carga.getCargaMax());
        System.out.println("Placa:"+carga.getPlaca());
        System.out.println("Marca:"+carga.getMarca());
        System.out.println("Modelo:"+carga.getModelo());
        System.out.println("Cor:"+carga.getCor());
        System.out.println("Qtd de rodas:"+carga.getQtdRodas());
        System.out.println("Velocidade Maxima:"+carga.getVelocMax());
        System.out.println("Qtd Pistoes de motor:"+carga.getMotor().getQtdPist());
        System.out.println("Potencia do motor:"+carga.getMotor().getPotencia());
        System.out.println("Qtd total de letras:"+carga.calcular());
        carga.calcVel();

    }//impPasseio

}//classe teste
