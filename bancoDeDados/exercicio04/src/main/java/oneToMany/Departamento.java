package oneToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DEPARTAMETNO")
public class Departamento extends AbstractPersistable<Long> {
    @Column(name = "nome", length = 64, nullable = false)
    private String nome;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "departamento_id", nullable = false)
    private List<Funcionario> funcionarios;

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

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
