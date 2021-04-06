//Analu Sorbara
package lista7;

public class BDVeiculos {

    private Passeio vetPasseio[] = new Passeio[5];
    private Carga vetCarga[] = new Carga[5];

    public Passeio[] getVetPasseio() {
        return vetPasseio;
    }


    public Carga[] getVetCarga() {
        return vetCarga;
    }

    public int achaVagoPasseio(){

        for(int i = 0; i<vetPasseio.length; i++){
            if(vetPasseio[i]==null){
                return i;
            }
        }
        return -1;
    }


    public int achaVagoCarga(){

        for(int i = 0; i<vetCarga.length; i++){
            if(vetCarga[i]==null){
                return i;
            }
        }
        return -1;
    }

    public void cadastrarPasseio(Passeio passeio, int i) throws VeicExistException {

        boolean existPlacaPass = false;

            for(int j = 0; j <vetPasseio.length; j++){
                if(vetPasseio[j] != null && vetPasseio[j].getPlaca().equalsIgnoreCase(passeio.getPlaca())){
                    existPlacaPass = true;
                    break;
                }
            }//for
            if(existPlacaPass){
                throw new VeicExistException("Já existe um veículo com esta placa");
            }//if

            vetPasseio[i] = passeio;


    }//cadastrarPasseio

    public void cadastrarCarga(Carga carga,int i) throws VeicExistException {

            boolean existPlacaCarg = false;

            for(int j = 0; j < vetCarga.length; j++){
                if(vetCarga[j] != null && vetCarga[j].getPlaca().equalsIgnoreCase(carga.getPlaca())){
                    existPlacaCarg = true;
                    break;
                }
            }
            if(existPlacaCarg){
                throw new VeicExistException("Ja existe um veiculo com esta placa");
            }

            vetCarga[i] = carga;

    }
}
