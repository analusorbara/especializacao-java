package edu.utfpr.javadb.entity;

import javax.persistence.*;

//#IDCagoPK, Cargo
@Entity
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDCargoPK")
    private Long idCargoPK;

    @Column(name = "Cargo", length = 64, nullable = false)
    private String cargo;

    @OneToOne(mappedBy="cargo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Funcionario funcionario;

    // getters e setters
    public Long getIdCargoPK() {
        return idCargoPK;
    }

    public void setIdCargoPK(Long idCargoPK) {
        this.idCargoPK = idCargoPK;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
