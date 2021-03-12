package manyToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "LIVROS")
public class Livros  extends AbstractPersistable<Long> {
    @Column(name = "nome", length = 64, nullable = false)
    public String nome;

    @Column(name = "data_publicacao")
    private Date dtPublicacao;

    @ManyToMany(mappedBy = "livros")
    Set<Autores> autores;
}
