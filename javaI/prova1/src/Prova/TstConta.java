//Analu Sorbara
package Prova;
//exception

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TstConta {

    public static void main(String[] args) {

          PessoaJuridica pessoaj= new PessoaJuridica();

        //entrada
             try {
                  pessoaj.setNumeroConta(10);
              } catch (NumException e) {
                  e.impMsg();
              }

              pessoaj.setCnpj(15);
              pessoaj.getEnder().setRua("24 de maio");
              pessoaj.getEnder().setNum(379);
              pessoaj.getResponsavel().setCpf(12);
              pessoaj.setNome("Analu");

              //saida
              System.out.println("");
              System.out.println("Pessoa Juridica:");
              System.out.println("Numero da conta:"+pessoaj.getNumeroConta());
              pessoaj.validar();
              System.out.println("CNPJ:"+pessoaj.getCnpj());
              System.out.println("Rua:"+pessoaj.getEnder().getRua()+" Numero:"+pessoaj.getEnder().getNum());
              System.out.println("");
              System.out.println("Pessoa Fisica:");
              System.out.println("CPF:"+pessoaj.getResponsavel().getCpf());
              pessoaj.getResponsavel().verifDoc();
              System.out.println("Nome do responsavel:"+pessoaj.getNome());
              pessoaj.verifDoc();


    }
}
