package edu.utfpr.javadb.repository;

import edu.utfpr.javadb.interfaces.CidadeTotal;
import edu.utfpr.javadb.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    @Query("select e.cidade as cidade, count(e.cidade) as total"
            + " from Endereco e"
            + " group by e.cidade")
    List<CidadeTotal> findByCidadeTotal();

    @Procedure("proc_endereco")
    String procedureEndereco(Long id);
    @Procedure
    String proc_endereco(long id);

    // código anterior omitido nesta listagem
    @Modifying
    @Query("update Endereco e set e.cidade = ?1 where e.id = ?2")
    int updateCidadeByld(String cidade, Long id);

//    @Modifying
//    @Query("delete from Endereco e where e.id =  ?1")
//    int deleteEndereco(Long id);

    @Modifying
    @Query("delete from Endereco e  where e.id = ?1")
    @Transactional
    int deleteEndereco(Long id);
}
