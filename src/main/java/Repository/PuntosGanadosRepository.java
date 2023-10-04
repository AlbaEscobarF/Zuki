package Repository;

import Models.PuntosGanados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuntosGanadosRepository extends JpaRepository<PuntosGanados, Long> {

}