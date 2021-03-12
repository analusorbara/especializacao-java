package entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CONTATOS")
@NamedQuery(
        name = "Contato.byIdade",
        query = "from Contato c where c.idade = ?1")
@NamedNativeQuery(
        name = "Contato.byNome",
        query = "select * from Contatos where nome like ?1",
        resultClass = Contato.class)
public class Contato extends AbstractPersistable<Long> {
    @Column(name = "nome", length = 64, nullable = false)
    private String nome;

    @Column(name = "idade")
    private Integer idade;

    @Column(name = "data_cadastro")
    private Date dtCadastro;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", nullable = false)
    private Endereco enedereco;

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    protected void setId(Long id) {
        super.setId(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Endereco getEnedereco() {
        return enedereco;
    }

    public void setEnedereco(Endereco enedereco) {
        this.enedereco = enedereco;
    }
}
