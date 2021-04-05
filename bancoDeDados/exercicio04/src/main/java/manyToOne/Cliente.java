package manyToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CLIENTE")
public class Cliente extends AbstractPersistable<Long> {
    @Column(name = "nome", length = 64, nullable = false)
    private String nome;

    @Column(name = "idade")
    private Integer idade;

    @Column(name = "data_cadastro")
    private Date dtCadastro;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Pedidos> pedidos;

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

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }
}
