package oneToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Entity
@Table(name = "ENDERECOS")
public class Endereco extends AbstractPersistable<Long> {
    public enum TipoEndereco {
        RESIDENCIAL,
        COMERCIAL
    }

    @Column(name = "tipo", length = 32, nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoEndereco tipoEndereco;

    @Column(name = "longradouro", length = 64, nullable = false)
    private String longradouro;

    @Column(name = "cidade", length = 64, nullable = false)
    private String cidade;

    @Column(name = "estado", length = 2, nullable = false)
    private String estado;

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    protected void setId(Long id) {
        super.setId(id);
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public String getLongradouro() {
        return longradouro;
    }

    public void setLongradouro(String longradouro) {
        this.longradouro = longradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
