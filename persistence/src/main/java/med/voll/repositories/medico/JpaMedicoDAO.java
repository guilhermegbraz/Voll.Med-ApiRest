package med.voll.repositories.medico;

import med.voll.entities.MedicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaMedicoDAO extends JpaRepository<MedicoEntity, Long> {

}
