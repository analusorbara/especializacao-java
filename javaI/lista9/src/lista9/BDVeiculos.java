//Analu Sorbara
package lista9;

import java.util.ArrayList;
import java.util.List;

public class BDVeiculos {

    private List<Passeio> vetPasseio = new ArrayList<Passeio>();
    private List<Carga> vetCarga = new ArrayList<Carga>();

    public List<Passeio> getVetPasseio() {
        return vetPasseio;
    }


    public List<Carga> getVetCarga() {
        return vetCarga;
    }

    public void cadastrarPasseio(Passeio passeio) throws VeicExistException {

        boolean existPlacaPass = false;

            for(int j = 0; j <vetPasseio.size(); j++){
                if(vetPasseio.get(j) != null && vetPasseio.get(j).getPlaca().equalsIgnoreCase(passeio.getPlaca())){
                    existPlacaPass = true;
                    break;
                }
            }//for
            if(existPlacaPass){
                throw new VeicExistException("Já existe um veiculo com esta placa");
            }//if

            vetPasseio.add(passeio);


    }//cadastrarPasseio

    public void cadastrarCarga(Carga carga) throws VeicExistException {

            boolean existPlacaCarg = false;

            for(int j = 0; j < vetCarga.size(); j++){
                if(vetCarga.get(j) != null && vetCarga.get(j).getPlaca().equalsIgnoreCase(carga.getPlaca())){
                    existPlacaCarg = true;
                    break;
                }
            }
            if(existPlacaCarg){
                throw new VeicExistException("Ja existe um veiculo com esta placa");
            }

            vetCarga.add(carga);

    }

    public Passeio excluiPasseio(String placa) throws NaoEncontradoException {
        for(Passeio p : vetPasseio) {
            if(p != null && p.getPlaca().equalsIgnoreCase(placa)) {
                vetPasseio.remove(p);
                return p;
            }
        }

        throw new NaoEncontradoException("Passeio não encontrado.");
    }

    public Carga excluiCarga(String placa) throws NaoEncontradoException {
        for(Carga p : vetCarga) {
            if(p != null && p.getPlaca().equalsIgnoreCase(placa)) {
                vetCarga.remove(p);
                return p;
            }
        }

        throw new NaoEncontradoException("Carga não encontrada.");
    }

    public Passeio consultaPasseio(String placa) throws NaoEncontradoException {
        for(Passeio p : vetPasseio) {
            if(p != null && p.getPlaca().equalsIgnoreCase(placa)) {
                return p;
            }
        }

        throw new NaoEncontradoException("Passeio não encontrado.");
    }

    public Carga consultaCarga(String placa) throws NaoEncontradoException {
        for(Carga p : vetCarga) {
            if(p != null && p.getPlaca().equalsIgnoreCase(placa)) {
                return p;
            }
        }

        throw new NaoEncontradoException("Carga não encontrada.");
    }

    public void limparPasseio() {
        vetPasseio.clear();
    }

    public void limparCarga() {
        vetCarga.clear();
    }
}
