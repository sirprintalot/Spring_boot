package med.voll.api.medico;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.*;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    Page<Medico> findByActivoTrue(Pageable paginacion);
} 
