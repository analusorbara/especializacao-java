package edu.utfpr.javadb.repository;

import edu.utfpr.javadb.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    Funcionario save(Funcionario obj);

    List<Funcionario> findAll();

    Optional<Funcionario> findFirstByIdFuncPk(Long idFuncPk);

    void delete(Funcionario deleted);

    @Query("select p.nome from Funcionario p order by p.nome")
    List<String> funcionariosNome();
}

