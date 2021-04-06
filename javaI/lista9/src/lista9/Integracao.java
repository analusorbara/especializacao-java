//Analu Sorbara
package lista9;

public class Integracao {

    private final Interface inter;
    private final BDVeiculos bd;

    public Integracao(Interface inter) {

        this.inter = inter;
        this.inter.gestaoDeVeiculos();

        bd = new BDVeiculos();
    }

    public void clickAbrirPasseio(){

        inter.veiculoDePasseio();
    }

    public void clickAbrirCarga(){

        inter.veiculoDeCarga();
    }

    public void clickCadastraPasseio(){

        inter.cadastroDePasseio();
    }

    public void clickConsultaExcluiPasseio(){

        inter.consultaExcluiPasseio();
    }

    public void clickImprimePasseio(){

        inter.imprimiExcluiPasseio();
    }

    public void clickCadastraCarga(){

        inter.cadastroDeCarga();
    }

    public void clickConsultaExcluiCarga(){

        inter.consultaExcluiCarga();
    }

    public void clickImprimeCarga(){

        inter.imprimiExcluiCarga();
    }

    public void cadastrarPasseio(String qtdPassageiro, String placa, String marca, String modelo, String cor,
                                 String qtdRodas, String velocMax, String qtdPistoes, String potencia){
        Passeio passeio = new Passeio();
        passeio.setQtdePassageiros(Integer.parseInt(qtdPassageiro));
        passeio.setPlaca(placa);
        passeio.setMarca(marca);
        passeio.setModelo(modelo);
        passeio.setCor(cor);
        passeio.setQtdRodas(Integer.parseInt(qtdRodas));

        // dialog do interface
        try {
            passeio.setVelocMax(Integer.parseInt(velocMax));
        } catch (VelocException e) {
            inter.mostrarErro(e.getMessage());
            try {
                passeio.setVelocMax(100);
            } catch (VelocException velocException) {
                velocException.printStackTrace();
            }
        }

        passeio.getMotor().setQtdPist(Integer.parseInt(qtdPistoes));
        passeio.getMotor().setPotencia(Integer.parseInt(potencia));

        try {
            bd.cadastrarPasseio(passeio);
        } catch (VeicExistException e) {
            inter.mostrarErro(e.getMessage());
        }
    }

    public void cadastrarCarga(String tara, String cargaMax, String placa, String marca, String modelo, String cor,
                               String qtdRodas, String velocMax, String qtdPistoes, String potencia){
        Carga carga = new Carga();
        carga.setTara(Integer.parseInt(tara));
        carga.setCargaMax(Integer.parseInt(cargaMax));
        carga.setPlaca(placa);
        carga.setMarca(marca);
        carga.setModelo(modelo);
        carga.setCor(cor);
        carga.setQtdRodas(Integer.parseInt(qtdRodas));


        try {
            carga.setVelocMax(Integer.parseInt(velocMax));
        } catch (VelocException e) {
            inter.mostrarErro(e.getMessage());
            try {
                carga.setVelocMax(90);
            } catch (VelocException velocException) {
                velocException.printStackTrace();
            }
        }

        carga.getMotor().setQtdPist(Integer.parseInt(qtdPistoes));
        carga.getMotor().setPotencia(Integer.parseInt(potencia));

        try {
            bd.cadastrarCarga(carga);
        } catch (VeicExistException e) {
            inter.mostrarErro(e.getMessage());
        }
    }

    public void consultaPasseio(String placa){
        try {
            Passeio passeio = bd.consultaPasseio(placa);
            inter.setDadoPasseio(Integer.toString(passeio.getQtdePassageiros()), passeio.getMarca(),
                    passeio.getModelo(), passeio.getCor(), Integer.toString(passeio.getQtdRodas()),
                    Integer.toString(passeio.getVelocMax()), Integer.toString(passeio.getMotor().getQtdPist()),
                    Integer.toString(passeio.getMotor().getPotencia()));
        } catch (NaoEncontradoException e) {
            inter.mostrarErro(e.getMessage());
        }
    }

    public void excluiPasseio(String placa){
        try {
            Passeio passeio = bd.excluiPasseio(placa);
            inter.setDadoPasseio(Integer.toString(passeio.getQtdePassageiros()), passeio.getMarca(),
                    passeio.getModelo(), passeio.getCor(), Integer.toString(passeio.getQtdRodas()),
                    Integer.toString(passeio.getVelocMax()), Integer.toString(passeio.getMotor().getQtdPist()),
                    Integer.toString(passeio.getMotor().getPotencia()));
        } catch (NaoEncontradoException e) {
            inter.mostrarErro(e.getMessage());
        }
    }

    public void consultaCarga(String placa){
        try {
            Carga carga = bd.consultaCarga(placa);
            inter.setDadoCarga(Integer.toString(carga.getTara()), Integer.toString(carga.getCargaMax()),
                    carga.getMarca(), carga.getModelo(), carga.getCor(), Integer.toString(carga.getQtdRodas()),
                    Integer.toString(carga.getVelocMax()), Integer.toString(carga.getMotor().getQtdPist()),
                    Integer.toString(carga.getMotor().getPotencia()));
        } catch (NaoEncontradoException e) {
            inter.mostrarErro(e.getMessage());
        }
    }

    public void excluiCarga(String placa){
        try {
            Carga carga = bd.excluiCarga(placa);
            inter.setDadoCarga(Integer.toString(carga.getTara()), Integer.toString(carga.getCargaMax()),
                    carga.getMarca(), carga.getModelo(), carga.getCor(), Integer.toString(carga.getQtdRodas()),
                    Integer.toString(carga.getVelocMax()), Integer.toString(carga.getMotor().getQtdPist()),
                    Integer.toString(carga.getMotor().getPotencia()));
        } catch (NaoEncontradoException e) {
            inter.mostrarErro(e.getMessage());
        }
    }

    public void imprimirTodosPasseio(){
        String [][] data = new String[bd.getVetPasseio().size()][9];

        for(int i=0; i<data.length; i++){
            Passeio p = bd.getVetPasseio().get(i);
            data[i][0] = p.getPlaca();
            data[i][1] = p.getMarca();
            data[i][2] = p.getModelo();
            data[i][3] = p.getCor();
            data[i][4] = Integer.toString(p.getQtdRodas());
            data[i][5] = Integer.toString(p.getVelocMax());
            data[i][6] = Integer.toString(p.getMotor().getQtdPist());
            data[i][7] = Integer.toString(p.getMotor().getPotencia());
            data[i][8] = Integer.toString(p.getQtdePassageiros());
        }

        inter.setTabelaPasseio(data);
    }

    public void excluirTodosPasseio(){
        bd.limparPasseio();
        imprimirTodosPasseio();
    }

    public void imprimirTodosCarga(){
        String [][] data = new String[bd.getVetCarga().size()][10];

        for(int i=0; i<data.length; i++){
            Carga p = bd.getVetCarga().get(i);
            data[i][0] = p.getPlaca();
            data[i][1] = p.getMarca();
            data[i][2] = p.getModelo();
            data[i][3] = p.getCor();
            data[i][4] = Integer.toString(p.getQtdRodas());
            data[i][5] = Integer.toString(p.getVelocMax());
            data[i][6] = Integer.toString(p.getMotor().getQtdPist());
            data[i][7] = Integer.toString(p.getMotor().getPotencia());
            data[i][8] = Integer.toString(p.getTara());
            data[i][9] = Integer.toString(p.getCargaMax());
        }

        inter.setTabelaCarda(data);

    }

    public void excluirTodosCarga(){
        bd.limparCarga();
        imprimirTodosCarga();
    }
}
