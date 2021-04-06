//Analu Sorbara
package Prova;

public final class PessoaJuridica extends ClienteBanco{

    private int cnpj=0;
    private PessoaFisica responsavel = new PessoaFisica();

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaFisica getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(PessoaFisica responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    void verifDoc() {
        if(getNome().length()<=30){
            System.out.println("Nome válido para Responsável");
        }
        else {
            System.out.println("Nome inválido para Responsável");
        }
    }


}
