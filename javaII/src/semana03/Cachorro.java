package semana03;

import java.io.Serializable;

public class Cachorro implements Serializable {
    private int idade;
    private double peso;
    private String nome;

    public Cachorro(int idade, double peso, String nome) {
        this.idade = idade;
        this.peso = peso;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "-> Nome: " + this.nome + " Idade: " + this.idade + " Peso: " + this.peso;
    }
}
