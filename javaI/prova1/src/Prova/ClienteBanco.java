//Analu
package Prova;

public abstract class ClienteBanco implements Verifica{

    private int numeroConta = 0;
    private String nome ="";
    private Endereco ender = new Endereco();

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) throws NumException {
        if (numeroConta > 0) {
            this.numeroConta = numeroConta;
        } else {
            throw new NumException("ERRO: Não pode haver Número Negativo para conta!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnder() {
        return ender;
    }

    public void setEnder(Endereco ender) {
        this.ender = ender;
    }

    abstract void verifDoc();

    @Override
    public void validar() {

        if(numeroConta%2==0){
            System.out.println("Numero Par");
        }
        else{
            System.out.println("Numero Impar");
        }
    }
}
