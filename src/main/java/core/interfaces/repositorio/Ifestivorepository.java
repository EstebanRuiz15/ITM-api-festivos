package core.interfaces.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import core.Dominio.festivo;

@Repository
public interface Ifestivorepository extends JpaRepository<festivo, Integer> {

}
