package repository;

import entity.Contato;
import entity.NomeCidade;
import entity.SemEndereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
    Contato findByNomeAndIdade(String nome, Integer idade);
    List<Contato> findByEnederecoCidade(String cidade);
    Contato findTopByOrderByIdadeAsc();
    List<Contato> findFirst3ByOrderByIdadeAsc();

    @Query("select c from Contato c where idade >= 18 order by nome asc")
    List<Contato> findByContatoMaiolrdade();

    @Query("select c from Contato c where c.dtCadastro > ?1")
    List<Contato> findByDtCadastroAfter(Date dataCadastro);

    @Query(value = "select * from contatos where data_cadastro = ?1", nativeQuery = true)
    List<Contato> findByDataCadastro(Date dataCadastro);

    @Query(name = "Contato.byIdade")
    List<Contato> findByIdade(Integer idade);
    @Query(name = "Contato.byNome")
    Contato findByNome(String nome);

    SemEndereco findContatoByNome(String nome);

    NomeCidade findContatoCidadeByNome(String nome);

//    @Query( "select c from Contato c "
//            + "where idade>= ?1 or nome like ?2")
//    List<Contato> findByIdadeOuNome(Integer idade, String nome);

    @Query("selcet c from Contato c "
            + "where idade >= : idade or nome like :nome")
    List<Contato> findByIdadeOuNome(@Param("idade") Integer idade,
                                    @Param("nome") String nome);
}
