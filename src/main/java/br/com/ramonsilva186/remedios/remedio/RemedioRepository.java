package br.com.ramonsilva186.remedios.remedio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemedioRepository extends JpaRepository<Remedio, Long> {
}
