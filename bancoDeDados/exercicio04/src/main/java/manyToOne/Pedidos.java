package manyToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDOS")
public class Pedidos extends AbstractPersistable<Long> {
    @Column(name = "nome_do_produto", length = 64, nullable = false)
    private String nomeDoProduto;

    @ManyToOne
    private Cliente cliente;

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    protected void setId(Long id) {
        super.setId(id);
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
