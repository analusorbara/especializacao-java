package manyToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "AUTORES")
public class Autores  extends AbstractPersistable<Long> {
    @Column(name = "nome", length = 64, nullable = false)
    private String nome;

    @Column(name = "idade")
    private Integer idade;

    @ManyToMany
    @JoinTable(
            name = "autores_livros",
            joinColumns = @JoinColumn(name = "autores_id"),
            inverseJoinColumns = @JoinColumn(name = "livros_id"))
    Set<Livros> livros;
}
