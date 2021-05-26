package edu.utfpr.javadb.entity;

import javax.persistence.*;

//#IDFuncPK, Nome, Sexo, Telefone, IDCargoFK
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDFuncPK")
    private Long idFuncPk;

    @Column(name = "Nome", length = 64, nullable = false)
    private String nome;

    @Column(name = "Sexo", length = 20, nullable = false)
    private String sexo;

    @Column(name = "Telefone", length = 64, nullable = false)
    private String telefone;

    @OneToOne
    @JoinColumn(name = "IDCargoFK")
    private Cargo cargo;

    // getters e setters

    public Long getIdFuncPk() {
        return idFuncPk;
    }

    public void setIdFuncPk(Long idFuncPk) {
        this.idFuncPk = idFuncPk;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
