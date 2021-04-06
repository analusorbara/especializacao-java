//Analu Sorbara
package Prova;

public final class PessoaFisica extends ClienteBanco{

    private int cpf = 0;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    //exception
    @Override
    void verifDoc() {

        if(10<cpf && cpf<20){
            System.out.println("CPF Valido");
        }
        else {
            System.out.println("CPF Invalido");
        }
    }

}
