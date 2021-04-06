//Analu Sorbara
package lista8;

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

    public void excluiPasseio(int i){

        vetPasseio.remove(i);

    }

    public void excluiCarga(int i){

        vetCarga.remove(i);

    }
}
