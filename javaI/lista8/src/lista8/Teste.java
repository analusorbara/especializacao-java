//Analu Sorbara
package lista8;
import java.lang.NumberFormatException;


public class Teste {

    private static Passeio passeio = new Passeio();
    private static Carga carga = new Carga();

   private static BDVeiculos bd = new BDVeiculos();

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
            System.out.println("\t(7) Excluir veiculo de Passeio pela placa");
            System.out.println("\t(8) Excluir veiculo de Carga pela placa");
            System.out.println("\t(9) Sair do sistema");

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
                    String respPass;

                do {
                    passeio = new Passeio();
                    passeio = cadPasseio(passeio);

                    try {
                        bd.cadastrarPasseio(passeio);
                    } catch (VeicExistException e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                    l.entDados("\nPasseio armazenado na posicao " + bd.getVetPasseio().size() + " do vetor - press <Enter");

                    respPass = l.entDados("\nDeseja cadastrar outro Passeio? <s/n>");


                }while(respPass.equalsIgnoreCase("s"));

                    break;

                case 2:
                    String respCarg;

                    do {
                        carga = new Carga();
                        carga = cadCarga(carga);

                        try {
                            bd.cadastrarCarga(carga);
                        } catch (VeicExistException e) {
                            System.out.println(e.getMessage());
                            break;
                        }
                        l.entDados("\nCarga armazenado na posição " + bd.getVetCarga().size() + " do vetor - press <ENTER>");

                        respCarg = l.entDados("\nDeseja cadastrar outro Carga? <s/n>");

                    }while(respCarg.equalsIgnoreCase("s"));


                    break;
                case 3:
                    System.out.println("\nPasseio - Impressao de todos os veiculos");
                    System.out.println("===========================================================");

                    for(int i = 0; i < bd.getVetPasseio().size(); i++){
                        if(bd.getVetPasseio().get(i) != null){
                            impPasseio(bd.getVetPasseio().get(i),i);
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

                    for(int i = 0; i < bd.getVetCarga().size(); i++){
                        if(bd.getVetCarga().get(i) != null){
                            impCarga(bd.getVetCarga().get(i),i);
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

                    for(int i = 0; i < bd.getVetPasseio().size(); i++){
                        if(bd.getVetPasseio().get(i) != null && bd.getVetPasseio().get(i).getPlaca().equalsIgnoreCase(passeio.getPlaca())){
                            impPasseio(bd.getVetPasseio().get(i),i);
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

                    for(int i = 0; i < bd.getVetCarga().size(); i++){
                        if(bd.getVetCarga().get(i) != null && bd.getVetCarga().get(i).getPlaca().equalsIgnoreCase(carga.getPlaca())){
                            impCarga(bd.getVetCarga().get(i),i);
                            existPlacaCarg = true;
                            break;
                        }
                    }

                    if(!existPlacaCarg){
                        l.entDados("\n\n\t\t\t======= Nao existe veiculo de carga com esta placa - press <ENTER>");

                    }
                    break;
                case 7:
                    System.out.println("\nExclusão pela PLACA - veiculos de Passeio");
                    System.out.println("===========================================================");

                    passeio = new Passeio();

                    boolean existPass = false;

                    String placaPasseio = l.entDados("\nInforme a placa ser excluida");

                    passeio.setPlaca(placaPasseio);

                    for(int i = 0; i < bd.getVetPasseio().size(); i++){
                        if(bd.getVetPasseio().get(i) != null && bd.getVetPasseio().get(i).getPlaca().equalsIgnoreCase(passeio.getPlaca())){
                            bd.excluiPasseio(i);
                            System.out.println("\nExclusao pela PLACA com sucesso - veiculos de Passeio");
                            existPass = true;
                            break;
                        }
                    }

                    if(!existPass){
                        l.entDados("\n\n\t\t\t======= Nao existe veiculo de passeio com esta placa - press <ENTER>");

                    }
                    break;
                case 8:
                    System.out.println("\nConsulta pela PLACA - veiculos de Carga");
                    System.out.println("===========================================================");

                    carga = new Carga();

                    boolean existCarg = false;

                    String placaCarga = l.entDados("\nInforme a placa ser excluida");

                    carga.setPlaca(placaCarga);

                    for(int i = 0; i < bd.getVetCarga().size(); i++){
                        if(bd.getVetCarga().get(i) != null && bd.getVetCarga().get(i).getPlaca().equalsIgnoreCase(carga.getPlaca())){
                            bd.excluiCarga(i);
                            System.out.println("\nExclusao pela PLACA com sucesso - veiculos de Carga");
                            existCarg = true;
                            break;
                        }
                    }

                    if(!existCarg){
                        l.entDados("\n\n\t\t\t======= Nao existe veiculo de carga com esta placa - press <ENTER>");

                    }
                    break;
                case 9 :
                    continua = false;
                    break;
                default:
                    l.entDados("O valor de ser >= que 1 e <= que 7 - press <ENTER>");
                    break;
            }//case

        }//while
    }//main



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
        try {
            passeio.setVelocMax(Integer.parseInt(l.entDados("Velocidade Maxima:")));
        } catch (VelocException e) {
            System.out.println(e.getMessage());
            try {
                passeio.setVelocMax(100);
            } catch (VelocException velocException) {

            }
        }
        passeio.getMotor().setQtdPist(Integer.parseInt(l.entDados("Qtd de pistoes:")));
        passeio.getMotor().setPotencia(Integer.parseInt(l.entDados("Potencia do motor:")));

        return passeio;
    }//cadpasseio

    public static void impPasseio(Passeio passeio, int i){

        System.out.println("\nPasseio armazenado no endereco:"+i+"(do vetor veiculo bd.getVetPasseio())");
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
        try {
            carga.setVelocMax(Integer.parseInt(l.entDados("Velocidade Maxima:")));
        } catch (VelocException e) {
            System.out.println(e.getMessage());
            try {
                carga.setVelocMax(90);
            } catch (VelocException velocException) {

            }
        }
        carga.getMotor().setQtdPist(Integer.parseInt(l.entDados("Qtd de pistoes:")));
        carga.getMotor().setPotencia(Integer.parseInt(l.entDados("Potencia do motor:")));

        return carga;
    }//cadcarga

    public static void impCarga(Carga carga, int i){

        System.out.println("\nCarga armazenado no endereco:"+i+"(do vetor veiculo bd.getVetCarga())");
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
