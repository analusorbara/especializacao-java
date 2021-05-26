package edu.utfpr.javadb.repository;

import edu.utfpr.javadb.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
    Cargo save(Cargo obj);

    List<Cargo> findAll();

    Optional<Cargo> findCargoByIdCargoPK(Long idCargoPK);

    Optional<Cargo> findFirstByCargo(String cargo);

    void delete(Cargo deleted);
}