package med.voll.repositories.medico;

import med.voll.entities.MedicoEntity;
import med.voll.entities.medico.Medico;
import med.voll.entities.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class JPAMedicoRepository implements MedicoRepository {


    @Autowired
    private final  JpaMedicoDAO manager;

    public JPAMedicoRepository(JpaMedicoDAO manager) {
        this.manager = manager;
    }

    @Transactional
    @Override
    public void cadastrar(Medico novoMedico) {
        MedicoEntity medico = new MedicoEntity(novoMedico);
        manager.save(medico);
        System.out.println("Salvei o medico no banco de dados");
    }
}
